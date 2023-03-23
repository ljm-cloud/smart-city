package smart.pulsar.client.consumer;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.apache.pulsar.client.api.Consumer;
import org.apache.pulsar.client.api.PulsarClient;
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

    private PulsarClient pulsarClient;

    private String consumerName;

    private String topicSuffix;
    private String topicPrefix;

    public PulsarConsumer(String consumerName,String topicPrefix,String topicSuffix,PulsarClient pulsarClient){
        this.consumerName = consumerName;
        this.pulsarClient = pulsarClient;
        this.topicPrefix = topicPrefix;
        this.topicSuffix = topicSuffix;
    }

    public CompletableFuture<Void> consumer(List<String> topics){
        try {
            if (StringUtils.isNotBlank(topicPrefix)){
                topics = topics.stream().map(topic->topicPrefix + topic).collect(Collectors.toList());
            }
            if (StringUtils.isNotBlank(topicSuffix)){
                topics = topics.stream().map(topic->topic + topicSuffix).collect(Collectors.toList());
            }
             pulsarClient.newConsumer().consumerName(consumerName).topics(topics)
                    .messageListener(((consumer, msg) -> {
                        String topic = msg.getTopicName();
                        if (StringUtils.isNotBlank(topicPrefix)){
                            topic = topic.replaceFirst(topicPrefix,"");
                        }
                        if (StringUtils.isNotBlank(topicSuffix)){
                            topic = topic.replaceAll(topicSuffix,"");
                        }
                        Optional.ofNullable(PulsarGlobalHelper.handlerMap.get(topic)).ifPresent(abstractHandler -> abstractHandler.doHandle(msg.getData()));
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
}
