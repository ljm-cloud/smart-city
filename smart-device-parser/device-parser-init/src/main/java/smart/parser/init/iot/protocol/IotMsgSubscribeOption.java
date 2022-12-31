package smart.parser.init.iot.protocol;

import lombok.Data;

@Data
public class IotMsgSubscribeOption {
    private Object iotMsgClient;
    private String[] topicFilters;
    private int[] qos;
}
