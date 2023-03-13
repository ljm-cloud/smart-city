package smart.park.common.dto;

import lombok.Data;

/**
 * @author ljm
 * @date 2023/3/13 15:00
 */
@Data
public class ParserInput {
    private String deviceId;
    private byte[] datas;
    private Integer fCnt;
    private Integer fPort;
    private Long timestamp;
    private Integer dr;
}
