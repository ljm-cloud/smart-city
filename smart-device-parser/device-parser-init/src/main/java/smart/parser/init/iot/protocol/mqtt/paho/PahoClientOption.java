package smart.parser.init.iot.protocol.mqtt.paho;

import lombok.Data;
import org.eclipse.paho.client.mqttv3.MqttClientPersistence;
import smart.parser.init.iot.protocol.api.IotMsgClientOption;

/**
 * @author ljm
 * @date 2022/12/15 13:50
 */
@Data
public class PahoClientOption extends IotMsgClientOption {
    private String clientId;
    private MqttClientPersistence persistence;
}
