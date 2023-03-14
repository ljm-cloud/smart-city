package smart.pulsar.client.service;

import com.google.common.collect.Maps;
import org.springframework.stereotype.Service;
import smart.pulsar.client.common.PulsarClientApplicationContextProvider;
import smart.pulsar.client.common.PulsarGlobalHelper;
import smart.pulsar.client.consumer.PulsarConsumer;
import smart.pulsar.client.consumer.handler.AbstractHandler;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

/**
 * @author ljm
 * @date 2023/3/6 14:06
 */
@Service
public class PulsarConsumerService extends PulsarBaseService {
    private final Map<String, PulsarConsumer> pulsarConsumerMap;
    public PulsarConsumerService() {
        super();
        pulsarConsumerMap = Maps.newHashMap();
    }
    public CompletableFuture<Void> initConsumers(){
        return CompletableFuture.runAsync(()->{
            Map<String,AbstractHandler> abstractHandlerMap = PulsarClientApplicationContextProvider.getApplicationContext().getBeansOfType(AbstractHandler.class);
            PulsarGlobalHelper.handlerMap = Maps.newHashMap();
            abstractHandlerMap.values().forEach(abstractHandler -> PulsarGlobalHelper.handlerMap.put(abstractHandler.getTopic(),abstractHandler));
            pulsarConfig.getConsumers().forEach((name,pulsarConsumerConfig)->{
                if (pulsarConsumerConfig.isEnable()){
                    pulsarClientManager.build(pulsarConsumerConfig.getServiceUrl())
                            .thenApply(pulsarClient -> new PulsarConsumer(name,pulsarConsumerConfig.getTopicPrefix(),pulsarConsumerConfig.getTopicSuffix(),pulsarClient))
                            .thenAccept(pulsarConsumer -> {
                                pulsarConsumerMap.put(name,pulsarConsumer);
                                pulsarConsumer.consumer(pulsarConsumerConfig.getTopics());
                            });
                }
            });
        });
    }
    public void subscribe(String consumerName, List<String> topics){
        Optional.ofNullable(pulsarConsumerMap.get(consumerName)).ifPresent(pulsarConsumer -> pulsarConsumer.consumer(topics));
    }
}
