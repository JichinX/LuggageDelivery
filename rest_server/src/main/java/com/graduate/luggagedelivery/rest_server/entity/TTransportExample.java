package com.graduate.luggagedelivery.rest_server.entity;

import java.util.ArrayList;
import java.util.List;

public class TTransportExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TTransportExample() {
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

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andAdddateIsNull() {
            addCriterion("addDate is null");
            return (Criteria) this;
        }

        public Criteria andAdddateIsNotNull() {
            addCriterion("addDate is not null");
            return (Criteria) this;
        }

        public Criteria andAdddateEqualTo(String value) {
            addCriterion("addDate =", value, "adddate");
            return (Criteria) this;
        }

        public Criteria andAdddateNotEqualTo(String value) {
            addCriterion("addDate <>", value, "adddate");
            return (Criteria) this;
        }

        public Criteria andAdddateGreaterThan(String value) {
            addCriterion("addDate >", value, "adddate");
            return (Criteria) this;
        }

        public Criteria andAdddateGreaterThanOrEqualTo(String value) {
            addCriterion("addDate >=", value, "adddate");
            return (Criteria) this;
        }

        public Criteria andAdddateLessThan(String value) {
            addCriterion("addDate <", value, "adddate");
            return (Criteria) this;
        }

        public Criteria andAdddateLessThanOrEqualTo(String value) {
            addCriterion("addDate <=", value, "adddate");
            return (Criteria) this;
        }

        public Criteria andAdddateLike(String value) {
            addCriterion("addDate like", value, "adddate");
            return (Criteria) this;
        }

        public Criteria andAdddateNotLike(String value) {
            addCriterion("addDate not like", value, "adddate");
            return (Criteria) this;
        }

        public Criteria andAdddateIn(List<String> values) {
            addCriterion("addDate in", values, "adddate");
            return (Criteria) this;
        }

        public Criteria andAdddateNotIn(List<String> values) {
            addCriterion("addDate not in", values, "adddate");
            return (Criteria) this;
        }

        public Criteria andAdddateBetween(String value1, String value2) {
            addCriterion("addDate between", value1, value2, "adddate");
            return (Criteria) this;
        }

        public Criteria andAdddateNotBetween(String value1, String value2) {
            addCriterion("addDate not between", value1, value2, "adddate");
            return (Criteria) this;
        }

        public Criteria andTransindexIsNull() {
            addCriterion("transIndex is null");
            return (Criteria) this;
        }

        public Criteria andTransindexIsNotNull() {
            addCriterion("transIndex is not null");
            return (Criteria) this;
        }

        public Criteria andTransindexEqualTo(Integer value) {
            addCriterion("transIndex =", value, "transindex");
            return (Criteria) this;
        }

        public Criteria andTransindexNotEqualTo(Integer value) {
            addCriterion("transIndex <>", value, "transindex");
            return (Criteria) this;
        }

        public Criteria andTransindexGreaterThan(Integer value) {
            addCriterion("transIndex >", value, "transindex");
            return (Criteria) this;
        }

        public Criteria andTransindexGreaterThanOrEqualTo(Integer value) {
            addCriterion("transIndex >=", value, "transindex");
            return (Criteria) this;
        }

        public Criteria andTransindexLessThan(Integer value) {
            addCriterion("transIndex <", value, "transindex");
            return (Criteria) this;
        }

        public Criteria andTransindexLessThanOrEqualTo(Integer value) {
            addCriterion("transIndex <=", value, "transindex");
            return (Criteria) this;
        }

        public Criteria andTransindexIn(List<Integer> values) {
            addCriterion("transIndex in", values, "transindex");
            return (Criteria) this;
        }

        public Criteria andTransindexNotIn(List<Integer> values) {
            addCriterion("transIndex not in", values, "transindex");
            return (Criteria) this;
        }

        public Criteria andTransindexBetween(Integer value1, Integer value2) {
            addCriterion("transIndex between", value1, value2, "transindex");
            return (Criteria) this;
        }

        public Criteria andTransindexNotBetween(Integer value1, Integer value2) {
            addCriterion("transIndex not between", value1, value2, "transindex");
            return (Criteria) this;
        }

        public Criteria andTransstatusIsNull() {
            addCriterion("transStatus is null");
            return (Criteria) this;
        }

        public Criteria andTransstatusIsNotNull() {
            addCriterion("transStatus is not null");
            return (Criteria) this;
        }

        public Criteria andTransstatusEqualTo(String value) {
            addCriterion("transStatus =", value, "transstatus");
            return (Criteria) this;
        }

        public Criteria andTransstatusNotEqualTo(String value) {
            addCriterion("transStatus <>", value, "transstatus");
            return (Criteria) this;
        }

        public Criteria andTransstatusGreaterThan(String value) {
            addCriterion("transStatus >", value, "transstatus");
            return (Criteria) this;
        }

        public Criteria andTransstatusGreaterThanOrEqualTo(String value) {
            addCriterion("transStatus >=", value, "transstatus");
            return (Criteria) this;
        }

        public Criteria andTransstatusLessThan(String value) {
            addCriterion("transStatus <", value, "transstatus");
            return (Criteria) this;
        }

        public Criteria andTransstatusLessThanOrEqualTo(String value) {
            addCriterion("transStatus <=", value, "transstatus");
            return (Criteria) this;
        }

        public Criteria andTransstatusLike(String value) {
            addCriterion("transStatus like", value, "transstatus");
            return (Criteria) this;
        }

        public Criteria andTransstatusNotLike(String value) {
            addCriterion("transStatus not like", value, "transstatus");
            return (Criteria) this;
        }

        public Criteria andTransstatusIn(List<String> values) {
            addCriterion("transStatus in", values, "transstatus");
            return (Criteria) this;
        }

        public Criteria andTransstatusNotIn(List<String> values) {
            addCriterion("transStatus not in", values, "transstatus");
            return (Criteria) this;
        }

        public Criteria andTransstatusBetween(String value1, String value2) {
            addCriterion("transStatus between", value1, value2, "transstatus");
            return (Criteria) this;
        }

        public Criteria andTransstatusNotBetween(String value1, String value2) {
            addCriterion("transStatus not between", value1, value2, "transstatus");
            return (Criteria) this;
        }

        public Criteria andDriverIdIsNull() {
            addCriterion("driver_id is null");
            return (Criteria) this;
        }

        public Criteria andDriverIdIsNotNull() {
            addCriterion("driver_id is not null");
            return (Criteria) this;
        }

        public Criteria andDriverIdEqualTo(Long value) {
            addCriterion("driver_id =", value, "driverId");
            return (Criteria) this;
        }

        public Criteria andDriverIdNotEqualTo(Long value) {
            addCriterion("driver_id <>", value, "driverId");
            return (Criteria) this;
        }

        public Criteria andDriverIdGreaterThan(Long value) {
            addCriterion("driver_id >", value, "driverId");
            return (Criteria) this;
        }

        public Criteria andDriverIdGreaterThanOrEqualTo(Long value) {
            addCriterion("driver_id >=", value, "driverId");
            return (Criteria) this;
        }

        public Criteria andDriverIdLessThan(Long value) {
            addCriterion("driver_id <", value, "driverId");
            return (Criteria) this;
        }

        public Criteria andDriverIdLessThanOrEqualTo(Long value) {
            addCriterion("driver_id <=", value, "driverId");
            return (Criteria) this;
        }

        public Criteria andDriverIdIn(List<Long> values) {
            addCriterion("driver_id in", values, "driverId");
            return (Criteria) this;
        }

        public Criteria andDriverIdNotIn(List<Long> values) {
            addCriterion("driver_id not in", values, "driverId");
            return (Criteria) this;
        }

        public Criteria andDriverIdBetween(Long value1, Long value2) {
            addCriterion("driver_id between", value1, value2, "driverId");
            return (Criteria) this;
        }

        public Criteria andDriverIdNotBetween(Long value1, Long value2) {
            addCriterion("driver_id not between", value1, value2, "driverId");
            return (Criteria) this;
        }

        public Criteria andLineIdIsNull() {
            addCriterion("line_id is null");
            return (Criteria) this;
        }

        public Criteria andLineIdIsNotNull() {
            addCriterion("line_id is not null");
            return (Criteria) this;
        }

        public Criteria andLineIdEqualTo(Long value) {
            addCriterion("line_id =", value, "lineId");
            return (Criteria) this;
        }

        public Criteria andLineIdNotEqualTo(Long value) {
            addCriterion("line_id <>", value, "lineId");
            return (Criteria) this;
        }

        public Criteria andLineIdGreaterThan(Long value) {
            addCriterion("line_id >", value, "lineId");
            return (Criteria) this;
        }

        public Criteria andLineIdGreaterThanOrEqualTo(Long value) {
            addCriterion("line_id >=", value, "lineId");
            return (Criteria) this;
        }

        public Criteria andLineIdLessThan(Long value) {
            addCriterion("line_id <", value, "lineId");
            return (Criteria) this;
        }

        public Criteria andLineIdLessThanOrEqualTo(Long value) {
            addCriterion("line_id <=", value, "lineId");
            return (Criteria) this;
        }

        public Criteria andLineIdIn(List<Long> values) {
            addCriterion("line_id in", values, "lineId");
            return (Criteria) this;
        }

        public Criteria andLineIdNotIn(List<Long> values) {
            addCriterion("line_id not in", values, "lineId");
            return (Criteria) this;
        }

        public Criteria andLineIdBetween(Long value1, Long value2) {
            addCriterion("line_id between", value1, value2, "lineId");
            return (Criteria) this;
        }

        public Criteria andLineIdNotBetween(Long value1, Long value2) {
            addCriterion("line_id not between", value1, value2, "lineId");
            return (Criteria) this;
        }

        public Criteria andTruckIdIsNull() {
            addCriterion("truck_id is null");
            return (Criteria) this;
        }

        public Criteria andTruckIdIsNotNull() {
            addCriterion("truck_id is not null");
            return (Criteria) this;
        }

        public Criteria andTruckIdEqualTo(Long value) {
            addCriterion("truck_id =", value, "truckId");
            return (Criteria) this;
        }

        public Criteria andTruckIdNotEqualTo(Long value) {
            addCriterion("truck_id <>", value, "truckId");
            return (Criteria) this;
        }

        public Criteria andTruckIdGreaterThan(Long value) {
            addCriterion("truck_id >", value, "truckId");
            return (Criteria) this;
        }

        public Criteria andTruckIdGreaterThanOrEqualTo(Long value) {
            addCriterion("truck_id >=", value, "truckId");
            return (Criteria) this;
        }

        public Criteria andTruckIdLessThan(Long value) {
            addCriterion("truck_id <", value, "truckId");
            return (Criteria) this;
        }

        public Criteria andTruckIdLessThanOrEqualTo(Long value) {
            addCriterion("truck_id <=", value, "truckId");
            return (Criteria) this;
        }

        public Criteria andTruckIdIn(List<Long> values) {
            addCriterion("truck_id in", values, "truckId");
            return (Criteria) this;
        }

        public Criteria andTruckIdNotIn(List<Long> values) {
            addCriterion("truck_id not in", values, "truckId");
            return (Criteria) this;
        }

        public Criteria andTruckIdBetween(Long value1, Long value2) {
            addCriterion("truck_id between", value1, value2, "truckId");
            return (Criteria) this;
        }

        public Criteria andTruckIdNotBetween(Long value1, Long value2) {
            addCriterion("truck_id not between", value1, value2, "truckId");
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