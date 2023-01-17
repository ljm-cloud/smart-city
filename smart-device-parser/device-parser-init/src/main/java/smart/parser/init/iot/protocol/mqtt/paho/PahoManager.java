package smart.parser.init.iot.protocol.mqtt.paho;

import lombok.extern.slf4j.Slf4j;
import org.eclipse.paho.client.mqttv3.*;
import org.eclipse.paho.client.mqttv3.persist.MemoryPersistence;
import smart.parser.init.iot.protocol.IotMsgClientOption;
import smart.parser.init.iot.protocol.IotMsgProtocolManager;
import smart.parser.init.iot.protocol.IotMsgPublishOption;
import smart.parser.init.iot.protocol.IotMsgSubscribeOption;

import java.util.Optional;

/**
 * @author ljm
 * @date 2022/12/15 13:27
 */
@Slf4j
public class PahoManager implements IotMsgProtocolManager {
    @Override
    public Object buildMsgClient(IotMsgClientOption iotMsgClientOption) throws MqttException {
        PahoClientOption pahoClientOption = (PahoClientOption) iotMsgClientOption;
        MqttAsyncClient client = new MqttAsyncClient(pahoClientOption.getServerURI(),pahoClientOption.getClientId(), Optional.ofNullable(pahoClientOption.getPersistence()).orElseGet(MemoryPersistence::new));
        MqttConnectOptions connectOptions = new MqttConnectOptions();
        connectOptions.setUserName(iotMsgClientOption.getUserName());
        connectOptions.setPassword(iotMsgClientOption.getPassword().toCharArray());
        connectOptions.setCleanSession(true);
        client.setCallback(new OnMessageCallback());
        client.connect(connectOptions);
        return client;
    }

    @Override
    public IMqttToken subscribe(IotMsgSubscribeOption iotMsgSubscribeOption) throws MqttException {
        PahoSubscribeOption pahoSubscribeOption = (PahoSubscribeOption) iotMsgSubscribeOption;
        MqttAsyncClient client = (MqttAsyncClient) pahoSubscribeOption.getIotMsgClient();
        return client.subscribe(pahoSubscribeOption.getTopicFilters(),pahoSubscribeOption.getQos(),pahoSubscribeOption.getIMqttMessageListeners());
    }

    @Override
    public IMqttDeliveryToken publish(IotMsgPublishOption iotMsgPublishOption) throws MqttException {
        PahoPublishOption pahoPublishOption = (PahoPublishOption) iotMsgPublishOption;
        MqttAsyncClient client = (MqttAsyncClient) pahoPublishOption.getIotMsgClient();
        MqttMessage message = new MqttMessage(pahoPublishOption.getPayload());
        message.setQos(pahoPublishOption.getQos());
        return client.publish(pahoPublishOption.getTopic(),message);
    }

    static class OnMessageCallback implements MqttCallback {

        @Override
        public void connectionLost(Throwable throwable) {

        }

        @Override
        public void messageArrived(String s, MqttMessage mqttMessage) throws Exception {

        }

        @Override
        public void deliveryComplete(IMqttDeliveryToken iMqttDeliveryToken) {

        }
    }
}
