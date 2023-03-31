package smart.pulsar.client.config;

import lombok.Data;

import java.util.Collections;
import java.util.List;

/**
 * @author ljm
 * @date 2023/3/6 11:37
 */
@Data
public class PulsarConsumerConfig {
    private String serviceUrl;
    private boolean enable;
    private List<String> topics = Collections.emptyList();
    private String topicSuffix;
    private String topicPrefix;
    private String subscriptionType;
}
