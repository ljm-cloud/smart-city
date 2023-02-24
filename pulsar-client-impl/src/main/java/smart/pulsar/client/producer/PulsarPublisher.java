package smart.pulsar.client.producer;

import com.google.common.collect.Maps;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.apache.pulsar.client.api.MessageId;
import org.apache.pulsar.client.api.Producer;
import org.apache.pulsar.client.api.PulsarClient;
import org.apache.pulsar.client.api.PulsarClientException;

import java.util.Map;
import java.util.concurrent.CompletableFuture;

/**
 * @author ljm
 * @date 2023/2/24 12:08
 */
@Slf4j
public class PulsarPublisher {

    private PulsarClient pulsarClient;

    private String producerName;

    private Map<String, Producer> producerMap;

    private String topicSuffix;
    private String topicPrefix;

    public PulsarPublisher(String producerName,String topicPrefix,String topicSuffix,PulsarClient pulsarClient){
        this.topicPrefix = topicPrefix;
        this.topicSuffix = topicSuffix;
        this.producerName = producerName;
        this.pulsarClient = pulsarClient;
        producerMap = Maps.newHashMap();
    }

    public PulsarPublisher(String producerName,PulsarClient pulsarClient){
        this.producerName = producerName;
        this.pulsarClient = pulsarClient;
        producerMap = Maps.newHashMap();
    }

    public CompletableFuture<MessageId> publish(String topic,byte[] message){
        try {
            if (StringUtils.isNotBlank(topicPrefix)){
                topic = topicPrefix +topic;
            }
            if (StringUtils.isNotBlank(topicSuffix)){
                topic += topicSuffix;
            }
            String finalTopic = topic;
            Producer producer =
            producerMap.computeIfAbsent(producerName+"#"+finalTopic,key->{
                try {
                    return pulsarClient.newProducer().producerName(producerName).topic(finalTopic).create();
                } catch (PulsarClientException e) {
                    log.error("create producer failed!",e);
                    return null;
                }
            });
            if (producer!=null){
                return producer.newMessage().value(message).sendAsync();
            }
        }catch (Exception e){
            log.error("PulsarPublisher.publish error",e);
            return null;
        }
        return CompletableFuture.completedFuture(null);
    }
}