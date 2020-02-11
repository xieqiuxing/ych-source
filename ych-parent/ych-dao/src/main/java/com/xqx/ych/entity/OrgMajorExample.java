package com.xqx.ych.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class OrgMajorExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ych_org_major
     *
     * @mbggenerated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ych_org_major
     *
     * @mbggenerated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ych_org_major
     *
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ych_org_major
     *
     * @mbggenerated
     */
    public OrgMajorExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ych_org_major
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ych_org_major
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ych_org_major
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ych_org_major
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ych_org_major
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ych_org_major
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ych_org_major
     *
     * @mbggenerated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ych_org_major
     *
     * @mbggenerated
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ych_org_major
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ych_org_major
     *
     * @mbggenerated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table ych_org_major
     *
     * @mbggenerated
     */
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

        public Criteria andOrgIdIsNull() {
            addCriterion("org_id is null");
            return (Criteria) this;
        }

        public Criteria andOrgIdIsNotNull() {
            addCriterion("org_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrgIdEqualTo(Integer value) {
            addCriterion("org_id =", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdNotEqualTo(Integer value) {
            addCriterion("org_id <>", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdGreaterThan(Integer value) {
            addCriterion("org_id >", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("org_id >=", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdLessThan(Integer value) {
            addCriterion("org_id <", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdLessThanOrEqualTo(Integer value) {
            addCriterion("org_id <=", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdIn(List<Integer> values) {
            addCriterion("org_id in", values, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdNotIn(List<Integer> values) {
            addCriterion("org_id not in", values, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdBetween(Integer value1, Integer value2) {
            addCriterion("org_id between", value1, value2, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdNotBetween(Integer value1, Integer value2) {
            addCriterion("org_id not between", value1, value2, "orgId");
            return (Criteria) this;
        }

        public Criteria andMajorIdIsNull() {
            addCriterion("major_id is null");
            return (Criteria) this;
        }

        public Criteria andMajorIdIsNotNull() {
            addCriterion("major_id is not null");
            return (Criteria) this;
        }

        public Criteria andMajorIdEqualTo(Integer value) {
            addCriterion("major_id =", value, "majorId");
            return (Criteria) this;
        }

        public Criteria andMajorIdNotEqualTo(Integer value) {
            addCriterion("major_id <>", value, "majorId");
            return (Criteria) this;
        }

        public Criteria andMajorIdGreaterThan(Integer value) {
            addCriterion("major_id >", value, "majorId");
            return (Criteria) this;
        }

        public Criteria andMajorIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("major_id >=", value, "majorId");
            return (Criteria) this;
        }

        public Criteria andMajorIdLessThan(Integer value) {
            addCriterion("major_id <", value, "majorId");
            return (Criteria) this;
        }

        public Criteria andMajorIdLessThanOrEqualTo(Integer value) {
            addCriterion("major_id <=", value, "majorId");
            return (Criteria) this;
        }

        public Criteria andMajorIdIn(List<Integer> values) {
            addCriterion("major_id in", values, "majorId");
            return (Criteria) this;
        }

        public Criteria andMajorIdNotIn(List<Integer> values) {
            addCriterion("major_id not in", values, "majorId");
            return (Criteria) this;
        }

        public Criteria andMajorIdBetween(Integer value1, Integer value2) {
            addCriterion("major_id between", value1, value2, "majorId");
            return (Criteria) this;
        }

        public Criteria andMajorIdNotBetween(Integer value1, Integer value2) {
            addCriterion("major_id not between", value1, value2, "majorId");
            return (Criteria) this;
        }

        public Criteria andEnrollmentQuotaIsNull() {
            addCriterion("enrollment_quota is null");
            return (Criteria) this;
        }

        public Criteria andEnrollmentQuotaIsNotNull() {
            addCriterion("enrollment_quota is not null");
            return (Criteria) this;
        }

        public Criteria andEnrollmentQuotaEqualTo(Integer value) {
            addCriterion("enrollment_quota =", value, "enrollmentQuota");
            return (Criteria) this;
        }

        public Criteria andEnrollmentQuotaNotEqualTo(Integer value) {
            addCriterion("enrollment_quota <>", value, "enrollmentQuota");
            return (Criteria) this;
        }

        public Criteria andEnrollmentQuotaGreaterThan(Integer value) {
            addCriterion("enrollment_quota >", value, "enrollmentQuota");
            return (Criteria) this;
        }

        public Criteria andEnrollmentQuotaGreaterThanOrEqualTo(Integer value) {
            addCriterion("enrollment_quota >=", value, "enrollmentQuota");
            return (Criteria) this;
        }

        public Criteria andEnrollmentQuotaLessThan(Integer value) {
            addCriterion("enrollment_quota <", value, "enrollmentQuota");
            return (Criteria) this;
        }

        public Criteria andEnrollmentQuotaLessThanOrEqualTo(Integer value) {
            addCriterion("enrollment_quota <=", value, "enrollmentQuota");
            return (Criteria) this;
        }

        public Criteria andEnrollmentQuotaIn(List<Integer> values) {
            addCriterion("enrollment_quota in", values, "enrollmentQuota");
            return (Criteria) this;
        }

        public Criteria andEnrollmentQuotaNotIn(List<Integer> values) {
            addCriterion("enrollment_quota not in", values, "enrollmentQuota");
            return (Criteria) this;
        }

        public Criteria andEnrollmentQuotaBetween(Integer value1, Integer value2) {
            addCriterion("enrollment_quota between", value1, value2, "enrollmentQuota");
            return (Criteria) this;
        }

        public Criteria andEnrollmentQuotaNotBetween(Integer value1, Integer value2) {
            addCriterion("enrollment_quota not between", value1, value2, "enrollmentQuota");
            return (Criteria) this;
        }

        public Criteria andTuitionIsNull() {
            addCriterion("tuition is null");
            return (Criteria) this;
        }

        public Criteria andTuitionIsNotNull() {
            addCriterion("tuition is not null");
            return (Criteria) this;
        }

        public Criteria andTuitionEqualTo(BigDecimal value) {
            addCriterion("tuition =", value, "tuition");
            return (Criteria) this;
        }

        public Criteria andTuitionNotEqualTo(BigDecimal value) {
            addCriterion("tuition <>", value, "tuition");
            return (Criteria) this;
        }

        public Criteria andTuitionGreaterThan(BigDecimal value) {
            addCriterion("tuition >", value, "tuition");
            return (Criteria) this;
        }

        public Criteria andTuitionGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("tuition >=", value, "tuition");
            return (Criteria) this;
        }

        public Criteria andTuitionLessThan(BigDecimal value) {
            addCriterion("tuition <", value, "tuition");
            return (Criteria) this;
        }

        public Criteria andTuitionLessThanOrEqualTo(BigDecimal value) {
            addCriterion("tuition <=", value, "tuition");
            return (Criteria) this;
        }

        public Criteria andTuitionIn(List<BigDecimal> values) {
            addCriterion("tuition in", values, "tuition");
            return (Criteria) this;
        }

        public Criteria andTuitionNotIn(List<BigDecimal> values) {
            addCriterion("tuition not in", values, "tuition");
            return (Criteria) this;
        }

        public Criteria andTuitionBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tuition between", value1, value2, "tuition");
            return (Criteria) this;
        }

        public Criteria andTuitionNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tuition not between", value1, value2, "tuition");
            return (Criteria) this;
        }

        public Criteria andPreTuitionIsNull() {
            addCriterion("pre_tuition is null");
            return (Criteria) this;
        }

        public Criteria andPreTuitionIsNotNull() {
            addCriterion("pre_tuition is not null");
            return (Criteria) this;
        }

        public Criteria andPreTuitionEqualTo(BigDecimal value) {
            addCriterion("pre_tuition =", value, "preTuition");
            return (Criteria) this;
        }

        public Criteria andPreTuitionNotEqualTo(BigDecimal value) {
            addCriterion("pre_tuition <>", value, "preTuition");
            return (Criteria) this;
        }

        public Criteria andPreTuitionGreaterThan(BigDecimal value) {
            addCriterion("pre_tuition >", value, "preTuition");
            return (Criteria) this;
        }

        public Criteria andPreTuitionGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("pre_tuition >=", value, "preTuition");
            return (Criteria) this;
        }

        public Criteria andPreTuitionLessThan(BigDecimal value) {
            addCriterion("pre_tuition <", value, "preTuition");
            return (Criteria) this;
        }

        public Criteria andPreTuitionLessThanOrEqualTo(BigDecimal value) {
            addCriterion("pre_tuition <=", value, "preTuition");
            return (Criteria) this;
        }

        public Criteria andPreTuitionIn(List<BigDecimal> values) {
            addCriterion("pre_tuition in", values, "preTuition");
            return (Criteria) this;
        }

        public Criteria andPreTuitionNotIn(List<BigDecimal> values) {
            addCriterion("pre_tuition not in", values, "preTuition");
            return (Criteria) this;
        }

        public Criteria andPreTuitionBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("pre_tuition between", value1, value2, "preTuition");
            return (Criteria) this;
        }

        public Criteria andPreTuitionNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("pre_tuition not between", value1, value2, "preTuition");
            return (Criteria) this;
        }

        public Criteria andGrantIsNull() {
            addCriterion("grant is null");
            return (Criteria) this;
        }

        public Criteria andGrantIsNotNull() {
            addCriterion("grant is not null");
            return (Criteria) this;
        }

        public Criteria andGrantEqualTo(BigDecimal value) {
            addCriterion("grant =", value, "grant");
            return (Criteria) this;
        }

        public Criteria andGrantNotEqualTo(BigDecimal value) {
            addCriterion("grant <>", value, "grant");
            return (Criteria) this;
        }

        public Criteria andGrantGreaterThan(BigDecimal value) {
            addCriterion("grant >", value, "grant");
            return (Criteria) this;
        }

        public Criteria andGrantGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("grant >=", value, "grant");
            return (Criteria) this;
        }

        public Criteria andGrantLessThan(BigDecimal value) {
            addCriterion("grant <", value, "grant");
            return (Criteria) this;
        }

        public Criteria andGrantLessThanOrEqualTo(BigDecimal value) {
            addCriterion("grant <=", value, "grant");
            return (Criteria) this;
        }

        public Criteria andGrantIn(List<BigDecimal> values) {
            addCriterion("grant in", values, "grant");
            return (Criteria) this;
        }

        public Criteria andGrantNotIn(List<BigDecimal> values) {
            addCriterion("grant not in", values, "grant");
            return (Criteria) this;
        }

        public Criteria andGrantBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("grant between", value1, value2, "grant");
            return (Criteria) this;
        }

        public Criteria andGrantNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("grant not between", value1, value2, "grant");
            return (Criteria) this;
        }

        public Criteria andIsHotIsNull() {
            addCriterion("is_hot is null");
            return (Criteria) this;
        }

        public Criteria andIsHotIsNotNull() {
            addCriterion("is_hot is not null");
            return (Criteria) this;
        }

        public Criteria andIsHotEqualTo(Integer value) {
            addCriterion("is_hot =", value, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotNotEqualTo(Integer value) {
            addCriterion("is_hot <>", value, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotGreaterThan(Integer value) {
            addCriterion("is_hot >", value, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_hot >=", value, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotLessThan(Integer value) {
            addCriterion("is_hot <", value, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotLessThanOrEqualTo(Integer value) {
            addCriterion("is_hot <=", value, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotIn(List<Integer> values) {
            addCriterion("is_hot in", values, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotNotIn(List<Integer> values) {
            addCriterion("is_hot not in", values, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotBetween(Integer value1, Integer value2) {
            addCriterion("is_hot between", value1, value2, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotNotBetween(Integer value1, Integer value2) {
            addCriterion("is_hot not between", value1, value2, "isHot");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table ych_org_major
     *
     * @mbggenerated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table ych_org_major
     *
     * @mbggenerated
     */
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