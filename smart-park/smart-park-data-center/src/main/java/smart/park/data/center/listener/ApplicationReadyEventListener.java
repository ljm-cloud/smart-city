package smart.park.data.center.listener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;
import smart.park.common.provider.SmartParkApplicationContextProvider;
import smart.park.data.center.common.helper.GlobalHelper;
import smart.park.data.center.parsed.base.AbstractParsed;
import smart.pulsar.client.service.PulsarConsumerService;
import smart.pulsar.client.service.PulsarPublisherService;
import java.util.function.Function;
import java.util.stream.Collectors;

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
        GlobalHelper.abstractParsedMap = SmartParkApplicationContextProvider.getApplicationContext().getBeansOfType(AbstractParsed.class).values().stream().collect(Collectors.toMap(abstractParsed -> abstractParsed.getDeviceType().getValue(), Function.identity()));
        SmartParkApplicationContextProvider.getBean(PulsarPublisherService.class).initPublishers();
        SmartParkApplicationContextProvider.getBean(PulsarConsumerService.class).initConsumers();
        log.info("smart-park-data-center applicationReadyEvent end...");
    }
}
