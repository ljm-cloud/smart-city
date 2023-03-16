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
    private ParserInput(Builder builder){
        this.deviceId = builder.deviceId;
        this.datas = builder.datas;
        this.fCnt = builder.fCnt;
        this.fPort = builder.fPort;
        this.timestamp = builder.timestamp;
        this.dr = builder.dr;
    }
    public static Builder newBuilder(){
        return new ParserInput.Builder();
    }
    public static class Builder{
        private String deviceId;
        private byte[] datas;
        private Integer fCnt;
        private Integer fPort;
        private Long timestamp;
        private Integer dr;
        public Builder deviceId(String deviceId){
            this.deviceId = deviceId;
            return this;
        }
        public Builder datas(byte[] datas){
            this.datas = datas;
            return this;
        }
        public Builder fCnt(Integer fCnt){
            this.fCnt = fCnt;
            return this;
        }
        public Builder fPort(Integer fPort){
            this.fPort = fPort;
            return this;
        }
        public Builder timestamp(Long timestamp){
            this.timestamp = timestamp;
            return this;
        }
        public Builder dr(Integer dr){
            this.dr = dr;
            return this;
        }
        public ParserInput build(){
            return new ParserInput(this);
        }
    }
}
