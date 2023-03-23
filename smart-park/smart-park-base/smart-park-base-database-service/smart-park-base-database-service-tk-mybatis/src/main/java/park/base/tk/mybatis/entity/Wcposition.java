package park.base.tk.mybatis.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "wc_position")
public class Wcposition implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 厕所id
     */
    @Column(name = "wc_id")
    private Integer wcId;

    @Column(name = "wc_detail_id")
    private Integer wcDetailId;

    /**
     * 男生尿斗 0  蹲位1  马桶2  女生女蹲位3  女马桶4,洗手液-5,纸巾卷-6,纸巾抽-7 尿布台-8 育婴室-9 哺乳室-10
     */
    private Integer type;

    /**
     * 厕所位置 1号位  2号位  3号位
     */
    private Integer position;

    /**
     * 不用 房间编号
     */
    @Column(name = "house_no")
    private String houseNo;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 房间唯一位置编号
     */
    private Integer number;

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
     * 获取厕所id
     *
     * @return wc_id - 厕所id
     */
    public Integer getWcId() {
        return wcId;
    }

    /**
     * 设置厕所id
     *
     * @param wcId 厕所id
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
     * 获取男生尿斗 0  蹲位1  马桶2  女生女蹲位3  女马桶4,洗手液-5,纸巾卷-6,纸巾抽-7 尿布台-8 育婴室-9 哺乳室-10
     *
     * @return type - 男生尿斗 0  蹲位1  马桶2  女生女蹲位3  女马桶4,洗手液-5,纸巾卷-6,纸巾抽-7 尿布台-8 育婴室-9 哺乳室-10
     */
    public Integer getType() {
        return type;
    }

    /**
     * 设置男生尿斗 0  蹲位1  马桶2  女生女蹲位3  女马桶4,洗手液-5,纸巾卷-6,纸巾抽-7 尿布台-8 育婴室-9 哺乳室-10
     *
     * @param type 男生尿斗 0  蹲位1  马桶2  女生女蹲位3  女马桶4,洗手液-5,纸巾卷-6,纸巾抽-7 尿布台-8 育婴室-9 哺乳室-10
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * 获取厕所位置 1号位  2号位  3号位
     *
     * @return position - 厕所位置 1号位  2号位  3号位
     */
    public Integer getPosition() {
        return position;
    }

    /**
     * 设置厕所位置 1号位  2号位  3号位
     *
     * @param position 厕所位置 1号位  2号位  3号位
     */
    public void setPosition(Integer position) {
        this.position = position;
    }

    /**
     * 获取不用 房间编号
     *
     * @return house_no - 不用 房间编号
     */
    public String getHouseNo() {
        return houseNo;
    }

    /**
     * 设置不用 房间编号
     *
     * @param houseNo 不用 房间编号
     */
    public void setHouseNo(String houseNo) {
        this.houseNo = houseNo == null ? null : houseNo.trim();
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
     * 获取房间唯一位置编号
     *
     * @return number - 房间唯一位置编号
     */
    public Integer getNumber() {
        return number;
    }

    /**
     * 设置房间唯一位置编号
     *
     * @param number 房间唯一位置编号
     */
    public void setNumber(Integer number) {
        this.number = number;
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
        sb.append(", type=").append(type);
        sb.append(", position=").append(position);
        sb.append(", houseNo=").append(houseNo);
        sb.append(", createTime=").append(createTime);
        sb.append(", number=").append(number);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}