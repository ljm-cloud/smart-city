package smart.park.parser.init.service;

import org.springframework.stereotype.Service;
import smart.park.common.dto.ParserInput;
import smart.park.common.provider.SmartParkApplicationContextProvider;
import smart.park.common.utils.FastJsonUtil;
import smart.park.parser.init.common.dto.TrashDataVo;
import smart.pulsar.client.service.PulsarPublisherService;

/**
 * @author ljm
 * @date 2023/3/16 14:54
 */
@Service
public class ParserService {

    public void publishParserFunctions(String parserTopicInput, TrashDataVo trashDataVo){
        ParserInput parserInput = ParserInput.newBuilder()
                .deviceId(trashDataVo.getDevEUI())
                .datas(trashDataVo.getData())
                .fCnt(trashDataVo.getFCnt())
                .fPort(trashDataVo.getFPort())
                .timestamp(trashDataVo.getTimestamp())
                .dr(trashDataVo.getDr())
                .build();
        SmartParkApplicationContextProvider.getBean(PulsarPublisherService.class).publish("parser-functions",parserTopicInput, FastJsonUtil.beanToJson(parserInput).getBytes());
    }
}
