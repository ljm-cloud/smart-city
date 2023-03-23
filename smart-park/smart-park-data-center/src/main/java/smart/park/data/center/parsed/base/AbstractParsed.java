package smart.park.data.center.parsed.base;

import smart.park.common.config.DeviceType;
import smart.park.common.dto.ParserOutput;
import smart.park.common.utils.FastJsonUtil;
import smart.pulsar.client.consumer.handler.SubscribeMsgHandlerI;

/**
 * @author ljm
 * @date 2023/3/16 17:59
 */
public abstract class AbstractParsed implements SubscribeMsgHandlerI {

    public abstract DeviceType getDeviceType();

    protected abstract boolean parse(ParserOutput parserOutput);

    public abstract AbstractParsed newParser();

    public abstract String getParserTopicOutput();

    @Override
    public String getTopic() {
        return getParserTopicOutput();
    }

    @Override
    public void handle(byte[] datas) {
        String msg = new String(datas);
        ParserOutput parserOutput = FastJsonUtil.jsonToBean(msg, ParserOutput.class);
        parse(parserOutput);
    }
}
