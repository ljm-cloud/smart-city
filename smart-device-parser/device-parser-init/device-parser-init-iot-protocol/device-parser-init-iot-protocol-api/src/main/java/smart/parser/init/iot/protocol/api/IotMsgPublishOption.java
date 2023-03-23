package smart.parser.init.iot.protocol.api;

import lombok.Data;

/**
 * @author ljm
 * @date 2023/1/3 12:27
 */
@Data
public class IotMsgPublishOption {
    private Object iotMsgClient;
    private String topic;
    private byte[] payload;
    private int qos;
    public void setMessage(String message){
        this.payload = message.getBytes();
    }
}
