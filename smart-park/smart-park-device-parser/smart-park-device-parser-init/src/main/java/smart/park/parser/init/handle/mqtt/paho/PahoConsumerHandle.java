package smart.park.parser.init.handle.mqtt.paho;

import lombok.extern.slf4j.Slf4j;
import org.eclipse.paho.client.mqttv3.IMqttMessageListener;
import org.eclipse.paho.client.mqttv3.MqttMessage;
import smart.park.common.provider.SmartParkApplicationContextProvider;
import smart.park.parser.init.service.InitParserService;

/**
 * @author ljm
 * @date 2023/3/14 9:54
 */
@Slf4j
public class PahoConsumerHandle implements IMqttMessageListener {

    private final String consumerName;

    public PahoConsumerHandle(String consumerName){
        this.consumerName=consumerName;
    }

    @Override
    public void messageArrived(String topic, MqttMessage mqttMessage) {
        try {
            String message = new String(mqttMessage.getPayload());
            SmartParkApplicationContextProvider.getBean(InitParserService.class).handleMqttMessage(topic,message,consumerName);
        }catch (Exception e){
            log.error("Mqtt.PahoConsumerHandle.messageArrived.error|"+topic,e);
        }
    }
}
