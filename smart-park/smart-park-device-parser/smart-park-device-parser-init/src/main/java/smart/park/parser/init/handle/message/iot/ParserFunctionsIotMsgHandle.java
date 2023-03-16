package smart.park.parser.init.handle.message.iot;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import smart.park.common.provider.SmartParkApplicationContextProvider;
import smart.park.common.utils.FastJsonUtil;
import smart.park.parser.init.common.dto.TrashDataVo;
import smart.park.parser.init.common.helper.GlobalHelper;
import smart.park.parser.init.service.ParserService;
import java.util.Optional;

/**
 * @author ljm
 * @date 2023/3/14 17:49
 * 以Pulsar Functions的方式解析数据解析器
 */
@Component
@Slf4j
public class ParserFunctionsIotMsgHandle extends AbsIotMessageHandle {
    @Override
    public String handleType() {
        return "parserFunctions";
    }

    @Override
    public void handle(String topic,String message,String consumerName) {
        TrashDataVo trashDataVo;
        try {
            trashDataVo = FastJsonUtil.jsonToBean(message, TrashDataVo.class);
            if (trashDataVo==null){
                return;
            }
        }catch (Exception e){
            log.error("ParserFunctionsIotMsgHandle.handle.messageToTrashDataVo error|"+message,e);
            return;
        }
        //放入Pulsar Functions Topic Input
        Optional.ofNullable(GlobalHelper.abstractParserMap.get(trashDataVo.getFPort())).ifPresent(abstractParser -> {
            SmartParkApplicationContextProvider.getBean(ParserService.class).publishParserFunctions(abstractParser.getParserTopicInput(),trashDataVo);
        });
    }
}
