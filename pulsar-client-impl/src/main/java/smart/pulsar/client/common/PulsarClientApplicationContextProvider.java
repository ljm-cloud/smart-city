package smart.pulsar.client.common;

import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 * @author ljm
 * @date 2023/2/24 16:01
 */
@Component
public class PulsarClientApplicationContextProvider {
    private static ApplicationContext applicationContext ;
    public PulsarClientApplicationContextProvider(ApplicationContext applicationContext){
        PulsarClientApplicationContextProvider.applicationContext = applicationContext;
    }
    /**
     * 获取容器
     * @return
     */
    public static ApplicationContext getApplicationContext() {
        return applicationContext;
    }

    /**
     * 获取容器对象
     * @param type
     * @param <T>
     * @return
     */
    public static <T> T getBean(Class<T> type) {
        return applicationContext.getBean(type);
    }
}
