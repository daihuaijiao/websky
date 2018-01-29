package com.websky.pojo;

import java.util.ArrayList;
import java.util.List;

public class SandianExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SandianExample() {
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

        public Criteria andTotalIsNull() {
            addCriterion("total is null");
            return (Criteria) this;
        }

        public Criteria andTotalIsNotNull() {
            addCriterion("total is not null");
            return (Criteria) this;
        }

        public Criteria andTotalEqualTo(Long value) {
            addCriterion("total =", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalNotEqualTo(Long value) {
            addCriterion("total <>", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalGreaterThan(Long value) {
            addCriterion("total >", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalGreaterThanOrEqualTo(Long value) {
            addCriterion("total >=", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalLessThan(Long value) {
            addCriterion("total <", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalLessThanOrEqualTo(Long value) {
            addCriterion("total <=", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalIn(List<Long> values) {
            addCriterion("total in", values, "total");
            return (Criteria) this;
        }

        public Criteria andTotalNotIn(List<Long> values) {
            addCriterion("total not in", values, "total");
            return (Criteria) this;
        }

        public Criteria andTotalBetween(Long value1, Long value2) {
            addCriterion("total between", value1, value2, "total");
            return (Criteria) this;
        }

        public Criteria andTotalNotBetween(Long value1, Long value2) {
            addCriterion("total not between", value1, value2, "total");
            return (Criteria) this;
        }

        public Criteria andMassIsNull() {
            addCriterion("mass is null");
            return (Criteria) this;
        }

        public Criteria andMassIsNotNull() {
            addCriterion("mass is not null");
            return (Criteria) this;
        }

        public Criteria andMassEqualTo(String value) {
            addCriterion("mass =", value, "mass");
            return (Criteria) this;
        }

        public Criteria andMassNotEqualTo(String value) {
            addCriterion("mass <>", value, "mass");
            return (Criteria) this;
        }

        public Criteria andMassGreaterThan(String value) {
            addCriterion("mass >", value, "mass");
            return (Criteria) this;
        }

        public Criteria andMassGreaterThanOrEqualTo(String value) {
            addCriterion("mass >=", value, "mass");
            return (Criteria) this;
        }

        public Criteria andMassLessThan(String value) {
            addCriterion("mass <", value, "mass");
            return (Criteria) this;
        }

        public Criteria andMassLessThanOrEqualTo(String value) {
            addCriterion("mass <=", value, "mass");
            return (Criteria) this;
        }

        public Criteria andMassLike(String value) {
            addCriterion("mass like", value, "mass");
            return (Criteria) this;
        }

        public Criteria andMassNotLike(String value) {
            addCriterion("mass not like", value, "mass");
            return (Criteria) this;
        }

        public Criteria andMassIn(List<String> values) {
            addCriterion("mass in", values, "mass");
            return (Criteria) this;
        }

        public Criteria andMassNotIn(List<String> values) {
            addCriterion("mass not in", values, "mass");
            return (Criteria) this;
        }

        public Criteria andMassBetween(String value1, String value2) {
            addCriterion("mass between", value1, value2, "mass");
            return (Criteria) this;
        }

        public Criteria andMassNotBetween(String value1, String value2) {
            addCriterion("mass not between", value1, value2, "mass");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(Long value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(Long value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(Long value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(Long value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(Long value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(Long value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<Long> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<Long> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(Long value1, Long value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(Long value1, Long value2) {
            addCriterion("price not between", value1, value2, "price");
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