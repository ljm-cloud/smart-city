package smart.park.parser.init.handle.message.iot;

/**
 * @author ljm
 * @date 2023/3/14 17:48
 */
public abstract class AbsIotMessageHandle {
    public abstract String handleType();
    public abstract void handle(String topic,String message,String consumerName);
}
