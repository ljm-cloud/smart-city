package smart.park.parser.init.service;

import com.google.common.collect.Maps;
import lombok.extern.slf4j.Slf4j;
import org.eclipse.paho.client.mqttv3.MqttAsyncClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import smart.park.parser.init.common.config.MqttsConf;
import smart.park.parser.init.handle.mqtt.paho.PahoConsumerHandle;
import smart.parser.init.iot.protocol.mqtt.paho.PahoClientOption;
import smart.parser.init.iot.protocol.mqtt.paho.PahoManager;
import smart.parser.init.iot.protocol.mqtt.paho.PahoSubscribeOption;

import java.util.Map;
import java.util.concurrent.CompletableFuture;

/**
 * @author ljm
 * @date 2023/3/13 16:12
 */
@Service
@Slf4j
public class InitParserService {

    @Autowired
    private MqttsConf mqttsConf;

    @Autowired
    private PahoManager pahoManager;

    private Map<String,MqttAsyncClient> mqttAsyncClientMap = Maps.newHashMap();

    public CompletableFuture<Void> initMqtt(){
        return CompletableFuture.runAsync(()->{
            mqttsConf.getMqtts().forEach((key,mqttConf)->{
                try {
                    MqttAsyncClient mqttAsyncClient = null;
                    if (mqttConf.isSubscribe() || mqttConf.isPublish()){
                        PahoClientOption pahoClientOption = new PahoClientOption();
                        pahoClientOption.setClientId(key);
                        pahoClientOption.setUserName(mqttConf.getUsername());
                        pahoClientOption.setPassword(mqttConf.getPassword());
                        pahoClientOption.setServerURI(mqttConf.getMqttHost()+":"+mqttConf.getMqttPort());
                        mqttAsyncClient = (MqttAsyncClient) pahoManager.buildMsgClient(pahoClientOption);
                        mqttAsyncClientMap.put(key,mqttAsyncClient);
                    }
                    if (mqttConf.isSubscribe()){
                        PahoSubscribeOption pahoSubscribeOption = new PahoSubscribeOption();
                        pahoSubscribeOption.setIotMsgClient(mqttAsyncClient);
                        pahoSubscribeOption.setQos(new int[]{mqttConf.getQos()});
                        pahoSubscribeOption.setTopicFilters(new String[]{mqttConf.getTopic()});
                        PahoConsumerHandle pahoConsumerHandle = new PahoConsumerHandle(key);
                        pahoSubscribeOption.setIMqttMessageListeners(new PahoConsumerHandle[]{pahoConsumerHandle});
                        pahoManager.subscribe(pahoSubscribeOption);
                    }
                }catch (Exception e){
                    log.error("InitParserService.initMqtt error|"+key,e);
                }
            });
        });
    }

    public void handleMqttMessage(String topic,String message,String consumerName){

    }
}
