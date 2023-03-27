package smart.parser.init.iot.protocol.mqtt.paho;

import lombok.Data;
import org.eclipse.paho.client.mqttv3.IMqttMessageListener;
import smart.parser.init.iot.protocol.api.IotMsgSubscribeOption;

@Data
public class PahoSubscribeOption extends IotMsgSubscribeOption {
    private IMqttMessageListener[] iMqttMessageListeners;
}
