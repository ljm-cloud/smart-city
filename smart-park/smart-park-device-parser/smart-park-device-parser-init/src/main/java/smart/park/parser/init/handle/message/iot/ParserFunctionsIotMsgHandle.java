package smart.park.parser.init.handle.message.iot;

import org.springframework.stereotype.Component;

/**
 * @author ljm
 * @date 2023/3/14 17:49
 * 以Pulsar Functions的方式解析数据解析器
 */
@Component
public class ParserFunctionsIotMsgHandle extends AbsIotMessageHandle {
    @Override
    public String handleType() {
        return "parserFunctions";
    }

    @Override
    public void handle(String topic,String message,String consumerName) {

    }
}
