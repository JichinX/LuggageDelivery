package com.graduate.luggagedelivery.rest_server.entity;

import java.util.ArrayList;
import java.util.List;

public class TTruckExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TTruckExample() {
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

        public Criteria andLicenseplateIsNull() {
            addCriterion("licensePlate is null");
            return (Criteria) this;
        }

        public Criteria andLicenseplateIsNotNull() {
            addCriterion("licensePlate is not null");
            return (Criteria) this;
        }

        public Criteria andLicenseplateEqualTo(String value) {
            addCriterion("licensePlate =", value, "licenseplate");
            return (Criteria) this;
        }

        public Criteria andLicenseplateNotEqualTo(String value) {
            addCriterion("licensePlate <>", value, "licenseplate");
            return (Criteria) this;
        }

        public Criteria andLicenseplateGreaterThan(String value) {
            addCriterion("licensePlate >", value, "licenseplate");
            return (Criteria) this;
        }

        public Criteria andLicenseplateGreaterThanOrEqualTo(String value) {
            addCriterion("licensePlate >=", value, "licenseplate");
            return (Criteria) this;
        }

        public Criteria andLicenseplateLessThan(String value) {
            addCriterion("licensePlate <", value, "licenseplate");
            return (Criteria) this;
        }

        public Criteria andLicenseplateLessThanOrEqualTo(String value) {
            addCriterion("licensePlate <=", value, "licenseplate");
            return (Criteria) this;
        }

        public Criteria andLicenseplateLike(String value) {
            addCriterion("licensePlate like", value, "licenseplate");
            return (Criteria) this;
        }

        public Criteria andLicenseplateNotLike(String value) {
            addCriterion("licensePlate not like", value, "licenseplate");
            return (Criteria) this;
        }

        public Criteria andLicenseplateIn(List<String> values) {
            addCriterion("licensePlate in", values, "licenseplate");
            return (Criteria) this;
        }

        public Criteria andLicenseplateNotIn(List<String> values) {
            addCriterion("licensePlate not in", values, "licenseplate");
            return (Criteria) this;
        }

        public Criteria andLicenseplateBetween(String value1, String value2) {
            addCriterion("licensePlate between", value1, value2, "licenseplate");
            return (Criteria) this;
        }

        public Criteria andLicenseplateNotBetween(String value1, String value2) {
            addCriterion("licensePlate not between", value1, value2, "licenseplate");
            return (Criteria) this;
        }

        public Criteria andUsestatusIsNull() {
            addCriterion("useStatus is null");
            return (Criteria) this;
        }

        public Criteria andUsestatusIsNotNull() {
            addCriterion("useStatus is not null");
            return (Criteria) this;
        }

        public Criteria andUsestatusEqualTo(String value) {
            addCriterion("useStatus =", value, "usestatus");
            return (Criteria) this;
        }

        public Criteria andUsestatusNotEqualTo(String value) {
            addCriterion("useStatus <>", value, "usestatus");
            return (Criteria) this;
        }

        public Criteria andUsestatusGreaterThan(String value) {
            addCriterion("useStatus >", value, "usestatus");
            return (Criteria) this;
        }

        public Criteria andUsestatusGreaterThanOrEqualTo(String value) {
            addCriterion("useStatus >=", value, "usestatus");
            return (Criteria) this;
        }

        public Criteria andUsestatusLessThan(String value) {
            addCriterion("useStatus <", value, "usestatus");
            return (Criteria) this;
        }

        public Criteria andUsestatusLessThanOrEqualTo(String value) {
            addCriterion("useStatus <=", value, "usestatus");
            return (Criteria) this;
        }

        public Criteria andUsestatusLike(String value) {
            addCriterion("useStatus like", value, "usestatus");
            return (Criteria) this;
        }

        public Criteria andUsestatusNotLike(String value) {
            addCriterion("useStatus not like", value, "usestatus");
            return (Criteria) this;
        }

        public Criteria andUsestatusIn(List<String> values) {
            addCriterion("useStatus in", values, "usestatus");
            return (Criteria) this;
        }

        public Criteria andUsestatusNotIn(List<String> values) {
            addCriterion("useStatus not in", values, "usestatus");
            return (Criteria) this;
        }

        public Criteria andUsestatusBetween(String value1, String value2) {
            addCriterion("useStatus between", value1, value2, "usestatus");
            return (Criteria) this;
        }

        public Criteria andUsestatusNotBetween(String value1, String value2) {
            addCriterion("useStatus not between", value1, value2, "usestatus");
            return (Criteria) this;
        }

        public Criteria andVinnerIsNull() {
            addCriterion("vinner is null");
            return (Criteria) this;
        }

        public Criteria andVinnerIsNotNull() {
            addCriterion("vinner is not null");
            return (Criteria) this;
        }

        public Criteria andVinnerEqualTo(String value) {
            addCriterion("vinner =", value, "vinner");
            return (Criteria) this;
        }

        public Criteria andVinnerNotEqualTo(String value) {
            addCriterion("vinner <>", value, "vinner");
            return (Criteria) this;
        }

        public Criteria andVinnerGreaterThan(String value) {
            addCriterion("vinner >", value, "vinner");
            return (Criteria) this;
        }

        public Criteria andVinnerGreaterThanOrEqualTo(String value) {
            addCriterion("vinner >=", value, "vinner");
            return (Criteria) this;
        }

        public Criteria andVinnerLessThan(String value) {
            addCriterion("vinner <", value, "vinner");
            return (Criteria) this;
        }

        public Criteria andVinnerLessThanOrEqualTo(String value) {
            addCriterion("vinner <=", value, "vinner");
            return (Criteria) this;
        }

        public Criteria andVinnerLike(String value) {
            addCriterion("vinner like", value, "vinner");
            return (Criteria) this;
        }

        public Criteria andVinnerNotLike(String value) {
            addCriterion("vinner not like", value, "vinner");
            return (Criteria) this;
        }

        public Criteria andVinnerIn(List<String> values) {
            addCriterion("vinner in", values, "vinner");
            return (Criteria) this;
        }

        public Criteria andVinnerNotIn(List<String> values) {
            addCriterion("vinner not in", values, "vinner");
            return (Criteria) this;
        }

        public Criteria andVinnerBetween(String value1, String value2) {
            addCriterion("vinner between", value1, value2, "vinner");
            return (Criteria) this;
        }

        public Criteria andVinnerNotBetween(String value1, String value2) {
            addCriterion("vinner not between", value1, value2, "vinner");
            return (Criteria) this;
        }

        public Criteria andVlengthIsNull() {
            addCriterion("vlength is null");
            return (Criteria) this;
        }

        public Criteria andVlengthIsNotNull() {
            addCriterion("vlength is not null");
            return (Criteria) this;
        }

        public Criteria andVlengthEqualTo(String value) {
            addCriterion("vlength =", value, "vlength");
            return (Criteria) this;
        }

        public Criteria andVlengthNotEqualTo(String value) {
            addCriterion("vlength <>", value, "vlength");
            return (Criteria) this;
        }

        public Criteria andVlengthGreaterThan(String value) {
            addCriterion("vlength >", value, "vlength");
            return (Criteria) this;
        }

        public Criteria andVlengthGreaterThanOrEqualTo(String value) {
            addCriterion("vlength >=", value, "vlength");
            return (Criteria) this;
        }

        public Criteria andVlengthLessThan(String value) {
            addCriterion("vlength <", value, "vlength");
            return (Criteria) this;
        }

        public Criteria andVlengthLessThanOrEqualTo(String value) {
            addCriterion("vlength <=", value, "vlength");
            return (Criteria) this;
        }

        public Criteria andVlengthLike(String value) {
            addCriterion("vlength like", value, "vlength");
            return (Criteria) this;
        }

        public Criteria andVlengthNotLike(String value) {
            addCriterion("vlength not like", value, "vlength");
            return (Criteria) this;
        }

        public Criteria andVlengthIn(List<String> values) {
            addCriterion("vlength in", values, "vlength");
            return (Criteria) this;
        }

        public Criteria andVlengthNotIn(List<String> values) {
            addCriterion("vlength not in", values, "vlength");
            return (Criteria) this;
        }

        public Criteria andVlengthBetween(String value1, String value2) {
            addCriterion("vlength between", value1, value2, "vlength");
            return (Criteria) this;
        }

        public Criteria andVlengthNotBetween(String value1, String value2) {
            addCriterion("vlength not between", value1, value2, "vlength");
            return (Criteria) this;
        }

        public Criteria andVloadIsNull() {
            addCriterion("vload is null");
            return (Criteria) this;
        }

        public Criteria andVloadIsNotNull() {
            addCriterion("vload is not null");
            return (Criteria) this;
        }

        public Criteria andVloadEqualTo(String value) {
            addCriterion("vload =", value, "vload");
            return (Criteria) this;
        }

        public Criteria andVloadNotEqualTo(String value) {
            addCriterion("vload <>", value, "vload");
            return (Criteria) this;
        }

        public Criteria andVloadGreaterThan(String value) {
            addCriterion("vload >", value, "vload");
            return (Criteria) this;
        }

        public Criteria andVloadGreaterThanOrEqualTo(String value) {
            addCriterion("vload >=", value, "vload");
            return (Criteria) this;
        }

        public Criteria andVloadLessThan(String value) {
            addCriterion("vload <", value, "vload");
            return (Criteria) this;
        }

        public Criteria andVloadLessThanOrEqualTo(String value) {
            addCriterion("vload <=", value, "vload");
            return (Criteria) this;
        }

        public Criteria andVloadLike(String value) {
            addCriterion("vload like", value, "vload");
            return (Criteria) this;
        }

        public Criteria andVloadNotLike(String value) {
            addCriterion("vload not like", value, "vload");
            return (Criteria) this;
        }

        public Criteria andVloadIn(List<String> values) {
            addCriterion("vload in", values, "vload");
            return (Criteria) this;
        }

        public Criteria andVloadNotIn(List<String> values) {
            addCriterion("vload not in", values, "vload");
            return (Criteria) this;
        }

        public Criteria andVloadBetween(String value1, String value2) {
            addCriterion("vload between", value1, value2, "vload");
            return (Criteria) this;
        }

        public Criteria andVloadNotBetween(String value1, String value2) {
            addCriterion("vload not between", value1, value2, "vload");
            return (Criteria) this;
        }

        public Criteria andVtypeIsNull() {
            addCriterion("vtype is null");
            return (Criteria) this;
        }

        public Criteria andVtypeIsNotNull() {
            addCriterion("vtype is not null");
            return (Criteria) this;
        }

        public Criteria andVtypeEqualTo(String value) {
            addCriterion("vtype =", value, "vtype");
            return (Criteria) this;
        }

        public Criteria andVtypeNotEqualTo(String value) {
            addCriterion("vtype <>", value, "vtype");
            return (Criteria) this;
        }

        public Criteria andVtypeGreaterThan(String value) {
            addCriterion("vtype >", value, "vtype");
            return (Criteria) this;
        }

        public Criteria andVtypeGreaterThanOrEqualTo(String value) {
            addCriterion("vtype >=", value, "vtype");
            return (Criteria) this;
        }

        public Criteria andVtypeLessThan(String value) {
            addCriterion("vtype <", value, "vtype");
            return (Criteria) this;
        }

        public Criteria andVtypeLessThanOrEqualTo(String value) {
            addCriterion("vtype <=", value, "vtype");
            return (Criteria) this;
        }

        public Criteria andVtypeLike(String value) {
            addCriterion("vtype like", value, "vtype");
            return (Criteria) this;
        }

        public Criteria andVtypeNotLike(String value) {
            addCriterion("vtype not like", value, "vtype");
            return (Criteria) this;
        }

        public Criteria andVtypeIn(List<String> values) {
            addCriterion("vtype in", values, "vtype");
            return (Criteria) this;
        }

        public Criteria andVtypeNotIn(List<String> values) {
            addCriterion("vtype not in", values, "vtype");
            return (Criteria) this;
        }

        public Criteria andVtypeBetween(String value1, String value2) {
            addCriterion("vtype between", value1, value2, "vtype");
            return (Criteria) this;
        }

        public Criteria andVtypeNotBetween(String value1, String value2) {
            addCriterion("vtype not between", value1, value2, "vtype");
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