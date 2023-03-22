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
@TableName("t_wc")
public class TWc implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private Integer unitId;

    private String unitName;

    private String wcName;

    private String streetName;

    private String ownerType;

    private String buildingName;

    private String floor;

    private String address;

    private Date completedTime;

    private Date createTime;

    private String principal;

    private Double lng;

    private Double lat;

    private Boolean isRepair;

    private String adminPhone;

    /**
     * 是否删除
     */
    private Boolean isDel;

    private String wcNo;

    private String guidanceUrl;

    private String constructionUrl;

    private String phoneUrl;

    private String timelaps01Url;

    private String timelaps02Url;

    private String timelaps03Url;

    private String timelaps04Url;

    private String timelaps05Url;

    private String timelaps06Url;

    private Integer buildingId;

    /**
     * 公司id
     */
    private Integer companyId;

    /**
     * 创建人id
     */
    private Integer createrId;

    /**
     * 园区
     */
    private String parkName;

    /**
     * 园区大厦编号 A B栋
     */
    private String parkNo;

    /**
     * 园区 大厦方向  如:A座东
     */
    private String parkSubNo;

    /**
     * 第一名稱,
     */
    private String firstName;

    /**
     * 第二名稱
     */
    private String secondName;


}
