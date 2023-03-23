package smart.park.data.center.parsed;

import org.springframework.stereotype.Service;
import smart.park.common.config.DeviceType;
import smart.park.common.dto.ParserOutput;
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

    @Override
    protected boolean parse(ParserOutput parserOutput) {
        //推送实时数据
        //存储时序数据库
        return true;
    }

    @Override
    public AbstractParsed newParser() {
        return new AqParsed();
    }

    @Override
    public String getParserTopicOutput() {
        return "smp_aq_parser_output";
    }
}
