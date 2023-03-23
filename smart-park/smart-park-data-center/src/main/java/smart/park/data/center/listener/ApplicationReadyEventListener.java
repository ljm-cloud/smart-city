package smart.park.data.center.listener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;
import smart.park.common.provider.SmartParkApplicationContextProvider;
import smart.pulsar.client.service.PulsarConsumerService;
import smart.pulsar.client.service.PulsarPublisherService;

/**
 * @author ljm
 * @date 2023/3/23 10:44
 */
@Component
@Slf4j
public class ApplicationReadyEventListener implements ApplicationListener<ApplicationReadyEvent> {

    @Override
    public void onApplicationEvent(ApplicationReadyEvent event) {
        log.info("smart-park-data-center applicationReadyEvent start...");
        SmartParkApplicationContextProvider.getBean(PulsarPublisherService.class).initPublishers();
        SmartParkApplicationContextProvider.getBean(PulsarConsumerService.class).initConsumers();
        log.info("smart-park-data-center applicationReadyEvent end...");
    }
}
