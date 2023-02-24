package smart.pulsar.client.config;

import lombok.Data;

/**
 * @author ljm
 * @date 2023/2/24 14:21
 */
@Data
public class PulsarPublisherConfig {
    private String serviceUrl;
    private boolean enable;
    private String topicSuffix;
    private String topicPrefix;
}
