package smart.pulsar.client.common;

import smart.pulsar.client.consumer.handler.SubscribeMsgHandlerI;
import java.util.Map;

/**
 * @author ljm
 * @date 2023/3/6 13:42
 */
public class PulsarGlobalHelper {
    public static Map<String, SubscribeMsgHandlerI> handlerMap;
}
