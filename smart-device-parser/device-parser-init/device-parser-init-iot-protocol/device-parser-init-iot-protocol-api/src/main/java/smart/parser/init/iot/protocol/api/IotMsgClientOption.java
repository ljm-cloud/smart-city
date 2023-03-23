package smart.parser.init.iot.protocol.api;

import lombok.Data;

/**
 * @author ljm
 * @date 2022/12/5 14:08
 */
@Data
public class IotMsgClientOption {
    private String serverURI;
    private String userName;
    private String password;
}
