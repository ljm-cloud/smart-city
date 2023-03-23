package park.base.tk.mybatis.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class WcExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WcExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andUnitIdIsNull() {
            addCriterion("unit_id is null");
            return (Criteria) this;
        }

        public Criteria andUnitIdIsNotNull() {
            addCriterion("unit_id is not null");
            return (Criteria) this;
        }

        public Criteria andUnitIdEqualTo(Integer value) {
            addCriterion("unit_id =", value, "unitId");
            return (Criteria) this;
        }

        public Criteria andUnitIdNotEqualTo(Integer value) {
            addCriterion("unit_id <>", value, "unitId");
            return (Criteria) this;
        }

        public Criteria andUnitIdGreaterThan(Integer value) {
            addCriterion("unit_id >", value, "unitId");
            return (Criteria) this;
        }

        public Criteria andUnitIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("unit_id >=", value, "unitId");
            return (Criteria) this;
        }

        public Criteria andUnitIdLessThan(Integer value) {
            addCriterion("unit_id <", value, "unitId");
            return (Criteria) this;
        }

        public Criteria andUnitIdLessThanOrEqualTo(Integer value) {
            addCriterion("unit_id <=", value, "unitId");
            return (Criteria) this;
        }

        public Criteria andUnitIdIn(List<Integer> values) {
            addCriterion("unit_id in", values, "unitId");
            return (Criteria) this;
        }

        public Criteria andUnitIdNotIn(List<Integer> values) {
            addCriterion("unit_id not in", values, "unitId");
            return (Criteria) this;
        }

        public Criteria andUnitIdBetween(Integer value1, Integer value2) {
            addCriterion("unit_id between", value1, value2, "unitId");
            return (Criteria) this;
        }

        public Criteria andUnitIdNotBetween(Integer value1, Integer value2) {
            addCriterion("unit_id not between", value1, value2, "unitId");
            return (Criteria) this;
        }

        public Criteria andUnitNameIsNull() {
            addCriterion("unit_name is null");
            return (Criteria) this;
        }

        public Criteria andUnitNameIsNotNull() {
            addCriterion("unit_name is not null");
            return (Criteria) this;
        }

        public Criteria andUnitNameEqualTo(String value) {
            addCriterion("unit_name =", value, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameNotEqualTo(String value) {
            addCriterion("unit_name <>", value, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameGreaterThan(String value) {
            addCriterion("unit_name >", value, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameGreaterThanOrEqualTo(String value) {
            addCriterion("unit_name >=", value, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameLessThan(String value) {
            addCriterion("unit_name <", value, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameLessThanOrEqualTo(String value) {
            addCriterion("unit_name <=", value, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameLike(String value) {
            addCriterion("unit_name like", value, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameNotLike(String value) {
            addCriterion("unit_name not like", value, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameIn(List<String> values) {
            addCriterion("unit_name in", values, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameNotIn(List<String> values) {
            addCriterion("unit_name not in", values, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameBetween(String value1, String value2) {
            addCriterion("unit_name between", value1, value2, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameNotBetween(String value1, String value2) {
            addCriterion("unit_name not between", value1, value2, "unitName");
            return (Criteria) this;
        }

        public Criteria andWcNameIsNull() {
            addCriterion("wc_name is null");
            return (Criteria) this;
        }

        public Criteria andWcNameIsNotNull() {
            addCriterion("wc_name is not null");
            return (Criteria) this;
        }

        public Criteria andWcNameEqualTo(String value) {
            addCriterion("wc_name =", value, "wcName");
            return (Criteria) this;
        }

        public Criteria andWcNameNotEqualTo(String value) {
            addCriterion("wc_name <>", value, "wcName");
            return (Criteria) this;
        }

        public Criteria andWcNameGreaterThan(String value) {
            addCriterion("wc_name >", value, "wcName");
            return (Criteria) this;
        }

        public Criteria andWcNameGreaterThanOrEqualTo(String value) {
            addCriterion("wc_name >=", value, "wcName");
            return (Criteria) this;
        }

        public Criteria andWcNameLessThan(String value) {
            addCriterion("wc_name <", value, "wcName");
            return (Criteria) this;
        }

        public Criteria andWcNameLessThanOrEqualTo(String value) {
            addCriterion("wc_name <=", value, "wcName");
            return (Criteria) this;
        }

        public Criteria andWcNameLike(String value) {
            addCriterion("wc_name like", value, "wcName");
            return (Criteria) this;
        }

        public Criteria andWcNameNotLike(String value) {
            addCriterion("wc_name not like", value, "wcName");
            return (Criteria) this;
        }

        public Criteria andWcNameIn(List<String> values) {
            addCriterion("wc_name in", values, "wcName");
            return (Criteria) this;
        }

        public Criteria andWcNameNotIn(List<String> values) {
            addCriterion("wc_name not in", values, "wcName");
            return (Criteria) this;
        }

        public Criteria andWcNameBetween(String value1, String value2) {
            addCriterion("wc_name between", value1, value2, "wcName");
            return (Criteria) this;
        }

        public Criteria andWcNameNotBetween(String value1, String value2) {
            addCriterion("wc_name not between", value1, value2, "wcName");
            return (Criteria) this;
        }

        public Criteria andStreetNameIsNull() {
            addCriterion("street_name is null");
            return (Criteria) this;
        }

        public Criteria andStreetNameIsNotNull() {
            addCriterion("street_name is not null");
            return (Criteria) this;
        }

        public Criteria andStreetNameEqualTo(String value) {
            addCriterion("street_name =", value, "streetName");
            return (Criteria) this;
        }

        public Criteria andStreetNameNotEqualTo(String value) {
            addCriterion("street_name <>", value, "streetName");
            return (Criteria) this;
        }

        public Criteria andStreetNameGreaterThan(String value) {
            addCriterion("street_name >", value, "streetName");
            return (Criteria) this;
        }

        public Criteria andStreetNameGreaterThanOrEqualTo(String value) {
            addCriterion("street_name >=", value, "streetName");
            return (Criteria) this;
        }

        public Criteria andStreetNameLessThan(String value) {
            addCriterion("street_name <", value, "streetName");
            return (Criteria) this;
        }

        public Criteria andStreetNameLessThanOrEqualTo(String value) {
            addCriterion("street_name <=", value, "streetName");
            return (Criteria) this;
        }

        public Criteria andStreetNameLike(String value) {
            addCriterion("street_name like", value, "streetName");
            return (Criteria) this;
        }

        public Criteria andStreetNameNotLike(String value) {
            addCriterion("street_name not like", value, "streetName");
            return (Criteria) this;
        }

        public Criteria andStreetNameIn(List<String> values) {
            addCriterion("street_name in", values, "streetName");
            return (Criteria) this;
        }

        public Criteria andStreetNameNotIn(List<String> values) {
            addCriterion("street_name not in", values, "streetName");
            return (Criteria) this;
        }

        public Criteria andStreetNameBetween(String value1, String value2) {
            addCriterion("street_name between", value1, value2, "streetName");
            return (Criteria) this;
        }

        public Criteria andStreetNameNotBetween(String value1, String value2) {
            addCriterion("street_name not between", value1, value2, "streetName");
            return (Criteria) this;
        }

        public Criteria andOwnerTypeIsNull() {
            addCriterion("owner_type is null");
            return (Criteria) this;
        }

        public Criteria andOwnerTypeIsNotNull() {
            addCriterion("owner_type is not null");
            return (Criteria) this;
        }

        public Criteria andOwnerTypeEqualTo(String value) {
            addCriterion("owner_type =", value, "ownerType");
            return (Criteria) this;
        }

        public Criteria andOwnerTypeNotEqualTo(String value) {
            addCriterion("owner_type <>", value, "ownerType");
            return (Criteria) this;
        }

        public Criteria andOwnerTypeGreaterThan(String value) {
            addCriterion("owner_type >", value, "ownerType");
            return (Criteria) this;
        }

        public Criteria andOwnerTypeGreaterThanOrEqualTo(String value) {
            addCriterion("owner_type >=", value, "ownerType");
            return (Criteria) this;
        }

        public Criteria andOwnerTypeLessThan(String value) {
            addCriterion("owner_type <", value, "ownerType");
            return (Criteria) this;
        }

        public Criteria andOwnerTypeLessThanOrEqualTo(String value) {
            addCriterion("owner_type <=", value, "ownerType");
            return (Criteria) this;
        }

        public Criteria andOwnerTypeLike(String value) {
            addCriterion("owner_type like", value, "ownerType");
            return (Criteria) this;
        }

        public Criteria andOwnerTypeNotLike(String value) {
            addCriterion("owner_type not like", value, "ownerType");
            return (Criteria) this;
        }

        public Criteria andOwnerTypeIn(List<String> values) {
            addCriterion("owner_type in", values, "ownerType");
            return (Criteria) this;
        }

        public Criteria andOwnerTypeNotIn(List<String> values) {
            addCriterion("owner_type not in", values, "ownerType");
            return (Criteria) this;
        }

        public Criteria andOwnerTypeBetween(String value1, String value2) {
            addCriterion("owner_type between", value1, value2, "ownerType");
            return (Criteria) this;
        }

        public Criteria andOwnerTypeNotBetween(String value1, String value2) {
            addCriterion("owner_type not between", value1, value2, "ownerType");
            return (Criteria) this;
        }

        public Criteria andBuildingNameIsNull() {
            addCriterion("building_name is null");
            return (Criteria) this;
        }

        public Criteria andBuildingNameIsNotNull() {
            addCriterion("building_name is not null");
            return (Criteria) this;
        }

        public Criteria andBuildingNameEqualTo(String value) {
            addCriterion("building_name =", value, "buildingName");
            return (Criteria) this;
        }

        public Criteria andBuildingNameNotEqualTo(String value) {
            addCriterion("building_name <>", value, "buildingName");
            return (Criteria) this;
        }

        public Criteria andBuildingNameGreaterThan(String value) {
            addCriterion("building_name >", value, "buildingName");
            return (Criteria) this;
        }

        public Criteria andBuildingNameGreaterThanOrEqualTo(String value) {
            addCriterion("building_name >=", value, "buildingName");
            return (Criteria) this;
        }

        public Criteria andBuildingNameLessThan(String value) {
            addCriterion("building_name <", value, "buildingName");
            return (Criteria) this;
        }

        public Criteria andBuildingNameLessThanOrEqualTo(String value) {
            addCriterion("building_name <=", value, "buildingName");
            return (Criteria) this;
        }

        public Criteria andBuildingNameLike(String value) {
            addCriterion("building_name like", value, "buildingName");
            return (Criteria) this;
        }

        public Criteria andBuildingNameNotLike(String value) {
            addCriterion("building_name not like", value, "buildingName");
            return (Criteria) this;
        }

        public Criteria andBuildingNameIn(List<String> values) {
            addCriterion("building_name in", values, "buildingName");
            return (Criteria) this;
        }

        public Criteria andBuildingNameNotIn(List<String> values) {
            addCriterion("building_name not in", values, "buildingName");
            return (Criteria) this;
        }

        public Criteria andBuildingNameBetween(String value1, String value2) {
            addCriterion("building_name between", value1, value2, "buildingName");
            return (Criteria) this;
        }

        public Criteria andBuildingNameNotBetween(String value1, String value2) {
            addCriterion("building_name not between", value1, value2, "buildingName");
            return (Criteria) this;
        }

        public Criteria andFloorIsNull() {
            addCriterion("floor is null");
            return (Criteria) this;
        }

        public Criteria andFloorIsNotNull() {
            addCriterion("floor is not null");
            return (Criteria) this;
        }

        public Criteria andFloorEqualTo(String value) {
            addCriterion("floor =", value, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorNotEqualTo(String value) {
            addCriterion("floor <>", value, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorGreaterThan(String value) {
            addCriterion("floor >", value, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorGreaterThanOrEqualTo(String value) {
            addCriterion("floor >=", value, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorLessThan(String value) {
            addCriterion("floor <", value, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorLessThanOrEqualTo(String value) {
            addCriterion("floor <=", value, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorLike(String value) {
            addCriterion("floor like", value, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorNotLike(String value) {
            addCriterion("floor not like", value, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorIn(List<String> values) {
            addCriterion("floor in", values, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorNotIn(List<String> values) {
            addCriterion("floor not in", values, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorBetween(String value1, String value2) {
            addCriterion("floor between", value1, value2, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorNotBetween(String value1, String value2) {
            addCriterion("floor not between", value1, value2, "floor");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andCompletedTimeIsNull() {
            addCriterion("completed_time is null");
            return (Criteria) this;
        }

        public Criteria andCompletedTimeIsNotNull() {
            addCriterion("completed_time is not null");
            return (Criteria) this;
        }

        public Criteria andCompletedTimeEqualTo(Date value) {
            addCriterionForJDBCDate("completed_time =", value, "completedTime");
            return (Criteria) this;
        }

        public Criteria andCompletedTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("completed_time <>", value, "completedTime");
            return (Criteria) this;
        }

        public Criteria andCompletedTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("completed_time >", value, "completedTime");
            return (Criteria) this;
        }

        public Criteria andCompletedTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("completed_time >=", value, "completedTime");
            return (Criteria) this;
        }

        public Criteria andCompletedTimeLessThan(Date value) {
            addCriterionForJDBCDate("completed_time <", value, "completedTime");
            return (Criteria) this;
        }

        public Criteria andCompletedTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("completed_time <=", value, "completedTime");
            return (Criteria) this;
        }

        public Criteria andCompletedTimeIn(List<Date> values) {
            addCriterionForJDBCDate("completed_time in", values, "completedTime");
            return (Criteria) this;
        }

        public Criteria andCompletedTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("completed_time not in", values, "completedTime");
            return (Criteria) this;
        }

        public Criteria andCompletedTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("completed_time between", value1, value2, "completedTime");
            return (Criteria) this;
        }

        public Criteria andCompletedTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("completed_time not between", value1, value2, "completedTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andPrincipalIsNull() {
            addCriterion("principal is null");
            return (Criteria) this;
        }

        public Criteria andPrincipalIsNotNull() {
            addCriterion("principal is not null");
            return (Criteria) this;
        }

        public Criteria andPrincipalEqualTo(String value) {
            addCriterion("principal =", value, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalNotEqualTo(String value) {
            addCriterion("principal <>", value, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalGreaterThan(String value) {
            addCriterion("principal >", value, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalGreaterThanOrEqualTo(String value) {
            addCriterion("principal >=", value, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalLessThan(String value) {
            addCriterion("principal <", value, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalLessThanOrEqualTo(String value) {
            addCriterion("principal <=", value, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalLike(String value) {
            addCriterion("principal like", value, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalNotLike(String value) {
            addCriterion("principal not like", value, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalIn(List<String> values) {
            addCriterion("principal in", values, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalNotIn(List<String> values) {
            addCriterion("principal not in", values, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalBetween(String value1, String value2) {
            addCriterion("principal between", value1, value2, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalNotBetween(String value1, String value2) {
            addCriterion("principal not between", value1, value2, "principal");
            return (Criteria) this;
        }

        public Criteria andLngIsNull() {
            addCriterion("lng is null");
            return (Criteria) this;
        }

        public Criteria andLngIsNotNull() {
            addCriterion("lng is not null");
            return (Criteria) this;
        }

        public Criteria andLngEqualTo(Double value) {
            addCriterion("lng =", value, "lng");
            return (Criteria) this;
        }

        public Criteria andLngNotEqualTo(Double value) {
            addCriterion("lng <>", value, "lng");
            return (Criteria) this;
        }

        public Criteria andLngGreaterThan(Double value) {
            addCriterion("lng >", value, "lng");
            return (Criteria) this;
        }

        public Criteria andLngGreaterThanOrEqualTo(Double value) {
            addCriterion("lng >=", value, "lng");
            return (Criteria) this;
        }

        public Criteria andLngLessThan(Double value) {
            addCriterion("lng <", value, "lng");
            return (Criteria) this;
        }

        public Criteria andLngLessThanOrEqualTo(Double value) {
            addCriterion("lng <=", value, "lng");
            return (Criteria) this;
        }

        public Criteria andLngIn(List<Double> values) {
            addCriterion("lng in", values, "lng");
            return (Criteria) this;
        }

        public Criteria andLngNotIn(List<Double> values) {
            addCriterion("lng not in", values, "lng");
            return (Criteria) this;
        }

        public Criteria andLngBetween(Double value1, Double value2) {
            addCriterion("lng between", value1, value2, "lng");
            return (Criteria) this;
        }

        public Criteria andLngNotBetween(Double value1, Double value2) {
            addCriterion("lng not between", value1, value2, "lng");
            return (Criteria) this;
        }

        public Criteria andLatIsNull() {
            addCriterion("lat is null");
            return (Criteria) this;
        }

        public Criteria andLatIsNotNull() {
            addCriterion("lat is not null");
            return (Criteria) this;
        }

        public Criteria andLatEqualTo(Double value) {
            addCriterion("lat =", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatNotEqualTo(Double value) {
            addCriterion("lat <>", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatGreaterThan(Double value) {
            addCriterion("lat >", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatGreaterThanOrEqualTo(Double value) {
            addCriterion("lat >=", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatLessThan(Double value) {
            addCriterion("lat <", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatLessThanOrEqualTo(Double value) {
            addCriterion("lat <=", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatIn(List<Double> values) {
            addCriterion("lat in", values, "lat");
            return (Criteria) this;
        }

        public Criteria andLatNotIn(List<Double> values) {
            addCriterion("lat not in", values, "lat");
            return (Criteria) this;
        }

        public Criteria andLatBetween(Double value1, Double value2) {
            addCriterion("lat between", value1, value2, "lat");
            return (Criteria) this;
        }

        public Criteria andLatNotBetween(Double value1, Double value2) {
            addCriterion("lat not between", value1, value2, "lat");
            return (Criteria) this;
        }

        public Criteria andIsRepairIsNull() {
            addCriterion("is_repair is null");
            return (Criteria) this;
        }

        public Criteria andIsRepairIsNotNull() {
            addCriterion("is_repair is not null");
            return (Criteria) this;
        }

        public Criteria andIsRepairEqualTo(Boolean value) {
            addCriterion("is_repair =", value, "isRepair");
            return (Criteria) this;
        }

        public Criteria andIsRepairNotEqualTo(Boolean value) {
            addCriterion("is_repair <>", value, "isRepair");
            return (Criteria) this;
        }

        public Criteria andIsRepairGreaterThan(Boolean value) {
            addCriterion("is_repair >", value, "isRepair");
            return (Criteria) this;
        }

        public Criteria andIsRepairGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_repair >=", value, "isRepair");
            return (Criteria) this;
        }

        public Criteria andIsRepairLessThan(Boolean value) {
            addCriterion("is_repair <", value, "isRepair");
            return (Criteria) this;
        }

        public Criteria andIsRepairLessThanOrEqualTo(Boolean value) {
            addCriterion("is_repair <=", value, "isRepair");
            return (Criteria) this;
        }

        public Criteria andIsRepairIn(List<Boolean> values) {
            addCriterion("is_repair in", values, "isRepair");
            return (Criteria) this;
        }

        public Criteria andIsRepairNotIn(List<Boolean> values) {
            addCriterion("is_repair not in", values, "isRepair");
            return (Criteria) this;
        }

        public Criteria andIsRepairBetween(Boolean value1, Boolean value2) {
            addCriterion("is_repair between", value1, value2, "isRepair");
            return (Criteria) this;
        }

        public Criteria andIsRepairNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_repair not between", value1, value2, "isRepair");
            return (Criteria) this;
        }

        public Criteria andAdminPhoneIsNull() {
            addCriterion("admin_phone is null");
            return (Criteria) this;
        }

        public Criteria andAdminPhoneIsNotNull() {
            addCriterion("admin_phone is not null");
            return (Criteria) this;
        }

        public Criteria andAdminPhoneEqualTo(String value) {
            addCriterion("admin_phone =", value, "adminPhone");
            return (Criteria) this;
        }

        public Criteria andAdminPhoneNotEqualTo(String value) {
            addCriterion("admin_phone <>", value, "adminPhone");
            return (Criteria) this;
        }

        public Criteria andAdminPhoneGreaterThan(String value) {
            addCriterion("admin_phone >", value, "adminPhone");
            return (Criteria) this;
        }

        public Criteria andAdminPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("admin_phone >=", value, "adminPhone");
            return (Criteria) this;
        }

        public Criteria andAdminPhoneLessThan(String value) {
            addCriterion("admin_phone <", value, "adminPhone");
            return (Criteria) this;
        }

        public Criteria andAdminPhoneLessThanOrEqualTo(String value) {
            addCriterion("admin_phone <=", value, "adminPhone");
            return (Criteria) this;
        }

        public Criteria andAdminPhoneLike(String value) {
            addCriterion("admin_phone like", value, "adminPhone");
            return (Criteria) this;
        }

        public Criteria andAdminPhoneNotLike(String value) {
            addCriterion("admin_phone not like", value, "adminPhone");
            return (Criteria) this;
        }

        public Criteria andAdminPhoneIn(List<String> values) {
            addCriterion("admin_phone in", values, "adminPhone");
            return (Criteria) this;
        }

        public Criteria andAdminPhoneNotIn(List<String> values) {
            addCriterion("admin_phone not in", values, "adminPhone");
            return (Criteria) this;
        }

        public Criteria andAdminPhoneBetween(String value1, String value2) {
            addCriterion("admin_phone between", value1, value2, "adminPhone");
            return (Criteria) this;
        }

        public Criteria andAdminPhoneNotBetween(String value1, String value2) {
            addCriterion("admin_phone not between", value1, value2, "adminPhone");
            return (Criteria) this;
        }

        public Criteria andIsDelIsNull() {
            addCriterion("is_del is null");
            return (Criteria) this;
        }

        public Criteria andIsDelIsNotNull() {
            addCriterion("is_del is not null");
            return (Criteria) this;
        }

        public Criteria andIsDelEqualTo(Boolean value) {
            addCriterion("is_del =", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelNotEqualTo(Boolean value) {
            addCriterion("is_del <>", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelGreaterThan(Boolean value) {
            addCriterion("is_del >", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_del >=", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelLessThan(Boolean value) {
            addCriterion("is_del <", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelLessThanOrEqualTo(Boolean value) {
            addCriterion("is_del <=", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelIn(List<Boolean> values) {
            addCriterion("is_del in", values, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelNotIn(List<Boolean> values) {
            addCriterion("is_del not in", values, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelBetween(Boolean value1, Boolean value2) {
            addCriterion("is_del between", value1, value2, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_del not between", value1, value2, "isDel");
            return (Criteria) this;
        }

        public Criteria andWcNoIsNull() {
            addCriterion("wc_no is null");
            return (Criteria) this;
        }

        public Criteria andWcNoIsNotNull() {
            addCriterion("wc_no is not null");
            return (Criteria) this;
        }

        public Criteria andWcNoEqualTo(String value) {
            addCriterion("wc_no =", value, "wcNo");
            return (Criteria) this;
        }

        public Criteria andWcNoNotEqualTo(String value) {
            addCriterion("wc_no <>", value, "wcNo");
            return (Criteria) this;
        }

        public Criteria andWcNoGreaterThan(String value) {
            addCriterion("wc_no >", value, "wcNo");
            return (Criteria) this;
        }

        public Criteria andWcNoGreaterThanOrEqualTo(String value) {
            addCriterion("wc_no >=", value, "wcNo");
            return (Criteria) this;
        }

        public Criteria andWcNoLessThan(String value) {
            addCriterion("wc_no <", value, "wcNo");
            return (Criteria) this;
        }

        public Criteria andWcNoLessThanOrEqualTo(String value) {
            addCriterion("wc_no <=", value, "wcNo");
            return (Criteria) this;
        }

        public Criteria andWcNoLike(String value) {
            addCriterion("wc_no like", value, "wcNo");
            return (Criteria) this;
        }

        public Criteria andWcNoNotLike(String value) {
            addCriterion("wc_no not like", value, "wcNo");
            return (Criteria) this;
        }

        public Criteria andWcNoIn(List<String> values) {
            addCriterion("wc_no in", values, "wcNo");
            return (Criteria) this;
        }

        public Criteria andWcNoNotIn(List<String> values) {
            addCriterion("wc_no not in", values, "wcNo");
            return (Criteria) this;
        }

        public Criteria andWcNoBetween(String value1, String value2) {
            addCriterion("wc_no between", value1, value2, "wcNo");
            return (Criteria) this;
        }

        public Criteria andWcNoNotBetween(String value1, String value2) {
            addCriterion("wc_no not between", value1, value2, "wcNo");
            return (Criteria) this;
        }

        public Criteria andGuidanceUrlIsNull() {
            addCriterion("guidance_url is null");
            return (Criteria) this;
        }

        public Criteria andGuidanceUrlIsNotNull() {
            addCriterion("guidance_url is not null");
            return (Criteria) this;
        }

        public Criteria andGuidanceUrlEqualTo(String value) {
            addCriterion("guidance_url =", value, "guidanceUrl");
            return (Criteria) this;
        }

        public Criteria andGuidanceUrlNotEqualTo(String value) {
            addCriterion("guidance_url <>", value, "guidanceUrl");
            return (Criteria) this;
        }

        public Criteria andGuidanceUrlGreaterThan(String value) {
            addCriterion("guidance_url >", value, "guidanceUrl");
            return (Criteria) this;
        }

        public Criteria andGuidanceUrlGreaterThanOrEqualTo(String value) {
            addCriterion("guidance_url >=", value, "guidanceUrl");
            return (Criteria) this;
        }

        public Criteria andGuidanceUrlLessThan(String value) {
            addCriterion("guidance_url <", value, "guidanceUrl");
            return (Criteria) this;
        }

        public Criteria andGuidanceUrlLessThanOrEqualTo(String value) {
            addCriterion("guidance_url <=", value, "guidanceUrl");
            return (Criteria) this;
        }

        public Criteria andGuidanceUrlLike(String value) {
            addCriterion("guidance_url like", value, "guidanceUrl");
            return (Criteria) this;
        }

        public Criteria andGuidanceUrlNotLike(String value) {
            addCriterion("guidance_url not like", value, "guidanceUrl");
            return (Criteria) this;
        }

        public Criteria andGuidanceUrlIn(List<String> values) {
            addCriterion("guidance_url in", values, "guidanceUrl");
            return (Criteria) this;
        }

        public Criteria andGuidanceUrlNotIn(List<String> values) {
            addCriterion("guidance_url not in", values, "guidanceUrl");
            return (Criteria) this;
        }

        public Criteria andGuidanceUrlBetween(String value1, String value2) {
            addCriterion("guidance_url between", value1, value2, "guidanceUrl");
            return (Criteria) this;
        }

        public Criteria andGuidanceUrlNotBetween(String value1, String value2) {
            addCriterion("guidance_url not between", value1, value2, "guidanceUrl");
            return (Criteria) this;
        }

        public Criteria andConstructionUrlIsNull() {
            addCriterion("construction_url is null");
            return (Criteria) this;
        }

        public Criteria andConstructionUrlIsNotNull() {
            addCriterion("construction_url is not null");
            return (Criteria) this;
        }

        public Criteria andConstructionUrlEqualTo(String value) {
            addCriterion("construction_url =", value, "constructionUrl");
            return (Criteria) this;
        }

        public Criteria andConstructionUrlNotEqualTo(String value) {
            addCriterion("construction_url <>", value, "constructionUrl");
            return (Criteria) this;
        }

        public Criteria andConstructionUrlGreaterThan(String value) {
            addCriterion("construction_url >", value, "constructionUrl");
            return (Criteria) this;
        }

        public Criteria andConstructionUrlGreaterThanOrEqualTo(String value) {
            addCriterion("construction_url >=", value, "constructionUrl");
            return (Criteria) this;
        }

        public Criteria andConstructionUrlLessThan(String value) {
            addCriterion("construction_url <", value, "constructionUrl");
            return (Criteria) this;
        }

        public Criteria andConstructionUrlLessThanOrEqualTo(String value) {
            addCriterion("construction_url <=", value, "constructionUrl");
            return (Criteria) this;
        }

        public Criteria andConstructionUrlLike(String value) {
            addCriterion("construction_url like", value, "constructionUrl");
            return (Criteria) this;
        }

        public Criteria andConstructionUrlNotLike(String value) {
            addCriterion("construction_url not like", value, "constructionUrl");
            return (Criteria) this;
        }

        public Criteria andConstructionUrlIn(List<String> values) {
            addCriterion("construction_url in", values, "constructionUrl");
            return (Criteria) this;
        }

        public Criteria andConstructionUrlNotIn(List<String> values) {
            addCriterion("construction_url not in", values, "constructionUrl");
            return (Criteria) this;
        }

        public Criteria andConstructionUrlBetween(String value1, String value2) {
            addCriterion("construction_url between", value1, value2, "constructionUrl");
            return (Criteria) this;
        }

        public Criteria andConstructionUrlNotBetween(String value1, String value2) {
            addCriterion("construction_url not between", value1, value2, "constructionUrl");
            return (Criteria) this;
        }

        public Criteria andPhoneUrlIsNull() {
            addCriterion("phone_url is null");
            return (Criteria) this;
        }

        public Criteria andPhoneUrlIsNotNull() {
            addCriterion("phone_url is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneUrlEqualTo(String value) {
            addCriterion("phone_url =", value, "phoneUrl");
            return (Criteria) this;
        }

        public Criteria andPhoneUrlNotEqualTo(String value) {
            addCriterion("phone_url <>", value, "phoneUrl");
            return (Criteria) this;
        }

        public Criteria andPhoneUrlGreaterThan(String value) {
            addCriterion("phone_url >", value, "phoneUrl");
            return (Criteria) this;
        }

        public Criteria andPhoneUrlGreaterThanOrEqualTo(String value) {
            addCriterion("phone_url >=", value, "phoneUrl");
            return (Criteria) this;
        }

        public Criteria andPhoneUrlLessThan(String value) {
            addCriterion("phone_url <", value, "phoneUrl");
            return (Criteria) this;
        }

        public Criteria andPhoneUrlLessThanOrEqualTo(String value) {
            addCriterion("phone_url <=", value, "phoneUrl");
            return (Criteria) this;
        }

        public Criteria andPhoneUrlLike(String value) {
            addCriterion("phone_url like", value, "phoneUrl");
            return (Criteria) this;
        }

        public Criteria andPhoneUrlNotLike(String value) {
            addCriterion("phone_url not like", value, "phoneUrl");
            return (Criteria) this;
        }

        public Criteria andPhoneUrlIn(List<String> values) {
            addCriterion("phone_url in", values, "phoneUrl");
            return (Criteria) this;
        }

        public Criteria andPhoneUrlNotIn(List<String> values) {
            addCriterion("phone_url not in", values, "phoneUrl");
            return (Criteria) this;
        }

        public Criteria andPhoneUrlBetween(String value1, String value2) {
            addCriterion("phone_url between", value1, value2, "phoneUrl");
            return (Criteria) this;
        }

        public Criteria andPhoneUrlNotBetween(String value1, String value2) {
            addCriterion("phone_url not between", value1, value2, "phoneUrl");
            return (Criteria) this;
        }

        public Criteria andTimelaps01UrlIsNull() {
            addCriterion("timelaps01_url is null");
            return (Criteria) this;
        }

        public Criteria andTimelaps01UrlIsNotNull() {
            addCriterion("timelaps01_url is not null");
            return (Criteria) this;
        }

        public Criteria andTimelaps01UrlEqualTo(String value) {
            addCriterion("timelaps01_url =", value, "timelaps01Url");
            return (Criteria) this;
        }

        public Criteria andTimelaps01UrlNotEqualTo(String value) {
            addCriterion("timelaps01_url <>", value, "timelaps01Url");
            return (Criteria) this;
        }

        public Criteria andTimelaps01UrlGreaterThan(String value) {
            addCriterion("timelaps01_url >", value, "timelaps01Url");
            return (Criteria) this;
        }

        public Criteria andTimelaps01UrlGreaterThanOrEqualTo(String value) {
            addCriterion("timelaps01_url >=", value, "timelaps01Url");
            return (Criteria) this;
        }

        public Criteria andTimelaps01UrlLessThan(String value) {
            addCriterion("timelaps01_url <", value, "timelaps01Url");
            return (Criteria) this;
        }

        public Criteria andTimelaps01UrlLessThanOrEqualTo(String value) {
            addCriterion("timelaps01_url <=", value, "timelaps01Url");
            return (Criteria) this;
        }

        public Criteria andTimelaps01UrlLike(String value) {
            addCriterion("timelaps01_url like", value, "timelaps01Url");
            return (Criteria) this;
        }

        public Criteria andTimelaps01UrlNotLike(String value) {
            addCriterion("timelaps01_url not like", value, "timelaps01Url");
            return (Criteria) this;
        }

        public Criteria andTimelaps01UrlIn(List<String> values) {
            addCriterion("timelaps01_url in", values, "timelaps01Url");
            return (Criteria) this;
        }

        public Criteria andTimelaps01UrlNotIn(List<String> values) {
            addCriterion("timelaps01_url not in", values, "timelaps01Url");
            return (Criteria) this;
        }

        public Criteria andTimelaps01UrlBetween(String value1, String value2) {
            addCriterion("timelaps01_url between", value1, value2, "timelaps01Url");
            return (Criteria) this;
        }

        public Criteria andTimelaps01UrlNotBetween(String value1, String value2) {
            addCriterion("timelaps01_url not between", value1, value2, "timelaps01Url");
            return (Criteria) this;
        }

        public Criteria andTimelaps02UrlIsNull() {
            addCriterion("timelaps02_url is null");
            return (Criteria) this;
        }

        public Criteria andTimelaps02UrlIsNotNull() {
            addCriterion("timelaps02_url is not null");
            return (Criteria) this;
        }

        public Criteria andTimelaps02UrlEqualTo(String value) {
            addCriterion("timelaps02_url =", value, "timelaps02Url");
            return (Criteria) this;
        }

        public Criteria andTimelaps02UrlNotEqualTo(String value) {
            addCriterion("timelaps02_url <>", value, "timelaps02Url");
            return (Criteria) this;
        }

        public Criteria andTimelaps02UrlGreaterThan(String value) {
            addCriterion("timelaps02_url >", value, "timelaps02Url");
            return (Criteria) this;
        }

        public Criteria andTimelaps02UrlGreaterThanOrEqualTo(String value) {
            addCriterion("timelaps02_url >=", value, "timelaps02Url");
            return (Criteria) this;
        }

        public Criteria andTimelaps02UrlLessThan(String value) {
            addCriterion("timelaps02_url <", value, "timelaps02Url");
            return (Criteria) this;
        }

        public Criteria andTimelaps02UrlLessThanOrEqualTo(String value) {
            addCriterion("timelaps02_url <=", value, "timelaps02Url");
            return (Criteria) this;
        }

        public Criteria andTimelaps02UrlLike(String value) {
            addCriterion("timelaps02_url like", value, "timelaps02Url");
            return (Criteria) this;
        }

        public Criteria andTimelaps02UrlNotLike(String value) {
            addCriterion("timelaps02_url not like", value, "timelaps02Url");
            return (Criteria) this;
        }

        public Criteria andTimelaps02UrlIn(List<String> values) {
            addCriterion("timelaps02_url in", values, "timelaps02Url");
            return (Criteria) this;
        }

        public Criteria andTimelaps02UrlNotIn(List<String> values) {
            addCriterion("timelaps02_url not in", values, "timelaps02Url");
            return (Criteria) this;
        }

        public Criteria andTimelaps02UrlBetween(String value1, String value2) {
            addCriterion("timelaps02_url between", value1, value2, "timelaps02Url");
            return (Criteria) this;
        }

        public Criteria andTimelaps02UrlNotBetween(String value1, String value2) {
            addCriterion("timelaps02_url not between", value1, value2, "timelaps02Url");
            return (Criteria) this;
        }

        public Criteria andTimelaps03UrlIsNull() {
            addCriterion("timelaps03_url is null");
            return (Criteria) this;
        }

        public Criteria andTimelaps03UrlIsNotNull() {
            addCriterion("timelaps03_url is not null");
            return (Criteria) this;
        }

        public Criteria andTimelaps03UrlEqualTo(String value) {
            addCriterion("timelaps03_url =", value, "timelaps03Url");
            return (Criteria) this;
        }

        public Criteria andTimelaps03UrlNotEqualTo(String value) {
            addCriterion("timelaps03_url <>", value, "timelaps03Url");
            return (Criteria) this;
        }

        public Criteria andTimelaps03UrlGreaterThan(String value) {
            addCriterion("timelaps03_url >", value, "timelaps03Url");
            return (Criteria) this;
        }

        public Criteria andTimelaps03UrlGreaterThanOrEqualTo(String value) {
            addCriterion("timelaps03_url >=", value, "timelaps03Url");
            return (Criteria) this;
        }

        public Criteria andTimelaps03UrlLessThan(String value) {
            addCriterion("timelaps03_url <", value, "timelaps03Url");
            return (Criteria) this;
        }

        public Criteria andTimelaps03UrlLessThanOrEqualTo(String value) {
            addCriterion("timelaps03_url <=", value, "timelaps03Url");
            return (Criteria) this;
        }

        public Criteria andTimelaps03UrlLike(String value) {
            addCriterion("timelaps03_url like", value, "timelaps03Url");
            return (Criteria) this;
        }

        public Criteria andTimelaps03UrlNotLike(String value) {
            addCriterion("timelaps03_url not like", value, "timelaps03Url");
            return (Criteria) this;
        }

        public Criteria andTimelaps03UrlIn(List<String> values) {
            addCriterion("timelaps03_url in", values, "timelaps03Url");
            return (Criteria) this;
        }

        public Criteria andTimelaps03UrlNotIn(List<String> values) {
            addCriterion("timelaps03_url not in", values, "timelaps03Url");
            return (Criteria) this;
        }

        public Criteria andTimelaps03UrlBetween(String value1, String value2) {
            addCriterion("timelaps03_url between", value1, value2, "timelaps03Url");
            return (Criteria) this;
        }

        public Criteria andTimelaps03UrlNotBetween(String value1, String value2) {
            addCriterion("timelaps03_url not between", value1, value2, "timelaps03Url");
            return (Criteria) this;
        }

        public Criteria andTimelaps04UrlIsNull() {
            addCriterion("timelaps04_url is null");
            return (Criteria) this;
        }

        public Criteria andTimelaps04UrlIsNotNull() {
            addCriterion("timelaps04_url is not null");
            return (Criteria) this;
        }

        public Criteria andTimelaps04UrlEqualTo(String value) {
            addCriterion("timelaps04_url =", value, "timelaps04Url");
            return (Criteria) this;
        }

        public Criteria andTimelaps04UrlNotEqualTo(String value) {
            addCriterion("timelaps04_url <>", value, "timelaps04Url");
            return (Criteria) this;
        }

        public Criteria andTimelaps04UrlGreaterThan(String value) {
            addCriterion("timelaps04_url >", value, "timelaps04Url");
            return (Criteria) this;
        }

        public Criteria andTimelaps04UrlGreaterThanOrEqualTo(String value) {
            addCriterion("timelaps04_url >=", value, "timelaps04Url");
            return (Criteria) this;
        }

        public Criteria andTimelaps04UrlLessThan(String value) {
            addCriterion("timelaps04_url <", value, "timelaps04Url");
            return (Criteria) this;
        }

        public Criteria andTimelaps04UrlLessThanOrEqualTo(String value) {
            addCriterion("timelaps04_url <=", value, "timelaps04Url");
            return (Criteria) this;
        }

        public Criteria andTimelaps04UrlLike(String value) {
            addCriterion("timelaps04_url like", value, "timelaps04Url");
            return (Criteria) this;
        }

        public Criteria andTimelaps04UrlNotLike(String value) {
            addCriterion("timelaps04_url not like", value, "timelaps04Url");
            return (Criteria) this;
        }

        public Criteria andTimelaps04UrlIn(List<String> values) {
            addCriterion("timelaps04_url in", values, "timelaps04Url");
            return (Criteria) this;
        }

        public Criteria andTimelaps04UrlNotIn(List<String> values) {
            addCriterion("timelaps04_url not in", values, "timelaps04Url");
            return (Criteria) this;
        }

        public Criteria andTimelaps04UrlBetween(String value1, String value2) {
            addCriterion("timelaps04_url between", value1, value2, "timelaps04Url");
            return (Criteria) this;
        }

        public Criteria andTimelaps04UrlNotBetween(String value1, String value2) {
            addCriterion("timelaps04_url not between", value1, value2, "timelaps04Url");
            return (Criteria) this;
        }

        public Criteria andTimelaps05UrlIsNull() {
            addCriterion("timelaps05_url is null");
            return (Criteria) this;
        }

        public Criteria andTimelaps05UrlIsNotNull() {
            addCriterion("timelaps05_url is not null");
            return (Criteria) this;
        }

        public Criteria andTimelaps05UrlEqualTo(String value) {
            addCriterion("timelaps05_url =", value, "timelaps05Url");
            return (Criteria) this;
        }

        public Criteria andTimelaps05UrlNotEqualTo(String value) {
            addCriterion("timelaps05_url <>", value, "timelaps05Url");
            return (Criteria) this;
        }

        public Criteria andTimelaps05UrlGreaterThan(String value) {
            addCriterion("timelaps05_url >", value, "timelaps05Url");
            return (Criteria) this;
        }

        public Criteria andTimelaps05UrlGreaterThanOrEqualTo(String value) {
            addCriterion("timelaps05_url >=", value, "timelaps05Url");
            return (Criteria) this;
        }

        public Criteria andTimelaps05UrlLessThan(String value) {
            addCriterion("timelaps05_url <", value, "timelaps05Url");
            return (Criteria) this;
        }

        public Criteria andTimelaps05UrlLessThanOrEqualTo(String value) {
            addCriterion("timelaps05_url <=", value, "timelaps05Url");
            return (Criteria) this;
        }

        public Criteria andTimelaps05UrlLike(String value) {
            addCriterion("timelaps05_url like", value, "timelaps05Url");
            return (Criteria) this;
        }

        public Criteria andTimelaps05UrlNotLike(String value) {
            addCriterion("timelaps05_url not like", value, "timelaps05Url");
            return (Criteria) this;
        }

        public Criteria andTimelaps05UrlIn(List<String> values) {
            addCriterion("timelaps05_url in", values, "timelaps05Url");
            return (Criteria) this;
        }

        public Criteria andTimelaps05UrlNotIn(List<String> values) {
            addCriterion("timelaps05_url not in", values, "timelaps05Url");
            return (Criteria) this;
        }

        public Criteria andTimelaps05UrlBetween(String value1, String value2) {
            addCriterion("timelaps05_url between", value1, value2, "timelaps05Url");
            return (Criteria) this;
        }

        public Criteria andTimelaps05UrlNotBetween(String value1, String value2) {
            addCriterion("timelaps05_url not between", value1, value2, "timelaps05Url");
            return (Criteria) this;
        }

        public Criteria andTimelaps06UrlIsNull() {
            addCriterion("timelaps06_url is null");
            return (Criteria) this;
        }

        public Criteria andTimelaps06UrlIsNotNull() {
            addCriterion("timelaps06_url is not null");
            return (Criteria) this;
        }

        public Criteria andTimelaps06UrlEqualTo(String value) {
            addCriterion("timelaps06_url =", value, "timelaps06Url");
            return (Criteria) this;
        }

        public Criteria andTimelaps06UrlNotEqualTo(String value) {
            addCriterion("timelaps06_url <>", value, "timelaps06Url");
            return (Criteria) this;
        }

        public Criteria andTimelaps06UrlGreaterThan(String value) {
            addCriterion("timelaps06_url >", value, "timelaps06Url");
            return (Criteria) this;
        }

        public Criteria andTimelaps06UrlGreaterThanOrEqualTo(String value) {
            addCriterion("timelaps06_url >=", value, "timelaps06Url");
            return (Criteria) this;
        }

        public Criteria andTimelaps06UrlLessThan(String value) {
            addCriterion("timelaps06_url <", value, "timelaps06Url");
            return (Criteria) this;
        }

        public Criteria andTimelaps06UrlLessThanOrEqualTo(String value) {
            addCriterion("timelaps06_url <=", value, "timelaps06Url");
            return (Criteria) this;
        }

        public Criteria andTimelaps06UrlLike(String value) {
            addCriterion("timelaps06_url like", value, "timelaps06Url");
            return (Criteria) this;
        }

        public Criteria andTimelaps06UrlNotLike(String value) {
            addCriterion("timelaps06_url not like", value, "timelaps06Url");
            return (Criteria) this;
        }

        public Criteria andTimelaps06UrlIn(List<String> values) {
            addCriterion("timelaps06_url in", values, "timelaps06Url");
            return (Criteria) this;
        }

        public Criteria andTimelaps06UrlNotIn(List<String> values) {
            addCriterion("timelaps06_url not in", values, "timelaps06Url");
            return (Criteria) this;
        }

        public Criteria andTimelaps06UrlBetween(String value1, String value2) {
            addCriterion("timelaps06_url between", value1, value2, "timelaps06Url");
            return (Criteria) this;
        }

        public Criteria andTimelaps06UrlNotBetween(String value1, String value2) {
            addCriterion("timelaps06_url not between", value1, value2, "timelaps06Url");
            return (Criteria) this;
        }

        public Criteria andBuildingIdIsNull() {
            addCriterion("building_id is null");
            return (Criteria) this;
        }

        public Criteria andBuildingIdIsNotNull() {
            addCriterion("building_id is not null");
            return (Criteria) this;
        }

        public Criteria andBuildingIdEqualTo(Integer value) {
            addCriterion("building_id =", value, "buildingId");
            return (Criteria) this;
        }

        public Criteria andBuildingIdNotEqualTo(Integer value) {
            addCriterion("building_id <>", value, "buildingId");
            return (Criteria) this;
        }

        public Criteria andBuildingIdGreaterThan(Integer value) {
            addCriterion("building_id >", value, "buildingId");
            return (Criteria) this;
        }

        public Criteria andBuildingIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("building_id >=", value, "buildingId");
            return (Criteria) this;
        }

        public Criteria andBuildingIdLessThan(Integer value) {
            addCriterion("building_id <", value, "buildingId");
            return (Criteria) this;
        }

        public Criteria andBuildingIdLessThanOrEqualTo(Integer value) {
            addCriterion("building_id <=", value, "buildingId");
            return (Criteria) this;
        }

        public Criteria andBuildingIdIn(List<Integer> values) {
            addCriterion("building_id in", values, "buildingId");
            return (Criteria) this;
        }

        public Criteria andBuildingIdNotIn(List<Integer> values) {
            addCriterion("building_id not in", values, "buildingId");
            return (Criteria) this;
        }

        public Criteria andBuildingIdBetween(Integer value1, Integer value2) {
            addCriterion("building_id between", value1, value2, "buildingId");
            return (Criteria) this;
        }

        public Criteria andBuildingIdNotBetween(Integer value1, Integer value2) {
            addCriterion("building_id not between", value1, value2, "buildingId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIsNull() {
            addCriterion("company_id is null");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIsNotNull() {
            addCriterion("company_id is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyIdEqualTo(Integer value) {
            addCriterion("company_id =", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotEqualTo(Integer value) {
            addCriterion("company_id <>", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdGreaterThan(Integer value) {
            addCriterion("company_id >", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("company_id >=", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLessThan(Integer value) {
            addCriterion("company_id <", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLessThanOrEqualTo(Integer value) {
            addCriterion("company_id <=", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIn(List<Integer> values) {
            addCriterion("company_id in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotIn(List<Integer> values) {
            addCriterion("company_id not in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdBetween(Integer value1, Integer value2) {
            addCriterion("company_id between", value1, value2, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("company_id not between", value1, value2, "companyId");
            return (Criteria) this;
        }

        public Criteria andCreaterIdIsNull() {
            addCriterion("creater_id is null");
            return (Criteria) this;
        }

        public Criteria andCreaterIdIsNotNull() {
            addCriterion("creater_id is not null");
            return (Criteria) this;
        }

        public Criteria andCreaterIdEqualTo(Integer value) {
            addCriterion("creater_id =", value, "createrId");
            return (Criteria) this;
        }

        public Criteria andCreaterIdNotEqualTo(Integer value) {
            addCriterion("creater_id <>", value, "createrId");
            return (Criteria) this;
        }

        public Criteria andCreaterIdGreaterThan(Integer value) {
            addCriterion("creater_id >", value, "createrId");
            return (Criteria) this;
        }

        public Criteria andCreaterIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("creater_id >=", value, "createrId");
            return (Criteria) this;
        }

        public Criteria andCreaterIdLessThan(Integer value) {
            addCriterion("creater_id <", value, "createrId");
            return (Criteria) this;
        }

        public Criteria andCreaterIdLessThanOrEqualTo(Integer value) {
            addCriterion("creater_id <=", value, "createrId");
            return (Criteria) this;
        }

        public Criteria andCreaterIdIn(List<Integer> values) {
            addCriterion("creater_id in", values, "createrId");
            return (Criteria) this;
        }

        public Criteria andCreaterIdNotIn(List<Integer> values) {
            addCriterion("creater_id not in", values, "createrId");
            return (Criteria) this;
        }

        public Criteria andCreaterIdBetween(Integer value1, Integer value2) {
            addCriterion("creater_id between", value1, value2, "createrId");
            return (Criteria) this;
        }

        public Criteria andCreaterIdNotBetween(Integer value1, Integer value2) {
            addCriterion("creater_id not between", value1, value2, "createrId");
            return (Criteria) this;
        }

        public Criteria andParkNameIsNull() {
            addCriterion("park_name is null");
            return (Criteria) this;
        }

        public Criteria andParkNameIsNotNull() {
            addCriterion("park_name is not null");
            return (Criteria) this;
        }

        public Criteria andParkNameEqualTo(String value) {
            addCriterion("park_name =", value, "parkName");
            return (Criteria) this;
        }

        public Criteria andParkNameNotEqualTo(String value) {
            addCriterion("park_name <>", value, "parkName");
            return (Criteria) this;
        }

        public Criteria andParkNameGreaterThan(String value) {
            addCriterion("park_name >", value, "parkName");
            return (Criteria) this;
        }

        public Criteria andParkNameGreaterThanOrEqualTo(String value) {
            addCriterion("park_name >=", value, "parkName");
            return (Criteria) this;
        }

        public Criteria andParkNameLessThan(String value) {
            addCriterion("park_name <", value, "parkName");
            return (Criteria) this;
        }

        public Criteria andParkNameLessThanOrEqualTo(String value) {
            addCriterion("park_name <=", value, "parkName");
            return (Criteria) this;
        }

        public Criteria andParkNameLike(String value) {
            addCriterion("park_name like", value, "parkName");
            return (Criteria) this;
        }

        public Criteria andParkNameNotLike(String value) {
            addCriterion("park_name not like", value, "parkName");
            return (Criteria) this;
        }

        public Criteria andParkNameIn(List<String> values) {
            addCriterion("park_name in", values, "parkName");
            return (Criteria) this;
        }

        public Criteria andParkNameNotIn(List<String> values) {
            addCriterion("park_name not in", values, "parkName");
            return (Criteria) this;
        }

        public Criteria andParkNameBetween(String value1, String value2) {
            addCriterion("park_name between", value1, value2, "parkName");
            return (Criteria) this;
        }

        public Criteria andParkNameNotBetween(String value1, String value2) {
            addCriterion("park_name not between", value1, value2, "parkName");
            return (Criteria) this;
        }

        public Criteria andParkNoIsNull() {
            addCriterion("park_no is null");
            return (Criteria) this;
        }

        public Criteria andParkNoIsNotNull() {
            addCriterion("park_no is not null");
            return (Criteria) this;
        }

        public Criteria andParkNoEqualTo(String value) {
            addCriterion("park_no =", value, "parkNo");
            return (Criteria) this;
        }

        public Criteria andParkNoNotEqualTo(String value) {
            addCriterion("park_no <>", value, "parkNo");
            return (Criteria) this;
        }

        public Criteria andParkNoGreaterThan(String value) {
            addCriterion("park_no >", value, "parkNo");
            return (Criteria) this;
        }

        public Criteria andParkNoGreaterThanOrEqualTo(String value) {
            addCriterion("park_no >=", value, "parkNo");
            return (Criteria) this;
        }

        public Criteria andParkNoLessThan(String value) {
            addCriterion("park_no <", value, "parkNo");
            return (Criteria) this;
        }

        public Criteria andParkNoLessThanOrEqualTo(String value) {
            addCriterion("park_no <=", value, "parkNo");
            return (Criteria) this;
        }

        public Criteria andParkNoLike(String value) {
            addCriterion("park_no like", value, "parkNo");
            return (Criteria) this;
        }

        public Criteria andParkNoNotLike(String value) {
            addCriterion("park_no not like", value, "parkNo");
            return (Criteria) this;
        }

        public Criteria andParkNoIn(List<String> values) {
            addCriterion("park_no in", values, "parkNo");
            return (Criteria) this;
        }

        public Criteria andParkNoNotIn(List<String> values) {
            addCriterion("park_no not in", values, "parkNo");
            return (Criteria) this;
        }

        public Criteria andParkNoBetween(String value1, String value2) {
            addCriterion("park_no between", value1, value2, "parkNo");
            return (Criteria) this;
        }

        public Criteria andParkNoNotBetween(String value1, String value2) {
            addCriterion("park_no not between", value1, value2, "parkNo");
            return (Criteria) this;
        }

        public Criteria andParkSubNoIsNull() {
            addCriterion("park_sub_no is null");
            return (Criteria) this;
        }

        public Criteria andParkSubNoIsNotNull() {
            addCriterion("park_sub_no is not null");
            return (Criteria) this;
        }

        public Criteria andParkSubNoEqualTo(String value) {
            addCriterion("park_sub_no =", value, "parkSubNo");
            return (Criteria) this;
        }

        public Criteria andParkSubNoNotEqualTo(String value) {
            addCriterion("park_sub_no <>", value, "parkSubNo");
            return (Criteria) this;
        }

        public Criteria andParkSubNoGreaterThan(String value) {
            addCriterion("park_sub_no >", value, "parkSubNo");
            return (Criteria) this;
        }

        public Criteria andParkSubNoGreaterThanOrEqualTo(String value) {
            addCriterion("park_sub_no >=", value, "parkSubNo");
            return (Criteria) this;
        }

        public Criteria andParkSubNoLessThan(String value) {
            addCriterion("park_sub_no <", value, "parkSubNo");
            return (Criteria) this;
        }

        public Criteria andParkSubNoLessThanOrEqualTo(String value) {
            addCriterion("park_sub_no <=", value, "parkSubNo");
            return (Criteria) this;
        }

        public Criteria andParkSubNoLike(String value) {
            addCriterion("park_sub_no like", value, "parkSubNo");
            return (Criteria) this;
        }

        public Criteria andParkSubNoNotLike(String value) {
            addCriterion("park_sub_no not like", value, "parkSubNo");
            return (Criteria) this;
        }

        public Criteria andParkSubNoIn(List<String> values) {
            addCriterion("park_sub_no in", values, "parkSubNo");
            return (Criteria) this;
        }

        public Criteria andParkSubNoNotIn(List<String> values) {
            addCriterion("park_sub_no not in", values, "parkSubNo");
            return (Criteria) this;
        }

        public Criteria andParkSubNoBetween(String value1, String value2) {
            addCriterion("park_sub_no between", value1, value2, "parkSubNo");
            return (Criteria) this;
        }

        public Criteria andParkSubNoNotBetween(String value1, String value2) {
            addCriterion("park_sub_no not between", value1, value2, "parkSubNo");
            return (Criteria) this;
        }

        public Criteria andFirstNameIsNull() {
            addCriterion("first_name is null");
            return (Criteria) this;
        }

        public Criteria andFirstNameIsNotNull() {
            addCriterion("first_name is not null");
            return (Criteria) this;
        }

        public Criteria andFirstNameEqualTo(String value) {
            addCriterion("first_name =", value, "firstName");
            return (Criteria) this;
        }

        public Criteria andFirstNameNotEqualTo(String value) {
            addCriterion("first_name <>", value, "firstName");
            return (Criteria) this;
        }

        public Criteria andFirstNameGreaterThan(String value) {
            addCriterion("first_name >", value, "firstName");
            return (Criteria) this;
        }

        public Criteria andFirstNameGreaterThanOrEqualTo(String value) {
            addCriterion("first_name >=", value, "firstName");
            return (Criteria) this;
        }

        public Criteria andFirstNameLessThan(String value) {
            addCriterion("first_name <", value, "firstName");
            return (Criteria) this;
        }

        public Criteria andFirstNameLessThanOrEqualTo(String value) {
            addCriterion("first_name <=", value, "firstName");
            return (Criteria) this;
        }

        public Criteria andFirstNameLike(String value) {
            addCriterion("first_name like", value, "firstName");
            return (Criteria) this;
        }

        public Criteria andFirstNameNotLike(String value) {
            addCriterion("first_name not like", value, "firstName");
            return (Criteria) this;
        }

        public Criteria andFirstNameIn(List<String> values) {
            addCriterion("first_name in", values, "firstName");
            return (Criteria) this;
        }

        public Criteria andFirstNameNotIn(List<String> values) {
            addCriterion("first_name not in", values, "firstName");
            return (Criteria) this;
        }

        public Criteria andFirstNameBetween(String value1, String value2) {
            addCriterion("first_name between", value1, value2, "firstName");
            return (Criteria) this;
        }

        public Criteria andFirstNameNotBetween(String value1, String value2) {
            addCriterion("first_name not between", value1, value2, "firstName");
            return (Criteria) this;
        }

        public Criteria andSecondNameIsNull() {
            addCriterion("second_name is null");
            return (Criteria) this;
        }

        public Criteria andSecondNameIsNotNull() {
            addCriterion("second_name is not null");
            return (Criteria) this;
        }

        public Criteria andSecondNameEqualTo(String value) {
            addCriterion("second_name =", value, "secondName");
            return (Criteria) this;
        }

        public Criteria andSecondNameNotEqualTo(String value) {
            addCriterion("second_name <>", value, "secondName");
            return (Criteria) this;
        }

        public Criteria andSecondNameGreaterThan(String value) {
            addCriterion("second_name >", value, "secondName");
            return (Criteria) this;
        }

        public Criteria andSecondNameGreaterThanOrEqualTo(String value) {
            addCriterion("second_name >=", value, "secondName");
            return (Criteria) this;
        }

        public Criteria andSecondNameLessThan(String value) {
            addCriterion("second_name <", value, "secondName");
            return (Criteria) this;
        }

        public Criteria andSecondNameLessThanOrEqualTo(String value) {
            addCriterion("second_name <=", value, "secondName");
            return (Criteria) this;
        }

        public Criteria andSecondNameLike(String value) {
            addCriterion("second_name like", value, "secondName");
            return (Criteria) this;
        }

        public Criteria andSecondNameNotLike(String value) {
            addCriterion("second_name not like", value, "secondName");
            return (Criteria) this;
        }

        public Criteria andSecondNameIn(List<String> values) {
            addCriterion("second_name in", values, "secondName");
            return (Criteria) this;
        }

        public Criteria andSecondNameNotIn(List<String> values) {
            addCriterion("second_name not in", values, "secondName");
            return (Criteria) this;
        }

        public Criteria andSecondNameBetween(String value1, String value2) {
            addCriterion("second_name between", value1, value2, "secondName");
            return (Criteria) this;
        }

        public Criteria andSecondNameNotBetween(String value1, String value2) {
            addCriterion("second_name not between", value1, value2, "secondName");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}