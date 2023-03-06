package smart.pulsar.client.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.Map;

/**
 * @author ljm
 * @date 2023/2/24 14:41
 */
@Data
@Component
@ConfigurationProperties(prefix = "smart.pulsar")
public class PulsarConfig {
    private Map<String,PulsarPublisherConfig> publishers = Collections.emptyMap();
    private Map<String,PulsarConsumerConfig> consumers = Collections.emptyMap();
}
