package smart.park.parser.init.common.config.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import smart.parser.init.iot.protocol.mqtt.paho.PahoManager;

/**
 * @author ljm
 * @date 2023/2/9 11:27
 */
@Configuration
public class PahoConfiguration {

    @Bean
    public PahoManager pahoManager(){
        return new PahoManager();
    }
}
