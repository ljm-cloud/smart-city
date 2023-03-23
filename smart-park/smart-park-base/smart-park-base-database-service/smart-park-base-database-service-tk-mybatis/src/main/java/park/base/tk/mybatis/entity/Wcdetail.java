package park.base.tk.mybatis.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "t_wc_detail")
public class Wcdetail implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer type;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "wc_id")
    private Integer wcId;

    @Column(name = "is_repair")
    private Integer isRepair;

    /**
     * 0
     */
    @Column(name = "is_del")
    private Boolean isDel;

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
     * @return type
     */
    public Integer getType() {
        return type;
    }

    /**
     * @param type
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * @return create_time
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * @param createTime
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * @return wc_id
     */
    public Integer getWcId() {
        return wcId;
    }

    /**
     * @param wcId
     */
    public void setWcId(Integer wcId) {
        this.wcId = wcId;
    }

    /**
     * @return is_repair
     */
    public Integer getIsRepair() {
        return isRepair;
    }

    /**
     * @param isRepair
     */
    public void setIsRepair(Integer isRepair) {
        this.isRepair = isRepair;
    }

    /**
     * 获取0
     *
     * @return is_del - 0
     */
    public Boolean getIsDel() {
        return isDel;
    }

    /**
     * 设置0
     *
     * @param isDel 0
     */
    public void setIsDel(Boolean isDel) {
        this.isDel = isDel;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", type=").append(type);
        sb.append(", createTime=").append(createTime);
        sb.append(", wcId=").append(wcId);
        sb.append(", isRepair=").append(isRepair);
        sb.append(", isDel=").append(isDel);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}