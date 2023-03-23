package park.base.tk.mybatis.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "t_device")
public class Device implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 公厕id
     */
    @Column(name = "wc_id")
    private Integer wcId;

    @Column(name = "wc_detail_id")
    private Integer wcDetailId;

    /**
     * 厕位id
     */
    @Column(name = "position_id")
    private Integer positionId;

    private String version;

    /**
     * 设备名称
     */
    @Column(name = "device_name")
    private String deviceName;

    /**
     * 0-电表，1-水表，2-AQ(空气质量),3-硫化氢,4-氨气,5-8路采集盒,6-摄像头,7-网关,8-魔镜,9-485液位,10-垃圾桶,11-16路采集盒,12-红外纸巾卷,13-红外纸巾抽,14-红外液位,15-门磁开关,16门磁锁开关
     */
    @Column(name = "device_type")
    private Integer deviceType;

    /**
     * 设备唯一id
     */
    @Column(name = "device_id")
    private String deviceId;

    /**
     * 创建人id
     */
    @Column(name = "creater_id")
    private Integer createrId;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 是否被删除
     */
    @Column(name = "is_del")
    private Boolean isDel;

    /**
     * 最近一次活跃时间
     */
    @Column(name = "last_active")
    private Date lastActive;

    private Boolean online;

    /**
     * 更新时间
     */
    @Column(name = "update_time")
    private Date updateTime;

    /**
     * 下线时间
     */
    @Column(name = "offline_time")
    private Date offlineTime;

    private Integer pid;

    /**
     * 设备父类型，1-网络设备(网关、摄像头、评价屏),2-485传感器,3-开关传感器,4-耗材监控设备
     */
    private Integer ptype;

    /**
     * lorawan,联动设备id
     */
    @Column(name = "partner_id")
    private String partnerId;

    /**
     * lorawanserver application id
     */
    private Integer appid;

    private static final long serialVersionUID = 1L;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取公厕id
     *
     * @return wc_id - 公厕id
     */
    public Integer getWcId() {
        return wcId;
    }

    /**
     * 设置公厕id
     *
     * @param wcId 公厕id
     */
    public void setWcId(Integer wcId) {
        this.wcId = wcId;
    }

    /**
     * @return wc_detail_id
     */
    public Integer getWcDetailId() {
        return wcDetailId;
    }

    /**
     * @param wcDetailId
     */
    public void setWcDetailId(Integer wcDetailId) {
        this.wcDetailId = wcDetailId;
    }

    /**
     * 获取厕位id
     *
     * @return position_id - 厕位id
     */
    public Integer getPositionId() {
        return positionId;
    }

    /**
     * 设置厕位id
     *
     * @param positionId 厕位id
     */
    public void setPositionId(Integer positionId) {
        this.positionId = positionId;
    }

    /**
     * @return version
     */
    public String getVersion() {
        return version;
    }

    /**
     * @param version
     */
    public void setVersion(String version) {
        this.version = version == null ? null : version.trim();
    }

    /**
     * 获取设备名称
     *
     * @return device_name - 设备名称
     */
    public String getDeviceName() {
        return deviceName;
    }

    /**
     * 设置设备名称
     *
     * @param deviceName 设备名称
     */
    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName == null ? null : deviceName.trim();
    }

    /**
     * 获取0-电表，1-水表，2-AQ(空气质量),3-硫化氢,4-氨气,5-8路采集盒,6-摄像头,7-网关,8-魔镜,9-485液位,10-垃圾桶,11-16路采集盒,12-红外纸巾卷,13-红外纸巾抽,14-红外液位,15-门磁开关,16门磁锁开关
     *
     * @return device_type - 0-电表，1-水表，2-AQ(空气质量),3-硫化氢,4-氨气,5-8路采集盒,6-摄像头,7-网关,8-魔镜,9-485液位,10-垃圾桶,11-16路采集盒,12-红外纸巾卷,13-红外纸巾抽,14-红外液位,15-门磁开关,16门磁锁开关
     */
    public Integer getDeviceType() {
        return deviceType;
    }

    /**
     * 设置0-电表，1-水表，2-AQ(空气质量),3-硫化氢,4-氨气,5-8路采集盒,6-摄像头,7-网关,8-魔镜,9-485液位,10-垃圾桶,11-16路采集盒,12-红外纸巾卷,13-红外纸巾抽,14-红外液位,15-门磁开关,16门磁锁开关
     *
     * @param deviceType 0-电表，1-水表，2-AQ(空气质量),3-硫化氢,4-氨气,5-8路采集盒,6-摄像头,7-网关,8-魔镜,9-485液位,10-垃圾桶,11-16路采集盒,12-红外纸巾卷,13-红外纸巾抽,14-红外液位,15-门磁开关,16门磁锁开关
     */
    public void setDeviceType(Integer deviceType) {
        this.deviceType = deviceType;
    }

    /**
     * 获取设备唯一id
     *
     * @return device_id - 设备唯一id
     */
    public String getDeviceId() {
        return deviceId;
    }

    /**
     * 设置设备唯一id
     *
     * @param deviceId 设备唯一id
     */
    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId == null ? null : deviceId.trim();
    }

    /**
     * 获取创建人id
     *
     * @return creater_id - 创建人id
     */
    public Integer getCreaterId() {
        return createrId;
    }

    /**
     * 设置创建人id
     *
     * @param createrId 创建人id
     */
    public void setCreaterId(Integer createrId) {
        this.createrId = createrId;
    }

    /**
     * 获取创建时间
     *
     * @return create_time - 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取是否被删除
     *
     * @return is_del - 是否被删除
     */
    public Boolean getIsDel() {
        return isDel;
    }

    /**
     * 设置是否被删除
     *
     * @param isDel 是否被删除
     */
    public void setIsDel(Boolean isDel) {
        this.isDel = isDel;
    }

    /**
     * 获取最近一次活跃时间
     *
     * @return last_active - 最近一次活跃时间
     */
    public Date getLastActive() {
        return lastActive;
    }

    /**
     * 设置最近一次活跃时间
     *
     * @param lastActive 最近一次活跃时间
     */
    public void setLastActive(Date lastActive) {
        this.lastActive = lastActive;
    }

    /**
     * @return online
     */
    public Boolean getOnline() {
        return online;
    }

    /**
     * @param online
     */
    public void setOnline(Boolean online) {
        this.online = online;
    }

    /**
     * 获取更新时间
     *
     * @return update_time - 更新时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置更新时间
     *
     * @param updateTime 更新时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 获取下线时间
     *
     * @return offline_time - 下线时间
     */
    public Date getOfflineTime() {
        return offlineTime;
    }

    /**
     * 设置下线时间
     *
     * @param offlineTime 下线时间
     */
    public void setOfflineTime(Date offlineTime) {
        this.offlineTime = offlineTime;
    }

    /**
     * @return pid
     */
    public Integer getPid() {
        return pid;
    }

    /**
     * @param pid
     */
    public void setPid(Integer pid) {
        this.pid = pid;
    }

    /**
     * 获取设备父类型，1-网络设备(网关、摄像头、评价屏),2-485传感器,3-开关传感器,4-耗材监控设备
     *
     * @return ptype - 设备父类型，1-网络设备(网关、摄像头、评价屏),2-485传感器,3-开关传感器,4-耗材监控设备
     */
    public Integer getPtype() {
        return ptype;
    }

    /**
     * 设置设备父类型，1-网络设备(网关、摄像头、评价屏),2-485传感器,3-开关传感器,4-耗材监控设备
     *
     * @param ptype 设备父类型，1-网络设备(网关、摄像头、评价屏),2-485传感器,3-开关传感器,4-耗材监控设备
     */
    public void setPtype(Integer ptype) {
        this.ptype = ptype;
    }

    /**
     * 获取lorawan,联动设备id
     *
     * @return partner_id - lorawan,联动设备id
     */
    public String getPartnerId() {
        return partnerId;
    }

    /**
     * 设置lorawan,联动设备id
     *
     * @param partnerId lorawan,联动设备id
     */
    public void setPartnerId(String partnerId) {
        this.partnerId = partnerId == null ? null : partnerId.trim();
    }

    /**
     * 获取lorawanserver application id
     *
     * @return appid - lorawanserver application id
     */
    public Integer getAppid() {
        return appid;
    }

    /**
     * 设置lorawanserver application id
     *
     * @param appid lorawanserver application id
     */
    public void setAppid(Integer appid) {
        this.appid = appid;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", wcId=").append(wcId);
        sb.append(", wcDetailId=").append(wcDetailId);
        sb.append(", positionId=").append(positionId);
        sb.append(", version=").append(version);
        sb.append(", deviceName=").append(deviceName);
        sb.append(", deviceType=").append(deviceType);
        sb.append(", deviceId=").append(deviceId);
        sb.append(", createrId=").append(createrId);
        sb.append(", createTime=").append(createTime);
        sb.append(", isDel=").append(isDel);
        sb.append(", lastActive=").append(lastActive);
        sb.append(", online=").append(online);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", offlineTime=").append(offlineTime);
        sb.append(", pid=").append(pid);
        sb.append(", ptype=").append(ptype);
        sb.append(", partnerId=").append(partnerId);
        sb.append(", appid=").append(appid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}