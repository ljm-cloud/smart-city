package smart.pulsar.client.service;

import com.google.common.collect.Maps;
import org.springframework.stereotype.Service;
import smart.pulsar.client.producer.PulsarPublisher;

import java.util.Map;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

/**
 * @author ljm
 * @date 2023/2/24 15:38
 */
@Service
public class PulsarPublisherService extends PulsarBaseService {
    private final Map<String, PulsarPublisher> pulsarPublisherMap;
    public PulsarPublisherService() {
        super();
        pulsarPublisherMap = Maps.newHashMap();
    }
    public CompletableFuture<Void> initPublishers(){
        return CompletableFuture.runAsync(()->{
            pulsarConfig.getPublishers().forEach((name,pulsarPublisherConfig)->{
                if (pulsarPublisherConfig.isEnable()){
                    pulsarClientManager.build(pulsarPublisherConfig.getServiceUrl())
                            .thenApply(pulsarClient -> new PulsarPublisher(name,pulsarPublisherConfig.getTopicPrefix(),pulsarPublisherConfig.getTopicSuffix(),pulsarClient))
                            .thenAccept(pulsarPublisher -> pulsarPublisherMap.put(name,pulsarPublisher));
                }
            });
        });
    }
    public void publish(String publisherName,String topic,byte[] message){
        Optional.ofNullable(pulsarPublisherMap.get(publisherName)).ifPresent(pulsarPublisher -> pulsarPublisher.publish(topic, message));
    }
}
