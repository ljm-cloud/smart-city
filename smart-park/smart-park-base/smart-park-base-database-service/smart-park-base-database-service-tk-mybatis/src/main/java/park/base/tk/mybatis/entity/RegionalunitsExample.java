package park.base.tk.mybatis.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RegionalunitsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RegionalunitsExample() {
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

        public Criteria andUnitSubnameIsNull() {
            addCriterion("unit_subname is null");
            return (Criteria) this;
        }

        public Criteria andUnitSubnameIsNotNull() {
            addCriterion("unit_subname is not null");
            return (Criteria) this;
        }

        public Criteria andUnitSubnameEqualTo(String value) {
            addCriterion("unit_subname =", value, "unitSubname");
            return (Criteria) this;
        }

        public Criteria andUnitSubnameNotEqualTo(String value) {
            addCriterion("unit_subname <>", value, "unitSubname");
            return (Criteria) this;
        }

        public Criteria andUnitSubnameGreaterThan(String value) {
            addCriterion("unit_subname >", value, "unitSubname");
            return (Criteria) this;
        }

        public Criteria andUnitSubnameGreaterThanOrEqualTo(String value) {
            addCriterion("unit_subname >=", value, "unitSubname");
            return (Criteria) this;
        }

        public Criteria andUnitSubnameLessThan(String value) {
            addCriterion("unit_subname <", value, "unitSubname");
            return (Criteria) this;
        }

        public Criteria andUnitSubnameLessThanOrEqualTo(String value) {
            addCriterion("unit_subname <=", value, "unitSubname");
            return (Criteria) this;
        }

        public Criteria andUnitSubnameLike(String value) {
            addCriterion("unit_subname like", value, "unitSubname");
            return (Criteria) this;
        }

        public Criteria andUnitSubnameNotLike(String value) {
            addCriterion("unit_subname not like", value, "unitSubname");
            return (Criteria) this;
        }

        public Criteria andUnitSubnameIn(List<String> values) {
            addCriterion("unit_subname in", values, "unitSubname");
            return (Criteria) this;
        }

        public Criteria andUnitSubnameNotIn(List<String> values) {
            addCriterion("unit_subname not in", values, "unitSubname");
            return (Criteria) this;
        }

        public Criteria andUnitSubnameBetween(String value1, String value2) {
            addCriterion("unit_subname between", value1, value2, "unitSubname");
            return (Criteria) this;
        }

        public Criteria andUnitSubnameNotBetween(String value1, String value2) {
            addCriterion("unit_subname not between", value1, value2, "unitSubname");
            return (Criteria) this;
        }

        public Criteria andUnitOrgnameIsNull() {
            addCriterion("unit_orgname is null");
            return (Criteria) this;
        }

        public Criteria andUnitOrgnameIsNotNull() {
            addCriterion("unit_orgname is not null");
            return (Criteria) this;
        }

        public Criteria andUnitOrgnameEqualTo(String value) {
            addCriterion("unit_orgname =", value, "unitOrgname");
            return (Criteria) this;
        }

        public Criteria andUnitOrgnameNotEqualTo(String value) {
            addCriterion("unit_orgname <>", value, "unitOrgname");
            return (Criteria) this;
        }

        public Criteria andUnitOrgnameGreaterThan(String value) {
            addCriterion("unit_orgname >", value, "unitOrgname");
            return (Criteria) this;
        }

        public Criteria andUnitOrgnameGreaterThanOrEqualTo(String value) {
            addCriterion("unit_orgname >=", value, "unitOrgname");
            return (Criteria) this;
        }

        public Criteria andUnitOrgnameLessThan(String value) {
            addCriterion("unit_orgname <", value, "unitOrgname");
            return (Criteria) this;
        }

        public Criteria andUnitOrgnameLessThanOrEqualTo(String value) {
            addCriterion("unit_orgname <=", value, "unitOrgname");
            return (Criteria) this;
        }

        public Criteria andUnitOrgnameLike(String value) {
            addCriterion("unit_orgname like", value, "unitOrgname");
            return (Criteria) this;
        }

        public Criteria andUnitOrgnameNotLike(String value) {
            addCriterion("unit_orgname not like", value, "unitOrgname");
            return (Criteria) this;
        }

        public Criteria andUnitOrgnameIn(List<String> values) {
            addCriterion("unit_orgname in", values, "unitOrgname");
            return (Criteria) this;
        }

        public Criteria andUnitOrgnameNotIn(List<String> values) {
            addCriterion("unit_orgname not in", values, "unitOrgname");
            return (Criteria) this;
        }

        public Criteria andUnitOrgnameBetween(String value1, String value2) {
            addCriterion("unit_orgname between", value1, value2, "unitOrgname");
            return (Criteria) this;
        }

        public Criteria andUnitOrgnameNotBetween(String value1, String value2) {
            addCriterion("unit_orgname not between", value1, value2, "unitOrgname");
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