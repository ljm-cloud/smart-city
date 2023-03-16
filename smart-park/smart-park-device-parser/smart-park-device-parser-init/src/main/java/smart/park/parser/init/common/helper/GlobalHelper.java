package smart.park.parser.init.common.helper;

import smart.park.parser.init.handle.message.iot.AbsIotMessageHandle;

import java.util.Collections;
import java.util.Map;

/**
 * @author ljm
 * @date 2023/3/14 17:59
 */
public class GlobalHelper {
    public static Map<String, AbsIotMessageHandle> iotMessageHandleMap = Collections.emptyMap();
}
