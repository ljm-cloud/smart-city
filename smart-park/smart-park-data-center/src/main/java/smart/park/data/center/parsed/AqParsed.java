package smart.park.data.center.parsed;

import org.springframework.stereotype.Service;
import smart.park.common.config.DeviceType;
import smart.park.data.center.parsed.base.AbstractParsed;

/**
 * @author ljm
 * @date 2023/3/16 17:58
 */
@Service
public class AqParsed extends AbstractParsed {
    @Override
    public DeviceType getDeviceType() {
        return DeviceType.AQ;
    }
}
