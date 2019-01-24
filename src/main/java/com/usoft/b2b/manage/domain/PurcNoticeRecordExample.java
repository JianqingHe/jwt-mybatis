package com.usoft.b2b.manage.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PurcNoticeRecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PurcNoticeRecordExample() {
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

        public Criteria andNoIdIsNull() {
            addCriterion("no_id is null");
            return (Criteria) this;
        }

        public Criteria andNoIdIsNotNull() {
            addCriterion("no_id is not null");
            return (Criteria) this;
        }

        public Criteria andNoIdEqualTo(Long value) {
            addCriterion("no_id =", value, "noId");
            return (Criteria) this;
        }

        public Criteria andNoIdNotEqualTo(Long value) {
            addCriterion("no_id <>", value, "noId");
            return (Criteria) this;
        }

        public Criteria andNoIdGreaterThan(Long value) {
            addCriterion("no_id >", value, "noId");
            return (Criteria) this;
        }

        public Criteria andNoIdGreaterThanOrEqualTo(Long value) {
            addCriterion("no_id >=", value, "noId");
            return (Criteria) this;
        }

        public Criteria andNoIdLessThan(Long value) {
            addCriterion("no_id <", value, "noId");
            return (Criteria) this;
        }

        public Criteria andNoIdLessThanOrEqualTo(Long value) {
            addCriterion("no_id <=", value, "noId");
            return (Criteria) this;
        }

        public Criteria andNoIdIn(List<Long> values) {
            addCriterion("no_id in", values, "noId");
            return (Criteria) this;
        }

        public Criteria andNoIdNotIn(List<Long> values) {
            addCriterion("no_id not in", values, "noId");
            return (Criteria) this;
        }

        public Criteria andNoIdBetween(Long value1, Long value2) {
            addCriterion("no_id between", value1, value2, "noId");
            return (Criteria) this;
        }

        public Criteria andNoIdNotBetween(Long value1, Long value2) {
            addCriterion("no_id not between", value1, value2, "noId");
            return (Criteria) this;
        }

        public Criteria andNoDateIsNull() {
            addCriterion("no_date is null");
            return (Criteria) this;
        }

        public Criteria andNoDateIsNotNull() {
            addCriterion("no_date is not null");
            return (Criteria) this;
        }

        public Criteria andNoDateEqualTo(Date value) {
            addCriterion("no_date =", value, "noDate");
            return (Criteria) this;
        }

        public Criteria andNoDateNotEqualTo(Date value) {
            addCriterion("no_date <>", value, "noDate");
            return (Criteria) this;
        }

        public Criteria andNoDateGreaterThan(Date value) {
            addCriterion("no_date >", value, "noDate");
            return (Criteria) this;
        }

        public Criteria andNoDateGreaterThanOrEqualTo(Date value) {
            addCriterion("no_date >=", value, "noDate");
            return (Criteria) this;
        }

        public Criteria andNoDateLessThan(Date value) {
            addCriterion("no_date <", value, "noDate");
            return (Criteria) this;
        }

        public Criteria andNoDateLessThanOrEqualTo(Date value) {
            addCriterion("no_date <=", value, "noDate");
            return (Criteria) this;
        }

        public Criteria andNoDateIn(List<Date> values) {
            addCriterion("no_date in", values, "noDate");
            return (Criteria) this;
        }

        public Criteria andNoDateNotIn(List<Date> values) {
            addCriterion("no_date not in", values, "noDate");
            return (Criteria) this;
        }

        public Criteria andNoDateBetween(Date value1, Date value2) {
            addCriterion("no_date between", value1, value2, "noDate");
            return (Criteria) this;
        }

        public Criteria andNoDateNotBetween(Date value1, Date value2) {
            addCriterion("no_date not between", value1, value2, "noDate");
            return (Criteria) this;
        }

        public Criteria andNoDescribeIsNull() {
            addCriterion("no_describe is null");
            return (Criteria) this;
        }

        public Criteria andNoDescribeIsNotNull() {
            addCriterion("no_describe is not null");
            return (Criteria) this;
        }

        public Criteria andNoDescribeEqualTo(String value) {
            addCriterion("no_describe =", value, "noDescribe");
            return (Criteria) this;
        }

        public Criteria andNoDescribeNotEqualTo(String value) {
            addCriterion("no_describe <>", value, "noDescribe");
            return (Criteria) this;
        }

        public Criteria andNoDescribeGreaterThan(String value) {
            addCriterion("no_describe >", value, "noDescribe");
            return (Criteria) this;
        }

        public Criteria andNoDescribeGreaterThanOrEqualTo(String value) {
            addCriterion("no_describe >=", value, "noDescribe");
            return (Criteria) this;
        }

        public Criteria andNoDescribeLessThan(String value) {
            addCriterion("no_describe <", value, "noDescribe");
            return (Criteria) this;
        }

        public Criteria andNoDescribeLessThanOrEqualTo(String value) {
            addCriterion("no_describe <=", value, "noDescribe");
            return (Criteria) this;
        }

        public Criteria andNoDescribeLike(String value) {
            addCriterion("no_describe like", value, "noDescribe");
            return (Criteria) this;
        }

        public Criteria andNoDescribeNotLike(String value) {
            addCriterion("no_describe not like", value, "noDescribe");
            return (Criteria) this;
        }

        public Criteria andNoDescribeIn(List<String> values) {
            addCriterion("no_describe in", values, "noDescribe");
            return (Criteria) this;
        }

        public Criteria andNoDescribeNotIn(List<String> values) {
            addCriterion("no_describe not in", values, "noDescribe");
            return (Criteria) this;
        }

        public Criteria andNoDescribeBetween(String value1, String value2) {
            addCriterion("no_describe between", value1, value2, "noDescribe");
            return (Criteria) this;
        }

        public Criteria andNoDescribeNotBetween(String value1, String value2) {
            addCriterion("no_describe not between", value1, value2, "noDescribe");
            return (Criteria) this;
        }

        public Criteria andNoEnnameIsNull() {
            addCriterion("no_enname is null");
            return (Criteria) this;
        }

        public Criteria andNoEnnameIsNotNull() {
            addCriterion("no_enname is not null");
            return (Criteria) this;
        }

        public Criteria andNoEnnameEqualTo(String value) {
            addCriterion("no_enname =", value, "noEnname");
            return (Criteria) this;
        }

        public Criteria andNoEnnameNotEqualTo(String value) {
            addCriterion("no_enname <>", value, "noEnname");
            return (Criteria) this;
        }

        public Criteria andNoEnnameGreaterThan(String value) {
            addCriterion("no_enname >", value, "noEnname");
            return (Criteria) this;
        }

        public Criteria andNoEnnameGreaterThanOrEqualTo(String value) {
            addCriterion("no_enname >=", value, "noEnname");
            return (Criteria) this;
        }

        public Criteria andNoEnnameLessThan(String value) {
            addCriterion("no_enname <", value, "noEnname");
            return (Criteria) this;
        }

        public Criteria andNoEnnameLessThanOrEqualTo(String value) {
            addCriterion("no_enname <=", value, "noEnname");
            return (Criteria) this;
        }

        public Criteria andNoEnnameLike(String value) {
            addCriterion("no_enname like", value, "noEnname");
            return (Criteria) this;
        }

        public Criteria andNoEnnameNotLike(String value) {
            addCriterion("no_enname not like", value, "noEnname");
            return (Criteria) this;
        }

        public Criteria andNoEnnameIn(List<String> values) {
            addCriterion("no_enname in", values, "noEnname");
            return (Criteria) this;
        }

        public Criteria andNoEnnameNotIn(List<String> values) {
            addCriterion("no_enname not in", values, "noEnname");
            return (Criteria) this;
        }

        public Criteria andNoEnnameBetween(String value1, String value2) {
            addCriterion("no_enname between", value1, value2, "noEnname");
            return (Criteria) this;
        }

        public Criteria andNoEnnameNotBetween(String value1, String value2) {
            addCriterion("no_enname not between", value1, value2, "noEnname");
            return (Criteria) this;
        }

        public Criteria andNoEnuuIsNull() {
            addCriterion("no_enuu is null");
            return (Criteria) this;
        }

        public Criteria andNoEnuuIsNotNull() {
            addCriterion("no_enuu is not null");
            return (Criteria) this;
        }

        public Criteria andNoEnuuEqualTo(Long value) {
            addCriterion("no_enuu =", value, "noEnuu");
            return (Criteria) this;
        }

        public Criteria andNoEnuuNotEqualTo(Long value) {
            addCriterion("no_enuu <>", value, "noEnuu");
            return (Criteria) this;
        }

        public Criteria andNoEnuuGreaterThan(Long value) {
            addCriterion("no_enuu >", value, "noEnuu");
            return (Criteria) this;
        }

        public Criteria andNoEnuuGreaterThanOrEqualTo(Long value) {
            addCriterion("no_enuu >=", value, "noEnuu");
            return (Criteria) this;
        }

        public Criteria andNoEnuuLessThan(Long value) {
            addCriterion("no_enuu <", value, "noEnuu");
            return (Criteria) this;
        }

        public Criteria andNoEnuuLessThanOrEqualTo(Long value) {
            addCriterion("no_enuu <=", value, "noEnuu");
            return (Criteria) this;
        }

        public Criteria andNoEnuuIn(List<Long> values) {
            addCriterion("no_enuu in", values, "noEnuu");
            return (Criteria) this;
        }

        public Criteria andNoEnuuNotIn(List<Long> values) {
            addCriterion("no_enuu not in", values, "noEnuu");
            return (Criteria) this;
        }

        public Criteria andNoEnuuBetween(Long value1, Long value2) {
            addCriterion("no_enuu between", value1, value2, "noEnuu");
            return (Criteria) this;
        }

        public Criteria andNoEnuuNotBetween(Long value1, Long value2) {
            addCriterion("no_enuu not between", value1, value2, "noEnuu");
            return (Criteria) this;
        }

        public Criteria andNoKindIsNull() {
            addCriterion("no_kind is null");
            return (Criteria) this;
        }

        public Criteria andNoKindIsNotNull() {
            addCriterion("no_kind is not null");
            return (Criteria) this;
        }

        public Criteria andNoKindEqualTo(String value) {
            addCriterion("no_kind =", value, "noKind");
            return (Criteria) this;
        }

        public Criteria andNoKindNotEqualTo(String value) {
            addCriterion("no_kind <>", value, "noKind");
            return (Criteria) this;
        }

        public Criteria andNoKindGreaterThan(String value) {
            addCriterion("no_kind >", value, "noKind");
            return (Criteria) this;
        }

        public Criteria andNoKindGreaterThanOrEqualTo(String value) {
            addCriterion("no_kind >=", value, "noKind");
            return (Criteria) this;
        }

        public Criteria andNoKindLessThan(String value) {
            addCriterion("no_kind <", value, "noKind");
            return (Criteria) this;
        }

        public Criteria andNoKindLessThanOrEqualTo(String value) {
            addCriterion("no_kind <=", value, "noKind");
            return (Criteria) this;
        }

        public Criteria andNoKindLike(String value) {
            addCriterion("no_kind like", value, "noKind");
            return (Criteria) this;
        }

        public Criteria andNoKindNotLike(String value) {
            addCriterion("no_kind not like", value, "noKind");
            return (Criteria) this;
        }

        public Criteria andNoKindIn(List<String> values) {
            addCriterion("no_kind in", values, "noKind");
            return (Criteria) this;
        }

        public Criteria andNoKindNotIn(List<String> values) {
            addCriterion("no_kind not in", values, "noKind");
            return (Criteria) this;
        }

        public Criteria andNoKindBetween(String value1, String value2) {
            addCriterion("no_kind between", value1, value2, "noKind");
            return (Criteria) this;
        }

        public Criteria andNoKindNotBetween(String value1, String value2) {
            addCriterion("no_kind not between", value1, value2, "noKind");
            return (Criteria) this;
        }

        public Criteria andNoErrcountIsNull() {
            addCriterion("no_errcount is null");
            return (Criteria) this;
        }

        public Criteria andNoErrcountIsNotNull() {
            addCriterion("no_errcount is not null");
            return (Criteria) this;
        }

        public Criteria andNoErrcountEqualTo(Integer value) {
            addCriterion("no_errcount =", value, "noErrcount");
            return (Criteria) this;
        }

        public Criteria andNoErrcountNotEqualTo(Integer value) {
            addCriterion("no_errcount <>", value, "noErrcount");
            return (Criteria) this;
        }

        public Criteria andNoErrcountGreaterThan(Integer value) {
            addCriterion("no_errcount >", value, "noErrcount");
            return (Criteria) this;
        }

        public Criteria andNoErrcountGreaterThanOrEqualTo(Integer value) {
            addCriterion("no_errcount >=", value, "noErrcount");
            return (Criteria) this;
        }

        public Criteria andNoErrcountLessThan(Integer value) {
            addCriterion("no_errcount <", value, "noErrcount");
            return (Criteria) this;
        }

        public Criteria andNoErrcountLessThanOrEqualTo(Integer value) {
            addCriterion("no_errcount <=", value, "noErrcount");
            return (Criteria) this;
        }

        public Criteria andNoErrcountIn(List<Integer> values) {
            addCriterion("no_errcount in", values, "noErrcount");
            return (Criteria) this;
        }

        public Criteria andNoErrcountNotIn(List<Integer> values) {
            addCriterion("no_errcount not in", values, "noErrcount");
            return (Criteria) this;
        }

        public Criteria andNoErrcountBetween(Integer value1, Integer value2) {
            addCriterion("no_errcount between", value1, value2, "noErrcount");
            return (Criteria) this;
        }

        public Criteria andNoErrcountNotBetween(Integer value1, Integer value2) {
            addCriterion("no_errcount not between", value1, value2, "noErrcount");
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