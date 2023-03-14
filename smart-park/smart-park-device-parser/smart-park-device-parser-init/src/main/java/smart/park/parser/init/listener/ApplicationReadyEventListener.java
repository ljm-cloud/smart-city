package smart.park.parser.init.listener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;
import smart.park.common.provider.SmartParkApplicationContextProvider;
import smart.park.parser.init.service.InitParserService;
import smart.pulsar.client.service.PulsarPublisherService;

/**
 * @author ljm
 * @date 2023/3/14 14:05
 */
@Component
@Slf4j
public class ApplicationReadyEventListener implements ApplicationListener<ApplicationReadyEvent> {
    @Override
    public void onApplicationEvent(ApplicationReadyEvent event) {
        log.info("Smart-park-device-parser-init applicationReadyEvent start...");
        SmartParkApplicationContextProvider.getBean(PulsarPublisherService.class).initPublishers()
                .thenRun(()->SmartParkApplicationContextProvider.getBean(InitParserService.class).initMqtt());
        log.info("Smart-park-device-parser-init applicationReadyEvent end...");
    }
}
