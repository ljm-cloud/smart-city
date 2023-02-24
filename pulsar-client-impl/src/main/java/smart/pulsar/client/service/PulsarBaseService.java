package smart.pulsar.client.service;

import smart.pulsar.client.PulsarClientManager;
import smart.pulsar.client.common.PulsarClientApplicationContextProvider;
import smart.pulsar.client.config.PulsarConfig;

/**
 * @author ljm
 * @date 2023/2/24 15:46
 */
public class PulsarBaseService {
    protected PulsarClientManager pulsarClientManager;
    protected PulsarConfig pulsarConfig;
    public PulsarBaseService(){
        pulsarClientManager = PulsarClientManager.getInstance();
        pulsarConfig = PulsarClientApplicationContextProvider.getBean(PulsarConfig.class);
    }
}
