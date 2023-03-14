package smart.park.common.provider;

import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 * @author ljm
 * @date 2023/3/14 10:27
 */
@Component
public class SmartParkApplicationContextProvider {
    private static ApplicationContext applicationContext;
    public SmartParkApplicationContextProvider(ApplicationContext applicationContext){
        SmartParkApplicationContextProvider.applicationContext = applicationContext;
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
