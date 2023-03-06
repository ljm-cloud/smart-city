package smart.pulsar.client.consumer.handler;

import lombok.extern.slf4j.Slf4j;

import java.util.Collection;

/**
 * @author ljm
 * @date 2023/3/6 13:36
 */
@Slf4j
public abstract class AbstractHandler {

    public void doHandle(Collection<String> collection) {
        try {
            log.info("begin.handle.event:{}|{}",getTopic(),collection.size());
            handle(collection);
        }catch (Exception e){
            log.error("Topic.handle.failed!|"+getTopic(),e);
        }
    }

    public void doHandle(byte[] data){
        handle(data);
    }

    protected abstract void handle(byte[] data);

    protected abstract void handle(Collection<String> collection);

    public abstract String getTopic();
}
