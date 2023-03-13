package smart.park.parser.init.common.dto;

import lombok.Data;

import java.time.Instant;
import java.util.Collections;
import java.util.List;

@Data
public class TrashDataVo {

    private Integer applicationID;
    private String applicationName;
    private String deviceName;
    private String devEUI;
    private boolean adr;
    private Integer fCnt;
    private Integer fPort;

    private List<RxInfo> rxInfo = Collections.emptyList();

    private String data;
    private Integer singleData;
    private String parseData;
    private Long timestamp;
    private String timestr;
    private Instant time;

    private Long frequency;
    private Integer dr;

}
