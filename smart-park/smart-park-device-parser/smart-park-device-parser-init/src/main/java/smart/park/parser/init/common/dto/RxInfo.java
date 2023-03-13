package smart.park.parser.init.common.dto;

import lombok.Data;

@Data
public class RxInfo {
    private String gatewayID;
    private Integer rssi;
    private String channel;
    // location :{latitude, longitude}
//    private String time;   //field type unknown
//    private String timeSinceGPSEpoch;  //field type unknown
}
