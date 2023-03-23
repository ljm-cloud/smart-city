package smart.pulsar.client.consumer.handler;

/**
 * @author ljm
 * @date 2023/3/23 15:36
 * 实现这个接口可以自定义处理逻辑处理(handle())指定Topic(getTopic())的消息datas
 */
public interface SubscribeMsgHandlerI {
    void handle(byte[] datas);
    String getTopic();
}
