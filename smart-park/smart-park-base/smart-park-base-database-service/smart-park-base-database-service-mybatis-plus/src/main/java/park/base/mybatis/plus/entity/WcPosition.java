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
@TableName("wc_position")
public class WcPosition implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 厕所id
     */
    private Integer wcId;

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
    private String houseNo;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 房间唯一位置编号
     */
    private Integer number;


}
