package com.graduate.luggagedelivery.rest_server.entity;

import java.util.ArrayList;
import java.util.List;

public class TUserOrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TUserOrderExample() {
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

        public Criteria andFromuseraddressIsNull() {
            addCriterion("fromUserAddress is null");
            return (Criteria) this;
        }

        public Criteria andFromuseraddressIsNotNull() {
            addCriterion("fromUserAddress is not null");
            return (Criteria) this;
        }

        public Criteria andFromuseraddressEqualTo(String value) {
            addCriterion("fromUserAddress =", value, "fromuseraddress");
            return (Criteria) this;
        }

        public Criteria andFromuseraddressNotEqualTo(String value) {
            addCriterion("fromUserAddress <>", value, "fromuseraddress");
            return (Criteria) this;
        }

        public Criteria andFromuseraddressGreaterThan(String value) {
            addCriterion("fromUserAddress >", value, "fromuseraddress");
            return (Criteria) this;
        }

        public Criteria andFromuseraddressGreaterThanOrEqualTo(String value) {
            addCriterion("fromUserAddress >=", value, "fromuseraddress");
            return (Criteria) this;
        }

        public Criteria andFromuseraddressLessThan(String value) {
            addCriterion("fromUserAddress <", value, "fromuseraddress");
            return (Criteria) this;
        }

        public Criteria andFromuseraddressLessThanOrEqualTo(String value) {
            addCriterion("fromUserAddress <=", value, "fromuseraddress");
            return (Criteria) this;
        }

        public Criteria andFromuseraddressLike(String value) {
            addCriterion("fromUserAddress like", value, "fromuseraddress");
            return (Criteria) this;
        }

        public Criteria andFromuseraddressNotLike(String value) {
            addCriterion("fromUserAddress not like", value, "fromuseraddress");
            return (Criteria) this;
        }

        public Criteria andFromuseraddressIn(List<String> values) {
            addCriterion("fromUserAddress in", values, "fromuseraddress");
            return (Criteria) this;
        }

        public Criteria andFromuseraddressNotIn(List<String> values) {
            addCriterion("fromUserAddress not in", values, "fromuseraddress");
            return (Criteria) this;
        }

        public Criteria andFromuseraddressBetween(String value1, String value2) {
            addCriterion("fromUserAddress between", value1, value2, "fromuseraddress");
            return (Criteria) this;
        }

        public Criteria andFromuseraddressNotBetween(String value1, String value2) {
            addCriterion("fromUserAddress not between", value1, value2, "fromuseraddress");
            return (Criteria) this;
        }

        public Criteria andFromusernameIsNull() {
            addCriterion("fromUserName is null");
            return (Criteria) this;
        }

        public Criteria andFromusernameIsNotNull() {
            addCriterion("fromUserName is not null");
            return (Criteria) this;
        }

        public Criteria andFromusernameEqualTo(String value) {
            addCriterion("fromUserName =", value, "fromusername");
            return (Criteria) this;
        }

        public Criteria andFromusernameNotEqualTo(String value) {
            addCriterion("fromUserName <>", value, "fromusername");
            return (Criteria) this;
        }

        public Criteria andFromusernameGreaterThan(String value) {
            addCriterion("fromUserName >", value, "fromusername");
            return (Criteria) this;
        }

        public Criteria andFromusernameGreaterThanOrEqualTo(String value) {
            addCriterion("fromUserName >=", value, "fromusername");
            return (Criteria) this;
        }

        public Criteria andFromusernameLessThan(String value) {
            addCriterion("fromUserName <", value, "fromusername");
            return (Criteria) this;
        }

        public Criteria andFromusernameLessThanOrEqualTo(String value) {
            addCriterion("fromUserName <=", value, "fromusername");
            return (Criteria) this;
        }

        public Criteria andFromusernameLike(String value) {
            addCriterion("fromUserName like", value, "fromusername");
            return (Criteria) this;
        }

        public Criteria andFromusernameNotLike(String value) {
            addCriterion("fromUserName not like", value, "fromusername");
            return (Criteria) this;
        }

        public Criteria andFromusernameIn(List<String> values) {
            addCriterion("fromUserName in", values, "fromusername");
            return (Criteria) this;
        }

        public Criteria andFromusernameNotIn(List<String> values) {
            addCriterion("fromUserName not in", values, "fromusername");
            return (Criteria) this;
        }

        public Criteria andFromusernameBetween(String value1, String value2) {
            addCriterion("fromUserName between", value1, value2, "fromusername");
            return (Criteria) this;
        }

        public Criteria andFromusernameNotBetween(String value1, String value2) {
            addCriterion("fromUserName not between", value1, value2, "fromusername");
            return (Criteria) this;
        }

        public Criteria andFromuserphoneIsNull() {
            addCriterion("fromUserPhone is null");
            return (Criteria) this;
        }

        public Criteria andFromuserphoneIsNotNull() {
            addCriterion("fromUserPhone is not null");
            return (Criteria) this;
        }

        public Criteria andFromuserphoneEqualTo(String value) {
            addCriterion("fromUserPhone =", value, "fromuserphone");
            return (Criteria) this;
        }

        public Criteria andFromuserphoneNotEqualTo(String value) {
            addCriterion("fromUserPhone <>", value, "fromuserphone");
            return (Criteria) this;
        }

        public Criteria andFromuserphoneGreaterThan(String value) {
            addCriterion("fromUserPhone >", value, "fromuserphone");
            return (Criteria) this;
        }

        public Criteria andFromuserphoneGreaterThanOrEqualTo(String value) {
            addCriterion("fromUserPhone >=", value, "fromuserphone");
            return (Criteria) this;
        }

        public Criteria andFromuserphoneLessThan(String value) {
            addCriterion("fromUserPhone <", value, "fromuserphone");
            return (Criteria) this;
        }

        public Criteria andFromuserphoneLessThanOrEqualTo(String value) {
            addCriterion("fromUserPhone <=", value, "fromuserphone");
            return (Criteria) this;
        }

        public Criteria andFromuserphoneLike(String value) {
            addCriterion("fromUserPhone like", value, "fromuserphone");
            return (Criteria) this;
        }

        public Criteria andFromuserphoneNotLike(String value) {
            addCriterion("fromUserPhone not like", value, "fromuserphone");
            return (Criteria) this;
        }

        public Criteria andFromuserphoneIn(List<String> values) {
            addCriterion("fromUserPhone in", values, "fromuserphone");
            return (Criteria) this;
        }

        public Criteria andFromuserphoneNotIn(List<String> values) {
            addCriterion("fromUserPhone not in", values, "fromuserphone");
            return (Criteria) this;
        }

        public Criteria andFromuserphoneBetween(String value1, String value2) {
            addCriterion("fromUserPhone between", value1, value2, "fromuserphone");
            return (Criteria) this;
        }

        public Criteria andFromuserphoneNotBetween(String value1, String value2) {
            addCriterion("fromUserPhone not between", value1, value2, "fromuserphone");
            return (Criteria) this;
        }

        public Criteria andGoodsnameIsNull() {
            addCriterion("goodsName is null");
            return (Criteria) this;
        }

        public Criteria andGoodsnameIsNotNull() {
            addCriterion("goodsName is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsnameEqualTo(String value) {
            addCriterion("goodsName =", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameNotEqualTo(String value) {
            addCriterion("goodsName <>", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameGreaterThan(String value) {
            addCriterion("goodsName >", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameGreaterThanOrEqualTo(String value) {
            addCriterion("goodsName >=", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameLessThan(String value) {
            addCriterion("goodsName <", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameLessThanOrEqualTo(String value) {
            addCriterion("goodsName <=", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameLike(String value) {
            addCriterion("goodsName like", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameNotLike(String value) {
            addCriterion("goodsName not like", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameIn(List<String> values) {
            addCriterion("goodsName in", values, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameNotIn(List<String> values) {
            addCriterion("goodsName not in", values, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameBetween(String value1, String value2) {
            addCriterion("goodsName between", value1, value2, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameNotBetween(String value1, String value2) {
            addCriterion("goodsName not between", value1, value2, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsweightIsNull() {
            addCriterion("goodsWeight is null");
            return (Criteria) this;
        }

        public Criteria andGoodsweightIsNotNull() {
            addCriterion("goodsWeight is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsweightEqualTo(Double value) {
            addCriterion("goodsWeight =", value, "goodsweight");
            return (Criteria) this;
        }

        public Criteria andGoodsweightNotEqualTo(Double value) {
            addCriterion("goodsWeight <>", value, "goodsweight");
            return (Criteria) this;
        }

        public Criteria andGoodsweightGreaterThan(Double value) {
            addCriterion("goodsWeight >", value, "goodsweight");
            return (Criteria) this;
        }

        public Criteria andGoodsweightGreaterThanOrEqualTo(Double value) {
            addCriterion("goodsWeight >=", value, "goodsweight");
            return (Criteria) this;
        }

        public Criteria andGoodsweightLessThan(Double value) {
            addCriterion("goodsWeight <", value, "goodsweight");
            return (Criteria) this;
        }

        public Criteria andGoodsweightLessThanOrEqualTo(Double value) {
            addCriterion("goodsWeight <=", value, "goodsweight");
            return (Criteria) this;
        }

        public Criteria andGoodsweightIn(List<Double> values) {
            addCriterion("goodsWeight in", values, "goodsweight");
            return (Criteria) this;
        }

        public Criteria andGoodsweightNotIn(List<Double> values) {
            addCriterion("goodsWeight not in", values, "goodsweight");
            return (Criteria) this;
        }

        public Criteria andGoodsweightBetween(Double value1, Double value2) {
            addCriterion("goodsWeight between", value1, value2, "goodsweight");
            return (Criteria) this;
        }

        public Criteria andGoodsweightNotBetween(Double value1, Double value2) {
            addCriterion("goodsWeight not between", value1, value2, "goodsweight");
            return (Criteria) this;
        }

        public Criteria andMoneyIsNull() {
            addCriterion("money is null");
            return (Criteria) this;
        }

        public Criteria andMoneyIsNotNull() {
            addCriterion("money is not null");
            return (Criteria) this;
        }

        public Criteria andMoneyEqualTo(Double value) {
            addCriterion("money =", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotEqualTo(Double value) {
            addCriterion("money <>", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyGreaterThan(Double value) {
            addCriterion("money >", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("money >=", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLessThan(Double value) {
            addCriterion("money <", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLessThanOrEqualTo(Double value) {
            addCriterion("money <=", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyIn(List<Double> values) {
            addCriterion("money in", values, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotIn(List<Double> values) {
            addCriterion("money not in", values, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyBetween(Double value1, Double value2) {
            addCriterion("money between", value1, value2, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotBetween(Double value1, Double value2) {
            addCriterion("money not between", value1, value2, "money");
            return (Criteria) this;
        }

        public Criteria andOrderstatusIsNull() {
            addCriterion("orderStatus is null");
            return (Criteria) this;
        }

        public Criteria andOrderstatusIsNotNull() {
            addCriterion("orderStatus is not null");
            return (Criteria) this;
        }

        public Criteria andOrderstatusEqualTo(String value) {
            addCriterion("orderStatus =", value, "orderstatus");
            return (Criteria) this;
        }

        public Criteria andOrderstatusNotEqualTo(String value) {
            addCriterion("orderStatus <>", value, "orderstatus");
            return (Criteria) this;
        }

        public Criteria andOrderstatusGreaterThan(String value) {
            addCriterion("orderStatus >", value, "orderstatus");
            return (Criteria) this;
        }

        public Criteria andOrderstatusGreaterThanOrEqualTo(String value) {
            addCriterion("orderStatus >=", value, "orderstatus");
            return (Criteria) this;
        }

        public Criteria andOrderstatusLessThan(String value) {
            addCriterion("orderStatus <", value, "orderstatus");
            return (Criteria) this;
        }

        public Criteria andOrderstatusLessThanOrEqualTo(String value) {
            addCriterion("orderStatus <=", value, "orderstatus");
            return (Criteria) this;
        }

        public Criteria andOrderstatusLike(String value) {
            addCriterion("orderStatus like", value, "orderstatus");
            return (Criteria) this;
        }

        public Criteria andOrderstatusNotLike(String value) {
            addCriterion("orderStatus not like", value, "orderstatus");
            return (Criteria) this;
        }

        public Criteria andOrderstatusIn(List<String> values) {
            addCriterion("orderStatus in", values, "orderstatus");
            return (Criteria) this;
        }

        public Criteria andOrderstatusNotIn(List<String> values) {
            addCriterion("orderStatus not in", values, "orderstatus");
            return (Criteria) this;
        }

        public Criteria andOrderstatusBetween(String value1, String value2) {
            addCriterion("orderStatus between", value1, value2, "orderstatus");
            return (Criteria) this;
        }

        public Criteria andOrderstatusNotBetween(String value1, String value2) {
            addCriterion("orderStatus not between", value1, value2, "orderstatus");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("userName is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("userName is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("userName =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("userName <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("userName >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("userName >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("userName <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("userName <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("userName like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("userName not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("userName in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("userName not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("userName between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("userName not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUserphoneIsNull() {
            addCriterion("userPhone is null");
            return (Criteria) this;
        }

        public Criteria andUserphoneIsNotNull() {
            addCriterion("userPhone is not null");
            return (Criteria) this;
        }

        public Criteria andUserphoneEqualTo(String value) {
            addCriterion("userPhone =", value, "userphone");
            return (Criteria) this;
        }

        public Criteria andUserphoneNotEqualTo(String value) {
            addCriterion("userPhone <>", value, "userphone");
            return (Criteria) this;
        }

        public Criteria andUserphoneGreaterThan(String value) {
            addCriterion("userPhone >", value, "userphone");
            return (Criteria) this;
        }

        public Criteria andUserphoneGreaterThanOrEqualTo(String value) {
            addCriterion("userPhone >=", value, "userphone");
            return (Criteria) this;
        }

        public Criteria andUserphoneLessThan(String value) {
            addCriterion("userPhone <", value, "userphone");
            return (Criteria) this;
        }

        public Criteria andUserphoneLessThanOrEqualTo(String value) {
            addCriterion("userPhone <=", value, "userphone");
            return (Criteria) this;
        }

        public Criteria andUserphoneLike(String value) {
            addCriterion("userPhone like", value, "userphone");
            return (Criteria) this;
        }

        public Criteria andUserphoneNotLike(String value) {
            addCriterion("userPhone not like", value, "userphone");
            return (Criteria) this;
        }

        public Criteria andUserphoneIn(List<String> values) {
            addCriterion("userPhone in", values, "userphone");
            return (Criteria) this;
        }

        public Criteria andUserphoneNotIn(List<String> values) {
            addCriterion("userPhone not in", values, "userphone");
            return (Criteria) this;
        }

        public Criteria andUserphoneBetween(String value1, String value2) {
            addCriterion("userPhone between", value1, value2, "userphone");
            return (Criteria) this;
        }

        public Criteria andUserphoneNotBetween(String value1, String value2) {
            addCriterion("userPhone not between", value1, value2, "userphone");
            return (Criteria) this;
        }

        public Criteria andEndDeptIdIsNull() {
            addCriterion("end_dept_id is null");
            return (Criteria) this;
        }

        public Criteria andEndDeptIdIsNotNull() {
            addCriterion("end_dept_id is not null");
            return (Criteria) this;
        }

        public Criteria andEndDeptIdEqualTo(Long value) {
            addCriterion("end_dept_id =", value, "endDeptId");
            return (Criteria) this;
        }

        public Criteria andEndDeptIdNotEqualTo(Long value) {
            addCriterion("end_dept_id <>", value, "endDeptId");
            return (Criteria) this;
        }

        public Criteria andEndDeptIdGreaterThan(Long value) {
            addCriterion("end_dept_id >", value, "endDeptId");
            return (Criteria) this;
        }

        public Criteria andEndDeptIdGreaterThanOrEqualTo(Long value) {
            addCriterion("end_dept_id >=", value, "endDeptId");
            return (Criteria) this;
        }

        public Criteria andEndDeptIdLessThan(Long value) {
            addCriterion("end_dept_id <", value, "endDeptId");
            return (Criteria) this;
        }

        public Criteria andEndDeptIdLessThanOrEqualTo(Long value) {
            addCriterion("end_dept_id <=", value, "endDeptId");
            return (Criteria) this;
        }

        public Criteria andEndDeptIdIn(List<Long> values) {
            addCriterion("end_dept_id in", values, "endDeptId");
            return (Criteria) this;
        }

        public Criteria andEndDeptIdNotIn(List<Long> values) {
            addCriterion("end_dept_id not in", values, "endDeptId");
            return (Criteria) this;
        }

        public Criteria andEndDeptIdBetween(Long value1, Long value2) {
            addCriterion("end_dept_id between", value1, value2, "endDeptId");
            return (Criteria) this;
        }

        public Criteria andEndDeptIdNotBetween(Long value1, Long value2) {
            addCriterion("end_dept_id not between", value1, value2, "endDeptId");
            return (Criteria) this;
        }

        public Criteria andStartDeptIdIsNull() {
            addCriterion("start_dept_id is null");
            return (Criteria) this;
        }

        public Criteria andStartDeptIdIsNotNull() {
            addCriterion("start_dept_id is not null");
            return (Criteria) this;
        }

        public Criteria andStartDeptIdEqualTo(Long value) {
            addCriterion("start_dept_id =", value, "startDeptId");
            return (Criteria) this;
        }

        public Criteria andStartDeptIdNotEqualTo(Long value) {
            addCriterion("start_dept_id <>", value, "startDeptId");
            return (Criteria) this;
        }

        public Criteria andStartDeptIdGreaterThan(Long value) {
            addCriterion("start_dept_id >", value, "startDeptId");
            return (Criteria) this;
        }

        public Criteria andStartDeptIdGreaterThanOrEqualTo(Long value) {
            addCriterion("start_dept_id >=", value, "startDeptId");
            return (Criteria) this;
        }

        public Criteria andStartDeptIdLessThan(Long value) {
            addCriterion("start_dept_id <", value, "startDeptId");
            return (Criteria) this;
        }

        public Criteria andStartDeptIdLessThanOrEqualTo(Long value) {
            addCriterion("start_dept_id <=", value, "startDeptId");
            return (Criteria) this;
        }

        public Criteria andStartDeptIdIn(List<Long> values) {
            addCriterion("start_dept_id in", values, "startDeptId");
            return (Criteria) this;
        }

        public Criteria andStartDeptIdNotIn(List<Long> values) {
            addCriterion("start_dept_id not in", values, "startDeptId");
            return (Criteria) this;
        }

        public Criteria andStartDeptIdBetween(Long value1, Long value2) {
            addCriterion("start_dept_id between", value1, value2, "startDeptId");
            return (Criteria) this;
        }

        public Criteria andStartDeptIdNotBetween(Long value1, Long value2) {
            addCriterion("start_dept_id not between", value1, value2, "startDeptId");
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