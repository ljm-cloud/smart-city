package smart.parser.functions;

import io.cloudevents.CloudEvent;

/**
 * @author ljm
 * @date 2022/12/2 18:03
 */
public interface DeviceParserFunction {
    void parser(CloudEvent cloudEvent);
}
