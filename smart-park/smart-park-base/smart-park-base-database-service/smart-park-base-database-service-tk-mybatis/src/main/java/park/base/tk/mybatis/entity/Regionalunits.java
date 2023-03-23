package park.base.tk.mybatis.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "t_regional_units")
public class Regionalunits implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "unit_name")
    private String unitName;

    @Column(name = "unit_subname")
    private String unitSubname;

    @Column(name = "unit_orgname")
    private String unitOrgname;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "second_name")
    private String secondName;

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
     * @return unit_name
     */
    public String getUnitName() {
        return unitName;
    }

    /**
     * @param unitName
     */
    public void setUnitName(String unitName) {
        this.unitName = unitName == null ? null : unitName.trim();
    }

    /**
     * @return unit_subname
     */
    public String getUnitSubname() {
        return unitSubname;
    }

    /**
     * @param unitSubname
     */
    public void setUnitSubname(String unitSubname) {
        this.unitSubname = unitSubname == null ? null : unitSubname.trim();
    }

    /**
     * @return unit_orgname
     */
    public String getUnitOrgname() {
        return unitOrgname;
    }

    /**
     * @param unitOrgname
     */
    public void setUnitOrgname(String unitOrgname) {
        this.unitOrgname = unitOrgname == null ? null : unitOrgname.trim();
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
     * @return second_name
     */
    public String getSecondName() {
        return secondName;
    }

    /**
     * @param secondName
     */
    public void setSecondName(String secondName) {
        this.secondName = secondName == null ? null : secondName.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", unitName=").append(unitName);
        sb.append(", unitSubname=").append(unitSubname);
        sb.append(", unitOrgname=").append(unitOrgname);
        sb.append(", createTime=").append(createTime);
        sb.append(", secondName=").append(secondName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}