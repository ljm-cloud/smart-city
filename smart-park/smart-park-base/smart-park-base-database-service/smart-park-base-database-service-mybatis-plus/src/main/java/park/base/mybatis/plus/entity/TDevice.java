package park.base.mybatis.plus.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author ljm
 * @since 2023-03-22
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("t_device")
public class TDevice implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 公厕id
     */
    private Integer wcId;

    private Integer wcDetailId;

    /**
     * 厕位id
     */
    private Integer positionId;

    private String version;

    /**
     * 设备名称
     */
    private String deviceName;

    /**
     * 0-电表，1-水表，2-AQ(空气质量),3-硫化氢,4-氨气,5-8路采集盒,6-摄像头,7-网关,8-魔镜,9-485液位,10-垃圾桶,11-16路采集盒,12-红外纸巾卷,13-红外纸巾抽,14-红外液位,15-门磁开关,16门磁锁开关
     */
    private Integer deviceType;

    /**
     * 设备唯一id
     */
    private String deviceId;

    /**
     * 创建人id
     */
    private Integer createrId;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 是否被删除
     */
    private Boolean isDel;

    /**
     * 最近一次活跃时间
     */
    private Date lastActive;

    private Boolean online;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 下线时间
     */
    private Date offlineTime;

    private Integer pid;

    /**
     * 设备父类型，1-网络设备(网关、摄像头、评价屏),2-485传感器,3-开关传感器,4-耗材监控设备
     */
    private Integer ptype;

    /**
     * lorawan,联动设备id
     */
    private String partnerId;

    /**
     * lorawanserver application id
     */
    private Integer appid;


}
