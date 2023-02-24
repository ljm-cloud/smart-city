package smart.pulsar.client;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.apache.pulsar.client.api.PulsarClient;

import java.util.concurrent.CompletableFuture;

/**
 * @author ljm
 * @date 2023/2/24 15:29
 */
@Slf4j
public class PulsarClientManager {
    private PulsarClientManager(){
    }
    private static final PulsarClientManager pulsarClientManager = new PulsarClientManager();
    public static PulsarClientManager getInstance(){return pulsarClientManager;}
    public CompletableFuture<PulsarClient> build(String serviceUrl){
        return CompletableFuture.supplyAsync(()->{
            try {
                if (StringUtils.isBlank(serviceUrl)){
                    return null;
                }
                return PulsarClient.builder().serviceUrl(serviceUrl).build();
            } catch (Exception e) {
                log.error("Pulsar.publisher.init error",e);
                return null;
            }
        });
    }
}
