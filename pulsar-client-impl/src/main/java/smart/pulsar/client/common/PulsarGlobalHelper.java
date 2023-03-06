package smart.pulsar.client.common;

import smart.pulsar.client.consumer.handler.AbstractHandler;
import java.util.Map;

/**
 * @author ljm
 * @date 2023/3/6 13:42
 */
public class PulsarGlobalHelper {
    public static Map<String, AbstractHandler> handlerMap;
}
