package smart.park.data.center.parsed.base;

import smart.park.common.config.DeviceType;
import smart.pulsar.client.consumer.handler.SubscribeMsgHandlerI;

/**
 * @author ljm
 * @date 2023/3/16 17:59
 */
public abstract class AbstractParsed implements SubscribeMsgHandlerI {

    public abstract DeviceType getDeviceType();

    protected abstract boolean parse();

    public abstract AbstractParsed newParser();

    public abstract String getParserTopicOutput();

    @Override
    public String getTopic() {
        return getParserTopicOutput();
    }

    @Override
    public void handle(byte[] datas) {
        parse();
    }
}
