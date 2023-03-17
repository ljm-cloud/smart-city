package smart.park.data.center.parsed;

import smart.park.common.config.DeviceType;
import smart.park.data.center.parsed.base.AbstractParsed;

/**
 * @author ljm
 * @date 2023/3/16 17:58
 */
public class AqParsed extends AbstractParsed {
    @Override
    public DeviceType getDeviceType() {
        return DeviceType.AQ;
    }
}
