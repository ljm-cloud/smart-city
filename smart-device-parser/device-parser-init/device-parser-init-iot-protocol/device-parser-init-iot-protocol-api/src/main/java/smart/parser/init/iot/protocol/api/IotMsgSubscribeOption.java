package smart.parser.init.iot.protocol.api;

import lombok.Data;

@Data
public class IotMsgSubscribeOption {
    private Object iotMsgClient;
    private String[] topicFilters;
    private int[] qos;
}
