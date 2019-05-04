package com.graduate.luggagedelivery.rest_server.entity;

import java.util.ArrayList;
import java.util.List;

public class TTransportOrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TTransportOrderExample() {
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

        public Criteria andTransIdIsNull() {
            addCriterion("trans_id is null");
            return (Criteria) this;
        }

        public Criteria andTransIdIsNotNull() {
            addCriterion("trans_id is not null");
            return (Criteria) this;
        }

        public Criteria andTransIdEqualTo(Long value) {
            addCriterion("trans_id =", value, "transId");
            return (Criteria) this;
        }

        public Criteria andTransIdNotEqualTo(Long value) {
            addCriterion("trans_id <>", value, "transId");
            return (Criteria) this;
        }

        public Criteria andTransIdGreaterThan(Long value) {
            addCriterion("trans_id >", value, "transId");
            return (Criteria) this;
        }

        public Criteria andTransIdGreaterThanOrEqualTo(Long value) {
            addCriterion("trans_id >=", value, "transId");
            return (Criteria) this;
        }

        public Criteria andTransIdLessThan(Long value) {
            addCriterion("trans_id <", value, "transId");
            return (Criteria) this;
        }

        public Criteria andTransIdLessThanOrEqualTo(Long value) {
            addCriterion("trans_id <=", value, "transId");
            return (Criteria) this;
        }

        public Criteria andTransIdIn(List<Long> values) {
            addCriterion("trans_id in", values, "transId");
            return (Criteria) this;
        }

        public Criteria andTransIdNotIn(List<Long> values) {
            addCriterion("trans_id not in", values, "transId");
            return (Criteria) this;
        }

        public Criteria andTransIdBetween(Long value1, Long value2) {
            addCriterion("trans_id between", value1, value2, "transId");
            return (Criteria) this;
        }

        public Criteria andTransIdNotBetween(Long value1, Long value2) {
            addCriterion("trans_id not between", value1, value2, "transId");
            return (Criteria) this;
        }

        public Criteria andUserOrderIdIsNull() {
            addCriterion("user_order_id is null");
            return (Criteria) this;
        }

        public Criteria andUserOrderIdIsNotNull() {
            addCriterion("user_order_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserOrderIdEqualTo(Long value) {
            addCriterion("user_order_id =", value, "userOrderId");
            return (Criteria) this;
        }

        public Criteria andUserOrderIdNotEqualTo(Long value) {
            addCriterion("user_order_id <>", value, "userOrderId");
            return (Criteria) this;
        }

        public Criteria andUserOrderIdGreaterThan(Long value) {
            addCriterion("user_order_id >", value, "userOrderId");
            return (Criteria) this;
        }

        public Criteria andUserOrderIdGreaterThanOrEqualTo(Long value) {
            addCriterion("user_order_id >=", value, "userOrderId");
            return (Criteria) this;
        }

        public Criteria andUserOrderIdLessThan(Long value) {
            addCriterion("user_order_id <", value, "userOrderId");
            return (Criteria) this;
        }

        public Criteria andUserOrderIdLessThanOrEqualTo(Long value) {
            addCriterion("user_order_id <=", value, "userOrderId");
            return (Criteria) this;
        }

        public Criteria andUserOrderIdIn(List<Long> values) {
            addCriterion("user_order_id in", values, "userOrderId");
            return (Criteria) this;
        }

        public Criteria andUserOrderIdNotIn(List<Long> values) {
            addCriterion("user_order_id not in", values, "userOrderId");
            return (Criteria) this;
        }

        public Criteria andUserOrderIdBetween(Long value1, Long value2) {
            addCriterion("user_order_id between", value1, value2, "userOrderId");
            return (Criteria) this;
        }

        public Criteria andUserOrderIdNotBetween(Long value1, Long value2) {
            addCriterion("user_order_id not between", value1, value2, "userOrderId");
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