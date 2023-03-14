package smart.park.parser.init.common.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
@ConfigurationProperties(prefix="smartoilets")
@Data
public class MqttsConf {

    private Map<String,MqttConf> mqtts;

}
