package smart.park.common.config;

/**
 * @author ljm
 * @date 2023/3/16 18:06
 */
public enum DeviceType {
    AQ(1,"aq",1);
    ;
    private final Integer value;
    private final String name;
    private final Integer version;

    public Integer getValue() {
        return value;
    }

    public String getName() {
        return name;
    }

    public Integer getVersion() {
        return version;
    }

    DeviceType(Integer value, String name, Integer version){
        this.value = value;
        this.name = name;
        this.version = version;
    }
}
