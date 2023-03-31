package smart.pulsar.client.consumer;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.apache.pulsar.client.api.PulsarClient;
import org.apache.pulsar.client.api.SubscriptionType;
import smart.pulsar.client.common.PulsarGlobalHelper;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

/**
 * @author ljm
 * @date 2023/3/6 11:07
 */
@Slf4j
public class PulsarConsumer {

    private final PulsarClient pulsarClient;

    private final String consumerName;

    private String topicSuffix;
    private String topicPrefix;
    private String subscriptionTypeStr;

    public PulsarConsumer(String consumerName,PulsarClient pulsarClient){
        this.consumerName = consumerName;
        this.pulsarClient = pulsarClient;
    }

    public PulsarConsumer topicSuffix(String topicSuffix){
        this.topicSuffix = topicSuffix;
        return this;
    }

    public PulsarConsumer topicPrefix(String topicPrefix){
        this.topicPrefix = topicPrefix;
        return this;
    }

    public PulsarConsumer subscriptionType(String subscriptionTypeStr){
        this.subscriptionTypeStr = subscriptionTypeStr;
        return this;
    }

    public CompletableFuture<Void> consumer(List<String> topics){
        try {
            if (StringUtils.isNotBlank(topicPrefix)){
                topics = topics.stream().map(topic->topicPrefix + topic).collect(Collectors.toList());
            }
            if (StringUtils.isNotBlank(topicSuffix)){
                topics = topics.stream().map(topic->topic + topicSuffix).collect(Collectors.toList());
            }
             pulsarClient.newConsumer().consumerName(consumerName).subscriptionType(getSubscriptionType(subscriptionTypeStr)).topics(topics)
                    .messageListener(((consumer, msg) -> {
                        String topic = msg.getTopicName();
                        if (StringUtils.isNotBlank(topicPrefix)){
                            topic = topic.replaceFirst(topicPrefix,"");
                        }
                        if (StringUtils.isNotBlank(topicSuffix)){
                            topic = topic.replaceAll(topicSuffix,"");
                        }
                        Optional.ofNullable(PulsarGlobalHelper.handlerMap.get(topic)).ifPresent(subscribeMsgHandlerI -> subscribeMsgHandlerI.handle(msg.getData()));
                        try {
                            consumer.acknowledge(msg.getMessageId());
                        }catch (Exception e){
                            log.error("PulsarConsumer.consumer.acknowledge error|"+topic,e);
                        }
                    })).subscribe();
        }catch (Exception e){
            log.error("PulsarConsumer.consumer error",e);
            return null;
        }
        return CompletableFuture.completedFuture(null);
    }

    public SubscriptionType getSubscriptionType(String subscriptionTypeStr){
        SubscriptionType subscriptionType =  SubscriptionType.Shared;
        if(StringUtils.isNotBlank(subscriptionTypeStr)){
            switch (subscriptionTypeStr) {
                case "exclusive":
                    subscriptionType = SubscriptionType.Exclusive;
                    break;
                case "keyShared":
                    subscriptionType = SubscriptionType.Key_Shared;
                    break;
                case "failover":
                    subscriptionType = SubscriptionType.Failover;
                    break;
            }
        }
        return subscriptionType;
    }
}
