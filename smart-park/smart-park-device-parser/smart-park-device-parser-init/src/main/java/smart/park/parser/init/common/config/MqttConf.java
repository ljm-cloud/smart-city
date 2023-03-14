package smart.park.parser.init.common.config;

import lombok.Data;

@Data
public class MqttConf {

    private boolean subscribe;

    private boolean publish = true;

    private String topic;

    private Integer qos = 1;

    private String username;

    private String password;

    private String mqttHost;

    private Integer mqttPort = 1883;

    private String caFilePath;

    private String msgHandleType;
}
