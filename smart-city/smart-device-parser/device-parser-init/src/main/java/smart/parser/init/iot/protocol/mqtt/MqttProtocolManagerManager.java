package smart.parser.init.iot.protocol.mqtt;

import smart.parser.init.iot.protocol.IotMsgClientOption;
import smart.parser.init.iot.protocol.IotMsgProtocolManager;

/**
 * @author ljm
 * @date 2022/12/5 13:58
 */
public class MqttProtocolManagerManager implements IotMsgProtocolManager {

    private MqttProtocolManagerManager(){

    }

    public static MqttProtocolManagerManager newBuilder(){
        return new MqttProtocolManagerManager();
    }

    @Override
    public Object buildMsgClient(IotMsgClientOption iotMsgClientOption) {
        return null;
    }
}
