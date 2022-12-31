package smart.parser.init.iot.protocol;

/**
 * @author ljm
 * @date 2022/12/5 13:47
 */
public interface IotMsgProtocolManager {
    Object buildMsgClient(IotMsgClientOption iotMsgClientOption) throws Exception;
    Object subscribe(IotMsgSubscribeOption iotMsgSubscribeOption) throws Exception;
}
