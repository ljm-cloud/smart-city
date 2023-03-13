package smart.park.common.dto;

import com.google.common.collect.Maps;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.beanutils.BeanUtils;

import java.lang.reflect.InvocationTargetException;
import java.util.Map;

@Data
@Slf4j
public class BaseMsg {
    private String deviceId;
    private Map<String,Object> data;
    private Long timestamp;
    private Integer fPort;
    private Integer fCnt;
    private Integer dr;

    public BaseMsg(boolean initMap){
        if(initMap) {
            this.data = Maps.newHashMap();
        }
    }

    public BaseMsg(ParserInput input){
        this(true);
        try {
            BeanUtils.copyProperties(this,input);
        } catch (IllegalAccessException | InvocationTargetException e) {
            log.error("BaseMsg copyProperties error",e);
        }
    }

    public BaseMsg(){
        this(true);
    }

}
