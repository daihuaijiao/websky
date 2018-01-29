package com.websky.pojo;

import java.util.ArrayList;
import java.util.List;

public class KucunbianhuaExample {
    protected String orderByClause;
    protected String groupByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public KucunbianhuaExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setGroupByClause(String groupByClause) {
    	this.groupByClause = groupByClause;
    }
    
    public String getGroupByClause() {
    	return groupByClause;
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

        public Criteria andItmCdIsNull() {
            addCriterion("itm_cd is null");
            return (Criteria) this;
        }

        public Criteria andItmCdIsNotNull() {
            addCriterion("itm_cd is not null");
            return (Criteria) this;
        }

        public Criteria andItmCdEqualTo(String value) {
            addCriterion("itm_cd =", value, "itmCd");
            return (Criteria) this;
        }

        public Criteria andItmCdNotEqualTo(String value) {
            addCriterion("itm_cd <>", value, "itmCd");
            return (Criteria) this;
        }

        public Criteria andItmCdGreaterThan(String value) {
            addCriterion("itm_cd >", value, "itmCd");
            return (Criteria) this;
        }

        public Criteria andItmCdGreaterThanOrEqualTo(String value) {
            addCriterion("itm_cd >=", value, "itmCd");
            return (Criteria) this;
        }

        public Criteria andItmCdLessThan(String value) {
            addCriterion("itm_cd <", value, "itmCd");
            return (Criteria) this;
        }

        public Criteria andItmCdLessThanOrEqualTo(String value) {
            addCriterion("itm_cd <=", value, "itmCd");
            return (Criteria) this;
        }

        public Criteria andItmCdLike(String value) {
            addCriterion("itm_cd like", value, "itmCd");
            return (Criteria) this;
        }

        public Criteria andItmCdNotLike(String value) {
            addCriterion("itm_cd not like", value, "itmCd");
            return (Criteria) this;
        }

        public Criteria andItmCdIn(List<String> values) {
            addCriterion("itm_cd in", values, "itmCd");
            return (Criteria) this;
        }

        public Criteria andItmCdNotIn(List<String> values) {
            addCriterion("itm_cd not in", values, "itmCd");
            return (Criteria) this;
        }

        public Criteria andItmCdBetween(String value1, String value2) {
            addCriterion("itm_cd between", value1, value2, "itmCd");
            return (Criteria) this;
        }

        public Criteria andItmCdNotBetween(String value1, String value2) {
            addCriterion("itm_cd not between", value1, value2, "itmCd");
            return (Criteria) this;
        }

        public Criteria andDateIsNull() {
            addCriterion("date is null");
            return (Criteria) this;
        }

        public Criteria andDateIsNotNull() {
            addCriterion("date is not null");
            return (Criteria) this;
        }

        public Criteria andDateEqualTo(Long value) {
            addCriterion("date =", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotEqualTo(Long value) {
            addCriterion("date <>", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThan(Long value) {
            addCriterion("date >", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThanOrEqualTo(Long value) {
            addCriterion("date >=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThan(Long value) {
            addCriterion("date <", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThanOrEqualTo(Long value) {
            addCriterion("date <=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateIn(List<Long> values) {
            addCriterion("date in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotIn(List<Long> values) {
            addCriterion("date not in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateBetween(Long value1, Long value2) {
            addCriterion("date between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotBetween(Long value1, Long value2) {
            addCriterion("date not between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andKcNumIsNull() {
            addCriterion("kc_num is null");
            return (Criteria) this;
        }

        public Criteria andKcNumIsNotNull() {
            addCriterion("kc_num is not null");
            return (Criteria) this;
        }

        public Criteria andKcNumEqualTo(Integer value) {
            addCriterion("kc_num =", value, "kcNum");
            return (Criteria) this;
        }

        public Criteria andKcNumNotEqualTo(Integer value) {
            addCriterion("kc_num <>", value, "kcNum");
            return (Criteria) this;
        }

        public Criteria andKcNumGreaterThan(Integer value) {
            addCriterion("kc_num >", value, "kcNum");
            return (Criteria) this;
        }

        public Criteria andKcNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("kc_num >=", value, "kcNum");
            return (Criteria) this;
        }

        public Criteria andKcNumLessThan(Integer value) {
            addCriterion("kc_num <", value, "kcNum");
            return (Criteria) this;
        }

        public Criteria andKcNumLessThanOrEqualTo(Integer value) {
            addCriterion("kc_num <=", value, "kcNum");
            return (Criteria) this;
        }

        public Criteria andKcNumIn(List<Integer> values) {
            addCriterion("kc_num in", values, "kcNum");
            return (Criteria) this;
        }

        public Criteria andKcNumNotIn(List<Integer> values) {
            addCriterion("kc_num not in", values, "kcNum");
            return (Criteria) this;
        }

        public Criteria andKcNumBetween(Integer value1, Integer value2) {
            addCriterion("kc_num between", value1, value2, "kcNum");
            return (Criteria) this;
        }

        public Criteria andKcNumNotBetween(Integer value1, Integer value2) {
            addCriterion("kc_num not between", value1, value2, "kcNum");
            return (Criteria) this;
        }

        public Criteria andRkNumIsNull() {
            addCriterion("rk_num is null");
            return (Criteria) this;
        }

        public Criteria andRkNumIsNotNull() {
            addCriterion("rk_num is not null");
            return (Criteria) this;
        }

        public Criteria andRkNumEqualTo(Integer value) {
            addCriterion("rk_num =", value, "rkNum");
            return (Criteria) this;
        }

        public Criteria andRkNumNotEqualTo(Integer value) {
            addCriterion("rk_num <>", value, "rkNum");
            return (Criteria) this;
        }

        public Criteria andRkNumGreaterThan(Integer value) {
            addCriterion("rk_num >", value, "rkNum");
            return (Criteria) this;
        }

        public Criteria andRkNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("rk_num >=", value, "rkNum");
            return (Criteria) this;
        }

        public Criteria andRkNumLessThan(Integer value) {
            addCriterion("rk_num <", value, "rkNum");
            return (Criteria) this;
        }

        public Criteria andRkNumLessThanOrEqualTo(Integer value) {
            addCriterion("rk_num <=", value, "rkNum");
            return (Criteria) this;
        }

        public Criteria andRkNumIn(List<Integer> values) {
            addCriterion("rk_num in", values, "rkNum");
            return (Criteria) this;
        }

        public Criteria andRkNumNotIn(List<Integer> values) {
            addCriterion("rk_num not in", values, "rkNum");
            return (Criteria) this;
        }

        public Criteria andRkNumBetween(Integer value1, Integer value2) {
            addCriterion("rk_num between", value1, value2, "rkNum");
            return (Criteria) this;
        }

        public Criteria andRkNumNotBetween(Integer value1, Integer value2) {
            addCriterion("rk_num not between", value1, value2, "rkNum");
            return (Criteria) this;
        }

        public Criteria andCkNumIsNull() {
            addCriterion("ck_num is null");
            return (Criteria) this;
        }

        public Criteria andCkNumIsNotNull() {
            addCriterion("ck_num is not null");
            return (Criteria) this;
        }

        public Criteria andCkNumEqualTo(Integer value) {
            addCriterion("ck_num =", value, "ckNum");
            return (Criteria) this;
        }

        public Criteria andCkNumNotEqualTo(Integer value) {
            addCriterion("ck_num <>", value, "ckNum");
            return (Criteria) this;
        }

        public Criteria andCkNumGreaterThan(Integer value) {
            addCriterion("ck_num >", value, "ckNum");
            return (Criteria) this;
        }

        public Criteria andCkNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("ck_num >=", value, "ckNum");
            return (Criteria) this;
        }

        public Criteria andCkNumLessThan(Integer value) {
            addCriterion("ck_num <", value, "ckNum");
            return (Criteria) this;
        }

        public Criteria andCkNumLessThanOrEqualTo(Integer value) {
            addCriterion("ck_num <=", value, "ckNum");
            return (Criteria) this;
        }

        public Criteria andCkNumIn(List<Integer> values) {
            addCriterion("ck_num in", values, "ckNum");
            return (Criteria) this;
        }

        public Criteria andCkNumNotIn(List<Integer> values) {
            addCriterion("ck_num not in", values, "ckNum");
            return (Criteria) this;
        }

        public Criteria andCkNumBetween(Integer value1, Integer value2) {
            addCriterion("ck_num between", value1, value2, "ckNum");
            return (Criteria) this;
        }

        public Criteria andCkNumNotBetween(Integer value1, Integer value2) {
            addCriterion("ck_num not between", value1, value2, "ckNum");
            return (Criteria) this;
        }

        public Criteria andZkNumIsNull() {
            addCriterion("zk_num is null");
            return (Criteria) this;
        }

        public Criteria andZkNumIsNotNull() {
            addCriterion("zk_num is not null");
            return (Criteria) this;
        }

        public Criteria andZkNumEqualTo(Integer value) {
            addCriterion("zk_num =", value, "zkNum");
            return (Criteria) this;
        }

        public Criteria andZkNumNotEqualTo(Integer value) {
            addCriterion("zk_num <>", value, "zkNum");
            return (Criteria) this;
        }

        public Criteria andZkNumGreaterThan(Integer value) {
            addCriterion("zk_num >", value, "zkNum");
            return (Criteria) this;
        }

        public Criteria andZkNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("zk_num >=", value, "zkNum");
            return (Criteria) this;
        }

        public Criteria andZkNumLessThan(Integer value) {
            addCriterion("zk_num <", value, "zkNum");
            return (Criteria) this;
        }

        public Criteria andZkNumLessThanOrEqualTo(Integer value) {
            addCriterion("zk_num <=", value, "zkNum");
            return (Criteria) this;
        }

        public Criteria andZkNumIn(List<Integer> values) {
            addCriterion("zk_num in", values, "zkNum");
            return (Criteria) this;
        }

        public Criteria andZkNumNotIn(List<Integer> values) {
            addCriterion("zk_num not in", values, "zkNum");
            return (Criteria) this;
        }

        public Criteria andZkNumBetween(Integer value1, Integer value2) {
            addCriterion("zk_num between", value1, value2, "zkNum");
            return (Criteria) this;
        }

        public Criteria andZkNumNotBetween(Integer value1, Integer value2) {
            addCriterion("zk_num not between", value1, value2, "zkNum");
            return (Criteria) this;
        }

        public Criteria andTempIsNull() {
            addCriterion("temp is null");
            return (Criteria) this;
        }

        public Criteria andTempIsNotNull() {
            addCriterion("temp is not null");
            return (Criteria) this;
        }

        public Criteria andTempEqualTo(Integer value) {
            addCriterion("temp =", value, "temp");
            return (Criteria) this;
        }

        public Criteria andTempNotEqualTo(Integer value) {
            addCriterion("temp <>", value, "temp");
            return (Criteria) this;
        }

        public Criteria andTempGreaterThan(Integer value) {
            addCriterion("temp >", value, "temp");
            return (Criteria) this;
        }

        public Criteria andTempGreaterThanOrEqualTo(Integer value) {
            addCriterion("temp >=", value, "temp");
            return (Criteria) this;
        }

        public Criteria andTempLessThan(Integer value) {
            addCriterion("temp <", value, "temp");
            return (Criteria) this;
        }

        public Criteria andTempLessThanOrEqualTo(Integer value) {
            addCriterion("temp <=", value, "temp");
            return (Criteria) this;
        }

        public Criteria andTempIn(List<Integer> values) {
            addCriterion("temp in", values, "temp");
            return (Criteria) this;
        }

        public Criteria andTempNotIn(List<Integer> values) {
            addCriterion("temp not in", values, "temp");
            return (Criteria) this;
        }

        public Criteria andTempBetween(Integer value1, Integer value2) {
            addCriterion("temp between", value1, value2, "temp");
            return (Criteria) this;
        }

        public Criteria andTempNotBetween(Integer value1, Integer value2) {
            addCriterion("temp not between", value1, value2, "temp");
            return (Criteria) this;
        }

        public Criteria andKctzDayIsNull() {
            addCriterion("kctz_day is null");
            return (Criteria) this;
        }

        public Criteria andKctzDayIsNotNull() {
            addCriterion("kctz_day is not null");
            return (Criteria) this;
        }

        public Criteria andKctzDayEqualTo(Integer value) {
            addCriterion("kctz_day =", value, "kctzDay");
            return (Criteria) this;
        }

        public Criteria andKctzDayNotEqualTo(Integer value) {
            addCriterion("kctz_day <>", value, "kctzDay");
            return (Criteria) this;
        }

        public Criteria andKctzDayGreaterThan(Integer value) {
            addCriterion("kctz_day >", value, "kctzDay");
            return (Criteria) this;
        }

        public Criteria andKctzDayGreaterThanOrEqualTo(Integer value) {
            addCriterion("kctz_day >=", value, "kctzDay");
            return (Criteria) this;
        }

        public Criteria andKctzDayLessThan(Integer value) {
            addCriterion("kctz_day <", value, "kctzDay");
            return (Criteria) this;
        }

        public Criteria andKctzDayLessThanOrEqualTo(Integer value) {
            addCriterion("kctz_day <=", value, "kctzDay");
            return (Criteria) this;
        }

        public Criteria andKctzDayIn(List<Integer> values) {
            addCriterion("kctz_day in", values, "kctzDay");
            return (Criteria) this;
        }

        public Criteria andKctzDayNotIn(List<Integer> values) {
            addCriterion("kctz_day not in", values, "kctzDay");
            return (Criteria) this;
        }

        public Criteria andKctzDayBetween(Integer value1, Integer value2) {
            addCriterion("kctz_day between", value1, value2, "kctzDay");
            return (Criteria) this;
        }

        public Criteria andKctzDayNotBetween(Integer value1, Integer value2) {
            addCriterion("kctz_day not between", value1, value2, "kctzDay");
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