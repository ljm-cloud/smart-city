package park.base.tk.mybatis.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "t_wc")
public class Wc implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "unit_id")
    private Integer unitId;

    @Column(name = "unit_name")
    private String unitName;

    @Column(name = "wc_name")
    private String wcName;

    @Column(name = "street_name")
    private String streetName;

    @Column(name = "owner_type")
    private String ownerType;

    @Column(name = "building_name")
    private String buildingName;

    private String floor;

    private String address;

    @Column(name = "completed_time")
    private Date completedTime;

    @Column(name = "create_time")
    private Date createTime;

    private String principal;

    private Double lng;

    private Double lat;

    @Column(name = "is_repair")
    private Boolean isRepair;

    @Column(name = "admin_phone")
    private String adminPhone;

    /**
     * 是否删除
     */
    @Column(name = "is_del")
    private Boolean isDel;

    @Column(name = "wc_no")
    private String wcNo;

    @Column(name = "guidance_url")
    private String guidanceUrl;

    @Column(name = "construction_url")
    private String constructionUrl;

    @Column(name = "phone_url")
    private String phoneUrl;

    @Column(name = "timelaps01_url")
    private String timelaps01Url;

    @Column(name = "timelaps02_url")
    private String timelaps02Url;

    @Column(name = "timelaps03_url")
    private String timelaps03Url;

    @Column(name = "timelaps04_url")
    private String timelaps04Url;

    @Column(name = "timelaps05_url")
    private String timelaps05Url;

    @Column(name = "timelaps06_url")
    private String timelaps06Url;

    @Column(name = "building_id")
    private Integer buildingId;

    /**
     * 公司id
     */
    @Column(name = "company_id")
    private Integer companyId;

    /**
     * 创建人id
     */
    @Column(name = "creater_id")
    private Integer createrId;

    /**
     * 园区
     */
    @Column(name = "park_name")
    private String parkName;

    /**
     * 园区大厦编号 A B栋
     */
    @Column(name = "park_no")
    private String parkNo;

    /**
     * 园区 大厦方向  如:A座东
     */
    @Column(name = "park_sub_no")
    private String parkSubNo;

    /**
     * 第一名稱,
     */
    @Column(name = "first_name")
    private String firstName;

    /**
     * 第二名稱
     */
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
     * @return unit_id
     */
    public Integer getUnitId() {
        return unitId;
    }

    /**
     * @param unitId
     */
    public void setUnitId(Integer unitId) {
        this.unitId = unitId;
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
     * @return wc_name
     */
    public String getWcName() {
        return wcName;
    }

    /**
     * @param wcName
     */
    public void setWcName(String wcName) {
        this.wcName = wcName == null ? null : wcName.trim();
    }

    /**
     * @return street_name
     */
    public String getStreetName() {
        return streetName;
    }

    /**
     * @param streetName
     */
    public void setStreetName(String streetName) {
        this.streetName = streetName == null ? null : streetName.trim();
    }

    /**
     * @return owner_type
     */
    public String getOwnerType() {
        return ownerType;
    }

    /**
     * @param ownerType
     */
    public void setOwnerType(String ownerType) {
        this.ownerType = ownerType == null ? null : ownerType.trim();
    }

    /**
     * @return building_name
     */
    public String getBuildingName() {
        return buildingName;
    }

    /**
     * @param buildingName
     */
    public void setBuildingName(String buildingName) {
        this.buildingName = buildingName == null ? null : buildingName.trim();
    }

    /**
     * @return floor
     */
    public String getFloor() {
        return floor;
    }

    /**
     * @param floor
     */
    public void setFloor(String floor) {
        this.floor = floor == null ? null : floor.trim();
    }

    /**
     * @return address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    /**
     * @return completed_time
     */
    public Date getCompletedTime() {
        return completedTime;
    }

    /**
     * @param completedTime
     */
    public void setCompletedTime(Date completedTime) {
        this.completedTime = completedTime;
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
     * @return principal
     */
    public String getPrincipal() {
        return principal;
    }

    /**
     * @param principal
     */
    public void setPrincipal(String principal) {
        this.principal = principal == null ? null : principal.trim();
    }

    /**
     * @return lng
     */
    public Double getLng() {
        return lng;
    }

    /**
     * @param lng
     */
    public void setLng(Double lng) {
        this.lng = lng;
    }

    /**
     * @return lat
     */
    public Double getLat() {
        return lat;
    }

    /**
     * @param lat
     */
    public void setLat(Double lat) {
        this.lat = lat;
    }

    /**
     * @return is_repair
     */
    public Boolean getIsRepair() {
        return isRepair;
    }

    /**
     * @param isRepair
     */
    public void setIsRepair(Boolean isRepair) {
        this.isRepair = isRepair;
    }

    /**
     * @return admin_phone
     */
    public String getAdminPhone() {
        return adminPhone;
    }

    /**
     * @param adminPhone
     */
    public void setAdminPhone(String adminPhone) {
        this.adminPhone = adminPhone == null ? null : adminPhone.trim();
    }

    /**
     * 获取是否删除
     *
     * @return is_del - 是否删除
     */
    public Boolean getIsDel() {
        return isDel;
    }

    /**
     * 设置是否删除
     *
     * @param isDel 是否删除
     */
    public void setIsDel(Boolean isDel) {
        this.isDel = isDel;
    }

    /**
     * @return wc_no
     */
    public String getWcNo() {
        return wcNo;
    }

    /**
     * @param wcNo
     */
    public void setWcNo(String wcNo) {
        this.wcNo = wcNo == null ? null : wcNo.trim();
    }

    /**
     * @return guidance_url
     */
    public String getGuidanceUrl() {
        return guidanceUrl;
    }

    /**
     * @param guidanceUrl
     */
    public void setGuidanceUrl(String guidanceUrl) {
        this.guidanceUrl = guidanceUrl == null ? null : guidanceUrl.trim();
    }

    /**
     * @return construction_url
     */
    public String getConstructionUrl() {
        return constructionUrl;
    }

    /**
     * @param constructionUrl
     */
    public void setConstructionUrl(String constructionUrl) {
        this.constructionUrl = constructionUrl == null ? null : constructionUrl.trim();
    }

    /**
     * @return phone_url
     */
    public String getPhoneUrl() {
        return phoneUrl;
    }

    /**
     * @param phoneUrl
     */
    public void setPhoneUrl(String phoneUrl) {
        this.phoneUrl = phoneUrl == null ? null : phoneUrl.trim();
    }

    /**
     * @return timelaps01_url
     */
    public String getTimelaps01Url() {
        return timelaps01Url;
    }

    /**
     * @param timelaps01Url
     */
    public void setTimelaps01Url(String timelaps01Url) {
        this.timelaps01Url = timelaps01Url == null ? null : timelaps01Url.trim();
    }

    /**
     * @return timelaps02_url
     */
    public String getTimelaps02Url() {
        return timelaps02Url;
    }

    /**
     * @param timelaps02Url
     */
    public void setTimelaps02Url(String timelaps02Url) {
        this.timelaps02Url = timelaps02Url == null ? null : timelaps02Url.trim();
    }

    /**
     * @return timelaps03_url
     */
    public String getTimelaps03Url() {
        return timelaps03Url;
    }

    /**
     * @param timelaps03Url
     */
    public void setTimelaps03Url(String timelaps03Url) {
        this.timelaps03Url = timelaps03Url == null ? null : timelaps03Url.trim();
    }

    /**
     * @return timelaps04_url
     */
    public String getTimelaps04Url() {
        return timelaps04Url;
    }

    /**
     * @param timelaps04Url
     */
    public void setTimelaps04Url(String timelaps04Url) {
        this.timelaps04Url = timelaps04Url == null ? null : timelaps04Url.trim();
    }

    /**
     * @return timelaps05_url
     */
    public String getTimelaps05Url() {
        return timelaps05Url;
    }

    /**
     * @param timelaps05Url
     */
    public void setTimelaps05Url(String timelaps05Url) {
        this.timelaps05Url = timelaps05Url == null ? null : timelaps05Url.trim();
    }

    /**
     * @return timelaps06_url
     */
    public String getTimelaps06Url() {
        return timelaps06Url;
    }

    /**
     * @param timelaps06Url
     */
    public void setTimelaps06Url(String timelaps06Url) {
        this.timelaps06Url = timelaps06Url == null ? null : timelaps06Url.trim();
    }

    /**
     * @return building_id
     */
    public Integer getBuildingId() {
        return buildingId;
    }

    /**
     * @param buildingId
     */
    public void setBuildingId(Integer buildingId) {
        this.buildingId = buildingId;
    }

    /**
     * 获取公司id
     *
     * @return company_id - 公司id
     */
    public Integer getCompanyId() {
        return companyId;
    }

    /**
     * 设置公司id
     *
     * @param companyId 公司id
     */
    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
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
     * 获取园区
     *
     * @return park_name - 园区
     */
    public String getParkName() {
        return parkName;
    }

    /**
     * 设置园区
     *
     * @param parkName 园区
     */
    public void setParkName(String parkName) {
        this.parkName = parkName == null ? null : parkName.trim();
    }

    /**
     * 获取园区大厦编号 A B栋
     *
     * @return park_no - 园区大厦编号 A B栋
     */
    public String getParkNo() {
        return parkNo;
    }

    /**
     * 设置园区大厦编号 A B栋
     *
     * @param parkNo 园区大厦编号 A B栋
     */
    public void setParkNo(String parkNo) {
        this.parkNo = parkNo == null ? null : parkNo.trim();
    }

    /**
     * 获取园区 大厦方向  如:A座东
     *
     * @return park_sub_no - 园区 大厦方向  如:A座东
     */
    public String getParkSubNo() {
        return parkSubNo;
    }

    /**
     * 设置园区 大厦方向  如:A座东
     *
     * @param parkSubNo 园区 大厦方向  如:A座东
     */
    public void setParkSubNo(String parkSubNo) {
        this.parkSubNo = parkSubNo == null ? null : parkSubNo.trim();
    }

    /**
     * 获取第一名稱,
     *
     * @return first_name - 第一名稱,
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * 设置第一名稱,
     *
     * @param firstName 第一名稱,
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName == null ? null : firstName.trim();
    }

    /**
     * 获取第二名稱
     *
     * @return second_name - 第二名稱
     */
    public String getSecondName() {
        return secondName;
    }

    /**
     * 设置第二名稱
     *
     * @param secondName 第二名稱
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
        sb.append(", unitId=").append(unitId);
        sb.append(", unitName=").append(unitName);
        sb.append(", wcName=").append(wcName);
        sb.append(", streetName=").append(streetName);
        sb.append(", ownerType=").append(ownerType);
        sb.append(", buildingName=").append(buildingName);
        sb.append(", floor=").append(floor);
        sb.append(", address=").append(address);
        sb.append(", completedTime=").append(completedTime);
        sb.append(", createTime=").append(createTime);
        sb.append(", principal=").append(principal);
        sb.append(", lng=").append(lng);
        sb.append(", lat=").append(lat);
        sb.append(", isRepair=").append(isRepair);
        sb.append(", adminPhone=").append(adminPhone);
        sb.append(", isDel=").append(isDel);
        sb.append(", wcNo=").append(wcNo);
        sb.append(", guidanceUrl=").append(guidanceUrl);
        sb.append(", constructionUrl=").append(constructionUrl);
        sb.append(", phoneUrl=").append(phoneUrl);
        sb.append(", timelaps01Url=").append(timelaps01Url);
        sb.append(", timelaps02Url=").append(timelaps02Url);
        sb.append(", timelaps03Url=").append(timelaps03Url);
        sb.append(", timelaps04Url=").append(timelaps04Url);
        sb.append(", timelaps05Url=").append(timelaps05Url);
        sb.append(", timelaps06Url=").append(timelaps06Url);
        sb.append(", buildingId=").append(buildingId);
        sb.append(", companyId=").append(companyId);
        sb.append(", createrId=").append(createrId);
        sb.append(", parkName=").append(parkName);
        sb.append(", parkNo=").append(parkNo);
        sb.append(", parkSubNo=").append(parkSubNo);
        sb.append(", firstName=").append(firstName);
        sb.append(", secondName=").append(secondName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}