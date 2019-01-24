package com.usoft.b2b.manage.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LogErrorExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LogErrorExample() {
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

        public Criteria andLogIdIsNull() {
            addCriterion("log_id is null");
            return (Criteria) this;
        }

        public Criteria andLogIdIsNotNull() {
            addCriterion("log_id is not null");
            return (Criteria) this;
        }

        public Criteria andLogIdEqualTo(Long value) {
            addCriterion("log_id =", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdNotEqualTo(Long value) {
            addCriterion("log_id <>", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdGreaterThan(Long value) {
            addCriterion("log_id >", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdGreaterThanOrEqualTo(Long value) {
            addCriterion("log_id >=", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdLessThan(Long value) {
            addCriterion("log_id <", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdLessThanOrEqualTo(Long value) {
            addCriterion("log_id <=", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdIn(List<Long> values) {
            addCriterion("log_id in", values, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdNotIn(List<Long> values) {
            addCriterion("log_id not in", values, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdBetween(Long value1, Long value2) {
            addCriterion("log_id between", value1, value2, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdNotBetween(Long value1, Long value2) {
            addCriterion("log_id not between", value1, value2, "logId");
            return (Criteria) this;
        }

        public Criteria andLogDateIsNull() {
            addCriterion("log_date is null");
            return (Criteria) this;
        }

        public Criteria andLogDateIsNotNull() {
            addCriterion("log_date is not null");
            return (Criteria) this;
        }

        public Criteria andLogDateEqualTo(Date value) {
            addCriterion("log_date =", value, "logDate");
            return (Criteria) this;
        }

        public Criteria andLogDateNotEqualTo(Date value) {
            addCriterion("log_date <>", value, "logDate");
            return (Criteria) this;
        }

        public Criteria andLogDateGreaterThan(Date value) {
            addCriterion("log_date >", value, "logDate");
            return (Criteria) this;
        }

        public Criteria andLogDateGreaterThanOrEqualTo(Date value) {
            addCriterion("log_date >=", value, "logDate");
            return (Criteria) this;
        }

        public Criteria andLogDateLessThan(Date value) {
            addCriterion("log_date <", value, "logDate");
            return (Criteria) this;
        }

        public Criteria andLogDateLessThanOrEqualTo(Date value) {
            addCriterion("log_date <=", value, "logDate");
            return (Criteria) this;
        }

        public Criteria andLogDateIn(List<Date> values) {
            addCriterion("log_date in", values, "logDate");
            return (Criteria) this;
        }

        public Criteria andLogDateNotIn(List<Date> values) {
            addCriterion("log_date not in", values, "logDate");
            return (Criteria) this;
        }

        public Criteria andLogDateBetween(Date value1, Date value2) {
            addCriterion("log_date between", value1, value2, "logDate");
            return (Criteria) this;
        }

        public Criteria andLogDateNotBetween(Date value1, Date value2) {
            addCriterion("log_date not between", value1, value2, "logDate");
            return (Criteria) this;
        }

        public Criteria andLogEnnameIsNull() {
            addCriterion("log_enname is null");
            return (Criteria) this;
        }

        public Criteria andLogEnnameIsNotNull() {
            addCriterion("log_enname is not null");
            return (Criteria) this;
        }

        public Criteria andLogEnnameEqualTo(String value) {
            addCriterion("log_enname =", value, "logEnname");
            return (Criteria) this;
        }

        public Criteria andLogEnnameNotEqualTo(String value) {
            addCriterion("log_enname <>", value, "logEnname");
            return (Criteria) this;
        }

        public Criteria andLogEnnameGreaterThan(String value) {
            addCriterion("log_enname >", value, "logEnname");
            return (Criteria) this;
        }

        public Criteria andLogEnnameGreaterThanOrEqualTo(String value) {
            addCriterion("log_enname >=", value, "logEnname");
            return (Criteria) this;
        }

        public Criteria andLogEnnameLessThan(String value) {
            addCriterion("log_enname <", value, "logEnname");
            return (Criteria) this;
        }

        public Criteria andLogEnnameLessThanOrEqualTo(String value) {
            addCriterion("log_enname <=", value, "logEnname");
            return (Criteria) this;
        }

        public Criteria andLogEnnameLike(String value) {
            addCriterion("log_enname like", value, "logEnname");
            return (Criteria) this;
        }

        public Criteria andLogEnnameNotLike(String value) {
            addCriterion("log_enname not like", value, "logEnname");
            return (Criteria) this;
        }

        public Criteria andLogEnnameIn(List<String> values) {
            addCriterion("log_enname in", values, "logEnname");
            return (Criteria) this;
        }

        public Criteria andLogEnnameNotIn(List<String> values) {
            addCriterion("log_enname not in", values, "logEnname");
            return (Criteria) this;
        }

        public Criteria andLogEnnameBetween(String value1, String value2) {
            addCriterion("log_enname between", value1, value2, "logEnname");
            return (Criteria) this;
        }

        public Criteria andLogEnnameNotBetween(String value1, String value2) {
            addCriterion("log_enname not between", value1, value2, "logEnname");
            return (Criteria) this;
        }

        public Criteria andLogEnuuIsNull() {
            addCriterion("log_enuu is null");
            return (Criteria) this;
        }

        public Criteria andLogEnuuIsNotNull() {
            addCriterion("log_enuu is not null");
            return (Criteria) this;
        }

        public Criteria andLogEnuuEqualTo(Long value) {
            addCriterion("log_enuu =", value, "logEnuu");
            return (Criteria) this;
        }

        public Criteria andLogEnuuNotEqualTo(Long value) {
            addCriterion("log_enuu <>", value, "logEnuu");
            return (Criteria) this;
        }

        public Criteria andLogEnuuGreaterThan(Long value) {
            addCriterion("log_enuu >", value, "logEnuu");
            return (Criteria) this;
        }

        public Criteria andLogEnuuGreaterThanOrEqualTo(Long value) {
            addCriterion("log_enuu >=", value, "logEnuu");
            return (Criteria) this;
        }

        public Criteria andLogEnuuLessThan(Long value) {
            addCriterion("log_enuu <", value, "logEnuu");
            return (Criteria) this;
        }

        public Criteria andLogEnuuLessThanOrEqualTo(Long value) {
            addCriterion("log_enuu <=", value, "logEnuu");
            return (Criteria) this;
        }

        public Criteria andLogEnuuIn(List<Long> values) {
            addCriterion("log_enuu in", values, "logEnuu");
            return (Criteria) this;
        }

        public Criteria andLogEnuuNotIn(List<Long> values) {
            addCriterion("log_enuu not in", values, "logEnuu");
            return (Criteria) this;
        }

        public Criteria andLogEnuuBetween(Long value1, Long value2) {
            addCriterion("log_enuu between", value1, value2, "logEnuu");
            return (Criteria) this;
        }

        public Criteria andLogEnuuNotBetween(Long value1, Long value2) {
            addCriterion("log_enuu not between", value1, value2, "logEnuu");
            return (Criteria) this;
        }

        public Criteria andLogMsgIsNull() {
            addCriterion("log_msg is null");
            return (Criteria) this;
        }

        public Criteria andLogMsgIsNotNull() {
            addCriterion("log_msg is not null");
            return (Criteria) this;
        }

        public Criteria andLogMsgEqualTo(String value) {
            addCriterion("log_msg =", value, "logMsg");
            return (Criteria) this;
        }

        public Criteria andLogMsgNotEqualTo(String value) {
            addCriterion("log_msg <>", value, "logMsg");
            return (Criteria) this;
        }

        public Criteria andLogMsgGreaterThan(String value) {
            addCriterion("log_msg >", value, "logMsg");
            return (Criteria) this;
        }

        public Criteria andLogMsgGreaterThanOrEqualTo(String value) {
            addCriterion("log_msg >=", value, "logMsg");
            return (Criteria) this;
        }

        public Criteria andLogMsgLessThan(String value) {
            addCriterion("log_msg <", value, "logMsg");
            return (Criteria) this;
        }

        public Criteria andLogMsgLessThanOrEqualTo(String value) {
            addCriterion("log_msg <=", value, "logMsg");
            return (Criteria) this;
        }

        public Criteria andLogMsgLike(String value) {
            addCriterion("log_msg like", value, "logMsg");
            return (Criteria) this;
        }

        public Criteria andLogMsgNotLike(String value) {
            addCriterion("log_msg not like", value, "logMsg");
            return (Criteria) this;
        }

        public Criteria andLogMsgIn(List<String> values) {
            addCriterion("log_msg in", values, "logMsg");
            return (Criteria) this;
        }

        public Criteria andLogMsgNotIn(List<String> values) {
            addCriterion("log_msg not in", values, "logMsg");
            return (Criteria) this;
        }

        public Criteria andLogMsgBetween(String value1, String value2) {
            addCriterion("log_msg between", value1, value2, "logMsg");
            return (Criteria) this;
        }

        public Criteria andLogMsgNotBetween(String value1, String value2) {
            addCriterion("log_msg not between", value1, value2, "logMsg");
            return (Criteria) this;
        }

        public Criteria andLogUrlIsNull() {
            addCriterion("log_url is null");
            return (Criteria) this;
        }

        public Criteria andLogUrlIsNotNull() {
            addCriterion("log_url is not null");
            return (Criteria) this;
        }

        public Criteria andLogUrlEqualTo(String value) {
            addCriterion("log_url =", value, "logUrl");
            return (Criteria) this;
        }

        public Criteria andLogUrlNotEqualTo(String value) {
            addCriterion("log_url <>", value, "logUrl");
            return (Criteria) this;
        }

        public Criteria andLogUrlGreaterThan(String value) {
            addCriterion("log_url >", value, "logUrl");
            return (Criteria) this;
        }

        public Criteria andLogUrlGreaterThanOrEqualTo(String value) {
            addCriterion("log_url >=", value, "logUrl");
            return (Criteria) this;
        }

        public Criteria andLogUrlLessThan(String value) {
            addCriterion("log_url <", value, "logUrl");
            return (Criteria) this;
        }

        public Criteria andLogUrlLessThanOrEqualTo(String value) {
            addCriterion("log_url <=", value, "logUrl");
            return (Criteria) this;
        }

        public Criteria andLogUrlLike(String value) {
            addCriterion("log_url like", value, "logUrl");
            return (Criteria) this;
        }

        public Criteria andLogUrlNotLike(String value) {
            addCriterion("log_url not like", value, "logUrl");
            return (Criteria) this;
        }

        public Criteria andLogUrlIn(List<String> values) {
            addCriterion("log_url in", values, "logUrl");
            return (Criteria) this;
        }

        public Criteria andLogUrlNotIn(List<String> values) {
            addCriterion("log_url not in", values, "logUrl");
            return (Criteria) this;
        }

        public Criteria andLogUrlBetween(String value1, String value2) {
            addCriterion("log_url between", value1, value2, "logUrl");
            return (Criteria) this;
        }

        public Criteria andLogUrlNotBetween(String value1, String value2) {
            addCriterion("log_url not between", value1, value2, "logUrl");
            return (Criteria) this;
        }

        public Criteria andLogUuidIsNull() {
            addCriterion("log_uuid is null");
            return (Criteria) this;
        }

        public Criteria andLogUuidIsNotNull() {
            addCriterion("log_uuid is not null");
            return (Criteria) this;
        }

        public Criteria andLogUuidEqualTo(String value) {
            addCriterion("log_uuid =", value, "logUuid");
            return (Criteria) this;
        }

        public Criteria andLogUuidNotEqualTo(String value) {
            addCriterion("log_uuid <>", value, "logUuid");
            return (Criteria) this;
        }

        public Criteria andLogUuidGreaterThan(String value) {
            addCriterion("log_uuid >", value, "logUuid");
            return (Criteria) this;
        }

        public Criteria andLogUuidGreaterThanOrEqualTo(String value) {
            addCriterion("log_uuid >=", value, "logUuid");
            return (Criteria) this;
        }

        public Criteria andLogUuidLessThan(String value) {
            addCriterion("log_uuid <", value, "logUuid");
            return (Criteria) this;
        }

        public Criteria andLogUuidLessThanOrEqualTo(String value) {
            addCriterion("log_uuid <=", value, "logUuid");
            return (Criteria) this;
        }

        public Criteria andLogUuidLike(String value) {
            addCriterion("log_uuid like", value, "logUuid");
            return (Criteria) this;
        }

        public Criteria andLogUuidNotLike(String value) {
            addCriterion("log_uuid not like", value, "logUuid");
            return (Criteria) this;
        }

        public Criteria andLogUuidIn(List<String> values) {
            addCriterion("log_uuid in", values, "logUuid");
            return (Criteria) this;
        }

        public Criteria andLogUuidNotIn(List<String> values) {
            addCriterion("log_uuid not in", values, "logUuid");
            return (Criteria) this;
        }

        public Criteria andLogUuidBetween(String value1, String value2) {
            addCriterion("log_uuid between", value1, value2, "logUuid");
            return (Criteria) this;
        }

        public Criteria andLogUuidNotBetween(String value1, String value2) {
            addCriterion("log_uuid not between", value1, value2, "logUuid");
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