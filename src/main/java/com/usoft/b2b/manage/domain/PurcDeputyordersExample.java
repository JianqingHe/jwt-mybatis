package com.usoft.b2b.manage.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PurcDeputyordersExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PurcDeputyordersExample() {
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

        public Criteria andDeoIdIsNull() {
            addCriterion("deo_id is null");
            return (Criteria) this;
        }

        public Criteria andDeoIdIsNotNull() {
            addCriterion("deo_id is not null");
            return (Criteria) this;
        }

        public Criteria andDeoIdEqualTo(Long value) {
            addCriterion("deo_id =", value, "deoId");
            return (Criteria) this;
        }

        public Criteria andDeoIdNotEqualTo(Long value) {
            addCriterion("deo_id <>", value, "deoId");
            return (Criteria) this;
        }

        public Criteria andDeoIdGreaterThan(Long value) {
            addCriterion("deo_id >", value, "deoId");
            return (Criteria) this;
        }

        public Criteria andDeoIdGreaterThanOrEqualTo(Long value) {
            addCriterion("deo_id >=", value, "deoId");
            return (Criteria) this;
        }

        public Criteria andDeoIdLessThan(Long value) {
            addCriterion("deo_id <", value, "deoId");
            return (Criteria) this;
        }

        public Criteria andDeoIdLessThanOrEqualTo(Long value) {
            addCriterion("deo_id <=", value, "deoId");
            return (Criteria) this;
        }

        public Criteria andDeoIdIn(List<Long> values) {
            addCriterion("deo_id in", values, "deoId");
            return (Criteria) this;
        }

        public Criteria andDeoIdNotIn(List<Long> values) {
            addCriterion("deo_id not in", values, "deoId");
            return (Criteria) this;
        }

        public Criteria andDeoIdBetween(Long value1, Long value2) {
            addCriterion("deo_id between", value1, value2, "deoId");
            return (Criteria) this;
        }

        public Criteria andDeoIdNotBetween(Long value1, Long value2) {
            addCriterion("deo_id not between", value1, value2, "deoId");
            return (Criteria) this;
        }

        public Criteria andDeoActualpaydateIsNull() {
            addCriterion("deo_actualpaydate is null");
            return (Criteria) this;
        }

        public Criteria andDeoActualpaydateIsNotNull() {
            addCriterion("deo_actualpaydate is not null");
            return (Criteria) this;
        }

        public Criteria andDeoActualpaydateEqualTo(Date value) {
            addCriterion("deo_actualpaydate =", value, "deoActualpaydate");
            return (Criteria) this;
        }

        public Criteria andDeoActualpaydateNotEqualTo(Date value) {
            addCriterion("deo_actualpaydate <>", value, "deoActualpaydate");
            return (Criteria) this;
        }

        public Criteria andDeoActualpaydateGreaterThan(Date value) {
            addCriterion("deo_actualpaydate >", value, "deoActualpaydate");
            return (Criteria) this;
        }

        public Criteria andDeoActualpaydateGreaterThanOrEqualTo(Date value) {
            addCriterion("deo_actualpaydate >=", value, "deoActualpaydate");
            return (Criteria) this;
        }

        public Criteria andDeoActualpaydateLessThan(Date value) {
            addCriterion("deo_actualpaydate <", value, "deoActualpaydate");
            return (Criteria) this;
        }

        public Criteria andDeoActualpaydateLessThanOrEqualTo(Date value) {
            addCriterion("deo_actualpaydate <=", value, "deoActualpaydate");
            return (Criteria) this;
        }

        public Criteria andDeoActualpaydateIn(List<Date> values) {
            addCriterion("deo_actualpaydate in", values, "deoActualpaydate");
            return (Criteria) this;
        }

        public Criteria andDeoActualpaydateNotIn(List<Date> values) {
            addCriterion("deo_actualpaydate not in", values, "deoActualpaydate");
            return (Criteria) this;
        }

        public Criteria andDeoActualpaydateBetween(Date value1, Date value2) {
            addCriterion("deo_actualpaydate between", value1, value2, "deoActualpaydate");
            return (Criteria) this;
        }

        public Criteria andDeoActualpaydateNotBetween(Date value1, Date value2) {
            addCriterion("deo_actualpaydate not between", value1, value2, "deoActualpaydate");
            return (Criteria) this;
        }

        public Criteria andDeoActusdpaymentIsNull() {
            addCriterion("deo_actusdpayment is null");
            return (Criteria) this;
        }

        public Criteria andDeoActusdpaymentIsNotNull() {
            addCriterion("deo_actusdpayment is not null");
            return (Criteria) this;
        }

        public Criteria andDeoActusdpaymentEqualTo(Double value) {
            addCriterion("deo_actusdpayment =", value, "deoActusdpayment");
            return (Criteria) this;
        }

        public Criteria andDeoActusdpaymentNotEqualTo(Double value) {
            addCriterion("deo_actusdpayment <>", value, "deoActusdpayment");
            return (Criteria) this;
        }

        public Criteria andDeoActusdpaymentGreaterThan(Double value) {
            addCriterion("deo_actusdpayment >", value, "deoActusdpayment");
            return (Criteria) this;
        }

        public Criteria andDeoActusdpaymentGreaterThanOrEqualTo(Double value) {
            addCriterion("deo_actusdpayment >=", value, "deoActusdpayment");
            return (Criteria) this;
        }

        public Criteria andDeoActusdpaymentLessThan(Double value) {
            addCriterion("deo_actusdpayment <", value, "deoActusdpayment");
            return (Criteria) this;
        }

        public Criteria andDeoActusdpaymentLessThanOrEqualTo(Double value) {
            addCriterion("deo_actusdpayment <=", value, "deoActusdpayment");
            return (Criteria) this;
        }

        public Criteria andDeoActusdpaymentIn(List<Double> values) {
            addCriterion("deo_actusdpayment in", values, "deoActusdpayment");
            return (Criteria) this;
        }

        public Criteria andDeoActusdpaymentNotIn(List<Double> values) {
            addCriterion("deo_actusdpayment not in", values, "deoActusdpayment");
            return (Criteria) this;
        }

        public Criteria andDeoActusdpaymentBetween(Double value1, Double value2) {
            addCriterion("deo_actusdpayment between", value1, value2, "deoActusdpayment");
            return (Criteria) this;
        }

        public Criteria andDeoActusdpaymentNotBetween(Double value1, Double value2) {
            addCriterion("deo_actusdpayment not between", value1, value2, "deoActusdpayment");
            return (Criteria) this;
        }

        public Criteria andDeoBankaccountIsNull() {
            addCriterion("deo_bankaccount is null");
            return (Criteria) this;
        }

        public Criteria andDeoBankaccountIsNotNull() {
            addCriterion("deo_bankaccount is not null");
            return (Criteria) this;
        }

        public Criteria andDeoBankaccountEqualTo(String value) {
            addCriterion("deo_bankaccount =", value, "deoBankaccount");
            return (Criteria) this;
        }

        public Criteria andDeoBankaccountNotEqualTo(String value) {
            addCriterion("deo_bankaccount <>", value, "deoBankaccount");
            return (Criteria) this;
        }

        public Criteria andDeoBankaccountGreaterThan(String value) {
            addCriterion("deo_bankaccount >", value, "deoBankaccount");
            return (Criteria) this;
        }

        public Criteria andDeoBankaccountGreaterThanOrEqualTo(String value) {
            addCriterion("deo_bankaccount >=", value, "deoBankaccount");
            return (Criteria) this;
        }

        public Criteria andDeoBankaccountLessThan(String value) {
            addCriterion("deo_bankaccount <", value, "deoBankaccount");
            return (Criteria) this;
        }

        public Criteria andDeoBankaccountLessThanOrEqualTo(String value) {
            addCriterion("deo_bankaccount <=", value, "deoBankaccount");
            return (Criteria) this;
        }

        public Criteria andDeoBankaccountLike(String value) {
            addCriterion("deo_bankaccount like", value, "deoBankaccount");
            return (Criteria) this;
        }

        public Criteria andDeoBankaccountNotLike(String value) {
            addCriterion("deo_bankaccount not like", value, "deoBankaccount");
            return (Criteria) this;
        }

        public Criteria andDeoBankaccountIn(List<String> values) {
            addCriterion("deo_bankaccount in", values, "deoBankaccount");
            return (Criteria) this;
        }

        public Criteria andDeoBankaccountNotIn(List<String> values) {
            addCriterion("deo_bankaccount not in", values, "deoBankaccount");
            return (Criteria) this;
        }

        public Criteria andDeoBankaccountBetween(String value1, String value2) {
            addCriterion("deo_bankaccount between", value1, value2, "deoBankaccount");
            return (Criteria) this;
        }

        public Criteria andDeoBankaccountNotBetween(String value1, String value2) {
            addCriterion("deo_bankaccount not between", value1, value2, "deoBankaccount");
            return (Criteria) this;
        }

        public Criteria andDeoBankaddressIsNull() {
            addCriterion("deo_bankaddress is null");
            return (Criteria) this;
        }

        public Criteria andDeoBankaddressIsNotNull() {
            addCriterion("deo_bankaddress is not null");
            return (Criteria) this;
        }

        public Criteria andDeoBankaddressEqualTo(String value) {
            addCriterion("deo_bankaddress =", value, "deoBankaddress");
            return (Criteria) this;
        }

        public Criteria andDeoBankaddressNotEqualTo(String value) {
            addCriterion("deo_bankaddress <>", value, "deoBankaddress");
            return (Criteria) this;
        }

        public Criteria andDeoBankaddressGreaterThan(String value) {
            addCriterion("deo_bankaddress >", value, "deoBankaddress");
            return (Criteria) this;
        }

        public Criteria andDeoBankaddressGreaterThanOrEqualTo(String value) {
            addCriterion("deo_bankaddress >=", value, "deoBankaddress");
            return (Criteria) this;
        }

        public Criteria andDeoBankaddressLessThan(String value) {
            addCriterion("deo_bankaddress <", value, "deoBankaddress");
            return (Criteria) this;
        }

        public Criteria andDeoBankaddressLessThanOrEqualTo(String value) {
            addCriterion("deo_bankaddress <=", value, "deoBankaddress");
            return (Criteria) this;
        }

        public Criteria andDeoBankaddressLike(String value) {
            addCriterion("deo_bankaddress like", value, "deoBankaddress");
            return (Criteria) this;
        }

        public Criteria andDeoBankaddressNotLike(String value) {
            addCriterion("deo_bankaddress not like", value, "deoBankaddress");
            return (Criteria) this;
        }

        public Criteria andDeoBankaddressIn(List<String> values) {
            addCriterion("deo_bankaddress in", values, "deoBankaddress");
            return (Criteria) this;
        }

        public Criteria andDeoBankaddressNotIn(List<String> values) {
            addCriterion("deo_bankaddress not in", values, "deoBankaddress");
            return (Criteria) this;
        }

        public Criteria andDeoBankaddressBetween(String value1, String value2) {
            addCriterion("deo_bankaddress between", value1, value2, "deoBankaddress");
            return (Criteria) this;
        }

        public Criteria andDeoBankaddressNotBetween(String value1, String value2) {
            addCriterion("deo_bankaddress not between", value1, value2, "deoBankaddress");
            return (Criteria) this;
        }

        public Criteria andDeoBankcodeIsNull() {
            addCriterion("deo_bankcode is null");
            return (Criteria) this;
        }

        public Criteria andDeoBankcodeIsNotNull() {
            addCriterion("deo_bankcode is not null");
            return (Criteria) this;
        }

        public Criteria andDeoBankcodeEqualTo(String value) {
            addCriterion("deo_bankcode =", value, "deoBankcode");
            return (Criteria) this;
        }

        public Criteria andDeoBankcodeNotEqualTo(String value) {
            addCriterion("deo_bankcode <>", value, "deoBankcode");
            return (Criteria) this;
        }

        public Criteria andDeoBankcodeGreaterThan(String value) {
            addCriterion("deo_bankcode >", value, "deoBankcode");
            return (Criteria) this;
        }

        public Criteria andDeoBankcodeGreaterThanOrEqualTo(String value) {
            addCriterion("deo_bankcode >=", value, "deoBankcode");
            return (Criteria) this;
        }

        public Criteria andDeoBankcodeLessThan(String value) {
            addCriterion("deo_bankcode <", value, "deoBankcode");
            return (Criteria) this;
        }

        public Criteria andDeoBankcodeLessThanOrEqualTo(String value) {
            addCriterion("deo_bankcode <=", value, "deoBankcode");
            return (Criteria) this;
        }

        public Criteria andDeoBankcodeLike(String value) {
            addCriterion("deo_bankcode like", value, "deoBankcode");
            return (Criteria) this;
        }

        public Criteria andDeoBankcodeNotLike(String value) {
            addCriterion("deo_bankcode not like", value, "deoBankcode");
            return (Criteria) this;
        }

        public Criteria andDeoBankcodeIn(List<String> values) {
            addCriterion("deo_bankcode in", values, "deoBankcode");
            return (Criteria) this;
        }

        public Criteria andDeoBankcodeNotIn(List<String> values) {
            addCriterion("deo_bankcode not in", values, "deoBankcode");
            return (Criteria) this;
        }

        public Criteria andDeoBankcodeBetween(String value1, String value2) {
            addCriterion("deo_bankcode between", value1, value2, "deoBankcode");
            return (Criteria) this;
        }

        public Criteria andDeoBankcodeNotBetween(String value1, String value2) {
            addCriterion("deo_bankcode not between", value1, value2, "deoBankcode");
            return (Criteria) this;
        }

        public Criteria andDeoBanknameIsNull() {
            addCriterion("deo_bankname is null");
            return (Criteria) this;
        }

        public Criteria andDeoBanknameIsNotNull() {
            addCriterion("deo_bankname is not null");
            return (Criteria) this;
        }

        public Criteria andDeoBanknameEqualTo(String value) {
            addCriterion("deo_bankname =", value, "deoBankname");
            return (Criteria) this;
        }

        public Criteria andDeoBanknameNotEqualTo(String value) {
            addCriterion("deo_bankname <>", value, "deoBankname");
            return (Criteria) this;
        }

        public Criteria andDeoBanknameGreaterThan(String value) {
            addCriterion("deo_bankname >", value, "deoBankname");
            return (Criteria) this;
        }

        public Criteria andDeoBanknameGreaterThanOrEqualTo(String value) {
            addCriterion("deo_bankname >=", value, "deoBankname");
            return (Criteria) this;
        }

        public Criteria andDeoBanknameLessThan(String value) {
            addCriterion("deo_bankname <", value, "deoBankname");
            return (Criteria) this;
        }

        public Criteria andDeoBanknameLessThanOrEqualTo(String value) {
            addCriterion("deo_bankname <=", value, "deoBankname");
            return (Criteria) this;
        }

        public Criteria andDeoBanknameLike(String value) {
            addCriterion("deo_bankname like", value, "deoBankname");
            return (Criteria) this;
        }

        public Criteria andDeoBanknameNotLike(String value) {
            addCriterion("deo_bankname not like", value, "deoBankname");
            return (Criteria) this;
        }

        public Criteria andDeoBanknameIn(List<String> values) {
            addCriterion("deo_bankname in", values, "deoBankname");
            return (Criteria) this;
        }

        public Criteria andDeoBanknameNotIn(List<String> values) {
            addCriterion("deo_bankname not in", values, "deoBankname");
            return (Criteria) this;
        }

        public Criteria andDeoBanknameBetween(String value1, String value2) {
            addCriterion("deo_bankname between", value1, value2, "deoBankname");
            return (Criteria) this;
        }

        public Criteria andDeoBanknameNotBetween(String value1, String value2) {
            addCriterion("deo_bankname not between", value1, value2, "deoBankname");
            return (Criteria) this;
        }

        public Criteria andDeoCodeIsNull() {
            addCriterion("deo_code is null");
            return (Criteria) this;
        }

        public Criteria andDeoCodeIsNotNull() {
            addCriterion("deo_code is not null");
            return (Criteria) this;
        }

        public Criteria andDeoCodeEqualTo(String value) {
            addCriterion("deo_code =", value, "deoCode");
            return (Criteria) this;
        }

        public Criteria andDeoCodeNotEqualTo(String value) {
            addCriterion("deo_code <>", value, "deoCode");
            return (Criteria) this;
        }

        public Criteria andDeoCodeGreaterThan(String value) {
            addCriterion("deo_code >", value, "deoCode");
            return (Criteria) this;
        }

        public Criteria andDeoCodeGreaterThanOrEqualTo(String value) {
            addCriterion("deo_code >=", value, "deoCode");
            return (Criteria) this;
        }

        public Criteria andDeoCodeLessThan(String value) {
            addCriterion("deo_code <", value, "deoCode");
            return (Criteria) this;
        }

        public Criteria andDeoCodeLessThanOrEqualTo(String value) {
            addCriterion("deo_code <=", value, "deoCode");
            return (Criteria) this;
        }

        public Criteria andDeoCodeLike(String value) {
            addCriterion("deo_code like", value, "deoCode");
            return (Criteria) this;
        }

        public Criteria andDeoCodeNotLike(String value) {
            addCriterion("deo_code not like", value, "deoCode");
            return (Criteria) this;
        }

        public Criteria andDeoCodeIn(List<String> values) {
            addCriterion("deo_code in", values, "deoCode");
            return (Criteria) this;
        }

        public Criteria andDeoCodeNotIn(List<String> values) {
            addCriterion("deo_code not in", values, "deoCode");
            return (Criteria) this;
        }

        public Criteria andDeoCodeBetween(String value1, String value2) {
            addCriterion("deo_code between", value1, value2, "deoCode");
            return (Criteria) this;
        }

        public Criteria andDeoCodeNotBetween(String value1, String value2) {
            addCriterion("deo_code not between", value1, value2, "deoCode");
            return (Criteria) this;
        }

        public Criteria andDeoCompanynameIsNull() {
            addCriterion("deo_companyname is null");
            return (Criteria) this;
        }

        public Criteria andDeoCompanynameIsNotNull() {
            addCriterion("deo_companyname is not null");
            return (Criteria) this;
        }

        public Criteria andDeoCompanynameEqualTo(String value) {
            addCriterion("deo_companyname =", value, "deoCompanyname");
            return (Criteria) this;
        }

        public Criteria andDeoCompanynameNotEqualTo(String value) {
            addCriterion("deo_companyname <>", value, "deoCompanyname");
            return (Criteria) this;
        }

        public Criteria andDeoCompanynameGreaterThan(String value) {
            addCriterion("deo_companyname >", value, "deoCompanyname");
            return (Criteria) this;
        }

        public Criteria andDeoCompanynameGreaterThanOrEqualTo(String value) {
            addCriterion("deo_companyname >=", value, "deoCompanyname");
            return (Criteria) this;
        }

        public Criteria andDeoCompanynameLessThan(String value) {
            addCriterion("deo_companyname <", value, "deoCompanyname");
            return (Criteria) this;
        }

        public Criteria andDeoCompanynameLessThanOrEqualTo(String value) {
            addCriterion("deo_companyname <=", value, "deoCompanyname");
            return (Criteria) this;
        }

        public Criteria andDeoCompanynameLike(String value) {
            addCriterion("deo_companyname like", value, "deoCompanyname");
            return (Criteria) this;
        }

        public Criteria andDeoCompanynameNotLike(String value) {
            addCriterion("deo_companyname not like", value, "deoCompanyname");
            return (Criteria) this;
        }

        public Criteria andDeoCompanynameIn(List<String> values) {
            addCriterion("deo_companyname in", values, "deoCompanyname");
            return (Criteria) this;
        }

        public Criteria andDeoCompanynameNotIn(List<String> values) {
            addCriterion("deo_companyname not in", values, "deoCompanyname");
            return (Criteria) this;
        }

        public Criteria andDeoCompanynameBetween(String value1, String value2) {
            addCriterion("deo_companyname between", value1, value2, "deoCompanyname");
            return (Criteria) this;
        }

        public Criteria andDeoCompanynameNotBetween(String value1, String value2) {
            addCriterion("deo_companyname not between", value1, value2, "deoCompanyname");
            return (Criteria) this;
        }

        public Criteria andDeoCurrencyIsNull() {
            addCriterion("deo_currency is null");
            return (Criteria) this;
        }

        public Criteria andDeoCurrencyIsNotNull() {
            addCriterion("deo_currency is not null");
            return (Criteria) this;
        }

        public Criteria andDeoCurrencyEqualTo(String value) {
            addCriterion("deo_currency =", value, "deoCurrency");
            return (Criteria) this;
        }

        public Criteria andDeoCurrencyNotEqualTo(String value) {
            addCriterion("deo_currency <>", value, "deoCurrency");
            return (Criteria) this;
        }

        public Criteria andDeoCurrencyGreaterThan(String value) {
            addCriterion("deo_currency >", value, "deoCurrency");
            return (Criteria) this;
        }

        public Criteria andDeoCurrencyGreaterThanOrEqualTo(String value) {
            addCriterion("deo_currency >=", value, "deoCurrency");
            return (Criteria) this;
        }

        public Criteria andDeoCurrencyLessThan(String value) {
            addCriterion("deo_currency <", value, "deoCurrency");
            return (Criteria) this;
        }

        public Criteria andDeoCurrencyLessThanOrEqualTo(String value) {
            addCriterion("deo_currency <=", value, "deoCurrency");
            return (Criteria) this;
        }

        public Criteria andDeoCurrencyLike(String value) {
            addCriterion("deo_currency like", value, "deoCurrency");
            return (Criteria) this;
        }

        public Criteria andDeoCurrencyNotLike(String value) {
            addCriterion("deo_currency not like", value, "deoCurrency");
            return (Criteria) this;
        }

        public Criteria andDeoCurrencyIn(List<String> values) {
            addCriterion("deo_currency in", values, "deoCurrency");
            return (Criteria) this;
        }

        public Criteria andDeoCurrencyNotIn(List<String> values) {
            addCriterion("deo_currency not in", values, "deoCurrency");
            return (Criteria) this;
        }

        public Criteria andDeoCurrencyBetween(String value1, String value2) {
            addCriterion("deo_currency between", value1, value2, "deoCurrency");
            return (Criteria) this;
        }

        public Criteria andDeoCurrencyNotBetween(String value1, String value2) {
            addCriterion("deo_currency not between", value1, value2, "deoCurrency");
            return (Criteria) this;
        }

        public Criteria andDeoCustomerIsNull() {
            addCriterion("deo_customer is null");
            return (Criteria) this;
        }

        public Criteria andDeoCustomerIsNotNull() {
            addCriterion("deo_customer is not null");
            return (Criteria) this;
        }

        public Criteria andDeoCustomerEqualTo(String value) {
            addCriterion("deo_customer =", value, "deoCustomer");
            return (Criteria) this;
        }

        public Criteria andDeoCustomerNotEqualTo(String value) {
            addCriterion("deo_customer <>", value, "deoCustomer");
            return (Criteria) this;
        }

        public Criteria andDeoCustomerGreaterThan(String value) {
            addCriterion("deo_customer >", value, "deoCustomer");
            return (Criteria) this;
        }

        public Criteria andDeoCustomerGreaterThanOrEqualTo(String value) {
            addCriterion("deo_customer >=", value, "deoCustomer");
            return (Criteria) this;
        }

        public Criteria andDeoCustomerLessThan(String value) {
            addCriterion("deo_customer <", value, "deoCustomer");
            return (Criteria) this;
        }

        public Criteria andDeoCustomerLessThanOrEqualTo(String value) {
            addCriterion("deo_customer <=", value, "deoCustomer");
            return (Criteria) this;
        }

        public Criteria andDeoCustomerLike(String value) {
            addCriterion("deo_customer like", value, "deoCustomer");
            return (Criteria) this;
        }

        public Criteria andDeoCustomerNotLike(String value) {
            addCriterion("deo_customer not like", value, "deoCustomer");
            return (Criteria) this;
        }

        public Criteria andDeoCustomerIn(List<String> values) {
            addCriterion("deo_customer in", values, "deoCustomer");
            return (Criteria) this;
        }

        public Criteria andDeoCustomerNotIn(List<String> values) {
            addCriterion("deo_customer not in", values, "deoCustomer");
            return (Criteria) this;
        }

        public Criteria andDeoCustomerBetween(String value1, String value2) {
            addCriterion("deo_customer between", value1, value2, "deoCustomer");
            return (Criteria) this;
        }

        public Criteria andDeoCustomerNotBetween(String value1, String value2) {
            addCriterion("deo_customer not between", value1, value2, "deoCustomer");
            return (Criteria) this;
        }

        public Criteria andDeoDateIsNull() {
            addCriterion("deo_date is null");
            return (Criteria) this;
        }

        public Criteria andDeoDateIsNotNull() {
            addCriterion("deo_date is not null");
            return (Criteria) this;
        }

        public Criteria andDeoDateEqualTo(Date value) {
            addCriterion("deo_date =", value, "deoDate");
            return (Criteria) this;
        }

        public Criteria andDeoDateNotEqualTo(Date value) {
            addCriterion("deo_date <>", value, "deoDate");
            return (Criteria) this;
        }

        public Criteria andDeoDateGreaterThan(Date value) {
            addCriterion("deo_date >", value, "deoDate");
            return (Criteria) this;
        }

        public Criteria andDeoDateGreaterThanOrEqualTo(Date value) {
            addCriterion("deo_date >=", value, "deoDate");
            return (Criteria) this;
        }

        public Criteria andDeoDateLessThan(Date value) {
            addCriterion("deo_date <", value, "deoDate");
            return (Criteria) this;
        }

        public Criteria andDeoDateLessThanOrEqualTo(Date value) {
            addCriterion("deo_date <=", value, "deoDate");
            return (Criteria) this;
        }

        public Criteria andDeoDateIn(List<Date> values) {
            addCriterion("deo_date in", values, "deoDate");
            return (Criteria) this;
        }

        public Criteria andDeoDateNotIn(List<Date> values) {
            addCriterion("deo_date not in", values, "deoDate");
            return (Criteria) this;
        }

        public Criteria andDeoDateBetween(Date value1, Date value2) {
            addCriterion("deo_date between", value1, value2, "deoDate");
            return (Criteria) this;
        }

        public Criteria andDeoDateNotBetween(Date value1, Date value2) {
            addCriterion("deo_date not between", value1, value2, "deoDate");
            return (Criteria) this;
        }

        public Criteria andDeoDeliverydateIsNull() {
            addCriterion("deo_deliverydate is null");
            return (Criteria) this;
        }

        public Criteria andDeoDeliverydateIsNotNull() {
            addCriterion("deo_deliverydate is not null");
            return (Criteria) this;
        }

        public Criteria andDeoDeliverydateEqualTo(Date value) {
            addCriterion("deo_deliverydate =", value, "deoDeliverydate");
            return (Criteria) this;
        }

        public Criteria andDeoDeliverydateNotEqualTo(Date value) {
            addCriterion("deo_deliverydate <>", value, "deoDeliverydate");
            return (Criteria) this;
        }

        public Criteria andDeoDeliverydateGreaterThan(Date value) {
            addCriterion("deo_deliverydate >", value, "deoDeliverydate");
            return (Criteria) this;
        }

        public Criteria andDeoDeliverydateGreaterThanOrEqualTo(Date value) {
            addCriterion("deo_deliverydate >=", value, "deoDeliverydate");
            return (Criteria) this;
        }

        public Criteria andDeoDeliverydateLessThan(Date value) {
            addCriterion("deo_deliverydate <", value, "deoDeliverydate");
            return (Criteria) this;
        }

        public Criteria andDeoDeliverydateLessThanOrEqualTo(Date value) {
            addCriterion("deo_deliverydate <=", value, "deoDeliverydate");
            return (Criteria) this;
        }

        public Criteria andDeoDeliverydateIn(List<Date> values) {
            addCriterion("deo_deliverydate in", values, "deoDeliverydate");
            return (Criteria) this;
        }

        public Criteria andDeoDeliverydateNotIn(List<Date> values) {
            addCriterion("deo_deliverydate not in", values, "deoDeliverydate");
            return (Criteria) this;
        }

        public Criteria andDeoDeliverydateBetween(Date value1, Date value2) {
            addCriterion("deo_deliverydate between", value1, value2, "deoDeliverydate");
            return (Criteria) this;
        }

        public Criteria andDeoDeliverydateNotBetween(Date value1, Date value2) {
            addCriterion("deo_deliverydate not between", value1, value2, "deoDeliverydate");
            return (Criteria) this;
        }

        public Criteria andDeoDeliverymethodIsNull() {
            addCriterion("deo_deliverymethod is null");
            return (Criteria) this;
        }

        public Criteria andDeoDeliverymethodIsNotNull() {
            addCriterion("deo_deliverymethod is not null");
            return (Criteria) this;
        }

        public Criteria andDeoDeliverymethodEqualTo(String value) {
            addCriterion("deo_deliverymethod =", value, "deoDeliverymethod");
            return (Criteria) this;
        }

        public Criteria andDeoDeliverymethodNotEqualTo(String value) {
            addCriterion("deo_deliverymethod <>", value, "deoDeliverymethod");
            return (Criteria) this;
        }

        public Criteria andDeoDeliverymethodGreaterThan(String value) {
            addCriterion("deo_deliverymethod >", value, "deoDeliverymethod");
            return (Criteria) this;
        }

        public Criteria andDeoDeliverymethodGreaterThanOrEqualTo(String value) {
            addCriterion("deo_deliverymethod >=", value, "deoDeliverymethod");
            return (Criteria) this;
        }

        public Criteria andDeoDeliverymethodLessThan(String value) {
            addCriterion("deo_deliverymethod <", value, "deoDeliverymethod");
            return (Criteria) this;
        }

        public Criteria andDeoDeliverymethodLessThanOrEqualTo(String value) {
            addCriterion("deo_deliverymethod <=", value, "deoDeliverymethod");
            return (Criteria) this;
        }

        public Criteria andDeoDeliverymethodLike(String value) {
            addCriterion("deo_deliverymethod like", value, "deoDeliverymethod");
            return (Criteria) this;
        }

        public Criteria andDeoDeliverymethodNotLike(String value) {
            addCriterion("deo_deliverymethod not like", value, "deoDeliverymethod");
            return (Criteria) this;
        }

        public Criteria andDeoDeliverymethodIn(List<String> values) {
            addCriterion("deo_deliverymethod in", values, "deoDeliverymethod");
            return (Criteria) this;
        }

        public Criteria andDeoDeliverymethodNotIn(List<String> values) {
            addCriterion("deo_deliverymethod not in", values, "deoDeliverymethod");
            return (Criteria) this;
        }

        public Criteria andDeoDeliverymethodBetween(String value1, String value2) {
            addCriterion("deo_deliverymethod between", value1, value2, "deoDeliverymethod");
            return (Criteria) this;
        }

        public Criteria andDeoDeliverymethodNotBetween(String value1, String value2) {
            addCriterion("deo_deliverymethod not between", value1, value2, "deoDeliverymethod");
            return (Criteria) this;
        }

        public Criteria andDeoDeputynameIsNull() {
            addCriterion("deo_deputyname is null");
            return (Criteria) this;
        }

        public Criteria andDeoDeputynameIsNotNull() {
            addCriterion("deo_deputyname is not null");
            return (Criteria) this;
        }

        public Criteria andDeoDeputynameEqualTo(String value) {
            addCriterion("deo_deputyname =", value, "deoDeputyname");
            return (Criteria) this;
        }

        public Criteria andDeoDeputynameNotEqualTo(String value) {
            addCriterion("deo_deputyname <>", value, "deoDeputyname");
            return (Criteria) this;
        }

        public Criteria andDeoDeputynameGreaterThan(String value) {
            addCriterion("deo_deputyname >", value, "deoDeputyname");
            return (Criteria) this;
        }

        public Criteria andDeoDeputynameGreaterThanOrEqualTo(String value) {
            addCriterion("deo_deputyname >=", value, "deoDeputyname");
            return (Criteria) this;
        }

        public Criteria andDeoDeputynameLessThan(String value) {
            addCriterion("deo_deputyname <", value, "deoDeputyname");
            return (Criteria) this;
        }

        public Criteria andDeoDeputynameLessThanOrEqualTo(String value) {
            addCriterion("deo_deputyname <=", value, "deoDeputyname");
            return (Criteria) this;
        }

        public Criteria andDeoDeputynameLike(String value) {
            addCriterion("deo_deputyname like", value, "deoDeputyname");
            return (Criteria) this;
        }

        public Criteria andDeoDeputynameNotLike(String value) {
            addCriterion("deo_deputyname not like", value, "deoDeputyname");
            return (Criteria) this;
        }

        public Criteria andDeoDeputynameIn(List<String> values) {
            addCriterion("deo_deputyname in", values, "deoDeputyname");
            return (Criteria) this;
        }

        public Criteria andDeoDeputynameNotIn(List<String> values) {
            addCriterion("deo_deputyname not in", values, "deoDeputyname");
            return (Criteria) this;
        }

        public Criteria andDeoDeputynameBetween(String value1, String value2) {
            addCriterion("deo_deputyname between", value1, value2, "deoDeputyname");
            return (Criteria) this;
        }

        public Criteria andDeoDeputynameNotBetween(String value1, String value2) {
            addCriterion("deo_deputyname not between", value1, value2, "deoDeputyname");
            return (Criteria) this;
        }

        public Criteria andDeoDeputyuuIsNull() {
            addCriterion("deo_deputyuu is null");
            return (Criteria) this;
        }

        public Criteria andDeoDeputyuuIsNotNull() {
            addCriterion("deo_deputyuu is not null");
            return (Criteria) this;
        }

        public Criteria andDeoDeputyuuEqualTo(Long value) {
            addCriterion("deo_deputyuu =", value, "deoDeputyuu");
            return (Criteria) this;
        }

        public Criteria andDeoDeputyuuNotEqualTo(Long value) {
            addCriterion("deo_deputyuu <>", value, "deoDeputyuu");
            return (Criteria) this;
        }

        public Criteria andDeoDeputyuuGreaterThan(Long value) {
            addCriterion("deo_deputyuu >", value, "deoDeputyuu");
            return (Criteria) this;
        }

        public Criteria andDeoDeputyuuGreaterThanOrEqualTo(Long value) {
            addCriterion("deo_deputyuu >=", value, "deoDeputyuu");
            return (Criteria) this;
        }

        public Criteria andDeoDeputyuuLessThan(Long value) {
            addCriterion("deo_deputyuu <", value, "deoDeputyuu");
            return (Criteria) this;
        }

        public Criteria andDeoDeputyuuLessThanOrEqualTo(Long value) {
            addCriterion("deo_deputyuu <=", value, "deoDeputyuu");
            return (Criteria) this;
        }

        public Criteria andDeoDeputyuuIn(List<Long> values) {
            addCriterion("deo_deputyuu in", values, "deoDeputyuu");
            return (Criteria) this;
        }

        public Criteria andDeoDeputyuuNotIn(List<Long> values) {
            addCriterion("deo_deputyuu not in", values, "deoDeputyuu");
            return (Criteria) this;
        }

        public Criteria andDeoDeputyuuBetween(Long value1, Long value2) {
            addCriterion("deo_deputyuu between", value1, value2, "deoDeputyuu");
            return (Criteria) this;
        }

        public Criteria andDeoDeputyuuNotBetween(Long value1, Long value2) {
            addCriterion("deo_deputyuu not between", value1, value2, "deoDeputyuu");
            return (Criteria) this;
        }

        public Criteria andDeoDownloadstatusIsNull() {
            addCriterion("deo_downloadstatus is null");
            return (Criteria) this;
        }

        public Criteria andDeoDownloadstatusIsNotNull() {
            addCriterion("deo_downloadstatus is not null");
            return (Criteria) this;
        }

        public Criteria andDeoDownloadstatusEqualTo(String value) {
            addCriterion("deo_downloadstatus =", value, "deoDownloadstatus");
            return (Criteria) this;
        }

        public Criteria andDeoDownloadstatusNotEqualTo(String value) {
            addCriterion("deo_downloadstatus <>", value, "deoDownloadstatus");
            return (Criteria) this;
        }

        public Criteria andDeoDownloadstatusGreaterThan(String value) {
            addCriterion("deo_downloadstatus >", value, "deoDownloadstatus");
            return (Criteria) this;
        }

        public Criteria andDeoDownloadstatusGreaterThanOrEqualTo(String value) {
            addCriterion("deo_downloadstatus >=", value, "deoDownloadstatus");
            return (Criteria) this;
        }

        public Criteria andDeoDownloadstatusLessThan(String value) {
            addCriterion("deo_downloadstatus <", value, "deoDownloadstatus");
            return (Criteria) this;
        }

        public Criteria andDeoDownloadstatusLessThanOrEqualTo(String value) {
            addCriterion("deo_downloadstatus <=", value, "deoDownloadstatus");
            return (Criteria) this;
        }

        public Criteria andDeoDownloadstatusLike(String value) {
            addCriterion("deo_downloadstatus like", value, "deoDownloadstatus");
            return (Criteria) this;
        }

        public Criteria andDeoDownloadstatusNotLike(String value) {
            addCriterion("deo_downloadstatus not like", value, "deoDownloadstatus");
            return (Criteria) this;
        }

        public Criteria andDeoDownloadstatusIn(List<String> values) {
            addCriterion("deo_downloadstatus in", values, "deoDownloadstatus");
            return (Criteria) this;
        }

        public Criteria andDeoDownloadstatusNotIn(List<String> values) {
            addCriterion("deo_downloadstatus not in", values, "deoDownloadstatus");
            return (Criteria) this;
        }

        public Criteria andDeoDownloadstatusBetween(String value1, String value2) {
            addCriterion("deo_downloadstatus between", value1, value2, "deoDownloadstatus");
            return (Criteria) this;
        }

        public Criteria andDeoDownloadstatusNotBetween(String value1, String value2) {
            addCriterion("deo_downloadstatus not between", value1, value2, "deoDownloadstatus");
            return (Criteria) this;
        }

        public Criteria andDeoEnaddressIsNull() {
            addCriterion("deo_enaddress is null");
            return (Criteria) this;
        }

        public Criteria andDeoEnaddressIsNotNull() {
            addCriterion("deo_enaddress is not null");
            return (Criteria) this;
        }

        public Criteria andDeoEnaddressEqualTo(String value) {
            addCriterion("deo_enaddress =", value, "deoEnaddress");
            return (Criteria) this;
        }

        public Criteria andDeoEnaddressNotEqualTo(String value) {
            addCriterion("deo_enaddress <>", value, "deoEnaddress");
            return (Criteria) this;
        }

        public Criteria andDeoEnaddressGreaterThan(String value) {
            addCriterion("deo_enaddress >", value, "deoEnaddress");
            return (Criteria) this;
        }

        public Criteria andDeoEnaddressGreaterThanOrEqualTo(String value) {
            addCriterion("deo_enaddress >=", value, "deoEnaddress");
            return (Criteria) this;
        }

        public Criteria andDeoEnaddressLessThan(String value) {
            addCriterion("deo_enaddress <", value, "deoEnaddress");
            return (Criteria) this;
        }

        public Criteria andDeoEnaddressLessThanOrEqualTo(String value) {
            addCriterion("deo_enaddress <=", value, "deoEnaddress");
            return (Criteria) this;
        }

        public Criteria andDeoEnaddressLike(String value) {
            addCriterion("deo_enaddress like", value, "deoEnaddress");
            return (Criteria) this;
        }

        public Criteria andDeoEnaddressNotLike(String value) {
            addCriterion("deo_enaddress not like", value, "deoEnaddress");
            return (Criteria) this;
        }

        public Criteria andDeoEnaddressIn(List<String> values) {
            addCriterion("deo_enaddress in", values, "deoEnaddress");
            return (Criteria) this;
        }

        public Criteria andDeoEnaddressNotIn(List<String> values) {
            addCriterion("deo_enaddress not in", values, "deoEnaddress");
            return (Criteria) this;
        }

        public Criteria andDeoEnaddressBetween(String value1, String value2) {
            addCriterion("deo_enaddress between", value1, value2, "deoEnaddress");
            return (Criteria) this;
        }

        public Criteria andDeoEnaddressNotBetween(String value1, String value2) {
            addCriterion("deo_enaddress not between", value1, value2, "deoEnaddress");
            return (Criteria) this;
        }

        public Criteria andDeoEnfaxIsNull() {
            addCriterion("deo_enfax is null");
            return (Criteria) this;
        }

        public Criteria andDeoEnfaxIsNotNull() {
            addCriterion("deo_enfax is not null");
            return (Criteria) this;
        }

        public Criteria andDeoEnfaxEqualTo(String value) {
            addCriterion("deo_enfax =", value, "deoEnfax");
            return (Criteria) this;
        }

        public Criteria andDeoEnfaxNotEqualTo(String value) {
            addCriterion("deo_enfax <>", value, "deoEnfax");
            return (Criteria) this;
        }

        public Criteria andDeoEnfaxGreaterThan(String value) {
            addCriterion("deo_enfax >", value, "deoEnfax");
            return (Criteria) this;
        }

        public Criteria andDeoEnfaxGreaterThanOrEqualTo(String value) {
            addCriterion("deo_enfax >=", value, "deoEnfax");
            return (Criteria) this;
        }

        public Criteria andDeoEnfaxLessThan(String value) {
            addCriterion("deo_enfax <", value, "deoEnfax");
            return (Criteria) this;
        }

        public Criteria andDeoEnfaxLessThanOrEqualTo(String value) {
            addCriterion("deo_enfax <=", value, "deoEnfax");
            return (Criteria) this;
        }

        public Criteria andDeoEnfaxLike(String value) {
            addCriterion("deo_enfax like", value, "deoEnfax");
            return (Criteria) this;
        }

        public Criteria andDeoEnfaxNotLike(String value) {
            addCriterion("deo_enfax not like", value, "deoEnfax");
            return (Criteria) this;
        }

        public Criteria andDeoEnfaxIn(List<String> values) {
            addCriterion("deo_enfax in", values, "deoEnfax");
            return (Criteria) this;
        }

        public Criteria andDeoEnfaxNotIn(List<String> values) {
            addCriterion("deo_enfax not in", values, "deoEnfax");
            return (Criteria) this;
        }

        public Criteria andDeoEnfaxBetween(String value1, String value2) {
            addCriterion("deo_enfax between", value1, value2, "deoEnfax");
            return (Criteria) this;
        }

        public Criteria andDeoEnfaxNotBetween(String value1, String value2) {
            addCriterion("deo_enfax not between", value1, value2, "deoEnfax");
            return (Criteria) this;
        }

        public Criteria andDeoEntrydateIsNull() {
            addCriterion("deo_entrydate is null");
            return (Criteria) this;
        }

        public Criteria andDeoEntrydateIsNotNull() {
            addCriterion("deo_entrydate is not null");
            return (Criteria) this;
        }

        public Criteria andDeoEntrydateEqualTo(Date value) {
            addCriterion("deo_entrydate =", value, "deoEntrydate");
            return (Criteria) this;
        }

        public Criteria andDeoEntrydateNotEqualTo(Date value) {
            addCriterion("deo_entrydate <>", value, "deoEntrydate");
            return (Criteria) this;
        }

        public Criteria andDeoEntrydateGreaterThan(Date value) {
            addCriterion("deo_entrydate >", value, "deoEntrydate");
            return (Criteria) this;
        }

        public Criteria andDeoEntrydateGreaterThanOrEqualTo(Date value) {
            addCriterion("deo_entrydate >=", value, "deoEntrydate");
            return (Criteria) this;
        }

        public Criteria andDeoEntrydateLessThan(Date value) {
            addCriterion("deo_entrydate <", value, "deoEntrydate");
            return (Criteria) this;
        }

        public Criteria andDeoEntrydateLessThanOrEqualTo(Date value) {
            addCriterion("deo_entrydate <=", value, "deoEntrydate");
            return (Criteria) this;
        }

        public Criteria andDeoEntrydateIn(List<Date> values) {
            addCriterion("deo_entrydate in", values, "deoEntrydate");
            return (Criteria) this;
        }

        public Criteria andDeoEntrydateNotIn(List<Date> values) {
            addCriterion("deo_entrydate not in", values, "deoEntrydate");
            return (Criteria) this;
        }

        public Criteria andDeoEntrydateBetween(Date value1, Date value2) {
            addCriterion("deo_entrydate between", value1, value2, "deoEntrydate");
            return (Criteria) this;
        }

        public Criteria andDeoEntrydateNotBetween(Date value1, Date value2) {
            addCriterion("deo_entrydate not between", value1, value2, "deoEntrydate");
            return (Criteria) this;
        }

        public Criteria andDeoEntrystatusIsNull() {
            addCriterion("deo_entrystatus is null");
            return (Criteria) this;
        }

        public Criteria andDeoEntrystatusIsNotNull() {
            addCriterion("deo_entrystatus is not null");
            return (Criteria) this;
        }

        public Criteria andDeoEntrystatusEqualTo(String value) {
            addCriterion("deo_entrystatus =", value, "deoEntrystatus");
            return (Criteria) this;
        }

        public Criteria andDeoEntrystatusNotEqualTo(String value) {
            addCriterion("deo_entrystatus <>", value, "deoEntrystatus");
            return (Criteria) this;
        }

        public Criteria andDeoEntrystatusGreaterThan(String value) {
            addCriterion("deo_entrystatus >", value, "deoEntrystatus");
            return (Criteria) this;
        }

        public Criteria andDeoEntrystatusGreaterThanOrEqualTo(String value) {
            addCriterion("deo_entrystatus >=", value, "deoEntrystatus");
            return (Criteria) this;
        }

        public Criteria andDeoEntrystatusLessThan(String value) {
            addCriterion("deo_entrystatus <", value, "deoEntrystatus");
            return (Criteria) this;
        }

        public Criteria andDeoEntrystatusLessThanOrEqualTo(String value) {
            addCriterion("deo_entrystatus <=", value, "deoEntrystatus");
            return (Criteria) this;
        }

        public Criteria andDeoEntrystatusLike(String value) {
            addCriterion("deo_entrystatus like", value, "deoEntrystatus");
            return (Criteria) this;
        }

        public Criteria andDeoEntrystatusNotLike(String value) {
            addCriterion("deo_entrystatus not like", value, "deoEntrystatus");
            return (Criteria) this;
        }

        public Criteria andDeoEntrystatusIn(List<String> values) {
            addCriterion("deo_entrystatus in", values, "deoEntrystatus");
            return (Criteria) this;
        }

        public Criteria andDeoEntrystatusNotIn(List<String> values) {
            addCriterion("deo_entrystatus not in", values, "deoEntrystatus");
            return (Criteria) this;
        }

        public Criteria andDeoEntrystatusBetween(String value1, String value2) {
            addCriterion("deo_entrystatus between", value1, value2, "deoEntrystatus");
            return (Criteria) this;
        }

        public Criteria andDeoEntrystatusNotBetween(String value1, String value2) {
            addCriterion("deo_entrystatus not between", value1, value2, "deoEntrystatus");
            return (Criteria) this;
        }

        public Criteria andDeoEnuuIsNull() {
            addCriterion("deo_enuu is null");
            return (Criteria) this;
        }

        public Criteria andDeoEnuuIsNotNull() {
            addCriterion("deo_enuu is not null");
            return (Criteria) this;
        }

        public Criteria andDeoEnuuEqualTo(Long value) {
            addCriterion("deo_enuu =", value, "deoEnuu");
            return (Criteria) this;
        }

        public Criteria andDeoEnuuNotEqualTo(Long value) {
            addCriterion("deo_enuu <>", value, "deoEnuu");
            return (Criteria) this;
        }

        public Criteria andDeoEnuuGreaterThan(Long value) {
            addCriterion("deo_enuu >", value, "deoEnuu");
            return (Criteria) this;
        }

        public Criteria andDeoEnuuGreaterThanOrEqualTo(Long value) {
            addCriterion("deo_enuu >=", value, "deoEnuu");
            return (Criteria) this;
        }

        public Criteria andDeoEnuuLessThan(Long value) {
            addCriterion("deo_enuu <", value, "deoEnuu");
            return (Criteria) this;
        }

        public Criteria andDeoEnuuLessThanOrEqualTo(Long value) {
            addCriterion("deo_enuu <=", value, "deoEnuu");
            return (Criteria) this;
        }

        public Criteria andDeoEnuuIn(List<Long> values) {
            addCriterion("deo_enuu in", values, "deoEnuu");
            return (Criteria) this;
        }

        public Criteria andDeoEnuuNotIn(List<Long> values) {
            addCriterion("deo_enuu not in", values, "deoEnuu");
            return (Criteria) this;
        }

        public Criteria andDeoEnuuBetween(Long value1, Long value2) {
            addCriterion("deo_enuu between", value1, value2, "deoEnuu");
            return (Criteria) this;
        }

        public Criteria andDeoEnuuNotBetween(Long value1, Long value2) {
            addCriterion("deo_enuu not between", value1, value2, "deoEnuu");
            return (Criteria) this;
        }

        public Criteria andDeoErpdateIsNull() {
            addCriterion("deo_erpdate is null");
            return (Criteria) this;
        }

        public Criteria andDeoErpdateIsNotNull() {
            addCriterion("deo_erpdate is not null");
            return (Criteria) this;
        }

        public Criteria andDeoErpdateEqualTo(Date value) {
            addCriterion("deo_erpdate =", value, "deoErpdate");
            return (Criteria) this;
        }

        public Criteria andDeoErpdateNotEqualTo(Date value) {
            addCriterion("deo_erpdate <>", value, "deoErpdate");
            return (Criteria) this;
        }

        public Criteria andDeoErpdateGreaterThan(Date value) {
            addCriterion("deo_erpdate >", value, "deoErpdate");
            return (Criteria) this;
        }

        public Criteria andDeoErpdateGreaterThanOrEqualTo(Date value) {
            addCriterion("deo_erpdate >=", value, "deoErpdate");
            return (Criteria) this;
        }

        public Criteria andDeoErpdateLessThan(Date value) {
            addCriterion("deo_erpdate <", value, "deoErpdate");
            return (Criteria) this;
        }

        public Criteria andDeoErpdateLessThanOrEqualTo(Date value) {
            addCriterion("deo_erpdate <=", value, "deoErpdate");
            return (Criteria) this;
        }

        public Criteria andDeoErpdateIn(List<Date> values) {
            addCriterion("deo_erpdate in", values, "deoErpdate");
            return (Criteria) this;
        }

        public Criteria andDeoErpdateNotIn(List<Date> values) {
            addCriterion("deo_erpdate not in", values, "deoErpdate");
            return (Criteria) this;
        }

        public Criteria andDeoErpdateBetween(Date value1, Date value2) {
            addCriterion("deo_erpdate between", value1, value2, "deoErpdate");
            return (Criteria) this;
        }

        public Criteria andDeoErpdateNotBetween(Date value1, Date value2) {
            addCriterion("deo_erpdate not between", value1, value2, "deoErpdate");
            return (Criteria) this;
        }

        public Criteria andDeoErpidIsNull() {
            addCriterion("deo_erpid is null");
            return (Criteria) this;
        }

        public Criteria andDeoErpidIsNotNull() {
            addCriterion("deo_erpid is not null");
            return (Criteria) this;
        }

        public Criteria andDeoErpidEqualTo(Long value) {
            addCriterion("deo_erpid =", value, "deoErpid");
            return (Criteria) this;
        }

        public Criteria andDeoErpidNotEqualTo(Long value) {
            addCriterion("deo_erpid <>", value, "deoErpid");
            return (Criteria) this;
        }

        public Criteria andDeoErpidGreaterThan(Long value) {
            addCriterion("deo_erpid >", value, "deoErpid");
            return (Criteria) this;
        }

        public Criteria andDeoErpidGreaterThanOrEqualTo(Long value) {
            addCriterion("deo_erpid >=", value, "deoErpid");
            return (Criteria) this;
        }

        public Criteria andDeoErpidLessThan(Long value) {
            addCriterion("deo_erpid <", value, "deoErpid");
            return (Criteria) this;
        }

        public Criteria andDeoErpidLessThanOrEqualTo(Long value) {
            addCriterion("deo_erpid <=", value, "deoErpid");
            return (Criteria) this;
        }

        public Criteria andDeoErpidIn(List<Long> values) {
            addCriterion("deo_erpid in", values, "deoErpid");
            return (Criteria) this;
        }

        public Criteria andDeoErpidNotIn(List<Long> values) {
            addCriterion("deo_erpid not in", values, "deoErpid");
            return (Criteria) this;
        }

        public Criteria andDeoErpidBetween(Long value1, Long value2) {
            addCriterion("deo_erpid between", value1, value2, "deoErpid");
            return (Criteria) this;
        }

        public Criteria andDeoErpidNotBetween(Long value1, Long value2) {
            addCriterion("deo_erpid not between", value1, value2, "deoErpid");
            return (Criteria) this;
        }

        public Criteria andDeoGoodspackingIsNull() {
            addCriterion("deo_goodspacking is null");
            return (Criteria) this;
        }

        public Criteria andDeoGoodspackingIsNotNull() {
            addCriterion("deo_goodspacking is not null");
            return (Criteria) this;
        }

        public Criteria andDeoGoodspackingEqualTo(String value) {
            addCriterion("deo_goodspacking =", value, "deoGoodspacking");
            return (Criteria) this;
        }

        public Criteria andDeoGoodspackingNotEqualTo(String value) {
            addCriterion("deo_goodspacking <>", value, "deoGoodspacking");
            return (Criteria) this;
        }

        public Criteria andDeoGoodspackingGreaterThan(String value) {
            addCriterion("deo_goodspacking >", value, "deoGoodspacking");
            return (Criteria) this;
        }

        public Criteria andDeoGoodspackingGreaterThanOrEqualTo(String value) {
            addCriterion("deo_goodspacking >=", value, "deoGoodspacking");
            return (Criteria) this;
        }

        public Criteria andDeoGoodspackingLessThan(String value) {
            addCriterion("deo_goodspacking <", value, "deoGoodspacking");
            return (Criteria) this;
        }

        public Criteria andDeoGoodspackingLessThanOrEqualTo(String value) {
            addCriterion("deo_goodspacking <=", value, "deoGoodspacking");
            return (Criteria) this;
        }

        public Criteria andDeoGoodspackingLike(String value) {
            addCriterion("deo_goodspacking like", value, "deoGoodspacking");
            return (Criteria) this;
        }

        public Criteria andDeoGoodspackingNotLike(String value) {
            addCriterion("deo_goodspacking not like", value, "deoGoodspacking");
            return (Criteria) this;
        }

        public Criteria andDeoGoodspackingIn(List<String> values) {
            addCriterion("deo_goodspacking in", values, "deoGoodspacking");
            return (Criteria) this;
        }

        public Criteria andDeoGoodspackingNotIn(List<String> values) {
            addCriterion("deo_goodspacking not in", values, "deoGoodspacking");
            return (Criteria) this;
        }

        public Criteria andDeoGoodspackingBetween(String value1, String value2) {
            addCriterion("deo_goodspacking between", value1, value2, "deoGoodspacking");
            return (Criteria) this;
        }

        public Criteria andDeoGoodspackingNotBetween(String value1, String value2) {
            addCriterion("deo_goodspacking not between", value1, value2, "deoGoodspacking");
            return (Criteria) this;
        }

        public Criteria andDeoLegalrepresentIsNull() {
            addCriterion("deo_legalrepresent is null");
            return (Criteria) this;
        }

        public Criteria andDeoLegalrepresentIsNotNull() {
            addCriterion("deo_legalrepresent is not null");
            return (Criteria) this;
        }

        public Criteria andDeoLegalrepresentEqualTo(String value) {
            addCriterion("deo_legalrepresent =", value, "deoLegalrepresent");
            return (Criteria) this;
        }

        public Criteria andDeoLegalrepresentNotEqualTo(String value) {
            addCriterion("deo_legalrepresent <>", value, "deoLegalrepresent");
            return (Criteria) this;
        }

        public Criteria andDeoLegalrepresentGreaterThan(String value) {
            addCriterion("deo_legalrepresent >", value, "deoLegalrepresent");
            return (Criteria) this;
        }

        public Criteria andDeoLegalrepresentGreaterThanOrEqualTo(String value) {
            addCriterion("deo_legalrepresent >=", value, "deoLegalrepresent");
            return (Criteria) this;
        }

        public Criteria andDeoLegalrepresentLessThan(String value) {
            addCriterion("deo_legalrepresent <", value, "deoLegalrepresent");
            return (Criteria) this;
        }

        public Criteria andDeoLegalrepresentLessThanOrEqualTo(String value) {
            addCriterion("deo_legalrepresent <=", value, "deoLegalrepresent");
            return (Criteria) this;
        }

        public Criteria andDeoLegalrepresentLike(String value) {
            addCriterion("deo_legalrepresent like", value, "deoLegalrepresent");
            return (Criteria) this;
        }

        public Criteria andDeoLegalrepresentNotLike(String value) {
            addCriterion("deo_legalrepresent not like", value, "deoLegalrepresent");
            return (Criteria) this;
        }

        public Criteria andDeoLegalrepresentIn(List<String> values) {
            addCriterion("deo_legalrepresent in", values, "deoLegalrepresent");
            return (Criteria) this;
        }

        public Criteria andDeoLegalrepresentNotIn(List<String> values) {
            addCriterion("deo_legalrepresent not in", values, "deoLegalrepresent");
            return (Criteria) this;
        }

        public Criteria andDeoLegalrepresentBetween(String value1, String value2) {
            addCriterion("deo_legalrepresent between", value1, value2, "deoLegalrepresent");
            return (Criteria) this;
        }

        public Criteria andDeoLegalrepresentNotBetween(String value1, String value2) {
            addCriterion("deo_legalrepresent not between", value1, value2, "deoLegalrepresent");
            return (Criteria) this;
        }

        public Criteria andDeoMadealcodeIsNull() {
            addCriterion("deo_madealcode is null");
            return (Criteria) this;
        }

        public Criteria andDeoMadealcodeIsNotNull() {
            addCriterion("deo_madealcode is not null");
            return (Criteria) this;
        }

        public Criteria andDeoMadealcodeEqualTo(String value) {
            addCriterion("deo_madealcode =", value, "deoMadealcode");
            return (Criteria) this;
        }

        public Criteria andDeoMadealcodeNotEqualTo(String value) {
            addCriterion("deo_madealcode <>", value, "deoMadealcode");
            return (Criteria) this;
        }

        public Criteria andDeoMadealcodeGreaterThan(String value) {
            addCriterion("deo_madealcode >", value, "deoMadealcode");
            return (Criteria) this;
        }

        public Criteria andDeoMadealcodeGreaterThanOrEqualTo(String value) {
            addCriterion("deo_madealcode >=", value, "deoMadealcode");
            return (Criteria) this;
        }

        public Criteria andDeoMadealcodeLessThan(String value) {
            addCriterion("deo_madealcode <", value, "deoMadealcode");
            return (Criteria) this;
        }

        public Criteria andDeoMadealcodeLessThanOrEqualTo(String value) {
            addCriterion("deo_madealcode <=", value, "deoMadealcode");
            return (Criteria) this;
        }

        public Criteria andDeoMadealcodeLike(String value) {
            addCriterion("deo_madealcode like", value, "deoMadealcode");
            return (Criteria) this;
        }

        public Criteria andDeoMadealcodeNotLike(String value) {
            addCriterion("deo_madealcode not like", value, "deoMadealcode");
            return (Criteria) this;
        }

        public Criteria andDeoMadealcodeIn(List<String> values) {
            addCriterion("deo_madealcode in", values, "deoMadealcode");
            return (Criteria) this;
        }

        public Criteria andDeoMadealcodeNotIn(List<String> values) {
            addCriterion("deo_madealcode not in", values, "deoMadealcode");
            return (Criteria) this;
        }

        public Criteria andDeoMadealcodeBetween(String value1, String value2) {
            addCriterion("deo_madealcode between", value1, value2, "deoMadealcode");
            return (Criteria) this;
        }

        public Criteria andDeoMadealcodeNotBetween(String value1, String value2) {
            addCriterion("deo_madealcode not between", value1, value2, "deoMadealcode");
            return (Criteria) this;
        }

        public Criteria andDeoMadealdateIsNull() {
            addCriterion("deo_madealdate is null");
            return (Criteria) this;
        }

        public Criteria andDeoMadealdateIsNotNull() {
            addCriterion("deo_madealdate is not null");
            return (Criteria) this;
        }

        public Criteria andDeoMadealdateEqualTo(Date value) {
            addCriterion("deo_madealdate =", value, "deoMadealdate");
            return (Criteria) this;
        }

        public Criteria andDeoMadealdateNotEqualTo(Date value) {
            addCriterion("deo_madealdate <>", value, "deoMadealdate");
            return (Criteria) this;
        }

        public Criteria andDeoMadealdateGreaterThan(Date value) {
            addCriterion("deo_madealdate >", value, "deoMadealdate");
            return (Criteria) this;
        }

        public Criteria andDeoMadealdateGreaterThanOrEqualTo(Date value) {
            addCriterion("deo_madealdate >=", value, "deoMadealdate");
            return (Criteria) this;
        }

        public Criteria andDeoMadealdateLessThan(Date value) {
            addCriterion("deo_madealdate <", value, "deoMadealdate");
            return (Criteria) this;
        }

        public Criteria andDeoMadealdateLessThanOrEqualTo(Date value) {
            addCriterion("deo_madealdate <=", value, "deoMadealdate");
            return (Criteria) this;
        }

        public Criteria andDeoMadealdateIn(List<Date> values) {
            addCriterion("deo_madealdate in", values, "deoMadealdate");
            return (Criteria) this;
        }

        public Criteria andDeoMadealdateNotIn(List<Date> values) {
            addCriterion("deo_madealdate not in", values, "deoMadealdate");
            return (Criteria) this;
        }

        public Criteria andDeoMadealdateBetween(Date value1, Date value2) {
            addCriterion("deo_madealdate between", value1, value2, "deoMadealdate");
            return (Criteria) this;
        }

        public Criteria andDeoMadealdateNotBetween(Date value1, Date value2) {
            addCriterion("deo_madealdate not between", value1, value2, "deoMadealdate");
            return (Criteria) this;
        }

        public Criteria andDeoOrderamountIsNull() {
            addCriterion("deo_orderamount is null");
            return (Criteria) this;
        }

        public Criteria andDeoOrderamountIsNotNull() {
            addCriterion("deo_orderamount is not null");
            return (Criteria) this;
        }

        public Criteria andDeoOrderamountEqualTo(Double value) {
            addCriterion("deo_orderamount =", value, "deoOrderamount");
            return (Criteria) this;
        }

        public Criteria andDeoOrderamountNotEqualTo(Double value) {
            addCriterion("deo_orderamount <>", value, "deoOrderamount");
            return (Criteria) this;
        }

        public Criteria andDeoOrderamountGreaterThan(Double value) {
            addCriterion("deo_orderamount >", value, "deoOrderamount");
            return (Criteria) this;
        }

        public Criteria andDeoOrderamountGreaterThanOrEqualTo(Double value) {
            addCriterion("deo_orderamount >=", value, "deoOrderamount");
            return (Criteria) this;
        }

        public Criteria andDeoOrderamountLessThan(Double value) {
            addCriterion("deo_orderamount <", value, "deoOrderamount");
            return (Criteria) this;
        }

        public Criteria andDeoOrderamountLessThanOrEqualTo(Double value) {
            addCriterion("deo_orderamount <=", value, "deoOrderamount");
            return (Criteria) this;
        }

        public Criteria andDeoOrderamountIn(List<Double> values) {
            addCriterion("deo_orderamount in", values, "deoOrderamount");
            return (Criteria) this;
        }

        public Criteria andDeoOrderamountNotIn(List<Double> values) {
            addCriterion("deo_orderamount not in", values, "deoOrderamount");
            return (Criteria) this;
        }

        public Criteria andDeoOrderamountBetween(Double value1, Double value2) {
            addCriterion("deo_orderamount between", value1, value2, "deoOrderamount");
            return (Criteria) this;
        }

        public Criteria andDeoOrderamountNotBetween(Double value1, Double value2) {
            addCriterion("deo_orderamount not between", value1, value2, "deoOrderamount");
            return (Criteria) this;
        }

        public Criteria andDeoOtherdataIsNull() {
            addCriterion("deo_otherdata is null");
            return (Criteria) this;
        }

        public Criteria andDeoOtherdataIsNotNull() {
            addCriterion("deo_otherdata is not null");
            return (Criteria) this;
        }

        public Criteria andDeoOtherdataEqualTo(String value) {
            addCriterion("deo_otherdata =", value, "deoOtherdata");
            return (Criteria) this;
        }

        public Criteria andDeoOtherdataNotEqualTo(String value) {
            addCriterion("deo_otherdata <>", value, "deoOtherdata");
            return (Criteria) this;
        }

        public Criteria andDeoOtherdataGreaterThan(String value) {
            addCriterion("deo_otherdata >", value, "deoOtherdata");
            return (Criteria) this;
        }

        public Criteria andDeoOtherdataGreaterThanOrEqualTo(String value) {
            addCriterion("deo_otherdata >=", value, "deoOtherdata");
            return (Criteria) this;
        }

        public Criteria andDeoOtherdataLessThan(String value) {
            addCriterion("deo_otherdata <", value, "deoOtherdata");
            return (Criteria) this;
        }

        public Criteria andDeoOtherdataLessThanOrEqualTo(String value) {
            addCriterion("deo_otherdata <=", value, "deoOtherdata");
            return (Criteria) this;
        }

        public Criteria andDeoOtherdataLike(String value) {
            addCriterion("deo_otherdata like", value, "deoOtherdata");
            return (Criteria) this;
        }

        public Criteria andDeoOtherdataNotLike(String value) {
            addCriterion("deo_otherdata not like", value, "deoOtherdata");
            return (Criteria) this;
        }

        public Criteria andDeoOtherdataIn(List<String> values) {
            addCriterion("deo_otherdata in", values, "deoOtherdata");
            return (Criteria) this;
        }

        public Criteria andDeoOtherdataNotIn(List<String> values) {
            addCriterion("deo_otherdata not in", values, "deoOtherdata");
            return (Criteria) this;
        }

        public Criteria andDeoOtherdataBetween(String value1, String value2) {
            addCriterion("deo_otherdata between", value1, value2, "deoOtherdata");
            return (Criteria) this;
        }

        public Criteria andDeoOtherdataNotBetween(String value1, String value2) {
            addCriterion("deo_otherdata not between", value1, value2, "deoOtherdata");
            return (Criteria) this;
        }

        public Criteria andDeoPaycomaddressIsNull() {
            addCriterion("deo_paycomaddress is null");
            return (Criteria) this;
        }

        public Criteria andDeoPaycomaddressIsNotNull() {
            addCriterion("deo_paycomaddress is not null");
            return (Criteria) this;
        }

        public Criteria andDeoPaycomaddressEqualTo(String value) {
            addCriterion("deo_paycomaddress =", value, "deoPaycomaddress");
            return (Criteria) this;
        }

        public Criteria andDeoPaycomaddressNotEqualTo(String value) {
            addCriterion("deo_paycomaddress <>", value, "deoPaycomaddress");
            return (Criteria) this;
        }

        public Criteria andDeoPaycomaddressGreaterThan(String value) {
            addCriterion("deo_paycomaddress >", value, "deoPaycomaddress");
            return (Criteria) this;
        }

        public Criteria andDeoPaycomaddressGreaterThanOrEqualTo(String value) {
            addCriterion("deo_paycomaddress >=", value, "deoPaycomaddress");
            return (Criteria) this;
        }

        public Criteria andDeoPaycomaddressLessThan(String value) {
            addCriterion("deo_paycomaddress <", value, "deoPaycomaddress");
            return (Criteria) this;
        }

        public Criteria andDeoPaycomaddressLessThanOrEqualTo(String value) {
            addCriterion("deo_paycomaddress <=", value, "deoPaycomaddress");
            return (Criteria) this;
        }

        public Criteria andDeoPaycomaddressLike(String value) {
            addCriterion("deo_paycomaddress like", value, "deoPaycomaddress");
            return (Criteria) this;
        }

        public Criteria andDeoPaycomaddressNotLike(String value) {
            addCriterion("deo_paycomaddress not like", value, "deoPaycomaddress");
            return (Criteria) this;
        }

        public Criteria andDeoPaycomaddressIn(List<String> values) {
            addCriterion("deo_paycomaddress in", values, "deoPaycomaddress");
            return (Criteria) this;
        }

        public Criteria andDeoPaycomaddressNotIn(List<String> values) {
            addCriterion("deo_paycomaddress not in", values, "deoPaycomaddress");
            return (Criteria) this;
        }

        public Criteria andDeoPaycomaddressBetween(String value1, String value2) {
            addCriterion("deo_paycomaddress between", value1, value2, "deoPaycomaddress");
            return (Criteria) this;
        }

        public Criteria andDeoPaycomaddressNotBetween(String value1, String value2) {
            addCriterion("deo_paycomaddress not between", value1, value2, "deoPaycomaddress");
            return (Criteria) this;
        }

        public Criteria andDeoPaycomnameIsNull() {
            addCriterion("deo_paycomname is null");
            return (Criteria) this;
        }

        public Criteria andDeoPaycomnameIsNotNull() {
            addCriterion("deo_paycomname is not null");
            return (Criteria) this;
        }

        public Criteria andDeoPaycomnameEqualTo(String value) {
            addCriterion("deo_paycomname =", value, "deoPaycomname");
            return (Criteria) this;
        }

        public Criteria andDeoPaycomnameNotEqualTo(String value) {
            addCriterion("deo_paycomname <>", value, "deoPaycomname");
            return (Criteria) this;
        }

        public Criteria andDeoPaycomnameGreaterThan(String value) {
            addCriterion("deo_paycomname >", value, "deoPaycomname");
            return (Criteria) this;
        }

        public Criteria andDeoPaycomnameGreaterThanOrEqualTo(String value) {
            addCriterion("deo_paycomname >=", value, "deoPaycomname");
            return (Criteria) this;
        }

        public Criteria andDeoPaycomnameLessThan(String value) {
            addCriterion("deo_paycomname <", value, "deoPaycomname");
            return (Criteria) this;
        }

        public Criteria andDeoPaycomnameLessThanOrEqualTo(String value) {
            addCriterion("deo_paycomname <=", value, "deoPaycomname");
            return (Criteria) this;
        }

        public Criteria andDeoPaycomnameLike(String value) {
            addCriterion("deo_paycomname like", value, "deoPaycomname");
            return (Criteria) this;
        }

        public Criteria andDeoPaycomnameNotLike(String value) {
            addCriterion("deo_paycomname not like", value, "deoPaycomname");
            return (Criteria) this;
        }

        public Criteria andDeoPaycomnameIn(List<String> values) {
            addCriterion("deo_paycomname in", values, "deoPaycomname");
            return (Criteria) this;
        }

        public Criteria andDeoPaycomnameNotIn(List<String> values) {
            addCriterion("deo_paycomname not in", values, "deoPaycomname");
            return (Criteria) this;
        }

        public Criteria andDeoPaycomnameBetween(String value1, String value2) {
            addCriterion("deo_paycomname between", value1, value2, "deoPaycomname");
            return (Criteria) this;
        }

        public Criteria andDeoPaycomnameNotBetween(String value1, String value2) {
            addCriterion("deo_paycomname not between", value1, value2, "deoPaycomname");
            return (Criteria) this;
        }

        public Criteria andDeoPaydateIsNull() {
            addCriterion("deo_paydate is null");
            return (Criteria) this;
        }

        public Criteria andDeoPaydateIsNotNull() {
            addCriterion("deo_paydate is not null");
            return (Criteria) this;
        }

        public Criteria andDeoPaydateEqualTo(Date value) {
            addCriterion("deo_paydate =", value, "deoPaydate");
            return (Criteria) this;
        }

        public Criteria andDeoPaydateNotEqualTo(Date value) {
            addCriterion("deo_paydate <>", value, "deoPaydate");
            return (Criteria) this;
        }

        public Criteria andDeoPaydateGreaterThan(Date value) {
            addCriterion("deo_paydate >", value, "deoPaydate");
            return (Criteria) this;
        }

        public Criteria andDeoPaydateGreaterThanOrEqualTo(Date value) {
            addCriterion("deo_paydate >=", value, "deoPaydate");
            return (Criteria) this;
        }

        public Criteria andDeoPaydateLessThan(Date value) {
            addCriterion("deo_paydate <", value, "deoPaydate");
            return (Criteria) this;
        }

        public Criteria andDeoPaydateLessThanOrEqualTo(Date value) {
            addCriterion("deo_paydate <=", value, "deoPaydate");
            return (Criteria) this;
        }

        public Criteria andDeoPaydateIn(List<Date> values) {
            addCriterion("deo_paydate in", values, "deoPaydate");
            return (Criteria) this;
        }

        public Criteria andDeoPaydateNotIn(List<Date> values) {
            addCriterion("deo_paydate not in", values, "deoPaydate");
            return (Criteria) this;
        }

        public Criteria andDeoPaydateBetween(Date value1, Date value2) {
            addCriterion("deo_paydate between", value1, value2, "deoPaydate");
            return (Criteria) this;
        }

        public Criteria andDeoPaydateNotBetween(Date value1, Date value2) {
            addCriterion("deo_paydate not between", value1, value2, "deoPaydate");
            return (Criteria) this;
        }

        public Criteria andDeoPaydeldateIsNull() {
            addCriterion("deo_paydeldate is null");
            return (Criteria) this;
        }

        public Criteria andDeoPaydeldateIsNotNull() {
            addCriterion("deo_paydeldate is not null");
            return (Criteria) this;
        }

        public Criteria andDeoPaydeldateEqualTo(Date value) {
            addCriterion("deo_paydeldate =", value, "deoPaydeldate");
            return (Criteria) this;
        }

        public Criteria andDeoPaydeldateNotEqualTo(Date value) {
            addCriterion("deo_paydeldate <>", value, "deoPaydeldate");
            return (Criteria) this;
        }

        public Criteria andDeoPaydeldateGreaterThan(Date value) {
            addCriterion("deo_paydeldate >", value, "deoPaydeldate");
            return (Criteria) this;
        }

        public Criteria andDeoPaydeldateGreaterThanOrEqualTo(Date value) {
            addCriterion("deo_paydeldate >=", value, "deoPaydeldate");
            return (Criteria) this;
        }

        public Criteria andDeoPaydeldateLessThan(Date value) {
            addCriterion("deo_paydeldate <", value, "deoPaydeldate");
            return (Criteria) this;
        }

        public Criteria andDeoPaydeldateLessThanOrEqualTo(Date value) {
            addCriterion("deo_paydeldate <=", value, "deoPaydeldate");
            return (Criteria) this;
        }

        public Criteria andDeoPaydeldateIn(List<Date> values) {
            addCriterion("deo_paydeldate in", values, "deoPaydeldate");
            return (Criteria) this;
        }

        public Criteria andDeoPaydeldateNotIn(List<Date> values) {
            addCriterion("deo_paydeldate not in", values, "deoPaydeldate");
            return (Criteria) this;
        }

        public Criteria andDeoPaydeldateBetween(Date value1, Date value2) {
            addCriterion("deo_paydeldate between", value1, value2, "deoPaydeldate");
            return (Criteria) this;
        }

        public Criteria andDeoPaydeldateNotBetween(Date value1, Date value2) {
            addCriterion("deo_paydeldate not between", value1, value2, "deoPaydeldate");
            return (Criteria) this;
        }

        public Criteria andDeoPaymentcomenuuIsNull() {
            addCriterion("deo_paymentcomenuu is null");
            return (Criteria) this;
        }

        public Criteria andDeoPaymentcomenuuIsNotNull() {
            addCriterion("deo_paymentcomenuu is not null");
            return (Criteria) this;
        }

        public Criteria andDeoPaymentcomenuuEqualTo(Long value) {
            addCriterion("deo_paymentcomenuu =", value, "deoPaymentcomenuu");
            return (Criteria) this;
        }

        public Criteria andDeoPaymentcomenuuNotEqualTo(Long value) {
            addCriterion("deo_paymentcomenuu <>", value, "deoPaymentcomenuu");
            return (Criteria) this;
        }

        public Criteria andDeoPaymentcomenuuGreaterThan(Long value) {
            addCriterion("deo_paymentcomenuu >", value, "deoPaymentcomenuu");
            return (Criteria) this;
        }

        public Criteria andDeoPaymentcomenuuGreaterThanOrEqualTo(Long value) {
            addCriterion("deo_paymentcomenuu >=", value, "deoPaymentcomenuu");
            return (Criteria) this;
        }

        public Criteria andDeoPaymentcomenuuLessThan(Long value) {
            addCriterion("deo_paymentcomenuu <", value, "deoPaymentcomenuu");
            return (Criteria) this;
        }

        public Criteria andDeoPaymentcomenuuLessThanOrEqualTo(Long value) {
            addCriterion("deo_paymentcomenuu <=", value, "deoPaymentcomenuu");
            return (Criteria) this;
        }

        public Criteria andDeoPaymentcomenuuIn(List<Long> values) {
            addCriterion("deo_paymentcomenuu in", values, "deoPaymentcomenuu");
            return (Criteria) this;
        }

        public Criteria andDeoPaymentcomenuuNotIn(List<Long> values) {
            addCriterion("deo_paymentcomenuu not in", values, "deoPaymentcomenuu");
            return (Criteria) this;
        }

        public Criteria andDeoPaymentcomenuuBetween(Long value1, Long value2) {
            addCriterion("deo_paymentcomenuu between", value1, value2, "deoPaymentcomenuu");
            return (Criteria) this;
        }

        public Criteria andDeoPaymentcomenuuNotBetween(Long value1, Long value2) {
            addCriterion("deo_paymentcomenuu not between", value1, value2, "deoPaymentcomenuu");
            return (Criteria) this;
        }

        public Criteria andDeoPaymentdateIsNull() {
            addCriterion("deo_paymentdate is null");
            return (Criteria) this;
        }

        public Criteria andDeoPaymentdateIsNotNull() {
            addCriterion("deo_paymentdate is not null");
            return (Criteria) this;
        }

        public Criteria andDeoPaymentdateEqualTo(Date value) {
            addCriterion("deo_paymentdate =", value, "deoPaymentdate");
            return (Criteria) this;
        }

        public Criteria andDeoPaymentdateNotEqualTo(Date value) {
            addCriterion("deo_paymentdate <>", value, "deoPaymentdate");
            return (Criteria) this;
        }

        public Criteria andDeoPaymentdateGreaterThan(Date value) {
            addCriterion("deo_paymentdate >", value, "deoPaymentdate");
            return (Criteria) this;
        }

        public Criteria andDeoPaymentdateGreaterThanOrEqualTo(Date value) {
            addCriterion("deo_paymentdate >=", value, "deoPaymentdate");
            return (Criteria) this;
        }

        public Criteria andDeoPaymentdateLessThan(Date value) {
            addCriterion("deo_paymentdate <", value, "deoPaymentdate");
            return (Criteria) this;
        }

        public Criteria andDeoPaymentdateLessThanOrEqualTo(Date value) {
            addCriterion("deo_paymentdate <=", value, "deoPaymentdate");
            return (Criteria) this;
        }

        public Criteria andDeoPaymentdateIn(List<Date> values) {
            addCriterion("deo_paymentdate in", values, "deoPaymentdate");
            return (Criteria) this;
        }

        public Criteria andDeoPaymentdateNotIn(List<Date> values) {
            addCriterion("deo_paymentdate not in", values, "deoPaymentdate");
            return (Criteria) this;
        }

        public Criteria andDeoPaymentdateBetween(Date value1, Date value2) {
            addCriterion("deo_paymentdate between", value1, value2, "deoPaymentdate");
            return (Criteria) this;
        }

        public Criteria andDeoPaymentdateNotBetween(Date value1, Date value2) {
            addCriterion("deo_paymentdate not between", value1, value2, "deoPaymentdate");
            return (Criteria) this;
        }

        public Criteria andDeoPaymentmethodIsNull() {
            addCriterion("deo_paymentmethod is null");
            return (Criteria) this;
        }

        public Criteria andDeoPaymentmethodIsNotNull() {
            addCriterion("deo_paymentmethod is not null");
            return (Criteria) this;
        }

        public Criteria andDeoPaymentmethodEqualTo(String value) {
            addCriterion("deo_paymentmethod =", value, "deoPaymentmethod");
            return (Criteria) this;
        }

        public Criteria andDeoPaymentmethodNotEqualTo(String value) {
            addCriterion("deo_paymentmethod <>", value, "deoPaymentmethod");
            return (Criteria) this;
        }

        public Criteria andDeoPaymentmethodGreaterThan(String value) {
            addCriterion("deo_paymentmethod >", value, "deoPaymentmethod");
            return (Criteria) this;
        }

        public Criteria andDeoPaymentmethodGreaterThanOrEqualTo(String value) {
            addCriterion("deo_paymentmethod >=", value, "deoPaymentmethod");
            return (Criteria) this;
        }

        public Criteria andDeoPaymentmethodLessThan(String value) {
            addCriterion("deo_paymentmethod <", value, "deoPaymentmethod");
            return (Criteria) this;
        }

        public Criteria andDeoPaymentmethodLessThanOrEqualTo(String value) {
            addCriterion("deo_paymentmethod <=", value, "deoPaymentmethod");
            return (Criteria) this;
        }

        public Criteria andDeoPaymentmethodLike(String value) {
            addCriterion("deo_paymentmethod like", value, "deoPaymentmethod");
            return (Criteria) this;
        }

        public Criteria andDeoPaymentmethodNotLike(String value) {
            addCriterion("deo_paymentmethod not like", value, "deoPaymentmethod");
            return (Criteria) this;
        }

        public Criteria andDeoPaymentmethodIn(List<String> values) {
            addCriterion("deo_paymentmethod in", values, "deoPaymentmethod");
            return (Criteria) this;
        }

        public Criteria andDeoPaymentmethodNotIn(List<String> values) {
            addCriterion("deo_paymentmethod not in", values, "deoPaymentmethod");
            return (Criteria) this;
        }

        public Criteria andDeoPaymentmethodBetween(String value1, String value2) {
            addCriterion("deo_paymentmethod between", value1, value2, "deoPaymentmethod");
            return (Criteria) this;
        }

        public Criteria andDeoPaymentmethodNotBetween(String value1, String value2) {
            addCriterion("deo_paymentmethod not between", value1, value2, "deoPaymentmethod");
            return (Criteria) this;
        }

        public Criteria andDeoPaymethodIsNull() {
            addCriterion("deo_paymethod is null");
            return (Criteria) this;
        }

        public Criteria andDeoPaymethodIsNotNull() {
            addCriterion("deo_paymethod is not null");
            return (Criteria) this;
        }

        public Criteria andDeoPaymethodEqualTo(String value) {
            addCriterion("deo_paymethod =", value, "deoPaymethod");
            return (Criteria) this;
        }

        public Criteria andDeoPaymethodNotEqualTo(String value) {
            addCriterion("deo_paymethod <>", value, "deoPaymethod");
            return (Criteria) this;
        }

        public Criteria andDeoPaymethodGreaterThan(String value) {
            addCriterion("deo_paymethod >", value, "deoPaymethod");
            return (Criteria) this;
        }

        public Criteria andDeoPaymethodGreaterThanOrEqualTo(String value) {
            addCriterion("deo_paymethod >=", value, "deoPaymethod");
            return (Criteria) this;
        }

        public Criteria andDeoPaymethodLessThan(String value) {
            addCriterion("deo_paymethod <", value, "deoPaymethod");
            return (Criteria) this;
        }

        public Criteria andDeoPaymethodLessThanOrEqualTo(String value) {
            addCriterion("deo_paymethod <=", value, "deoPaymethod");
            return (Criteria) this;
        }

        public Criteria andDeoPaymethodLike(String value) {
            addCriterion("deo_paymethod like", value, "deoPaymethod");
            return (Criteria) this;
        }

        public Criteria andDeoPaymethodNotLike(String value) {
            addCriterion("deo_paymethod not like", value, "deoPaymethod");
            return (Criteria) this;
        }

        public Criteria andDeoPaymethodIn(List<String> values) {
            addCriterion("deo_paymethod in", values, "deoPaymethod");
            return (Criteria) this;
        }

        public Criteria andDeoPaymethodNotIn(List<String> values) {
            addCriterion("deo_paymethod not in", values, "deoPaymethod");
            return (Criteria) this;
        }

        public Criteria andDeoPaymethodBetween(String value1, String value2) {
            addCriterion("deo_paymethod between", value1, value2, "deoPaymethod");
            return (Criteria) this;
        }

        public Criteria andDeoPaymethodNotBetween(String value1, String value2) {
            addCriterion("deo_paymethod not between", value1, value2, "deoPaymethod");
            return (Criteria) this;
        }

        public Criteria andDeoPickupdateIsNull() {
            addCriterion("deo_pickupdate is null");
            return (Criteria) this;
        }

        public Criteria andDeoPickupdateIsNotNull() {
            addCriterion("deo_pickupdate is not null");
            return (Criteria) this;
        }

        public Criteria andDeoPickupdateEqualTo(String value) {
            addCriterion("deo_pickupdate =", value, "deoPickupdate");
            return (Criteria) this;
        }

        public Criteria andDeoPickupdateNotEqualTo(String value) {
            addCriterion("deo_pickupdate <>", value, "deoPickupdate");
            return (Criteria) this;
        }

        public Criteria andDeoPickupdateGreaterThan(String value) {
            addCriterion("deo_pickupdate >", value, "deoPickupdate");
            return (Criteria) this;
        }

        public Criteria andDeoPickupdateGreaterThanOrEqualTo(String value) {
            addCriterion("deo_pickupdate >=", value, "deoPickupdate");
            return (Criteria) this;
        }

        public Criteria andDeoPickupdateLessThan(String value) {
            addCriterion("deo_pickupdate <", value, "deoPickupdate");
            return (Criteria) this;
        }

        public Criteria andDeoPickupdateLessThanOrEqualTo(String value) {
            addCriterion("deo_pickupdate <=", value, "deoPickupdate");
            return (Criteria) this;
        }

        public Criteria andDeoPickupdateLike(String value) {
            addCriterion("deo_pickupdate like", value, "deoPickupdate");
            return (Criteria) this;
        }

        public Criteria andDeoPickupdateNotLike(String value) {
            addCriterion("deo_pickupdate not like", value, "deoPickupdate");
            return (Criteria) this;
        }

        public Criteria andDeoPickupdateIn(List<String> values) {
            addCriterion("deo_pickupdate in", values, "deoPickupdate");
            return (Criteria) this;
        }

        public Criteria andDeoPickupdateNotIn(List<String> values) {
            addCriterion("deo_pickupdate not in", values, "deoPickupdate");
            return (Criteria) this;
        }

        public Criteria andDeoPickupdateBetween(String value1, String value2) {
            addCriterion("deo_pickupdate between", value1, value2, "deoPickupdate");
            return (Criteria) this;
        }

        public Criteria andDeoPickupdateNotBetween(String value1, String value2) {
            addCriterion("deo_pickupdate not between", value1, value2, "deoPickupdate");
            return (Criteria) this;
        }

        public Criteria andDeoPickupmethodIsNull() {
            addCriterion("deo_pickupmethod is null");
            return (Criteria) this;
        }

        public Criteria andDeoPickupmethodIsNotNull() {
            addCriterion("deo_pickupmethod is not null");
            return (Criteria) this;
        }

        public Criteria andDeoPickupmethodEqualTo(String value) {
            addCriterion("deo_pickupmethod =", value, "deoPickupmethod");
            return (Criteria) this;
        }

        public Criteria andDeoPickupmethodNotEqualTo(String value) {
            addCriterion("deo_pickupmethod <>", value, "deoPickupmethod");
            return (Criteria) this;
        }

        public Criteria andDeoPickupmethodGreaterThan(String value) {
            addCriterion("deo_pickupmethod >", value, "deoPickupmethod");
            return (Criteria) this;
        }

        public Criteria andDeoPickupmethodGreaterThanOrEqualTo(String value) {
            addCriterion("deo_pickupmethod >=", value, "deoPickupmethod");
            return (Criteria) this;
        }

        public Criteria andDeoPickupmethodLessThan(String value) {
            addCriterion("deo_pickupmethod <", value, "deoPickupmethod");
            return (Criteria) this;
        }

        public Criteria andDeoPickupmethodLessThanOrEqualTo(String value) {
            addCriterion("deo_pickupmethod <=", value, "deoPickupmethod");
            return (Criteria) this;
        }

        public Criteria andDeoPickupmethodLike(String value) {
            addCriterion("deo_pickupmethod like", value, "deoPickupmethod");
            return (Criteria) this;
        }

        public Criteria andDeoPickupmethodNotLike(String value) {
            addCriterion("deo_pickupmethod not like", value, "deoPickupmethod");
            return (Criteria) this;
        }

        public Criteria andDeoPickupmethodIn(List<String> values) {
            addCriterion("deo_pickupmethod in", values, "deoPickupmethod");
            return (Criteria) this;
        }

        public Criteria andDeoPickupmethodNotIn(List<String> values) {
            addCriterion("deo_pickupmethod not in", values, "deoPickupmethod");
            return (Criteria) this;
        }

        public Criteria andDeoPickupmethodBetween(String value1, String value2) {
            addCriterion("deo_pickupmethod between", value1, value2, "deoPickupmethod");
            return (Criteria) this;
        }

        public Criteria andDeoPickupmethodNotBetween(String value1, String value2) {
            addCriterion("deo_pickupmethod not between", value1, value2, "deoPickupmethod");
            return (Criteria) this;
        }

        public Criteria andDeoPrintIsNull() {
            addCriterion("deo_print is null");
            return (Criteria) this;
        }

        public Criteria andDeoPrintIsNotNull() {
            addCriterion("deo_print is not null");
            return (Criteria) this;
        }

        public Criteria andDeoPrintEqualTo(Short value) {
            addCriterion("deo_print =", value, "deoPrint");
            return (Criteria) this;
        }

        public Criteria andDeoPrintNotEqualTo(Short value) {
            addCriterion("deo_print <>", value, "deoPrint");
            return (Criteria) this;
        }

        public Criteria andDeoPrintGreaterThan(Short value) {
            addCriterion("deo_print >", value, "deoPrint");
            return (Criteria) this;
        }

        public Criteria andDeoPrintGreaterThanOrEqualTo(Short value) {
            addCriterion("deo_print >=", value, "deoPrint");
            return (Criteria) this;
        }

        public Criteria andDeoPrintLessThan(Short value) {
            addCriterion("deo_print <", value, "deoPrint");
            return (Criteria) this;
        }

        public Criteria andDeoPrintLessThanOrEqualTo(Short value) {
            addCriterion("deo_print <=", value, "deoPrint");
            return (Criteria) this;
        }

        public Criteria andDeoPrintIn(List<Short> values) {
            addCriterion("deo_print in", values, "deoPrint");
            return (Criteria) this;
        }

        public Criteria andDeoPrintNotIn(List<Short> values) {
            addCriterion("deo_print not in", values, "deoPrint");
            return (Criteria) this;
        }

        public Criteria andDeoPrintBetween(Short value1, Short value2) {
            addCriterion("deo_print between", value1, value2, "deoPrint");
            return (Criteria) this;
        }

        public Criteria andDeoPrintNotBetween(Short value1, Short value2) {
            addCriterion("deo_print not between", value1, value2, "deoPrint");
            return (Criteria) this;
        }

        public Criteria andDeoProstatsusIsNull() {
            addCriterion("deo_prostatsus is null");
            return (Criteria) this;
        }

        public Criteria andDeoProstatsusIsNotNull() {
            addCriterion("deo_prostatsus is not null");
            return (Criteria) this;
        }

        public Criteria andDeoProstatsusEqualTo(String value) {
            addCriterion("deo_prostatsus =", value, "deoProstatsus");
            return (Criteria) this;
        }

        public Criteria andDeoProstatsusNotEqualTo(String value) {
            addCriterion("deo_prostatsus <>", value, "deoProstatsus");
            return (Criteria) this;
        }

        public Criteria andDeoProstatsusGreaterThan(String value) {
            addCriterion("deo_prostatsus >", value, "deoProstatsus");
            return (Criteria) this;
        }

        public Criteria andDeoProstatsusGreaterThanOrEqualTo(String value) {
            addCriterion("deo_prostatsus >=", value, "deoProstatsus");
            return (Criteria) this;
        }

        public Criteria andDeoProstatsusLessThan(String value) {
            addCriterion("deo_prostatsus <", value, "deoProstatsus");
            return (Criteria) this;
        }

        public Criteria andDeoProstatsusLessThanOrEqualTo(String value) {
            addCriterion("deo_prostatsus <=", value, "deoProstatsus");
            return (Criteria) this;
        }

        public Criteria andDeoProstatsusLike(String value) {
            addCriterion("deo_prostatsus like", value, "deoProstatsus");
            return (Criteria) this;
        }

        public Criteria andDeoProstatsusNotLike(String value) {
            addCriterion("deo_prostatsus not like", value, "deoProstatsus");
            return (Criteria) this;
        }

        public Criteria andDeoProstatsusIn(List<String> values) {
            addCriterion("deo_prostatsus in", values, "deoProstatsus");
            return (Criteria) this;
        }

        public Criteria andDeoProstatsusNotIn(List<String> values) {
            addCriterion("deo_prostatsus not in", values, "deoProstatsus");
            return (Criteria) this;
        }

        public Criteria andDeoProstatsusBetween(String value1, String value2) {
            addCriterion("deo_prostatsus between", value1, value2, "deoProstatsus");
            return (Criteria) this;
        }

        public Criteria andDeoProstatsusNotBetween(String value1, String value2) {
            addCriterion("deo_prostatsus not between", value1, value2, "deoProstatsus");
            return (Criteria) this;
        }

        public Criteria andDeoProstatuscodeIsNull() {
            addCriterion("deo_prostatuscode is null");
            return (Criteria) this;
        }

        public Criteria andDeoProstatuscodeIsNotNull() {
            addCriterion("deo_prostatuscode is not null");
            return (Criteria) this;
        }

        public Criteria andDeoProstatuscodeEqualTo(Integer value) {
            addCriterion("deo_prostatuscode =", value, "deoProstatuscode");
            return (Criteria) this;
        }

        public Criteria andDeoProstatuscodeNotEqualTo(Integer value) {
            addCriterion("deo_prostatuscode <>", value, "deoProstatuscode");
            return (Criteria) this;
        }

        public Criteria andDeoProstatuscodeGreaterThan(Integer value) {
            addCriterion("deo_prostatuscode >", value, "deoProstatuscode");
            return (Criteria) this;
        }

        public Criteria andDeoProstatuscodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("deo_prostatuscode >=", value, "deoProstatuscode");
            return (Criteria) this;
        }

        public Criteria andDeoProstatuscodeLessThan(Integer value) {
            addCriterion("deo_prostatuscode <", value, "deoProstatuscode");
            return (Criteria) this;
        }

        public Criteria andDeoProstatuscodeLessThanOrEqualTo(Integer value) {
            addCriterion("deo_prostatuscode <=", value, "deoProstatuscode");
            return (Criteria) this;
        }

        public Criteria andDeoProstatuscodeIn(List<Integer> values) {
            addCriterion("deo_prostatuscode in", values, "deoProstatuscode");
            return (Criteria) this;
        }

        public Criteria andDeoProstatuscodeNotIn(List<Integer> values) {
            addCriterion("deo_prostatuscode not in", values, "deoProstatuscode");
            return (Criteria) this;
        }

        public Criteria andDeoProstatuscodeBetween(Integer value1, Integer value2) {
            addCriterion("deo_prostatuscode between", value1, value2, "deoProstatuscode");
            return (Criteria) this;
        }

        public Criteria andDeoProstatuscodeNotBetween(Integer value1, Integer value2) {
            addCriterion("deo_prostatuscode not between", value1, value2, "deoProstatuscode");
            return (Criteria) this;
        }

        public Criteria andDeoRateIsNull() {
            addCriterion("deo_rate is null");
            return (Criteria) this;
        }

        public Criteria andDeoRateIsNotNull() {
            addCriterion("deo_rate is not null");
            return (Criteria) this;
        }

        public Criteria andDeoRateEqualTo(Double value) {
            addCriterion("deo_rate =", value, "deoRate");
            return (Criteria) this;
        }

        public Criteria andDeoRateNotEqualTo(Double value) {
            addCriterion("deo_rate <>", value, "deoRate");
            return (Criteria) this;
        }

        public Criteria andDeoRateGreaterThan(Double value) {
            addCriterion("deo_rate >", value, "deoRate");
            return (Criteria) this;
        }

        public Criteria andDeoRateGreaterThanOrEqualTo(Double value) {
            addCriterion("deo_rate >=", value, "deoRate");
            return (Criteria) this;
        }

        public Criteria andDeoRateLessThan(Double value) {
            addCriterion("deo_rate <", value, "deoRate");
            return (Criteria) this;
        }

        public Criteria andDeoRateLessThanOrEqualTo(Double value) {
            addCriterion("deo_rate <=", value, "deoRate");
            return (Criteria) this;
        }

        public Criteria andDeoRateIn(List<Double> values) {
            addCriterion("deo_rate in", values, "deoRate");
            return (Criteria) this;
        }

        public Criteria andDeoRateNotIn(List<Double> values) {
            addCriterion("deo_rate not in", values, "deoRate");
            return (Criteria) this;
        }

        public Criteria andDeoRateBetween(Double value1, Double value2) {
            addCriterion("deo_rate between", value1, value2, "deoRate");
            return (Criteria) this;
        }

        public Criteria andDeoRateNotBetween(Double value1, Double value2) {
            addCriterion("deo_rate not between", value1, value2, "deoRate");
            return (Criteria) this;
        }

        public Criteria andDeoRemarkIsNull() {
            addCriterion("deo_remark is null");
            return (Criteria) this;
        }

        public Criteria andDeoRemarkIsNotNull() {
            addCriterion("deo_remark is not null");
            return (Criteria) this;
        }

        public Criteria andDeoRemarkEqualTo(String value) {
            addCriterion("deo_remark =", value, "deoRemark");
            return (Criteria) this;
        }

        public Criteria andDeoRemarkNotEqualTo(String value) {
            addCriterion("deo_remark <>", value, "deoRemark");
            return (Criteria) this;
        }

        public Criteria andDeoRemarkGreaterThan(String value) {
            addCriterion("deo_remark >", value, "deoRemark");
            return (Criteria) this;
        }

        public Criteria andDeoRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("deo_remark >=", value, "deoRemark");
            return (Criteria) this;
        }

        public Criteria andDeoRemarkLessThan(String value) {
            addCriterion("deo_remark <", value, "deoRemark");
            return (Criteria) this;
        }

        public Criteria andDeoRemarkLessThanOrEqualTo(String value) {
            addCriterion("deo_remark <=", value, "deoRemark");
            return (Criteria) this;
        }

        public Criteria andDeoRemarkLike(String value) {
            addCriterion("deo_remark like", value, "deoRemark");
            return (Criteria) this;
        }

        public Criteria andDeoRemarkNotLike(String value) {
            addCriterion("deo_remark not like", value, "deoRemark");
            return (Criteria) this;
        }

        public Criteria andDeoRemarkIn(List<String> values) {
            addCriterion("deo_remark in", values, "deoRemark");
            return (Criteria) this;
        }

        public Criteria andDeoRemarkNotIn(List<String> values) {
            addCriterion("deo_remark not in", values, "deoRemark");
            return (Criteria) this;
        }

        public Criteria andDeoRemarkBetween(String value1, String value2) {
            addCriterion("deo_remark between", value1, value2, "deoRemark");
            return (Criteria) this;
        }

        public Criteria andDeoRemarkNotBetween(String value1, String value2) {
            addCriterion("deo_remark not between", value1, value2, "deoRemark");
            return (Criteria) this;
        }

        public Criteria andDeoRequirepaydateIsNull() {
            addCriterion("deo_requirepaydate is null");
            return (Criteria) this;
        }

        public Criteria andDeoRequirepaydateIsNotNull() {
            addCriterion("deo_requirepaydate is not null");
            return (Criteria) this;
        }

        public Criteria andDeoRequirepaydateEqualTo(Date value) {
            addCriterion("deo_requirepaydate =", value, "deoRequirepaydate");
            return (Criteria) this;
        }

        public Criteria andDeoRequirepaydateNotEqualTo(Date value) {
            addCriterion("deo_requirepaydate <>", value, "deoRequirepaydate");
            return (Criteria) this;
        }

        public Criteria andDeoRequirepaydateGreaterThan(Date value) {
            addCriterion("deo_requirepaydate >", value, "deoRequirepaydate");
            return (Criteria) this;
        }

        public Criteria andDeoRequirepaydateGreaterThanOrEqualTo(Date value) {
            addCriterion("deo_requirepaydate >=", value, "deoRequirepaydate");
            return (Criteria) this;
        }

        public Criteria andDeoRequirepaydateLessThan(Date value) {
            addCriterion("deo_requirepaydate <", value, "deoRequirepaydate");
            return (Criteria) this;
        }

        public Criteria andDeoRequirepaydateLessThanOrEqualTo(Date value) {
            addCriterion("deo_requirepaydate <=", value, "deoRequirepaydate");
            return (Criteria) this;
        }

        public Criteria andDeoRequirepaydateIn(List<Date> values) {
            addCriterion("deo_requirepaydate in", values, "deoRequirepaydate");
            return (Criteria) this;
        }

        public Criteria andDeoRequirepaydateNotIn(List<Date> values) {
            addCriterion("deo_requirepaydate not in", values, "deoRequirepaydate");
            return (Criteria) this;
        }

        public Criteria andDeoRequirepaydateBetween(Date value1, Date value2) {
            addCriterion("deo_requirepaydate between", value1, value2, "deoRequirepaydate");
            return (Criteria) this;
        }

        public Criteria andDeoRequirepaydateNotBetween(Date value1, Date value2) {
            addCriterion("deo_requirepaydate not between", value1, value2, "deoRequirepaydate");
            return (Criteria) this;
        }

        public Criteria andDeoRiskmethodIsNull() {
            addCriterion("deo_riskmethod is null");
            return (Criteria) this;
        }

        public Criteria andDeoRiskmethodIsNotNull() {
            addCriterion("deo_riskmethod is not null");
            return (Criteria) this;
        }

        public Criteria andDeoRiskmethodEqualTo(String value) {
            addCriterion("deo_riskmethod =", value, "deoRiskmethod");
            return (Criteria) this;
        }

        public Criteria andDeoRiskmethodNotEqualTo(String value) {
            addCriterion("deo_riskmethod <>", value, "deoRiskmethod");
            return (Criteria) this;
        }

        public Criteria andDeoRiskmethodGreaterThan(String value) {
            addCriterion("deo_riskmethod >", value, "deoRiskmethod");
            return (Criteria) this;
        }

        public Criteria andDeoRiskmethodGreaterThanOrEqualTo(String value) {
            addCriterion("deo_riskmethod >=", value, "deoRiskmethod");
            return (Criteria) this;
        }

        public Criteria andDeoRiskmethodLessThan(String value) {
            addCriterion("deo_riskmethod <", value, "deoRiskmethod");
            return (Criteria) this;
        }

        public Criteria andDeoRiskmethodLessThanOrEqualTo(String value) {
            addCriterion("deo_riskmethod <=", value, "deoRiskmethod");
            return (Criteria) this;
        }

        public Criteria andDeoRiskmethodLike(String value) {
            addCriterion("deo_riskmethod like", value, "deoRiskmethod");
            return (Criteria) this;
        }

        public Criteria andDeoRiskmethodNotLike(String value) {
            addCriterion("deo_riskmethod not like", value, "deoRiskmethod");
            return (Criteria) this;
        }

        public Criteria andDeoRiskmethodIn(List<String> values) {
            addCriterion("deo_riskmethod in", values, "deoRiskmethod");
            return (Criteria) this;
        }

        public Criteria andDeoRiskmethodNotIn(List<String> values) {
            addCriterion("deo_riskmethod not in", values, "deoRiskmethod");
            return (Criteria) this;
        }

        public Criteria andDeoRiskmethodBetween(String value1, String value2) {
            addCriterion("deo_riskmethod between", value1, value2, "deoRiskmethod");
            return (Criteria) this;
        }

        public Criteria andDeoRiskmethodNotBetween(String value1, String value2) {
            addCriterion("deo_riskmethod not between", value1, value2, "deoRiskmethod");
            return (Criteria) this;
        }

        public Criteria andDeoSalecodeIsNull() {
            addCriterion("deo_salecode is null");
            return (Criteria) this;
        }

        public Criteria andDeoSalecodeIsNotNull() {
            addCriterion("deo_salecode is not null");
            return (Criteria) this;
        }

        public Criteria andDeoSalecodeEqualTo(String value) {
            addCriterion("deo_salecode =", value, "deoSalecode");
            return (Criteria) this;
        }

        public Criteria andDeoSalecodeNotEqualTo(String value) {
            addCriterion("deo_salecode <>", value, "deoSalecode");
            return (Criteria) this;
        }

        public Criteria andDeoSalecodeGreaterThan(String value) {
            addCriterion("deo_salecode >", value, "deoSalecode");
            return (Criteria) this;
        }

        public Criteria andDeoSalecodeGreaterThanOrEqualTo(String value) {
            addCriterion("deo_salecode >=", value, "deoSalecode");
            return (Criteria) this;
        }

        public Criteria andDeoSalecodeLessThan(String value) {
            addCriterion("deo_salecode <", value, "deoSalecode");
            return (Criteria) this;
        }

        public Criteria andDeoSalecodeLessThanOrEqualTo(String value) {
            addCriterion("deo_salecode <=", value, "deoSalecode");
            return (Criteria) this;
        }

        public Criteria andDeoSalecodeLike(String value) {
            addCriterion("deo_salecode like", value, "deoSalecode");
            return (Criteria) this;
        }

        public Criteria andDeoSalecodeNotLike(String value) {
            addCriterion("deo_salecode not like", value, "deoSalecode");
            return (Criteria) this;
        }

        public Criteria andDeoSalecodeIn(List<String> values) {
            addCriterion("deo_salecode in", values, "deoSalecode");
            return (Criteria) this;
        }

        public Criteria andDeoSalecodeNotIn(List<String> values) {
            addCriterion("deo_salecode not in", values, "deoSalecode");
            return (Criteria) this;
        }

        public Criteria andDeoSalecodeBetween(String value1, String value2) {
            addCriterion("deo_salecode between", value1, value2, "deoSalecode");
            return (Criteria) this;
        }

        public Criteria andDeoSalecodeNotBetween(String value1, String value2) {
            addCriterion("deo_salecode not between", value1, value2, "deoSalecode");
            return (Criteria) this;
        }

        public Criteria andDeoSalepocodeIsNull() {
            addCriterion("deo_salepocode is null");
            return (Criteria) this;
        }

        public Criteria andDeoSalepocodeIsNotNull() {
            addCriterion("deo_salepocode is not null");
            return (Criteria) this;
        }

        public Criteria andDeoSalepocodeEqualTo(String value) {
            addCriterion("deo_salepocode =", value, "deoSalepocode");
            return (Criteria) this;
        }

        public Criteria andDeoSalepocodeNotEqualTo(String value) {
            addCriterion("deo_salepocode <>", value, "deoSalepocode");
            return (Criteria) this;
        }

        public Criteria andDeoSalepocodeGreaterThan(String value) {
            addCriterion("deo_salepocode >", value, "deoSalepocode");
            return (Criteria) this;
        }

        public Criteria andDeoSalepocodeGreaterThanOrEqualTo(String value) {
            addCriterion("deo_salepocode >=", value, "deoSalepocode");
            return (Criteria) this;
        }

        public Criteria andDeoSalepocodeLessThan(String value) {
            addCriterion("deo_salepocode <", value, "deoSalepocode");
            return (Criteria) this;
        }

        public Criteria andDeoSalepocodeLessThanOrEqualTo(String value) {
            addCriterion("deo_salepocode <=", value, "deoSalepocode");
            return (Criteria) this;
        }

        public Criteria andDeoSalepocodeLike(String value) {
            addCriterion("deo_salepocode like", value, "deoSalepocode");
            return (Criteria) this;
        }

        public Criteria andDeoSalepocodeNotLike(String value) {
            addCriterion("deo_salepocode not like", value, "deoSalepocode");
            return (Criteria) this;
        }

        public Criteria andDeoSalepocodeIn(List<String> values) {
            addCriterion("deo_salepocode in", values, "deoSalepocode");
            return (Criteria) this;
        }

        public Criteria andDeoSalepocodeNotIn(List<String> values) {
            addCriterion("deo_salepocode not in", values, "deoSalepocode");
            return (Criteria) this;
        }

        public Criteria andDeoSalepocodeBetween(String value1, String value2) {
            addCriterion("deo_salepocode between", value1, value2, "deoSalepocode");
            return (Criteria) this;
        }

        public Criteria andDeoSalepocodeNotBetween(String value1, String value2) {
            addCriterion("deo_salepocode not between", value1, value2, "deoSalepocode");
            return (Criteria) this;
        }

        public Criteria andDeoShipdateIsNull() {
            addCriterion("deo_shipdate is null");
            return (Criteria) this;
        }

        public Criteria andDeoShipdateIsNotNull() {
            addCriterion("deo_shipdate is not null");
            return (Criteria) this;
        }

        public Criteria andDeoShipdateEqualTo(Date value) {
            addCriterion("deo_shipdate =", value, "deoShipdate");
            return (Criteria) this;
        }

        public Criteria andDeoShipdateNotEqualTo(Date value) {
            addCriterion("deo_shipdate <>", value, "deoShipdate");
            return (Criteria) this;
        }

        public Criteria andDeoShipdateGreaterThan(Date value) {
            addCriterion("deo_shipdate >", value, "deoShipdate");
            return (Criteria) this;
        }

        public Criteria andDeoShipdateGreaterThanOrEqualTo(Date value) {
            addCriterion("deo_shipdate >=", value, "deoShipdate");
            return (Criteria) this;
        }

        public Criteria andDeoShipdateLessThan(Date value) {
            addCriterion("deo_shipdate <", value, "deoShipdate");
            return (Criteria) this;
        }

        public Criteria andDeoShipdateLessThanOrEqualTo(Date value) {
            addCriterion("deo_shipdate <=", value, "deoShipdate");
            return (Criteria) this;
        }

        public Criteria andDeoShipdateIn(List<Date> values) {
            addCriterion("deo_shipdate in", values, "deoShipdate");
            return (Criteria) this;
        }

        public Criteria andDeoShipdateNotIn(List<Date> values) {
            addCriterion("deo_shipdate not in", values, "deoShipdate");
            return (Criteria) this;
        }

        public Criteria andDeoShipdateBetween(Date value1, Date value2) {
            addCriterion("deo_shipdate between", value1, value2, "deoShipdate");
            return (Criteria) this;
        }

        public Criteria andDeoShipdateNotBetween(Date value1, Date value2) {
            addCriterion("deo_shipdate not between", value1, value2, "deoShipdate");
            return (Criteria) this;
        }

        public Criteria andDeoStatusIsNull() {
            addCriterion("deo_status is null");
            return (Criteria) this;
        }

        public Criteria andDeoStatusIsNotNull() {
            addCriterion("deo_status is not null");
            return (Criteria) this;
        }

        public Criteria andDeoStatusEqualTo(String value) {
            addCriterion("deo_status =", value, "deoStatus");
            return (Criteria) this;
        }

        public Criteria andDeoStatusNotEqualTo(String value) {
            addCriterion("deo_status <>", value, "deoStatus");
            return (Criteria) this;
        }

        public Criteria andDeoStatusGreaterThan(String value) {
            addCriterion("deo_status >", value, "deoStatus");
            return (Criteria) this;
        }

        public Criteria andDeoStatusGreaterThanOrEqualTo(String value) {
            addCriterion("deo_status >=", value, "deoStatus");
            return (Criteria) this;
        }

        public Criteria andDeoStatusLessThan(String value) {
            addCriterion("deo_status <", value, "deoStatus");
            return (Criteria) this;
        }

        public Criteria andDeoStatusLessThanOrEqualTo(String value) {
            addCriterion("deo_status <=", value, "deoStatus");
            return (Criteria) this;
        }

        public Criteria andDeoStatusLike(String value) {
            addCriterion("deo_status like", value, "deoStatus");
            return (Criteria) this;
        }

        public Criteria andDeoStatusNotLike(String value) {
            addCriterion("deo_status not like", value, "deoStatus");
            return (Criteria) this;
        }

        public Criteria andDeoStatusIn(List<String> values) {
            addCriterion("deo_status in", values, "deoStatus");
            return (Criteria) this;
        }

        public Criteria andDeoStatusNotIn(List<String> values) {
            addCriterion("deo_status not in", values, "deoStatus");
            return (Criteria) this;
        }

        public Criteria andDeoStatusBetween(String value1, String value2) {
            addCriterion("deo_status between", value1, value2, "deoStatus");
            return (Criteria) this;
        }

        public Criteria andDeoStatusNotBetween(String value1, String value2) {
            addCriterion("deo_status not between", value1, value2, "deoStatus");
            return (Criteria) this;
        }

        public Criteria andDeoStatuscodeIsNull() {
            addCriterion("deo_statuscode is null");
            return (Criteria) this;
        }

        public Criteria andDeoStatuscodeIsNotNull() {
            addCriterion("deo_statuscode is not null");
            return (Criteria) this;
        }

        public Criteria andDeoStatuscodeEqualTo(Integer value) {
            addCriterion("deo_statuscode =", value, "deoStatuscode");
            return (Criteria) this;
        }

        public Criteria andDeoStatuscodeNotEqualTo(Integer value) {
            addCriterion("deo_statuscode <>", value, "deoStatuscode");
            return (Criteria) this;
        }

        public Criteria andDeoStatuscodeGreaterThan(Integer value) {
            addCriterion("deo_statuscode >", value, "deoStatuscode");
            return (Criteria) this;
        }

        public Criteria andDeoStatuscodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("deo_statuscode >=", value, "deoStatuscode");
            return (Criteria) this;
        }

        public Criteria andDeoStatuscodeLessThan(Integer value) {
            addCriterion("deo_statuscode <", value, "deoStatuscode");
            return (Criteria) this;
        }

        public Criteria andDeoStatuscodeLessThanOrEqualTo(Integer value) {
            addCriterion("deo_statuscode <=", value, "deoStatuscode");
            return (Criteria) this;
        }

        public Criteria andDeoStatuscodeIn(List<Integer> values) {
            addCriterion("deo_statuscode in", values, "deoStatuscode");
            return (Criteria) this;
        }

        public Criteria andDeoStatuscodeNotIn(List<Integer> values) {
            addCriterion("deo_statuscode not in", values, "deoStatuscode");
            return (Criteria) this;
        }

        public Criteria andDeoStatuscodeBetween(Integer value1, Integer value2) {
            addCriterion("deo_statuscode between", value1, value2, "deoStatuscode");
            return (Criteria) this;
        }

        public Criteria andDeoStatuscodeNotBetween(Integer value1, Integer value2) {
            addCriterion("deo_statuscode not between", value1, value2, "deoStatuscode");
            return (Criteria) this;
        }

        public Criteria andDeoTaxpaymentmethodIsNull() {
            addCriterion("deo_taxpaymentmethod is null");
            return (Criteria) this;
        }

        public Criteria andDeoTaxpaymentmethodIsNotNull() {
            addCriterion("deo_taxpaymentmethod is not null");
            return (Criteria) this;
        }

        public Criteria andDeoTaxpaymentmethodEqualTo(String value) {
            addCriterion("deo_taxpaymentmethod =", value, "deoTaxpaymentmethod");
            return (Criteria) this;
        }

        public Criteria andDeoTaxpaymentmethodNotEqualTo(String value) {
            addCriterion("deo_taxpaymentmethod <>", value, "deoTaxpaymentmethod");
            return (Criteria) this;
        }

        public Criteria andDeoTaxpaymentmethodGreaterThan(String value) {
            addCriterion("deo_taxpaymentmethod >", value, "deoTaxpaymentmethod");
            return (Criteria) this;
        }

        public Criteria andDeoTaxpaymentmethodGreaterThanOrEqualTo(String value) {
            addCriterion("deo_taxpaymentmethod >=", value, "deoTaxpaymentmethod");
            return (Criteria) this;
        }

        public Criteria andDeoTaxpaymentmethodLessThan(String value) {
            addCriterion("deo_taxpaymentmethod <", value, "deoTaxpaymentmethod");
            return (Criteria) this;
        }

        public Criteria andDeoTaxpaymentmethodLessThanOrEqualTo(String value) {
            addCriterion("deo_taxpaymentmethod <=", value, "deoTaxpaymentmethod");
            return (Criteria) this;
        }

        public Criteria andDeoTaxpaymentmethodLike(String value) {
            addCriterion("deo_taxpaymentmethod like", value, "deoTaxpaymentmethod");
            return (Criteria) this;
        }

        public Criteria andDeoTaxpaymentmethodNotLike(String value) {
            addCriterion("deo_taxpaymentmethod not like", value, "deoTaxpaymentmethod");
            return (Criteria) this;
        }

        public Criteria andDeoTaxpaymentmethodIn(List<String> values) {
            addCriterion("deo_taxpaymentmethod in", values, "deoTaxpaymentmethod");
            return (Criteria) this;
        }

        public Criteria andDeoTaxpaymentmethodNotIn(List<String> values) {
            addCriterion("deo_taxpaymentmethod not in", values, "deoTaxpaymentmethod");
            return (Criteria) this;
        }

        public Criteria andDeoTaxpaymentmethodBetween(String value1, String value2) {
            addCriterion("deo_taxpaymentmethod between", value1, value2, "deoTaxpaymentmethod");
            return (Criteria) this;
        }

        public Criteria andDeoTaxpaymentmethodNotBetween(String value1, String value2) {
            addCriterion("deo_taxpaymentmethod not between", value1, value2, "deoTaxpaymentmethod");
            return (Criteria) this;
        }

        public Criteria andDeoTervendaddressIsNull() {
            addCriterion("deo_tervendaddress is null");
            return (Criteria) this;
        }

        public Criteria andDeoTervendaddressIsNotNull() {
            addCriterion("deo_tervendaddress is not null");
            return (Criteria) this;
        }

        public Criteria andDeoTervendaddressEqualTo(String value) {
            addCriterion("deo_tervendaddress =", value, "deoTervendaddress");
            return (Criteria) this;
        }

        public Criteria andDeoTervendaddressNotEqualTo(String value) {
            addCriterion("deo_tervendaddress <>", value, "deoTervendaddress");
            return (Criteria) this;
        }

        public Criteria andDeoTervendaddressGreaterThan(String value) {
            addCriterion("deo_tervendaddress >", value, "deoTervendaddress");
            return (Criteria) this;
        }

        public Criteria andDeoTervendaddressGreaterThanOrEqualTo(String value) {
            addCriterion("deo_tervendaddress >=", value, "deoTervendaddress");
            return (Criteria) this;
        }

        public Criteria andDeoTervendaddressLessThan(String value) {
            addCriterion("deo_tervendaddress <", value, "deoTervendaddress");
            return (Criteria) this;
        }

        public Criteria andDeoTervendaddressLessThanOrEqualTo(String value) {
            addCriterion("deo_tervendaddress <=", value, "deoTervendaddress");
            return (Criteria) this;
        }

        public Criteria andDeoTervendaddressLike(String value) {
            addCriterion("deo_tervendaddress like", value, "deoTervendaddress");
            return (Criteria) this;
        }

        public Criteria andDeoTervendaddressNotLike(String value) {
            addCriterion("deo_tervendaddress not like", value, "deoTervendaddress");
            return (Criteria) this;
        }

        public Criteria andDeoTervendaddressIn(List<String> values) {
            addCriterion("deo_tervendaddress in", values, "deoTervendaddress");
            return (Criteria) this;
        }

        public Criteria andDeoTervendaddressNotIn(List<String> values) {
            addCriterion("deo_tervendaddress not in", values, "deoTervendaddress");
            return (Criteria) this;
        }

        public Criteria andDeoTervendaddressBetween(String value1, String value2) {
            addCriterion("deo_tervendaddress between", value1, value2, "deoTervendaddress");
            return (Criteria) this;
        }

        public Criteria andDeoTervendaddressNotBetween(String value1, String value2) {
            addCriterion("deo_tervendaddress not between", value1, value2, "deoTervendaddress");
            return (Criteria) this;
        }

        public Criteria andDeoTervendorIsNull() {
            addCriterion("deo_tervendor is null");
            return (Criteria) this;
        }

        public Criteria andDeoTervendorIsNotNull() {
            addCriterion("deo_tervendor is not null");
            return (Criteria) this;
        }

        public Criteria andDeoTervendorEqualTo(String value) {
            addCriterion("deo_tervendor =", value, "deoTervendor");
            return (Criteria) this;
        }

        public Criteria andDeoTervendorNotEqualTo(String value) {
            addCriterion("deo_tervendor <>", value, "deoTervendor");
            return (Criteria) this;
        }

        public Criteria andDeoTervendorGreaterThan(String value) {
            addCriterion("deo_tervendor >", value, "deoTervendor");
            return (Criteria) this;
        }

        public Criteria andDeoTervendorGreaterThanOrEqualTo(String value) {
            addCriterion("deo_tervendor >=", value, "deoTervendor");
            return (Criteria) this;
        }

        public Criteria andDeoTervendorLessThan(String value) {
            addCriterion("deo_tervendor <", value, "deoTervendor");
            return (Criteria) this;
        }

        public Criteria andDeoTervendorLessThanOrEqualTo(String value) {
            addCriterion("deo_tervendor <=", value, "deoTervendor");
            return (Criteria) this;
        }

        public Criteria andDeoTervendorLike(String value) {
            addCriterion("deo_tervendor like", value, "deoTervendor");
            return (Criteria) this;
        }

        public Criteria andDeoTervendorNotLike(String value) {
            addCriterion("deo_tervendor not like", value, "deoTervendor");
            return (Criteria) this;
        }

        public Criteria andDeoTervendorIn(List<String> values) {
            addCriterion("deo_tervendor in", values, "deoTervendor");
            return (Criteria) this;
        }

        public Criteria andDeoTervendorNotIn(List<String> values) {
            addCriterion("deo_tervendor not in", values, "deoTervendor");
            return (Criteria) this;
        }

        public Criteria andDeoTervendorBetween(String value1, String value2) {
            addCriterion("deo_tervendor between", value1, value2, "deoTervendor");
            return (Criteria) this;
        }

        public Criteria andDeoTervendorNotBetween(String value1, String value2) {
            addCriterion("deo_tervendor not between", value1, value2, "deoTervendor");
            return (Criteria) this;
        }

        public Criteria andDeoTervenduuIsNull() {
            addCriterion("deo_tervenduu is null");
            return (Criteria) this;
        }

        public Criteria andDeoTervenduuIsNotNull() {
            addCriterion("deo_tervenduu is not null");
            return (Criteria) this;
        }

        public Criteria andDeoTervenduuEqualTo(Long value) {
            addCriterion("deo_tervenduu =", value, "deoTervenduu");
            return (Criteria) this;
        }

        public Criteria andDeoTervenduuNotEqualTo(Long value) {
            addCriterion("deo_tervenduu <>", value, "deoTervenduu");
            return (Criteria) this;
        }

        public Criteria andDeoTervenduuGreaterThan(Long value) {
            addCriterion("deo_tervenduu >", value, "deoTervenduu");
            return (Criteria) this;
        }

        public Criteria andDeoTervenduuGreaterThanOrEqualTo(Long value) {
            addCriterion("deo_tervenduu >=", value, "deoTervenduu");
            return (Criteria) this;
        }

        public Criteria andDeoTervenduuLessThan(Long value) {
            addCriterion("deo_tervenduu <", value, "deoTervenduu");
            return (Criteria) this;
        }

        public Criteria andDeoTervenduuLessThanOrEqualTo(Long value) {
            addCriterion("deo_tervenduu <=", value, "deoTervenduu");
            return (Criteria) this;
        }

        public Criteria andDeoTervenduuIn(List<Long> values) {
            addCriterion("deo_tervenduu in", values, "deoTervenduu");
            return (Criteria) this;
        }

        public Criteria andDeoTervenduuNotIn(List<Long> values) {
            addCriterion("deo_tervenduu not in", values, "deoTervenduu");
            return (Criteria) this;
        }

        public Criteria andDeoTervenduuBetween(Long value1, Long value2) {
            addCriterion("deo_tervenduu between", value1, value2, "deoTervenduu");
            return (Criteria) this;
        }

        public Criteria andDeoTervenduuNotBetween(Long value1, Long value2) {
            addCriterion("deo_tervenduu not between", value1, value2, "deoTervenduu");
            return (Criteria) this;
        }

        public Criteria andDeoTotalamountIsNull() {
            addCriterion("deo_totalamount is null");
            return (Criteria) this;
        }

        public Criteria andDeoTotalamountIsNotNull() {
            addCriterion("deo_totalamount is not null");
            return (Criteria) this;
        }

        public Criteria andDeoTotalamountEqualTo(Double value) {
            addCriterion("deo_totalamount =", value, "deoTotalamount");
            return (Criteria) this;
        }

        public Criteria andDeoTotalamountNotEqualTo(Double value) {
            addCriterion("deo_totalamount <>", value, "deoTotalamount");
            return (Criteria) this;
        }

        public Criteria andDeoTotalamountGreaterThan(Double value) {
            addCriterion("deo_totalamount >", value, "deoTotalamount");
            return (Criteria) this;
        }

        public Criteria andDeoTotalamountGreaterThanOrEqualTo(Double value) {
            addCriterion("deo_totalamount >=", value, "deoTotalamount");
            return (Criteria) this;
        }

        public Criteria andDeoTotalamountLessThan(Double value) {
            addCriterion("deo_totalamount <", value, "deoTotalamount");
            return (Criteria) this;
        }

        public Criteria andDeoTotalamountLessThanOrEqualTo(Double value) {
            addCriterion("deo_totalamount <=", value, "deoTotalamount");
            return (Criteria) this;
        }

        public Criteria andDeoTotalamountIn(List<Double> values) {
            addCriterion("deo_totalamount in", values, "deoTotalamount");
            return (Criteria) this;
        }

        public Criteria andDeoTotalamountNotIn(List<Double> values) {
            addCriterion("deo_totalamount not in", values, "deoTotalamount");
            return (Criteria) this;
        }

        public Criteria andDeoTotalamountBetween(Double value1, Double value2) {
            addCriterion("deo_totalamount between", value1, value2, "deoTotalamount");
            return (Criteria) this;
        }

        public Criteria andDeoTotalamountNotBetween(Double value1, Double value2) {
            addCriterion("deo_totalamount not between", value1, value2, "deoTotalamount");
            return (Criteria) this;
        }

        public Criteria andDeoTotalpaymentIsNull() {
            addCriterion("deo_totalpayment is null");
            return (Criteria) this;
        }

        public Criteria andDeoTotalpaymentIsNotNull() {
            addCriterion("deo_totalpayment is not null");
            return (Criteria) this;
        }

        public Criteria andDeoTotalpaymentEqualTo(Double value) {
            addCriterion("deo_totalpayment =", value, "deoTotalpayment");
            return (Criteria) this;
        }

        public Criteria andDeoTotalpaymentNotEqualTo(Double value) {
            addCriterion("deo_totalpayment <>", value, "deoTotalpayment");
            return (Criteria) this;
        }

        public Criteria andDeoTotalpaymentGreaterThan(Double value) {
            addCriterion("deo_totalpayment >", value, "deoTotalpayment");
            return (Criteria) this;
        }

        public Criteria andDeoTotalpaymentGreaterThanOrEqualTo(Double value) {
            addCriterion("deo_totalpayment >=", value, "deoTotalpayment");
            return (Criteria) this;
        }

        public Criteria andDeoTotalpaymentLessThan(Double value) {
            addCriterion("deo_totalpayment <", value, "deoTotalpayment");
            return (Criteria) this;
        }

        public Criteria andDeoTotalpaymentLessThanOrEqualTo(Double value) {
            addCriterion("deo_totalpayment <=", value, "deoTotalpayment");
            return (Criteria) this;
        }

        public Criteria andDeoTotalpaymentIn(List<Double> values) {
            addCriterion("deo_totalpayment in", values, "deoTotalpayment");
            return (Criteria) this;
        }

        public Criteria andDeoTotalpaymentNotIn(List<Double> values) {
            addCriterion("deo_totalpayment not in", values, "deoTotalpayment");
            return (Criteria) this;
        }

        public Criteria andDeoTotalpaymentBetween(Double value1, Double value2) {
            addCriterion("deo_totalpayment between", value1, value2, "deoTotalpayment");
            return (Criteria) this;
        }

        public Criteria andDeoTotalpaymentNotBetween(Double value1, Double value2) {
            addCriterion("deo_totalpayment not between", value1, value2, "deoTotalpayment");
            return (Criteria) this;
        }

        public Criteria andDeoUsdpaymentIsNull() {
            addCriterion("deo_usdpayment is null");
            return (Criteria) this;
        }

        public Criteria andDeoUsdpaymentIsNotNull() {
            addCriterion("deo_usdpayment is not null");
            return (Criteria) this;
        }

        public Criteria andDeoUsdpaymentEqualTo(Double value) {
            addCriterion("deo_usdpayment =", value, "deoUsdpayment");
            return (Criteria) this;
        }

        public Criteria andDeoUsdpaymentNotEqualTo(Double value) {
            addCriterion("deo_usdpayment <>", value, "deoUsdpayment");
            return (Criteria) this;
        }

        public Criteria andDeoUsdpaymentGreaterThan(Double value) {
            addCriterion("deo_usdpayment >", value, "deoUsdpayment");
            return (Criteria) this;
        }

        public Criteria andDeoUsdpaymentGreaterThanOrEqualTo(Double value) {
            addCriterion("deo_usdpayment >=", value, "deoUsdpayment");
            return (Criteria) this;
        }

        public Criteria andDeoUsdpaymentLessThan(Double value) {
            addCriterion("deo_usdpayment <", value, "deoUsdpayment");
            return (Criteria) this;
        }

        public Criteria andDeoUsdpaymentLessThanOrEqualTo(Double value) {
            addCriterion("deo_usdpayment <=", value, "deoUsdpayment");
            return (Criteria) this;
        }

        public Criteria andDeoUsdpaymentIn(List<Double> values) {
            addCriterion("deo_usdpayment in", values, "deoUsdpayment");
            return (Criteria) this;
        }

        public Criteria andDeoUsdpaymentNotIn(List<Double> values) {
            addCriterion("deo_usdpayment not in", values, "deoUsdpayment");
            return (Criteria) this;
        }

        public Criteria andDeoUsdpaymentBetween(Double value1, Double value2) {
            addCriterion("deo_usdpayment between", value1, value2, "deoUsdpayment");
            return (Criteria) this;
        }

        public Criteria andDeoUsdpaymentNotBetween(Double value1, Double value2) {
            addCriterion("deo_usdpayment not between", value1, value2, "deoUsdpayment");
            return (Criteria) this;
        }

        public Criteria andDeoUsertelIsNull() {
            addCriterion("deo_usertel is null");
            return (Criteria) this;
        }

        public Criteria andDeoUsertelIsNotNull() {
            addCriterion("deo_usertel is not null");
            return (Criteria) this;
        }

        public Criteria andDeoUsertelEqualTo(String value) {
            addCriterion("deo_usertel =", value, "deoUsertel");
            return (Criteria) this;
        }

        public Criteria andDeoUsertelNotEqualTo(String value) {
            addCriterion("deo_usertel <>", value, "deoUsertel");
            return (Criteria) this;
        }

        public Criteria andDeoUsertelGreaterThan(String value) {
            addCriterion("deo_usertel >", value, "deoUsertel");
            return (Criteria) this;
        }

        public Criteria andDeoUsertelGreaterThanOrEqualTo(String value) {
            addCriterion("deo_usertel >=", value, "deoUsertel");
            return (Criteria) this;
        }

        public Criteria andDeoUsertelLessThan(String value) {
            addCriterion("deo_usertel <", value, "deoUsertel");
            return (Criteria) this;
        }

        public Criteria andDeoUsertelLessThanOrEqualTo(String value) {
            addCriterion("deo_usertel <=", value, "deoUsertel");
            return (Criteria) this;
        }

        public Criteria andDeoUsertelLike(String value) {
            addCriterion("deo_usertel like", value, "deoUsertel");
            return (Criteria) this;
        }

        public Criteria andDeoUsertelNotLike(String value) {
            addCriterion("deo_usertel not like", value, "deoUsertel");
            return (Criteria) this;
        }

        public Criteria andDeoUsertelIn(List<String> values) {
            addCriterion("deo_usertel in", values, "deoUsertel");
            return (Criteria) this;
        }

        public Criteria andDeoUsertelNotIn(List<String> values) {
            addCriterion("deo_usertel not in", values, "deoUsertel");
            return (Criteria) this;
        }

        public Criteria andDeoUsertelBetween(String value1, String value2) {
            addCriterion("deo_usertel between", value1, value2, "deoUsertel");
            return (Criteria) this;
        }

        public Criteria andDeoUsertelNotBetween(String value1, String value2) {
            addCriterion("deo_usertel not between", value1, value2, "deoUsertel");
            return (Criteria) this;
        }

        public Criteria andDeoUseruuIsNull() {
            addCriterion("deo_useruu is null");
            return (Criteria) this;
        }

        public Criteria andDeoUseruuIsNotNull() {
            addCriterion("deo_useruu is not null");
            return (Criteria) this;
        }

        public Criteria andDeoUseruuEqualTo(Long value) {
            addCriterion("deo_useruu =", value, "deoUseruu");
            return (Criteria) this;
        }

        public Criteria andDeoUseruuNotEqualTo(Long value) {
            addCriterion("deo_useruu <>", value, "deoUseruu");
            return (Criteria) this;
        }

        public Criteria andDeoUseruuGreaterThan(Long value) {
            addCriterion("deo_useruu >", value, "deoUseruu");
            return (Criteria) this;
        }

        public Criteria andDeoUseruuGreaterThanOrEqualTo(Long value) {
            addCriterion("deo_useruu >=", value, "deoUseruu");
            return (Criteria) this;
        }

        public Criteria andDeoUseruuLessThan(Long value) {
            addCriterion("deo_useruu <", value, "deoUseruu");
            return (Criteria) this;
        }

        public Criteria andDeoUseruuLessThanOrEqualTo(Long value) {
            addCriterion("deo_useruu <=", value, "deoUseruu");
            return (Criteria) this;
        }

        public Criteria andDeoUseruuIn(List<Long> values) {
            addCriterion("deo_useruu in", values, "deoUseruu");
            return (Criteria) this;
        }

        public Criteria andDeoUseruuNotIn(List<Long> values) {
            addCriterion("deo_useruu not in", values, "deoUseruu");
            return (Criteria) this;
        }

        public Criteria andDeoUseruuBetween(Long value1, Long value2) {
            addCriterion("deo_useruu between", value1, value2, "deoUseruu");
            return (Criteria) this;
        }

        public Criteria andDeoUseruuNotBetween(Long value1, Long value2) {
            addCriterion("deo_useruu not between", value1, value2, "deoUseruu");
            return (Criteria) this;
        }

        public Criteria andDeoVendorenuuIsNull() {
            addCriterion("deo_vendorenuu is null");
            return (Criteria) this;
        }

        public Criteria andDeoVendorenuuIsNotNull() {
            addCriterion("deo_vendorenuu is not null");
            return (Criteria) this;
        }

        public Criteria andDeoVendorenuuEqualTo(Long value) {
            addCriterion("deo_vendorenuu =", value, "deoVendorenuu");
            return (Criteria) this;
        }

        public Criteria andDeoVendorenuuNotEqualTo(Long value) {
            addCriterion("deo_vendorenuu <>", value, "deoVendorenuu");
            return (Criteria) this;
        }

        public Criteria andDeoVendorenuuGreaterThan(Long value) {
            addCriterion("deo_vendorenuu >", value, "deoVendorenuu");
            return (Criteria) this;
        }

        public Criteria andDeoVendorenuuGreaterThanOrEqualTo(Long value) {
            addCriterion("deo_vendorenuu >=", value, "deoVendorenuu");
            return (Criteria) this;
        }

        public Criteria andDeoVendorenuuLessThan(Long value) {
            addCriterion("deo_vendorenuu <", value, "deoVendorenuu");
            return (Criteria) this;
        }

        public Criteria andDeoVendorenuuLessThanOrEqualTo(Long value) {
            addCriterion("deo_vendorenuu <=", value, "deoVendorenuu");
            return (Criteria) this;
        }

        public Criteria andDeoVendorenuuIn(List<Long> values) {
            addCriterion("deo_vendorenuu in", values, "deoVendorenuu");
            return (Criteria) this;
        }

        public Criteria andDeoVendorenuuNotIn(List<Long> values) {
            addCriterion("deo_vendorenuu not in", values, "deoVendorenuu");
            return (Criteria) this;
        }

        public Criteria andDeoVendorenuuBetween(Long value1, Long value2) {
            addCriterion("deo_vendorenuu between", value1, value2, "deoVendorenuu");
            return (Criteria) this;
        }

        public Criteria andDeoVendorenuuNotBetween(Long value1, Long value2) {
            addCriterion("deo_vendorenuu not between", value1, value2, "deoVendorenuu");
            return (Criteria) this;
        }

        public Criteria andDeoVendtelIsNull() {
            addCriterion("deo_vendtel is null");
            return (Criteria) this;
        }

        public Criteria andDeoVendtelIsNotNull() {
            addCriterion("deo_vendtel is not null");
            return (Criteria) this;
        }

        public Criteria andDeoVendtelEqualTo(String value) {
            addCriterion("deo_vendtel =", value, "deoVendtel");
            return (Criteria) this;
        }

        public Criteria andDeoVendtelNotEqualTo(String value) {
            addCriterion("deo_vendtel <>", value, "deoVendtel");
            return (Criteria) this;
        }

        public Criteria andDeoVendtelGreaterThan(String value) {
            addCriterion("deo_vendtel >", value, "deoVendtel");
            return (Criteria) this;
        }

        public Criteria andDeoVendtelGreaterThanOrEqualTo(String value) {
            addCriterion("deo_vendtel >=", value, "deoVendtel");
            return (Criteria) this;
        }

        public Criteria andDeoVendtelLessThan(String value) {
            addCriterion("deo_vendtel <", value, "deoVendtel");
            return (Criteria) this;
        }

        public Criteria andDeoVendtelLessThanOrEqualTo(String value) {
            addCriterion("deo_vendtel <=", value, "deoVendtel");
            return (Criteria) this;
        }

        public Criteria andDeoVendtelLike(String value) {
            addCriterion("deo_vendtel like", value, "deoVendtel");
            return (Criteria) this;
        }

        public Criteria andDeoVendtelNotLike(String value) {
            addCriterion("deo_vendtel not like", value, "deoVendtel");
            return (Criteria) this;
        }

        public Criteria andDeoVendtelIn(List<String> values) {
            addCriterion("deo_vendtel in", values, "deoVendtel");
            return (Criteria) this;
        }

        public Criteria andDeoVendtelNotIn(List<String> values) {
            addCriterion("deo_vendtel not in", values, "deoVendtel");
            return (Criteria) this;
        }

        public Criteria andDeoVendtelBetween(String value1, String value2) {
            addCriterion("deo_vendtel between", value1, value2, "deoVendtel");
            return (Criteria) this;
        }

        public Criteria andDeoVendtelNotBetween(String value1, String value2) {
            addCriterion("deo_vendtel not between", value1, value2, "deoVendtel");
            return (Criteria) this;
        }

        public Criteria andDeoVenduserIsNull() {
            addCriterion("deo_venduser is null");
            return (Criteria) this;
        }

        public Criteria andDeoVenduserIsNotNull() {
            addCriterion("deo_venduser is not null");
            return (Criteria) this;
        }

        public Criteria andDeoVenduserEqualTo(String value) {
            addCriterion("deo_venduser =", value, "deoVenduser");
            return (Criteria) this;
        }

        public Criteria andDeoVenduserNotEqualTo(String value) {
            addCriterion("deo_venduser <>", value, "deoVenduser");
            return (Criteria) this;
        }

        public Criteria andDeoVenduserGreaterThan(String value) {
            addCriterion("deo_venduser >", value, "deoVenduser");
            return (Criteria) this;
        }

        public Criteria andDeoVenduserGreaterThanOrEqualTo(String value) {
            addCriterion("deo_venduser >=", value, "deoVenduser");
            return (Criteria) this;
        }

        public Criteria andDeoVenduserLessThan(String value) {
            addCriterion("deo_venduser <", value, "deoVenduser");
            return (Criteria) this;
        }

        public Criteria andDeoVenduserLessThanOrEqualTo(String value) {
            addCriterion("deo_venduser <=", value, "deoVenduser");
            return (Criteria) this;
        }

        public Criteria andDeoVenduserLike(String value) {
            addCriterion("deo_venduser like", value, "deoVenduser");
            return (Criteria) this;
        }

        public Criteria andDeoVenduserNotLike(String value) {
            addCriterion("deo_venduser not like", value, "deoVenduser");
            return (Criteria) this;
        }

        public Criteria andDeoVenduserIn(List<String> values) {
            addCriterion("deo_venduser in", values, "deoVenduser");
            return (Criteria) this;
        }

        public Criteria andDeoVenduserNotIn(List<String> values) {
            addCriterion("deo_venduser not in", values, "deoVenduser");
            return (Criteria) this;
        }

        public Criteria andDeoVenduserBetween(String value1, String value2) {
            addCriterion("deo_venduser between", value1, value2, "deoVenduser");
            return (Criteria) this;
        }

        public Criteria andDeoVenduserNotBetween(String value1, String value2) {
            addCriterion("deo_venduser not between", value1, value2, "deoVenduser");
            return (Criteria) this;
        }

        public Criteria andDeoVenduseruuIsNull() {
            addCriterion("deo_venduseruu is null");
            return (Criteria) this;
        }

        public Criteria andDeoVenduseruuIsNotNull() {
            addCriterion("deo_venduseruu is not null");
            return (Criteria) this;
        }

        public Criteria andDeoVenduseruuEqualTo(Long value) {
            addCriterion("deo_venduseruu =", value, "deoVenduseruu");
            return (Criteria) this;
        }

        public Criteria andDeoVenduseruuNotEqualTo(Long value) {
            addCriterion("deo_venduseruu <>", value, "deoVenduseruu");
            return (Criteria) this;
        }

        public Criteria andDeoVenduseruuGreaterThan(Long value) {
            addCriterion("deo_venduseruu >", value, "deoVenduseruu");
            return (Criteria) this;
        }

        public Criteria andDeoVenduseruuGreaterThanOrEqualTo(Long value) {
            addCriterion("deo_venduseruu >=", value, "deoVenduseruu");
            return (Criteria) this;
        }

        public Criteria andDeoVenduseruuLessThan(Long value) {
            addCriterion("deo_venduseruu <", value, "deoVenduseruu");
            return (Criteria) this;
        }

        public Criteria andDeoVenduseruuLessThanOrEqualTo(Long value) {
            addCriterion("deo_venduseruu <=", value, "deoVenduseruu");
            return (Criteria) this;
        }

        public Criteria andDeoVenduseruuIn(List<Long> values) {
            addCriterion("deo_venduseruu in", values, "deoVenduseruu");
            return (Criteria) this;
        }

        public Criteria andDeoVenduseruuNotIn(List<Long> values) {
            addCriterion("deo_venduseruu not in", values, "deoVenduseruu");
            return (Criteria) this;
        }

        public Criteria andDeoVenduseruuBetween(Long value1, Long value2) {
            addCriterion("deo_venduseruu between", value1, value2, "deoVenduseruu");
            return (Criteria) this;
        }

        public Criteria andDeoVenduseruuNotBetween(Long value1, Long value2) {
            addCriterion("deo_venduseruu not between", value1, value2, "deoVenduseruu");
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