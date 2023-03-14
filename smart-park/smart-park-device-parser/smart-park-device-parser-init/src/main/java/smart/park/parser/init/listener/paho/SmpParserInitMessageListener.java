package smart.park.parser.init.listener.paho;

import lombok.extern.slf4j.Slf4j;
import org.eclipse.paho.client.mqttv3.IMqttMessageListener;
import org.eclipse.paho.client.mqttv3.MqttMessage;
import smart.park.parser.init.common.helper.GlobalHelper;

import java.util.Optional;

/**
 * @author ljm
 * @date 2023/3/14 9:54
 */
@Slf4j
public class SmpParserInitMessageListener implements IMqttMessageListener {

    private final String consumerName;

    private final String msgHandleType;

    public SmpParserInitMessageListener(String consumerName,String msgHandleType){
        this.consumerName=consumerName;
        this.msgHandleType=msgHandleType;
    }

    @Override
    public void messageArrived(String topic, MqttMessage mqttMessage) {
        try {
            String message = new String(mqttMessage.getPayload());
            Optional.ofNullable(GlobalHelper.iotMessageHandleMap.get(msgHandleType))
            .ifPresent(absHandleIotMessage -> absHandleIotMessage.handle(topic,message,consumerName));
        }catch (Exception e){
            log.error("Mqtt.PahoConsumerHandle.messageArrived.error|"+topic,e);
        }
    }
}
