package smart.pulsar.client.consumer.handler;

/**
 * @author ljm
 * @date 2023/3/23 15:36
 */
public interface SubscribeMsgHandlerI {
    void handle(byte[] datas);
    String getTopic();
}
