package com.websky.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SvrMsgTblExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SvrMsgTblExample() {
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

        public Criteria andBusSecCdIsNull() {
            addCriterion("BUS_SEC_CD is null");
            return (Criteria) this;
        }

        public Criteria andBusSecCdIsNotNull() {
            addCriterion("BUS_SEC_CD is not null");
            return (Criteria) this;
        }

        public Criteria andBusSecCdEqualTo(String value) {
            addCriterion("BUS_SEC_CD =", value, "busSecCd");
            return (Criteria) this;
        }

        public Criteria andBusSecCdNotEqualTo(String value) {
            addCriterion("BUS_SEC_CD <>", value, "busSecCd");
            return (Criteria) this;
        }

        public Criteria andBusSecCdGreaterThan(String value) {
            addCriterion("BUS_SEC_CD >", value, "busSecCd");
            return (Criteria) this;
        }

        public Criteria andBusSecCdGreaterThanOrEqualTo(String value) {
            addCriterion("BUS_SEC_CD >=", value, "busSecCd");
            return (Criteria) this;
        }

        public Criteria andBusSecCdLessThan(String value) {
            addCriterion("BUS_SEC_CD <", value, "busSecCd");
            return (Criteria) this;
        }

        public Criteria andBusSecCdLessThanOrEqualTo(String value) {
            addCriterion("BUS_SEC_CD <=", value, "busSecCd");
            return (Criteria) this;
        }

        public Criteria andBusSecCdLike(String value) {
            addCriterion("BUS_SEC_CD like", value, "busSecCd");
            return (Criteria) this;
        }

        public Criteria andBusSecCdNotLike(String value) {
            addCriterion("BUS_SEC_CD not like", value, "busSecCd");
            return (Criteria) this;
        }

        public Criteria andBusSecCdIn(List<String> values) {
            addCriterion("BUS_SEC_CD in", values, "busSecCd");
            return (Criteria) this;
        }

        public Criteria andBusSecCdNotIn(List<String> values) {
            addCriterion("BUS_SEC_CD not in", values, "busSecCd");
            return (Criteria) this;
        }

        public Criteria andBusSecCdBetween(String value1, String value2) {
            addCriterion("BUS_SEC_CD between", value1, value2, "busSecCd");
            return (Criteria) this;
        }

        public Criteria andBusSecCdNotBetween(String value1, String value2) {
            addCriterion("BUS_SEC_CD not between", value1, value2, "busSecCd");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSeqIsNull() {
            addCriterion("SVR_MSG_SEQ is null");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSeqIsNotNull() {
            addCriterion("SVR_MSG_SEQ is not null");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSeqEqualTo(Integer value) {
            addCriterion("SVR_MSG_SEQ =", value, "svrMsgSeq");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSeqNotEqualTo(Integer value) {
            addCriterion("SVR_MSG_SEQ <>", value, "svrMsgSeq");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSeqGreaterThan(Integer value) {
            addCriterion("SVR_MSG_SEQ >", value, "svrMsgSeq");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSeqGreaterThanOrEqualTo(Integer value) {
            addCriterion("SVR_MSG_SEQ >=", value, "svrMsgSeq");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSeqLessThan(Integer value) {
            addCriterion("SVR_MSG_SEQ <", value, "svrMsgSeq");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSeqLessThanOrEqualTo(Integer value) {
            addCriterion("SVR_MSG_SEQ <=", value, "svrMsgSeq");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSeqIn(List<Integer> values) {
            addCriterion("SVR_MSG_SEQ in", values, "svrMsgSeq");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSeqNotIn(List<Integer> values) {
            addCriterion("SVR_MSG_SEQ not in", values, "svrMsgSeq");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSeqBetween(Integer value1, Integer value2) {
            addCriterion("SVR_MSG_SEQ between", value1, value2, "svrMsgSeq");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSeqNotBetween(Integer value1, Integer value2) {
            addCriterion("SVR_MSG_SEQ not between", value1, value2, "svrMsgSeq");
            return (Criteria) this;
        }

        public Criteria andSvrPrgNmIsNull() {
            addCriterion("SVR_PRG_NM is null");
            return (Criteria) this;
        }

        public Criteria andSvrPrgNmIsNotNull() {
            addCriterion("SVR_PRG_NM is not null");
            return (Criteria) this;
        }

        public Criteria andSvrPrgNmEqualTo(String value) {
            addCriterion("SVR_PRG_NM =", value, "svrPrgNm");
            return (Criteria) this;
        }

        public Criteria andSvrPrgNmNotEqualTo(String value) {
            addCriterion("SVR_PRG_NM <>", value, "svrPrgNm");
            return (Criteria) this;
        }

        public Criteria andSvrPrgNmGreaterThan(String value) {
            addCriterion("SVR_PRG_NM >", value, "svrPrgNm");
            return (Criteria) this;
        }

        public Criteria andSvrPrgNmGreaterThanOrEqualTo(String value) {
            addCriterion("SVR_PRG_NM >=", value, "svrPrgNm");
            return (Criteria) this;
        }

        public Criteria andSvrPrgNmLessThan(String value) {
            addCriterion("SVR_PRG_NM <", value, "svrPrgNm");
            return (Criteria) this;
        }

        public Criteria andSvrPrgNmLessThanOrEqualTo(String value) {
            addCriterion("SVR_PRG_NM <=", value, "svrPrgNm");
            return (Criteria) this;
        }

        public Criteria andSvrPrgNmLike(String value) {
            addCriterion("SVR_PRG_NM like", value, "svrPrgNm");
            return (Criteria) this;
        }

        public Criteria andSvrPrgNmNotLike(String value) {
            addCriterion("SVR_PRG_NM not like", value, "svrPrgNm");
            return (Criteria) this;
        }

        public Criteria andSvrPrgNmIn(List<String> values) {
            addCriterion("SVR_PRG_NM in", values, "svrPrgNm");
            return (Criteria) this;
        }

        public Criteria andSvrPrgNmNotIn(List<String> values) {
            addCriterion("SVR_PRG_NM not in", values, "svrPrgNm");
            return (Criteria) this;
        }

        public Criteria andSvrPrgNmBetween(String value1, String value2) {
            addCriterion("SVR_PRG_NM between", value1, value2, "svrPrgNm");
            return (Criteria) this;
        }

        public Criteria andSvrPrgNmNotBetween(String value1, String value2) {
            addCriterion("SVR_PRG_NM not between", value1, value2, "svrPrgNm");
            return (Criteria) this;
        }

        public Criteria andSvrUsrIdIsNull() {
            addCriterion("SVR_USR_ID is null");
            return (Criteria) this;
        }

        public Criteria andSvrUsrIdIsNotNull() {
            addCriterion("SVR_USR_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSvrUsrIdEqualTo(String value) {
            addCriterion("SVR_USR_ID =", value, "svrUsrId");
            return (Criteria) this;
        }

        public Criteria andSvrUsrIdNotEqualTo(String value) {
            addCriterion("SVR_USR_ID <>", value, "svrUsrId");
            return (Criteria) this;
        }

        public Criteria andSvrUsrIdGreaterThan(String value) {
            addCriterion("SVR_USR_ID >", value, "svrUsrId");
            return (Criteria) this;
        }

        public Criteria andSvrUsrIdGreaterThanOrEqualTo(String value) {
            addCriterion("SVR_USR_ID >=", value, "svrUsrId");
            return (Criteria) this;
        }

        public Criteria andSvrUsrIdLessThan(String value) {
            addCriterion("SVR_USR_ID <", value, "svrUsrId");
            return (Criteria) this;
        }

        public Criteria andSvrUsrIdLessThanOrEqualTo(String value) {
            addCriterion("SVR_USR_ID <=", value, "svrUsrId");
            return (Criteria) this;
        }

        public Criteria andSvrUsrIdLike(String value) {
            addCriterion("SVR_USR_ID like", value, "svrUsrId");
            return (Criteria) this;
        }

        public Criteria andSvrUsrIdNotLike(String value) {
            addCriterion("SVR_USR_ID not like", value, "svrUsrId");
            return (Criteria) this;
        }

        public Criteria andSvrUsrIdIn(List<String> values) {
            addCriterion("SVR_USR_ID in", values, "svrUsrId");
            return (Criteria) this;
        }

        public Criteria andSvrUsrIdNotIn(List<String> values) {
            addCriterion("SVR_USR_ID not in", values, "svrUsrId");
            return (Criteria) this;
        }

        public Criteria andSvrUsrIdBetween(String value1, String value2) {
            addCriterion("SVR_USR_ID between", value1, value2, "svrUsrId");
            return (Criteria) this;
        }

        public Criteria andSvrUsrIdNotBetween(String value1, String value2) {
            addCriterion("SVR_USR_ID not between", value1, value2, "svrUsrId");
            return (Criteria) this;
        }

        public Criteria andSvrStartTimeIsNull() {
            addCriterion("SVR_START_TIME is null");
            return (Criteria) this;
        }

        public Criteria andSvrStartTimeIsNotNull() {
            addCriterion("SVR_START_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andSvrStartTimeEqualTo(Date value) {
            addCriterion("SVR_START_TIME =", value, "svrStartTime");
            return (Criteria) this;
        }

        public Criteria andSvrStartTimeNotEqualTo(Date value) {
            addCriterion("SVR_START_TIME <>", value, "svrStartTime");
            return (Criteria) this;
        }

        public Criteria andSvrStartTimeGreaterThan(Date value) {
            addCriterion("SVR_START_TIME >", value, "svrStartTime");
            return (Criteria) this;
        }

        public Criteria andSvrStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("SVR_START_TIME >=", value, "svrStartTime");
            return (Criteria) this;
        }

        public Criteria andSvrStartTimeLessThan(Date value) {
            addCriterion("SVR_START_TIME <", value, "svrStartTime");
            return (Criteria) this;
        }

        public Criteria andSvrStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("SVR_START_TIME <=", value, "svrStartTime");
            return (Criteria) this;
        }

        public Criteria andSvrStartTimeIn(List<Date> values) {
            addCriterion("SVR_START_TIME in", values, "svrStartTime");
            return (Criteria) this;
        }

        public Criteria andSvrStartTimeNotIn(List<Date> values) {
            addCriterion("SVR_START_TIME not in", values, "svrStartTime");
            return (Criteria) this;
        }

        public Criteria andSvrStartTimeBetween(Date value1, Date value2) {
            addCriterion("SVR_START_TIME between", value1, value2, "svrStartTime");
            return (Criteria) this;
        }

        public Criteria andSvrStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("SVR_START_TIME not between", value1, value2, "svrStartTime");
            return (Criteria) this;
        }

        public Criteria andSvrEndTimeIsNull() {
            addCriterion("SVR_END_TIME is null");
            return (Criteria) this;
        }

        public Criteria andSvrEndTimeIsNotNull() {
            addCriterion("SVR_END_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andSvrEndTimeEqualTo(Date value) {
            addCriterion("SVR_END_TIME =", value, "svrEndTime");
            return (Criteria) this;
        }

        public Criteria andSvrEndTimeNotEqualTo(Date value) {
            addCriterion("SVR_END_TIME <>", value, "svrEndTime");
            return (Criteria) this;
        }

        public Criteria andSvrEndTimeGreaterThan(Date value) {
            addCriterion("SVR_END_TIME >", value, "svrEndTime");
            return (Criteria) this;
        }

        public Criteria andSvrEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("SVR_END_TIME >=", value, "svrEndTime");
            return (Criteria) this;
        }

        public Criteria andSvrEndTimeLessThan(Date value) {
            addCriterion("SVR_END_TIME <", value, "svrEndTime");
            return (Criteria) this;
        }

        public Criteria andSvrEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("SVR_END_TIME <=", value, "svrEndTime");
            return (Criteria) this;
        }

        public Criteria andSvrEndTimeIn(List<Date> values) {
            addCriterion("SVR_END_TIME in", values, "svrEndTime");
            return (Criteria) this;
        }

        public Criteria andSvrEndTimeNotIn(List<Date> values) {
            addCriterion("SVR_END_TIME not in", values, "svrEndTime");
            return (Criteria) this;
        }

        public Criteria andSvrEndTimeBetween(Date value1, Date value2) {
            addCriterion("SVR_END_TIME between", value1, value2, "svrEndTime");
            return (Criteria) this;
        }

        public Criteria andSvrEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("SVR_END_TIME not between", value1, value2, "svrEndTime");
            return (Criteria) this;
        }

        public Criteria andSvrReturnCdIsNull() {
            addCriterion("SVR_RETURN_CD is null");
            return (Criteria) this;
        }

        public Criteria andSvrReturnCdIsNotNull() {
            addCriterion("SVR_RETURN_CD is not null");
            return (Criteria) this;
        }

        public Criteria andSvrReturnCdEqualTo(String value) {
            addCriterion("SVR_RETURN_CD =", value, "svrReturnCd");
            return (Criteria) this;
        }

        public Criteria andSvrReturnCdNotEqualTo(String value) {
            addCriterion("SVR_RETURN_CD <>", value, "svrReturnCd");
            return (Criteria) this;
        }

        public Criteria andSvrReturnCdGreaterThan(String value) {
            addCriterion("SVR_RETURN_CD >", value, "svrReturnCd");
            return (Criteria) this;
        }

        public Criteria andSvrReturnCdGreaterThanOrEqualTo(String value) {
            addCriterion("SVR_RETURN_CD >=", value, "svrReturnCd");
            return (Criteria) this;
        }

        public Criteria andSvrReturnCdLessThan(String value) {
            addCriterion("SVR_RETURN_CD <", value, "svrReturnCd");
            return (Criteria) this;
        }

        public Criteria andSvrReturnCdLessThanOrEqualTo(String value) {
            addCriterion("SVR_RETURN_CD <=", value, "svrReturnCd");
            return (Criteria) this;
        }

        public Criteria andSvrReturnCdLike(String value) {
            addCriterion("SVR_RETURN_CD like", value, "svrReturnCd");
            return (Criteria) this;
        }

        public Criteria andSvrReturnCdNotLike(String value) {
            addCriterion("SVR_RETURN_CD not like", value, "svrReturnCd");
            return (Criteria) this;
        }

        public Criteria andSvrReturnCdIn(List<String> values) {
            addCriterion("SVR_RETURN_CD in", values, "svrReturnCd");
            return (Criteria) this;
        }

        public Criteria andSvrReturnCdNotIn(List<String> values) {
            addCriterion("SVR_RETURN_CD not in", values, "svrReturnCd");
            return (Criteria) this;
        }

        public Criteria andSvrReturnCdBetween(String value1, String value2) {
            addCriterion("SVR_RETURN_CD between", value1, value2, "svrReturnCd");
            return (Criteria) this;
        }

        public Criteria andSvrReturnCdNotBetween(String value1, String value2) {
            addCriterion("SVR_RETURN_CD not between", value1, value2, "svrReturnCd");
            return (Criteria) this;
        }

        public Criteria andSvrNumNmlIsNull() {
            addCriterion("SVR_NUM_NML is null");
            return (Criteria) this;
        }

        public Criteria andSvrNumNmlIsNotNull() {
            addCriterion("SVR_NUM_NML is not null");
            return (Criteria) this;
        }

        public Criteria andSvrNumNmlEqualTo(Integer value) {
            addCriterion("SVR_NUM_NML =", value, "svrNumNml");
            return (Criteria) this;
        }

        public Criteria andSvrNumNmlNotEqualTo(Integer value) {
            addCriterion("SVR_NUM_NML <>", value, "svrNumNml");
            return (Criteria) this;
        }

        public Criteria andSvrNumNmlGreaterThan(Integer value) {
            addCriterion("SVR_NUM_NML >", value, "svrNumNml");
            return (Criteria) this;
        }

        public Criteria andSvrNumNmlGreaterThanOrEqualTo(Integer value) {
            addCriterion("SVR_NUM_NML >=", value, "svrNumNml");
            return (Criteria) this;
        }

        public Criteria andSvrNumNmlLessThan(Integer value) {
            addCriterion("SVR_NUM_NML <", value, "svrNumNml");
            return (Criteria) this;
        }

        public Criteria andSvrNumNmlLessThanOrEqualTo(Integer value) {
            addCriterion("SVR_NUM_NML <=", value, "svrNumNml");
            return (Criteria) this;
        }

        public Criteria andSvrNumNmlIn(List<Integer> values) {
            addCriterion("SVR_NUM_NML in", values, "svrNumNml");
            return (Criteria) this;
        }

        public Criteria andSvrNumNmlNotIn(List<Integer> values) {
            addCriterion("SVR_NUM_NML not in", values, "svrNumNml");
            return (Criteria) this;
        }

        public Criteria andSvrNumNmlBetween(Integer value1, Integer value2) {
            addCriterion("SVR_NUM_NML between", value1, value2, "svrNumNml");
            return (Criteria) this;
        }

        public Criteria andSvrNumNmlNotBetween(Integer value1, Integer value2) {
            addCriterion("SVR_NUM_NML not between", value1, value2, "svrNumNml");
            return (Criteria) this;
        }

        public Criteria andSvrNumAbnmlIsNull() {
            addCriterion("SVR_NUM_ABNML is null");
            return (Criteria) this;
        }

        public Criteria andSvrNumAbnmlIsNotNull() {
            addCriterion("SVR_NUM_ABNML is not null");
            return (Criteria) this;
        }

        public Criteria andSvrNumAbnmlEqualTo(Integer value) {
            addCriterion("SVR_NUM_ABNML =", value, "svrNumAbnml");
            return (Criteria) this;
        }

        public Criteria andSvrNumAbnmlNotEqualTo(Integer value) {
            addCriterion("SVR_NUM_ABNML <>", value, "svrNumAbnml");
            return (Criteria) this;
        }

        public Criteria andSvrNumAbnmlGreaterThan(Integer value) {
            addCriterion("SVR_NUM_ABNML >", value, "svrNumAbnml");
            return (Criteria) this;
        }

        public Criteria andSvrNumAbnmlGreaterThanOrEqualTo(Integer value) {
            addCriterion("SVR_NUM_ABNML >=", value, "svrNumAbnml");
            return (Criteria) this;
        }

        public Criteria andSvrNumAbnmlLessThan(Integer value) {
            addCriterion("SVR_NUM_ABNML <", value, "svrNumAbnml");
            return (Criteria) this;
        }

        public Criteria andSvrNumAbnmlLessThanOrEqualTo(Integer value) {
            addCriterion("SVR_NUM_ABNML <=", value, "svrNumAbnml");
            return (Criteria) this;
        }

        public Criteria andSvrNumAbnmlIn(List<Integer> values) {
            addCriterion("SVR_NUM_ABNML in", values, "svrNumAbnml");
            return (Criteria) this;
        }

        public Criteria andSvrNumAbnmlNotIn(List<Integer> values) {
            addCriterion("SVR_NUM_ABNML not in", values, "svrNumAbnml");
            return (Criteria) this;
        }

        public Criteria andSvrNumAbnmlBetween(Integer value1, Integer value2) {
            addCriterion("SVR_NUM_ABNML between", value1, value2, "svrNumAbnml");
            return (Criteria) this;
        }

        public Criteria andSvrNumAbnmlNotBetween(Integer value1, Integer value2) {
            addCriterion("SVR_NUM_ABNML not between", value1, value2, "svrNumAbnml");
            return (Criteria) this;
        }

        public Criteria andSvrHndiMsgIsNull() {
            addCriterion("SVR_HNDI_MSG is null");
            return (Criteria) this;
        }

        public Criteria andSvrHndiMsgIsNotNull() {
            addCriterion("SVR_HNDI_MSG is not null");
            return (Criteria) this;
        }

        public Criteria andSvrHndiMsgEqualTo(String value) {
            addCriterion("SVR_HNDI_MSG =", value, "svrHndiMsg");
            return (Criteria) this;
        }

        public Criteria andSvrHndiMsgNotEqualTo(String value) {
            addCriterion("SVR_HNDI_MSG <>", value, "svrHndiMsg");
            return (Criteria) this;
        }

        public Criteria andSvrHndiMsgGreaterThan(String value) {
            addCriterion("SVR_HNDI_MSG >", value, "svrHndiMsg");
            return (Criteria) this;
        }

        public Criteria andSvrHndiMsgGreaterThanOrEqualTo(String value) {
            addCriterion("SVR_HNDI_MSG >=", value, "svrHndiMsg");
            return (Criteria) this;
        }

        public Criteria andSvrHndiMsgLessThan(String value) {
            addCriterion("SVR_HNDI_MSG <", value, "svrHndiMsg");
            return (Criteria) this;
        }

        public Criteria andSvrHndiMsgLessThanOrEqualTo(String value) {
            addCriterion("SVR_HNDI_MSG <=", value, "svrHndiMsg");
            return (Criteria) this;
        }

        public Criteria andSvrHndiMsgLike(String value) {
            addCriterion("SVR_HNDI_MSG like", value, "svrHndiMsg");
            return (Criteria) this;
        }

        public Criteria andSvrHndiMsgNotLike(String value) {
            addCriterion("SVR_HNDI_MSG not like", value, "svrHndiMsg");
            return (Criteria) this;
        }

        public Criteria andSvrHndiMsgIn(List<String> values) {
            addCriterion("SVR_HNDI_MSG in", values, "svrHndiMsg");
            return (Criteria) this;
        }

        public Criteria andSvrHndiMsgNotIn(List<String> values) {
            addCriterion("SVR_HNDI_MSG not in", values, "svrHndiMsg");
            return (Criteria) this;
        }

        public Criteria andSvrHndiMsgBetween(String value1, String value2) {
            addCriterion("SVR_HNDI_MSG between", value1, value2, "svrHndiMsg");
            return (Criteria) this;
        }

        public Criteria andSvrHndiMsgNotBetween(String value1, String value2) {
            addCriterion("SVR_HNDI_MSG not between", value1, value2, "svrHndiMsg");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareDt1IsNull() {
            addCriterion("SVR_MSG_SPARE_DT1 is null");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareDt1IsNotNull() {
            addCriterion("SVR_MSG_SPARE_DT1 is not null");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareDt1EqualTo(String value) {
            addCriterion("SVR_MSG_SPARE_DT1 =", value, "svrMsgSpareDt1");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareDt1NotEqualTo(String value) {
            addCriterion("SVR_MSG_SPARE_DT1 <>", value, "svrMsgSpareDt1");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareDt1GreaterThan(String value) {
            addCriterion("SVR_MSG_SPARE_DT1 >", value, "svrMsgSpareDt1");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareDt1GreaterThanOrEqualTo(String value) {
            addCriterion("SVR_MSG_SPARE_DT1 >=", value, "svrMsgSpareDt1");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareDt1LessThan(String value) {
            addCriterion("SVR_MSG_SPARE_DT1 <", value, "svrMsgSpareDt1");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareDt1LessThanOrEqualTo(String value) {
            addCriterion("SVR_MSG_SPARE_DT1 <=", value, "svrMsgSpareDt1");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareDt1Like(String value) {
            addCriterion("SVR_MSG_SPARE_DT1 like", value, "svrMsgSpareDt1");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareDt1NotLike(String value) {
            addCriterion("SVR_MSG_SPARE_DT1 not like", value, "svrMsgSpareDt1");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareDt1In(List<String> values) {
            addCriterion("SVR_MSG_SPARE_DT1 in", values, "svrMsgSpareDt1");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareDt1NotIn(List<String> values) {
            addCriterion("SVR_MSG_SPARE_DT1 not in", values, "svrMsgSpareDt1");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareDt1Between(String value1, String value2) {
            addCriterion("SVR_MSG_SPARE_DT1 between", value1, value2, "svrMsgSpareDt1");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareDt1NotBetween(String value1, String value2) {
            addCriterion("SVR_MSG_SPARE_DT1 not between", value1, value2, "svrMsgSpareDt1");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareDt2IsNull() {
            addCriterion("SVR_MSG_SPARE_DT2 is null");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareDt2IsNotNull() {
            addCriterion("SVR_MSG_SPARE_DT2 is not null");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareDt2EqualTo(String value) {
            addCriterion("SVR_MSG_SPARE_DT2 =", value, "svrMsgSpareDt2");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareDt2NotEqualTo(String value) {
            addCriterion("SVR_MSG_SPARE_DT2 <>", value, "svrMsgSpareDt2");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareDt2GreaterThan(String value) {
            addCriterion("SVR_MSG_SPARE_DT2 >", value, "svrMsgSpareDt2");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareDt2GreaterThanOrEqualTo(String value) {
            addCriterion("SVR_MSG_SPARE_DT2 >=", value, "svrMsgSpareDt2");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareDt2LessThan(String value) {
            addCriterion("SVR_MSG_SPARE_DT2 <", value, "svrMsgSpareDt2");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareDt2LessThanOrEqualTo(String value) {
            addCriterion("SVR_MSG_SPARE_DT2 <=", value, "svrMsgSpareDt2");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareDt2Like(String value) {
            addCriterion("SVR_MSG_SPARE_DT2 like", value, "svrMsgSpareDt2");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareDt2NotLike(String value) {
            addCriterion("SVR_MSG_SPARE_DT2 not like", value, "svrMsgSpareDt2");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareDt2In(List<String> values) {
            addCriterion("SVR_MSG_SPARE_DT2 in", values, "svrMsgSpareDt2");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareDt2NotIn(List<String> values) {
            addCriterion("SVR_MSG_SPARE_DT2 not in", values, "svrMsgSpareDt2");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareDt2Between(String value1, String value2) {
            addCriterion("SVR_MSG_SPARE_DT2 between", value1, value2, "svrMsgSpareDt2");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareDt2NotBetween(String value1, String value2) {
            addCriterion("SVR_MSG_SPARE_DT2 not between", value1, value2, "svrMsgSpareDt2");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareDt3IsNull() {
            addCriterion("SVR_MSG_SPARE_DT3 is null");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareDt3IsNotNull() {
            addCriterion("SVR_MSG_SPARE_DT3 is not null");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareDt3EqualTo(String value) {
            addCriterion("SVR_MSG_SPARE_DT3 =", value, "svrMsgSpareDt3");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareDt3NotEqualTo(String value) {
            addCriterion("SVR_MSG_SPARE_DT3 <>", value, "svrMsgSpareDt3");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareDt3GreaterThan(String value) {
            addCriterion("SVR_MSG_SPARE_DT3 >", value, "svrMsgSpareDt3");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareDt3GreaterThanOrEqualTo(String value) {
            addCriterion("SVR_MSG_SPARE_DT3 >=", value, "svrMsgSpareDt3");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareDt3LessThan(String value) {
            addCriterion("SVR_MSG_SPARE_DT3 <", value, "svrMsgSpareDt3");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareDt3LessThanOrEqualTo(String value) {
            addCriterion("SVR_MSG_SPARE_DT3 <=", value, "svrMsgSpareDt3");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareDt3Like(String value) {
            addCriterion("SVR_MSG_SPARE_DT3 like", value, "svrMsgSpareDt3");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareDt3NotLike(String value) {
            addCriterion("SVR_MSG_SPARE_DT3 not like", value, "svrMsgSpareDt3");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareDt3In(List<String> values) {
            addCriterion("SVR_MSG_SPARE_DT3 in", values, "svrMsgSpareDt3");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareDt3NotIn(List<String> values) {
            addCriterion("SVR_MSG_SPARE_DT3 not in", values, "svrMsgSpareDt3");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareDt3Between(String value1, String value2) {
            addCriterion("SVR_MSG_SPARE_DT3 between", value1, value2, "svrMsgSpareDt3");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareDt3NotBetween(String value1, String value2) {
            addCriterion("SVR_MSG_SPARE_DT3 not between", value1, value2, "svrMsgSpareDt3");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareDt4IsNull() {
            addCriterion("SVR_MSG_SPARE_DT4 is null");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareDt4IsNotNull() {
            addCriterion("SVR_MSG_SPARE_DT4 is not null");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareDt4EqualTo(String value) {
            addCriterion("SVR_MSG_SPARE_DT4 =", value, "svrMsgSpareDt4");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareDt4NotEqualTo(String value) {
            addCriterion("SVR_MSG_SPARE_DT4 <>", value, "svrMsgSpareDt4");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareDt4GreaterThan(String value) {
            addCriterion("SVR_MSG_SPARE_DT4 >", value, "svrMsgSpareDt4");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareDt4GreaterThanOrEqualTo(String value) {
            addCriterion("SVR_MSG_SPARE_DT4 >=", value, "svrMsgSpareDt4");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareDt4LessThan(String value) {
            addCriterion("SVR_MSG_SPARE_DT4 <", value, "svrMsgSpareDt4");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareDt4LessThanOrEqualTo(String value) {
            addCriterion("SVR_MSG_SPARE_DT4 <=", value, "svrMsgSpareDt4");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareDt4Like(String value) {
            addCriterion("SVR_MSG_SPARE_DT4 like", value, "svrMsgSpareDt4");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareDt4NotLike(String value) {
            addCriterion("SVR_MSG_SPARE_DT4 not like", value, "svrMsgSpareDt4");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareDt4In(List<String> values) {
            addCriterion("SVR_MSG_SPARE_DT4 in", values, "svrMsgSpareDt4");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareDt4NotIn(List<String> values) {
            addCriterion("SVR_MSG_SPARE_DT4 not in", values, "svrMsgSpareDt4");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareDt4Between(String value1, String value2) {
            addCriterion("SVR_MSG_SPARE_DT4 between", value1, value2, "svrMsgSpareDt4");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareDt4NotBetween(String value1, String value2) {
            addCriterion("SVR_MSG_SPARE_DT4 not between", value1, value2, "svrMsgSpareDt4");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareDt5IsNull() {
            addCriterion("SVR_MSG_SPARE_DT5 is null");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareDt5IsNotNull() {
            addCriterion("SVR_MSG_SPARE_DT5 is not null");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareDt5EqualTo(String value) {
            addCriterion("SVR_MSG_SPARE_DT5 =", value, "svrMsgSpareDt5");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareDt5NotEqualTo(String value) {
            addCriterion("SVR_MSG_SPARE_DT5 <>", value, "svrMsgSpareDt5");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareDt5GreaterThan(String value) {
            addCriterion("SVR_MSG_SPARE_DT5 >", value, "svrMsgSpareDt5");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareDt5GreaterThanOrEqualTo(String value) {
            addCriterion("SVR_MSG_SPARE_DT5 >=", value, "svrMsgSpareDt5");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareDt5LessThan(String value) {
            addCriterion("SVR_MSG_SPARE_DT5 <", value, "svrMsgSpareDt5");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareDt5LessThanOrEqualTo(String value) {
            addCriterion("SVR_MSG_SPARE_DT5 <=", value, "svrMsgSpareDt5");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareDt5Like(String value) {
            addCriterion("SVR_MSG_SPARE_DT5 like", value, "svrMsgSpareDt5");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareDt5NotLike(String value) {
            addCriterion("SVR_MSG_SPARE_DT5 not like", value, "svrMsgSpareDt5");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareDt5In(List<String> values) {
            addCriterion("SVR_MSG_SPARE_DT5 in", values, "svrMsgSpareDt5");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareDt5NotIn(List<String> values) {
            addCriterion("SVR_MSG_SPARE_DT5 not in", values, "svrMsgSpareDt5");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareDt5Between(String value1, String value2) {
            addCriterion("SVR_MSG_SPARE_DT5 between", value1, value2, "svrMsgSpareDt5");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareDt5NotBetween(String value1, String value2) {
            addCriterion("SVR_MSG_SPARE_DT5 not between", value1, value2, "svrMsgSpareDt5");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareTm1IsNull() {
            addCriterion("SVR_MSG_SPARE_TM1 is null");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareTm1IsNotNull() {
            addCriterion("SVR_MSG_SPARE_TM1 is not null");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareTm1EqualTo(String value) {
            addCriterion("SVR_MSG_SPARE_TM1 =", value, "svrMsgSpareTm1");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareTm1NotEqualTo(String value) {
            addCriterion("SVR_MSG_SPARE_TM1 <>", value, "svrMsgSpareTm1");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareTm1GreaterThan(String value) {
            addCriterion("SVR_MSG_SPARE_TM1 >", value, "svrMsgSpareTm1");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareTm1GreaterThanOrEqualTo(String value) {
            addCriterion("SVR_MSG_SPARE_TM1 >=", value, "svrMsgSpareTm1");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareTm1LessThan(String value) {
            addCriterion("SVR_MSG_SPARE_TM1 <", value, "svrMsgSpareTm1");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareTm1LessThanOrEqualTo(String value) {
            addCriterion("SVR_MSG_SPARE_TM1 <=", value, "svrMsgSpareTm1");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareTm1Like(String value) {
            addCriterion("SVR_MSG_SPARE_TM1 like", value, "svrMsgSpareTm1");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareTm1NotLike(String value) {
            addCriterion("SVR_MSG_SPARE_TM1 not like", value, "svrMsgSpareTm1");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareTm1In(List<String> values) {
            addCriterion("SVR_MSG_SPARE_TM1 in", values, "svrMsgSpareTm1");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareTm1NotIn(List<String> values) {
            addCriterion("SVR_MSG_SPARE_TM1 not in", values, "svrMsgSpareTm1");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareTm1Between(String value1, String value2) {
            addCriterion("SVR_MSG_SPARE_TM1 between", value1, value2, "svrMsgSpareTm1");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareTm1NotBetween(String value1, String value2) {
            addCriterion("SVR_MSG_SPARE_TM1 not between", value1, value2, "svrMsgSpareTm1");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareTm2IsNull() {
            addCriterion("SVR_MSG_SPARE_TM2 is null");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareTm2IsNotNull() {
            addCriterion("SVR_MSG_SPARE_TM2 is not null");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareTm2EqualTo(String value) {
            addCriterion("SVR_MSG_SPARE_TM2 =", value, "svrMsgSpareTm2");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareTm2NotEqualTo(String value) {
            addCriterion("SVR_MSG_SPARE_TM2 <>", value, "svrMsgSpareTm2");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareTm2GreaterThan(String value) {
            addCriterion("SVR_MSG_SPARE_TM2 >", value, "svrMsgSpareTm2");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareTm2GreaterThanOrEqualTo(String value) {
            addCriterion("SVR_MSG_SPARE_TM2 >=", value, "svrMsgSpareTm2");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareTm2LessThan(String value) {
            addCriterion("SVR_MSG_SPARE_TM2 <", value, "svrMsgSpareTm2");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareTm2LessThanOrEqualTo(String value) {
            addCriterion("SVR_MSG_SPARE_TM2 <=", value, "svrMsgSpareTm2");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareTm2Like(String value) {
            addCriterion("SVR_MSG_SPARE_TM2 like", value, "svrMsgSpareTm2");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareTm2NotLike(String value) {
            addCriterion("SVR_MSG_SPARE_TM2 not like", value, "svrMsgSpareTm2");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareTm2In(List<String> values) {
            addCriterion("SVR_MSG_SPARE_TM2 in", values, "svrMsgSpareTm2");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareTm2NotIn(List<String> values) {
            addCriterion("SVR_MSG_SPARE_TM2 not in", values, "svrMsgSpareTm2");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareTm2Between(String value1, String value2) {
            addCriterion("SVR_MSG_SPARE_TM2 between", value1, value2, "svrMsgSpareTm2");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareTm2NotBetween(String value1, String value2) {
            addCriterion("SVR_MSG_SPARE_TM2 not between", value1, value2, "svrMsgSpareTm2");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareTm3IsNull() {
            addCriterion("SVR_MSG_SPARE_TM3 is null");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareTm3IsNotNull() {
            addCriterion("SVR_MSG_SPARE_TM3 is not null");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareTm3EqualTo(String value) {
            addCriterion("SVR_MSG_SPARE_TM3 =", value, "svrMsgSpareTm3");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareTm3NotEqualTo(String value) {
            addCriterion("SVR_MSG_SPARE_TM3 <>", value, "svrMsgSpareTm3");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareTm3GreaterThan(String value) {
            addCriterion("SVR_MSG_SPARE_TM3 >", value, "svrMsgSpareTm3");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareTm3GreaterThanOrEqualTo(String value) {
            addCriterion("SVR_MSG_SPARE_TM3 >=", value, "svrMsgSpareTm3");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareTm3LessThan(String value) {
            addCriterion("SVR_MSG_SPARE_TM3 <", value, "svrMsgSpareTm3");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareTm3LessThanOrEqualTo(String value) {
            addCriterion("SVR_MSG_SPARE_TM3 <=", value, "svrMsgSpareTm3");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareTm3Like(String value) {
            addCriterion("SVR_MSG_SPARE_TM3 like", value, "svrMsgSpareTm3");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareTm3NotLike(String value) {
            addCriterion("SVR_MSG_SPARE_TM3 not like", value, "svrMsgSpareTm3");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareTm3In(List<String> values) {
            addCriterion("SVR_MSG_SPARE_TM3 in", values, "svrMsgSpareTm3");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareTm3NotIn(List<String> values) {
            addCriterion("SVR_MSG_SPARE_TM3 not in", values, "svrMsgSpareTm3");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareTm3Between(String value1, String value2) {
            addCriterion("SVR_MSG_SPARE_TM3 between", value1, value2, "svrMsgSpareTm3");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareTm3NotBetween(String value1, String value2) {
            addCriterion("SVR_MSG_SPARE_TM3 not between", value1, value2, "svrMsgSpareTm3");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareTm4IsNull() {
            addCriterion("SVR_MSG_SPARE_TM4 is null");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareTm4IsNotNull() {
            addCriterion("SVR_MSG_SPARE_TM4 is not null");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareTm4EqualTo(String value) {
            addCriterion("SVR_MSG_SPARE_TM4 =", value, "svrMsgSpareTm4");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareTm4NotEqualTo(String value) {
            addCriterion("SVR_MSG_SPARE_TM4 <>", value, "svrMsgSpareTm4");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareTm4GreaterThan(String value) {
            addCriterion("SVR_MSG_SPARE_TM4 >", value, "svrMsgSpareTm4");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareTm4GreaterThanOrEqualTo(String value) {
            addCriterion("SVR_MSG_SPARE_TM4 >=", value, "svrMsgSpareTm4");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareTm4LessThan(String value) {
            addCriterion("SVR_MSG_SPARE_TM4 <", value, "svrMsgSpareTm4");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareTm4LessThanOrEqualTo(String value) {
            addCriterion("SVR_MSG_SPARE_TM4 <=", value, "svrMsgSpareTm4");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareTm4Like(String value) {
            addCriterion("SVR_MSG_SPARE_TM4 like", value, "svrMsgSpareTm4");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareTm4NotLike(String value) {
            addCriterion("SVR_MSG_SPARE_TM4 not like", value, "svrMsgSpareTm4");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareTm4In(List<String> values) {
            addCriterion("SVR_MSG_SPARE_TM4 in", values, "svrMsgSpareTm4");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareTm4NotIn(List<String> values) {
            addCriterion("SVR_MSG_SPARE_TM4 not in", values, "svrMsgSpareTm4");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareTm4Between(String value1, String value2) {
            addCriterion("SVR_MSG_SPARE_TM4 between", value1, value2, "svrMsgSpareTm4");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareTm4NotBetween(String value1, String value2) {
            addCriterion("SVR_MSG_SPARE_TM4 not between", value1, value2, "svrMsgSpareTm4");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareTm5IsNull() {
            addCriterion("SVR_MSG_SPARE_TM5 is null");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareTm5IsNotNull() {
            addCriterion("SVR_MSG_SPARE_TM5 is not null");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareTm5EqualTo(String value) {
            addCriterion("SVR_MSG_SPARE_TM5 =", value, "svrMsgSpareTm5");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareTm5NotEqualTo(String value) {
            addCriterion("SVR_MSG_SPARE_TM5 <>", value, "svrMsgSpareTm5");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareTm5GreaterThan(String value) {
            addCriterion("SVR_MSG_SPARE_TM5 >", value, "svrMsgSpareTm5");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareTm5GreaterThanOrEqualTo(String value) {
            addCriterion("SVR_MSG_SPARE_TM5 >=", value, "svrMsgSpareTm5");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareTm5LessThan(String value) {
            addCriterion("SVR_MSG_SPARE_TM5 <", value, "svrMsgSpareTm5");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareTm5LessThanOrEqualTo(String value) {
            addCriterion("SVR_MSG_SPARE_TM5 <=", value, "svrMsgSpareTm5");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareTm5Like(String value) {
            addCriterion("SVR_MSG_SPARE_TM5 like", value, "svrMsgSpareTm5");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareTm5NotLike(String value) {
            addCriterion("SVR_MSG_SPARE_TM5 not like", value, "svrMsgSpareTm5");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareTm5In(List<String> values) {
            addCriterion("SVR_MSG_SPARE_TM5 in", values, "svrMsgSpareTm5");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareTm5NotIn(List<String> values) {
            addCriterion("SVR_MSG_SPARE_TM5 not in", values, "svrMsgSpareTm5");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareTm5Between(String value1, String value2) {
            addCriterion("SVR_MSG_SPARE_TM5 between", value1, value2, "svrMsgSpareTm5");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareTm5NotBetween(String value1, String value2) {
            addCriterion("SVR_MSG_SPARE_TM5 not between", value1, value2, "svrMsgSpareTm5");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareNum1IsNull() {
            addCriterion("SVR_MSG_SPARE_NUM1 is null");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareNum1IsNotNull() {
            addCriterion("SVR_MSG_SPARE_NUM1 is not null");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareNum1EqualTo(String value) {
            addCriterion("SVR_MSG_SPARE_NUM1 =", value, "svrMsgSpareNum1");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareNum1NotEqualTo(String value) {
            addCriterion("SVR_MSG_SPARE_NUM1 <>", value, "svrMsgSpareNum1");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareNum1GreaterThan(String value) {
            addCriterion("SVR_MSG_SPARE_NUM1 >", value, "svrMsgSpareNum1");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareNum1GreaterThanOrEqualTo(String value) {
            addCriterion("SVR_MSG_SPARE_NUM1 >=", value, "svrMsgSpareNum1");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareNum1LessThan(String value) {
            addCriterion("SVR_MSG_SPARE_NUM1 <", value, "svrMsgSpareNum1");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareNum1LessThanOrEqualTo(String value) {
            addCriterion("SVR_MSG_SPARE_NUM1 <=", value, "svrMsgSpareNum1");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareNum1Like(String value) {
            addCriterion("SVR_MSG_SPARE_NUM1 like", value, "svrMsgSpareNum1");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareNum1NotLike(String value) {
            addCriterion("SVR_MSG_SPARE_NUM1 not like", value, "svrMsgSpareNum1");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareNum1In(List<String> values) {
            addCriterion("SVR_MSG_SPARE_NUM1 in", values, "svrMsgSpareNum1");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareNum1NotIn(List<String> values) {
            addCriterion("SVR_MSG_SPARE_NUM1 not in", values, "svrMsgSpareNum1");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareNum1Between(String value1, String value2) {
            addCriterion("SVR_MSG_SPARE_NUM1 between", value1, value2, "svrMsgSpareNum1");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareNum1NotBetween(String value1, String value2) {
            addCriterion("SVR_MSG_SPARE_NUM1 not between", value1, value2, "svrMsgSpareNum1");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareNum2IsNull() {
            addCriterion("SVR_MSG_SPARE_NUM2 is null");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareNum2IsNotNull() {
            addCriterion("SVR_MSG_SPARE_NUM2 is not null");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareNum2EqualTo(String value) {
            addCriterion("SVR_MSG_SPARE_NUM2 =", value, "svrMsgSpareNum2");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareNum2NotEqualTo(String value) {
            addCriterion("SVR_MSG_SPARE_NUM2 <>", value, "svrMsgSpareNum2");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareNum2GreaterThan(String value) {
            addCriterion("SVR_MSG_SPARE_NUM2 >", value, "svrMsgSpareNum2");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareNum2GreaterThanOrEqualTo(String value) {
            addCriterion("SVR_MSG_SPARE_NUM2 >=", value, "svrMsgSpareNum2");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareNum2LessThan(String value) {
            addCriterion("SVR_MSG_SPARE_NUM2 <", value, "svrMsgSpareNum2");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareNum2LessThanOrEqualTo(String value) {
            addCriterion("SVR_MSG_SPARE_NUM2 <=", value, "svrMsgSpareNum2");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareNum2Like(String value) {
            addCriterion("SVR_MSG_SPARE_NUM2 like", value, "svrMsgSpareNum2");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareNum2NotLike(String value) {
            addCriterion("SVR_MSG_SPARE_NUM2 not like", value, "svrMsgSpareNum2");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareNum2In(List<String> values) {
            addCriterion("SVR_MSG_SPARE_NUM2 in", values, "svrMsgSpareNum2");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareNum2NotIn(List<String> values) {
            addCriterion("SVR_MSG_SPARE_NUM2 not in", values, "svrMsgSpareNum2");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareNum2Between(String value1, String value2) {
            addCriterion("SVR_MSG_SPARE_NUM2 between", value1, value2, "svrMsgSpareNum2");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareNum2NotBetween(String value1, String value2) {
            addCriterion("SVR_MSG_SPARE_NUM2 not between", value1, value2, "svrMsgSpareNum2");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareNum3IsNull() {
            addCriterion("SVR_MSG_SPARE_NUM3 is null");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareNum3IsNotNull() {
            addCriterion("SVR_MSG_SPARE_NUM3 is not null");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareNum3EqualTo(String value) {
            addCriterion("SVR_MSG_SPARE_NUM3 =", value, "svrMsgSpareNum3");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareNum3NotEqualTo(String value) {
            addCriterion("SVR_MSG_SPARE_NUM3 <>", value, "svrMsgSpareNum3");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareNum3GreaterThan(String value) {
            addCriterion("SVR_MSG_SPARE_NUM3 >", value, "svrMsgSpareNum3");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareNum3GreaterThanOrEqualTo(String value) {
            addCriterion("SVR_MSG_SPARE_NUM3 >=", value, "svrMsgSpareNum3");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareNum3LessThan(String value) {
            addCriterion("SVR_MSG_SPARE_NUM3 <", value, "svrMsgSpareNum3");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareNum3LessThanOrEqualTo(String value) {
            addCriterion("SVR_MSG_SPARE_NUM3 <=", value, "svrMsgSpareNum3");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareNum3Like(String value) {
            addCriterion("SVR_MSG_SPARE_NUM3 like", value, "svrMsgSpareNum3");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareNum3NotLike(String value) {
            addCriterion("SVR_MSG_SPARE_NUM3 not like", value, "svrMsgSpareNum3");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareNum3In(List<String> values) {
            addCriterion("SVR_MSG_SPARE_NUM3 in", values, "svrMsgSpareNum3");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareNum3NotIn(List<String> values) {
            addCriterion("SVR_MSG_SPARE_NUM3 not in", values, "svrMsgSpareNum3");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareNum3Between(String value1, String value2) {
            addCriterion("SVR_MSG_SPARE_NUM3 between", value1, value2, "svrMsgSpareNum3");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareNum3NotBetween(String value1, String value2) {
            addCriterion("SVR_MSG_SPARE_NUM3 not between", value1, value2, "svrMsgSpareNum3");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareNum4IsNull() {
            addCriterion("SVR_MSG_SPARE_NUM4 is null");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareNum4IsNotNull() {
            addCriterion("SVR_MSG_SPARE_NUM4 is not null");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareNum4EqualTo(String value) {
            addCriterion("SVR_MSG_SPARE_NUM4 =", value, "svrMsgSpareNum4");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareNum4NotEqualTo(String value) {
            addCriterion("SVR_MSG_SPARE_NUM4 <>", value, "svrMsgSpareNum4");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareNum4GreaterThan(String value) {
            addCriterion("SVR_MSG_SPARE_NUM4 >", value, "svrMsgSpareNum4");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareNum4GreaterThanOrEqualTo(String value) {
            addCriterion("SVR_MSG_SPARE_NUM4 >=", value, "svrMsgSpareNum4");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareNum4LessThan(String value) {
            addCriterion("SVR_MSG_SPARE_NUM4 <", value, "svrMsgSpareNum4");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareNum4LessThanOrEqualTo(String value) {
            addCriterion("SVR_MSG_SPARE_NUM4 <=", value, "svrMsgSpareNum4");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareNum4Like(String value) {
            addCriterion("SVR_MSG_SPARE_NUM4 like", value, "svrMsgSpareNum4");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareNum4NotLike(String value) {
            addCriterion("SVR_MSG_SPARE_NUM4 not like", value, "svrMsgSpareNum4");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareNum4In(List<String> values) {
            addCriterion("SVR_MSG_SPARE_NUM4 in", values, "svrMsgSpareNum4");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareNum4NotIn(List<String> values) {
            addCriterion("SVR_MSG_SPARE_NUM4 not in", values, "svrMsgSpareNum4");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareNum4Between(String value1, String value2) {
            addCriterion("SVR_MSG_SPARE_NUM4 between", value1, value2, "svrMsgSpareNum4");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareNum4NotBetween(String value1, String value2) {
            addCriterion("SVR_MSG_SPARE_NUM4 not between", value1, value2, "svrMsgSpareNum4");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareNum5IsNull() {
            addCriterion("SVR_MSG_SPARE_NUM5 is null");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareNum5IsNotNull() {
            addCriterion("SVR_MSG_SPARE_NUM5 is not null");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareNum5EqualTo(String value) {
            addCriterion("SVR_MSG_SPARE_NUM5 =", value, "svrMsgSpareNum5");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareNum5NotEqualTo(String value) {
            addCriterion("SVR_MSG_SPARE_NUM5 <>", value, "svrMsgSpareNum5");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareNum5GreaterThan(String value) {
            addCriterion("SVR_MSG_SPARE_NUM5 >", value, "svrMsgSpareNum5");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareNum5GreaterThanOrEqualTo(String value) {
            addCriterion("SVR_MSG_SPARE_NUM5 >=", value, "svrMsgSpareNum5");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareNum5LessThan(String value) {
            addCriterion("SVR_MSG_SPARE_NUM5 <", value, "svrMsgSpareNum5");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareNum5LessThanOrEqualTo(String value) {
            addCriterion("SVR_MSG_SPARE_NUM5 <=", value, "svrMsgSpareNum5");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareNum5Like(String value) {
            addCriterion("SVR_MSG_SPARE_NUM5 like", value, "svrMsgSpareNum5");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareNum5NotLike(String value) {
            addCriterion("SVR_MSG_SPARE_NUM5 not like", value, "svrMsgSpareNum5");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareNum5In(List<String> values) {
            addCriterion("SVR_MSG_SPARE_NUM5 in", values, "svrMsgSpareNum5");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareNum5NotIn(List<String> values) {
            addCriterion("SVR_MSG_SPARE_NUM5 not in", values, "svrMsgSpareNum5");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareNum5Between(String value1, String value2) {
            addCriterion("SVR_MSG_SPARE_NUM5 between", value1, value2, "svrMsgSpareNum5");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareNum5NotBetween(String value1, String value2) {
            addCriterion("SVR_MSG_SPARE_NUM5 not between", value1, value2, "svrMsgSpareNum5");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareTyp1IsNull() {
            addCriterion("SVR_MSG_SPARE_TYP1 is null");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareTyp1IsNotNull() {
            addCriterion("SVR_MSG_SPARE_TYP1 is not null");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareTyp1EqualTo(String value) {
            addCriterion("SVR_MSG_SPARE_TYP1 =", value, "svrMsgSpareTyp1");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareTyp1NotEqualTo(String value) {
            addCriterion("SVR_MSG_SPARE_TYP1 <>", value, "svrMsgSpareTyp1");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareTyp1GreaterThan(String value) {
            addCriterion("SVR_MSG_SPARE_TYP1 >", value, "svrMsgSpareTyp1");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareTyp1GreaterThanOrEqualTo(String value) {
            addCriterion("SVR_MSG_SPARE_TYP1 >=", value, "svrMsgSpareTyp1");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareTyp1LessThan(String value) {
            addCriterion("SVR_MSG_SPARE_TYP1 <", value, "svrMsgSpareTyp1");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareTyp1LessThanOrEqualTo(String value) {
            addCriterion("SVR_MSG_SPARE_TYP1 <=", value, "svrMsgSpareTyp1");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareTyp1Like(String value) {
            addCriterion("SVR_MSG_SPARE_TYP1 like", value, "svrMsgSpareTyp1");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareTyp1NotLike(String value) {
            addCriterion("SVR_MSG_SPARE_TYP1 not like", value, "svrMsgSpareTyp1");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareTyp1In(List<String> values) {
            addCriterion("SVR_MSG_SPARE_TYP1 in", values, "svrMsgSpareTyp1");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareTyp1NotIn(List<String> values) {
            addCriterion("SVR_MSG_SPARE_TYP1 not in", values, "svrMsgSpareTyp1");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareTyp1Between(String value1, String value2) {
            addCriterion("SVR_MSG_SPARE_TYP1 between", value1, value2, "svrMsgSpareTyp1");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareTyp1NotBetween(String value1, String value2) {
            addCriterion("SVR_MSG_SPARE_TYP1 not between", value1, value2, "svrMsgSpareTyp1");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareTyp2IsNull() {
            addCriterion("SVR_MSG_SPARE_TYP2 is null");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareTyp2IsNotNull() {
            addCriterion("SVR_MSG_SPARE_TYP2 is not null");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareTyp2EqualTo(String value) {
            addCriterion("SVR_MSG_SPARE_TYP2 =", value, "svrMsgSpareTyp2");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareTyp2NotEqualTo(String value) {
            addCriterion("SVR_MSG_SPARE_TYP2 <>", value, "svrMsgSpareTyp2");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareTyp2GreaterThan(String value) {
            addCriterion("SVR_MSG_SPARE_TYP2 >", value, "svrMsgSpareTyp2");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareTyp2GreaterThanOrEqualTo(String value) {
            addCriterion("SVR_MSG_SPARE_TYP2 >=", value, "svrMsgSpareTyp2");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareTyp2LessThan(String value) {
            addCriterion("SVR_MSG_SPARE_TYP2 <", value, "svrMsgSpareTyp2");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareTyp2LessThanOrEqualTo(String value) {
            addCriterion("SVR_MSG_SPARE_TYP2 <=", value, "svrMsgSpareTyp2");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareTyp2Like(String value) {
            addCriterion("SVR_MSG_SPARE_TYP2 like", value, "svrMsgSpareTyp2");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareTyp2NotLike(String value) {
            addCriterion("SVR_MSG_SPARE_TYP2 not like", value, "svrMsgSpareTyp2");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareTyp2In(List<String> values) {
            addCriterion("SVR_MSG_SPARE_TYP2 in", values, "svrMsgSpareTyp2");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareTyp2NotIn(List<String> values) {
            addCriterion("SVR_MSG_SPARE_TYP2 not in", values, "svrMsgSpareTyp2");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareTyp2Between(String value1, String value2) {
            addCriterion("SVR_MSG_SPARE_TYP2 between", value1, value2, "svrMsgSpareTyp2");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareTyp2NotBetween(String value1, String value2) {
            addCriterion("SVR_MSG_SPARE_TYP2 not between", value1, value2, "svrMsgSpareTyp2");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareTyp3IsNull() {
            addCriterion("SVR_MSG_SPARE_TYP3 is null");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareTyp3IsNotNull() {
            addCriterion("SVR_MSG_SPARE_TYP3 is not null");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareTyp3EqualTo(String value) {
            addCriterion("SVR_MSG_SPARE_TYP3 =", value, "svrMsgSpareTyp3");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareTyp3NotEqualTo(String value) {
            addCriterion("SVR_MSG_SPARE_TYP3 <>", value, "svrMsgSpareTyp3");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareTyp3GreaterThan(String value) {
            addCriterion("SVR_MSG_SPARE_TYP3 >", value, "svrMsgSpareTyp3");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareTyp3GreaterThanOrEqualTo(String value) {
            addCriterion("SVR_MSG_SPARE_TYP3 >=", value, "svrMsgSpareTyp3");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareTyp3LessThan(String value) {
            addCriterion("SVR_MSG_SPARE_TYP3 <", value, "svrMsgSpareTyp3");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareTyp3LessThanOrEqualTo(String value) {
            addCriterion("SVR_MSG_SPARE_TYP3 <=", value, "svrMsgSpareTyp3");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareTyp3Like(String value) {
            addCriterion("SVR_MSG_SPARE_TYP3 like", value, "svrMsgSpareTyp3");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareTyp3NotLike(String value) {
            addCriterion("SVR_MSG_SPARE_TYP3 not like", value, "svrMsgSpareTyp3");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareTyp3In(List<String> values) {
            addCriterion("SVR_MSG_SPARE_TYP3 in", values, "svrMsgSpareTyp3");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareTyp3NotIn(List<String> values) {
            addCriterion("SVR_MSG_SPARE_TYP3 not in", values, "svrMsgSpareTyp3");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareTyp3Between(String value1, String value2) {
            addCriterion("SVR_MSG_SPARE_TYP3 between", value1, value2, "svrMsgSpareTyp3");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareTyp3NotBetween(String value1, String value2) {
            addCriterion("SVR_MSG_SPARE_TYP3 not between", value1, value2, "svrMsgSpareTyp3");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareTyp4IsNull() {
            addCriterion("SVR_MSG_SPARE_TYP4 is null");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareTyp4IsNotNull() {
            addCriterion("SVR_MSG_SPARE_TYP4 is not null");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareTyp4EqualTo(String value) {
            addCriterion("SVR_MSG_SPARE_TYP4 =", value, "svrMsgSpareTyp4");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareTyp4NotEqualTo(String value) {
            addCriterion("SVR_MSG_SPARE_TYP4 <>", value, "svrMsgSpareTyp4");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareTyp4GreaterThan(String value) {
            addCriterion("SVR_MSG_SPARE_TYP4 >", value, "svrMsgSpareTyp4");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareTyp4GreaterThanOrEqualTo(String value) {
            addCriterion("SVR_MSG_SPARE_TYP4 >=", value, "svrMsgSpareTyp4");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareTyp4LessThan(String value) {
            addCriterion("SVR_MSG_SPARE_TYP4 <", value, "svrMsgSpareTyp4");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareTyp4LessThanOrEqualTo(String value) {
            addCriterion("SVR_MSG_SPARE_TYP4 <=", value, "svrMsgSpareTyp4");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareTyp4Like(String value) {
            addCriterion("SVR_MSG_SPARE_TYP4 like", value, "svrMsgSpareTyp4");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareTyp4NotLike(String value) {
            addCriterion("SVR_MSG_SPARE_TYP4 not like", value, "svrMsgSpareTyp4");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareTyp4In(List<String> values) {
            addCriterion("SVR_MSG_SPARE_TYP4 in", values, "svrMsgSpareTyp4");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareTyp4NotIn(List<String> values) {
            addCriterion("SVR_MSG_SPARE_TYP4 not in", values, "svrMsgSpareTyp4");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareTyp4Between(String value1, String value2) {
            addCriterion("SVR_MSG_SPARE_TYP4 between", value1, value2, "svrMsgSpareTyp4");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareTyp4NotBetween(String value1, String value2) {
            addCriterion("SVR_MSG_SPARE_TYP4 not between", value1, value2, "svrMsgSpareTyp4");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareTyp5IsNull() {
            addCriterion("SVR_MSG_SPARE_TYP5 is null");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareTyp5IsNotNull() {
            addCriterion("SVR_MSG_SPARE_TYP5 is not null");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareTyp5EqualTo(String value) {
            addCriterion("SVR_MSG_SPARE_TYP5 =", value, "svrMsgSpareTyp5");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareTyp5NotEqualTo(String value) {
            addCriterion("SVR_MSG_SPARE_TYP5 <>", value, "svrMsgSpareTyp5");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareTyp5GreaterThan(String value) {
            addCriterion("SVR_MSG_SPARE_TYP5 >", value, "svrMsgSpareTyp5");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareTyp5GreaterThanOrEqualTo(String value) {
            addCriterion("SVR_MSG_SPARE_TYP5 >=", value, "svrMsgSpareTyp5");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareTyp5LessThan(String value) {
            addCriterion("SVR_MSG_SPARE_TYP5 <", value, "svrMsgSpareTyp5");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareTyp5LessThanOrEqualTo(String value) {
            addCriterion("SVR_MSG_SPARE_TYP5 <=", value, "svrMsgSpareTyp5");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareTyp5Like(String value) {
            addCriterion("SVR_MSG_SPARE_TYP5 like", value, "svrMsgSpareTyp5");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareTyp5NotLike(String value) {
            addCriterion("SVR_MSG_SPARE_TYP5 not like", value, "svrMsgSpareTyp5");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareTyp5In(List<String> values) {
            addCriterion("SVR_MSG_SPARE_TYP5 in", values, "svrMsgSpareTyp5");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareTyp5NotIn(List<String> values) {
            addCriterion("SVR_MSG_SPARE_TYP5 not in", values, "svrMsgSpareTyp5");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareTyp5Between(String value1, String value2) {
            addCriterion("SVR_MSG_SPARE_TYP5 between", value1, value2, "svrMsgSpareTyp5");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareTyp5NotBetween(String value1, String value2) {
            addCriterion("SVR_MSG_SPARE_TYP5 not between", value1, value2, "svrMsgSpareTyp5");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareCd1IsNull() {
            addCriterion("SVR_MSG_SPARE_CD1 is null");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareCd1IsNotNull() {
            addCriterion("SVR_MSG_SPARE_CD1 is not null");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareCd1EqualTo(String value) {
            addCriterion("SVR_MSG_SPARE_CD1 =", value, "svrMsgSpareCd1");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareCd1NotEqualTo(String value) {
            addCriterion("SVR_MSG_SPARE_CD1 <>", value, "svrMsgSpareCd1");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareCd1GreaterThan(String value) {
            addCriterion("SVR_MSG_SPARE_CD1 >", value, "svrMsgSpareCd1");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareCd1GreaterThanOrEqualTo(String value) {
            addCriterion("SVR_MSG_SPARE_CD1 >=", value, "svrMsgSpareCd1");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareCd1LessThan(String value) {
            addCriterion("SVR_MSG_SPARE_CD1 <", value, "svrMsgSpareCd1");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareCd1LessThanOrEqualTo(String value) {
            addCriterion("SVR_MSG_SPARE_CD1 <=", value, "svrMsgSpareCd1");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareCd1Like(String value) {
            addCriterion("SVR_MSG_SPARE_CD1 like", value, "svrMsgSpareCd1");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareCd1NotLike(String value) {
            addCriterion("SVR_MSG_SPARE_CD1 not like", value, "svrMsgSpareCd1");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareCd1In(List<String> values) {
            addCriterion("SVR_MSG_SPARE_CD1 in", values, "svrMsgSpareCd1");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareCd1NotIn(List<String> values) {
            addCriterion("SVR_MSG_SPARE_CD1 not in", values, "svrMsgSpareCd1");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareCd1Between(String value1, String value2) {
            addCriterion("SVR_MSG_SPARE_CD1 between", value1, value2, "svrMsgSpareCd1");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareCd1NotBetween(String value1, String value2) {
            addCriterion("SVR_MSG_SPARE_CD1 not between", value1, value2, "svrMsgSpareCd1");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareCd2IsNull() {
            addCriterion("SVR_MSG_SPARE_CD2 is null");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareCd2IsNotNull() {
            addCriterion("SVR_MSG_SPARE_CD2 is not null");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareCd2EqualTo(String value) {
            addCriterion("SVR_MSG_SPARE_CD2 =", value, "svrMsgSpareCd2");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareCd2NotEqualTo(String value) {
            addCriterion("SVR_MSG_SPARE_CD2 <>", value, "svrMsgSpareCd2");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareCd2GreaterThan(String value) {
            addCriterion("SVR_MSG_SPARE_CD2 >", value, "svrMsgSpareCd2");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareCd2GreaterThanOrEqualTo(String value) {
            addCriterion("SVR_MSG_SPARE_CD2 >=", value, "svrMsgSpareCd2");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareCd2LessThan(String value) {
            addCriterion("SVR_MSG_SPARE_CD2 <", value, "svrMsgSpareCd2");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareCd2LessThanOrEqualTo(String value) {
            addCriterion("SVR_MSG_SPARE_CD2 <=", value, "svrMsgSpareCd2");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareCd2Like(String value) {
            addCriterion("SVR_MSG_SPARE_CD2 like", value, "svrMsgSpareCd2");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareCd2NotLike(String value) {
            addCriterion("SVR_MSG_SPARE_CD2 not like", value, "svrMsgSpareCd2");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareCd2In(List<String> values) {
            addCriterion("SVR_MSG_SPARE_CD2 in", values, "svrMsgSpareCd2");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareCd2NotIn(List<String> values) {
            addCriterion("SVR_MSG_SPARE_CD2 not in", values, "svrMsgSpareCd2");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareCd2Between(String value1, String value2) {
            addCriterion("SVR_MSG_SPARE_CD2 between", value1, value2, "svrMsgSpareCd2");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareCd2NotBetween(String value1, String value2) {
            addCriterion("SVR_MSG_SPARE_CD2 not between", value1, value2, "svrMsgSpareCd2");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareCd3IsNull() {
            addCriterion("SVR_MSG_SPARE_CD3 is null");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareCd3IsNotNull() {
            addCriterion("SVR_MSG_SPARE_CD3 is not null");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareCd3EqualTo(String value) {
            addCriterion("SVR_MSG_SPARE_CD3 =", value, "svrMsgSpareCd3");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareCd3NotEqualTo(String value) {
            addCriterion("SVR_MSG_SPARE_CD3 <>", value, "svrMsgSpareCd3");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareCd3GreaterThan(String value) {
            addCriterion("SVR_MSG_SPARE_CD3 >", value, "svrMsgSpareCd3");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareCd3GreaterThanOrEqualTo(String value) {
            addCriterion("SVR_MSG_SPARE_CD3 >=", value, "svrMsgSpareCd3");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareCd3LessThan(String value) {
            addCriterion("SVR_MSG_SPARE_CD3 <", value, "svrMsgSpareCd3");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareCd3LessThanOrEqualTo(String value) {
            addCriterion("SVR_MSG_SPARE_CD3 <=", value, "svrMsgSpareCd3");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareCd3Like(String value) {
            addCriterion("SVR_MSG_SPARE_CD3 like", value, "svrMsgSpareCd3");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareCd3NotLike(String value) {
            addCriterion("SVR_MSG_SPARE_CD3 not like", value, "svrMsgSpareCd3");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareCd3In(List<String> values) {
            addCriterion("SVR_MSG_SPARE_CD3 in", values, "svrMsgSpareCd3");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareCd3NotIn(List<String> values) {
            addCriterion("SVR_MSG_SPARE_CD3 not in", values, "svrMsgSpareCd3");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareCd3Between(String value1, String value2) {
            addCriterion("SVR_MSG_SPARE_CD3 between", value1, value2, "svrMsgSpareCd3");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareCd3NotBetween(String value1, String value2) {
            addCriterion("SVR_MSG_SPARE_CD3 not between", value1, value2, "svrMsgSpareCd3");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareCd4IsNull() {
            addCriterion("SVR_MSG_SPARE_CD4 is null");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareCd4IsNotNull() {
            addCriterion("SVR_MSG_SPARE_CD4 is not null");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareCd4EqualTo(String value) {
            addCriterion("SVR_MSG_SPARE_CD4 =", value, "svrMsgSpareCd4");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareCd4NotEqualTo(String value) {
            addCriterion("SVR_MSG_SPARE_CD4 <>", value, "svrMsgSpareCd4");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareCd4GreaterThan(String value) {
            addCriterion("SVR_MSG_SPARE_CD4 >", value, "svrMsgSpareCd4");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareCd4GreaterThanOrEqualTo(String value) {
            addCriterion("SVR_MSG_SPARE_CD4 >=", value, "svrMsgSpareCd4");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareCd4LessThan(String value) {
            addCriterion("SVR_MSG_SPARE_CD4 <", value, "svrMsgSpareCd4");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareCd4LessThanOrEqualTo(String value) {
            addCriterion("SVR_MSG_SPARE_CD4 <=", value, "svrMsgSpareCd4");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareCd4Like(String value) {
            addCriterion("SVR_MSG_SPARE_CD4 like", value, "svrMsgSpareCd4");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareCd4NotLike(String value) {
            addCriterion("SVR_MSG_SPARE_CD4 not like", value, "svrMsgSpareCd4");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareCd4In(List<String> values) {
            addCriterion("SVR_MSG_SPARE_CD4 in", values, "svrMsgSpareCd4");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareCd4NotIn(List<String> values) {
            addCriterion("SVR_MSG_SPARE_CD4 not in", values, "svrMsgSpareCd4");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareCd4Between(String value1, String value2) {
            addCriterion("SVR_MSG_SPARE_CD4 between", value1, value2, "svrMsgSpareCd4");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareCd4NotBetween(String value1, String value2) {
            addCriterion("SVR_MSG_SPARE_CD4 not between", value1, value2, "svrMsgSpareCd4");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareCd5IsNull() {
            addCriterion("SVR_MSG_SPARE_CD5 is null");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareCd5IsNotNull() {
            addCriterion("SVR_MSG_SPARE_CD5 is not null");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareCd5EqualTo(String value) {
            addCriterion("SVR_MSG_SPARE_CD5 =", value, "svrMsgSpareCd5");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareCd5NotEqualTo(String value) {
            addCriterion("SVR_MSG_SPARE_CD5 <>", value, "svrMsgSpareCd5");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareCd5GreaterThan(String value) {
            addCriterion("SVR_MSG_SPARE_CD5 >", value, "svrMsgSpareCd5");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareCd5GreaterThanOrEqualTo(String value) {
            addCriterion("SVR_MSG_SPARE_CD5 >=", value, "svrMsgSpareCd5");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareCd5LessThan(String value) {
            addCriterion("SVR_MSG_SPARE_CD5 <", value, "svrMsgSpareCd5");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareCd5LessThanOrEqualTo(String value) {
            addCriterion("SVR_MSG_SPARE_CD5 <=", value, "svrMsgSpareCd5");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareCd5Like(String value) {
            addCriterion("SVR_MSG_SPARE_CD5 like", value, "svrMsgSpareCd5");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareCd5NotLike(String value) {
            addCriterion("SVR_MSG_SPARE_CD5 not like", value, "svrMsgSpareCd5");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareCd5In(List<String> values) {
            addCriterion("SVR_MSG_SPARE_CD5 in", values, "svrMsgSpareCd5");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareCd5NotIn(List<String> values) {
            addCriterion("SVR_MSG_SPARE_CD5 not in", values, "svrMsgSpareCd5");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareCd5Between(String value1, String value2) {
            addCriterion("SVR_MSG_SPARE_CD5 between", value1, value2, "svrMsgSpareCd5");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareCd5NotBetween(String value1, String value2) {
            addCriterion("SVR_MSG_SPARE_CD5 not between", value1, value2, "svrMsgSpareCd5");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareCont1IsNull() {
            addCriterion("SVR_MSG_SPARE_CONT1 is null");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareCont1IsNotNull() {
            addCriterion("SVR_MSG_SPARE_CONT1 is not null");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareCont1EqualTo(String value) {
            addCriterion("SVR_MSG_SPARE_CONT1 =", value, "svrMsgSpareCont1");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareCont1NotEqualTo(String value) {
            addCriterion("SVR_MSG_SPARE_CONT1 <>", value, "svrMsgSpareCont1");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareCont1GreaterThan(String value) {
            addCriterion("SVR_MSG_SPARE_CONT1 >", value, "svrMsgSpareCont1");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareCont1GreaterThanOrEqualTo(String value) {
            addCriterion("SVR_MSG_SPARE_CONT1 >=", value, "svrMsgSpareCont1");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareCont1LessThan(String value) {
            addCriterion("SVR_MSG_SPARE_CONT1 <", value, "svrMsgSpareCont1");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareCont1LessThanOrEqualTo(String value) {
            addCriterion("SVR_MSG_SPARE_CONT1 <=", value, "svrMsgSpareCont1");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareCont1Like(String value) {
            addCriterion("SVR_MSG_SPARE_CONT1 like", value, "svrMsgSpareCont1");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareCont1NotLike(String value) {
            addCriterion("SVR_MSG_SPARE_CONT1 not like", value, "svrMsgSpareCont1");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareCont1In(List<String> values) {
            addCriterion("SVR_MSG_SPARE_CONT1 in", values, "svrMsgSpareCont1");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareCont1NotIn(List<String> values) {
            addCriterion("SVR_MSG_SPARE_CONT1 not in", values, "svrMsgSpareCont1");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareCont1Between(String value1, String value2) {
            addCriterion("SVR_MSG_SPARE_CONT1 between", value1, value2, "svrMsgSpareCont1");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareCont1NotBetween(String value1, String value2) {
            addCriterion("SVR_MSG_SPARE_CONT1 not between", value1, value2, "svrMsgSpareCont1");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareCont2IsNull() {
            addCriterion("SVR_MSG_SPARE_CONT2 is null");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareCont2IsNotNull() {
            addCriterion("SVR_MSG_SPARE_CONT2 is not null");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareCont2EqualTo(String value) {
            addCriterion("SVR_MSG_SPARE_CONT2 =", value, "svrMsgSpareCont2");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareCont2NotEqualTo(String value) {
            addCriterion("SVR_MSG_SPARE_CONT2 <>", value, "svrMsgSpareCont2");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareCont2GreaterThan(String value) {
            addCriterion("SVR_MSG_SPARE_CONT2 >", value, "svrMsgSpareCont2");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareCont2GreaterThanOrEqualTo(String value) {
            addCriterion("SVR_MSG_SPARE_CONT2 >=", value, "svrMsgSpareCont2");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareCont2LessThan(String value) {
            addCriterion("SVR_MSG_SPARE_CONT2 <", value, "svrMsgSpareCont2");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareCont2LessThanOrEqualTo(String value) {
            addCriterion("SVR_MSG_SPARE_CONT2 <=", value, "svrMsgSpareCont2");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareCont2Like(String value) {
            addCriterion("SVR_MSG_SPARE_CONT2 like", value, "svrMsgSpareCont2");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareCont2NotLike(String value) {
            addCriterion("SVR_MSG_SPARE_CONT2 not like", value, "svrMsgSpareCont2");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareCont2In(List<String> values) {
            addCriterion("SVR_MSG_SPARE_CONT2 in", values, "svrMsgSpareCont2");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareCont2NotIn(List<String> values) {
            addCriterion("SVR_MSG_SPARE_CONT2 not in", values, "svrMsgSpareCont2");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareCont2Between(String value1, String value2) {
            addCriterion("SVR_MSG_SPARE_CONT2 between", value1, value2, "svrMsgSpareCont2");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareCont2NotBetween(String value1, String value2) {
            addCriterion("SVR_MSG_SPARE_CONT2 not between", value1, value2, "svrMsgSpareCont2");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareCont3IsNull() {
            addCriterion("SVR_MSG_SPARE_CONT3 is null");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareCont3IsNotNull() {
            addCriterion("SVR_MSG_SPARE_CONT3 is not null");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareCont3EqualTo(String value) {
            addCriterion("SVR_MSG_SPARE_CONT3 =", value, "svrMsgSpareCont3");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareCont3NotEqualTo(String value) {
            addCriterion("SVR_MSG_SPARE_CONT3 <>", value, "svrMsgSpareCont3");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareCont3GreaterThan(String value) {
            addCriterion("SVR_MSG_SPARE_CONT3 >", value, "svrMsgSpareCont3");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareCont3GreaterThanOrEqualTo(String value) {
            addCriterion("SVR_MSG_SPARE_CONT3 >=", value, "svrMsgSpareCont3");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareCont3LessThan(String value) {
            addCriterion("SVR_MSG_SPARE_CONT3 <", value, "svrMsgSpareCont3");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareCont3LessThanOrEqualTo(String value) {
            addCriterion("SVR_MSG_SPARE_CONT3 <=", value, "svrMsgSpareCont3");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareCont3Like(String value) {
            addCriterion("SVR_MSG_SPARE_CONT3 like", value, "svrMsgSpareCont3");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareCont3NotLike(String value) {
            addCriterion("SVR_MSG_SPARE_CONT3 not like", value, "svrMsgSpareCont3");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareCont3In(List<String> values) {
            addCriterion("SVR_MSG_SPARE_CONT3 in", values, "svrMsgSpareCont3");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareCont3NotIn(List<String> values) {
            addCriterion("SVR_MSG_SPARE_CONT3 not in", values, "svrMsgSpareCont3");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareCont3Between(String value1, String value2) {
            addCriterion("SVR_MSG_SPARE_CONT3 between", value1, value2, "svrMsgSpareCont3");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareCont3NotBetween(String value1, String value2) {
            addCriterion("SVR_MSG_SPARE_CONT3 not between", value1, value2, "svrMsgSpareCont3");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareCont4IsNull() {
            addCriterion("SVR_MSG_SPARE_CONT4 is null");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareCont4IsNotNull() {
            addCriterion("SVR_MSG_SPARE_CONT4 is not null");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareCont4EqualTo(String value) {
            addCriterion("SVR_MSG_SPARE_CONT4 =", value, "svrMsgSpareCont4");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareCont4NotEqualTo(String value) {
            addCriterion("SVR_MSG_SPARE_CONT4 <>", value, "svrMsgSpareCont4");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareCont4GreaterThan(String value) {
            addCriterion("SVR_MSG_SPARE_CONT4 >", value, "svrMsgSpareCont4");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareCont4GreaterThanOrEqualTo(String value) {
            addCriterion("SVR_MSG_SPARE_CONT4 >=", value, "svrMsgSpareCont4");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareCont4LessThan(String value) {
            addCriterion("SVR_MSG_SPARE_CONT4 <", value, "svrMsgSpareCont4");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareCont4LessThanOrEqualTo(String value) {
            addCriterion("SVR_MSG_SPARE_CONT4 <=", value, "svrMsgSpareCont4");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareCont4Like(String value) {
            addCriterion("SVR_MSG_SPARE_CONT4 like", value, "svrMsgSpareCont4");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareCont4NotLike(String value) {
            addCriterion("SVR_MSG_SPARE_CONT4 not like", value, "svrMsgSpareCont4");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareCont4In(List<String> values) {
            addCriterion("SVR_MSG_SPARE_CONT4 in", values, "svrMsgSpareCont4");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareCont4NotIn(List<String> values) {
            addCriterion("SVR_MSG_SPARE_CONT4 not in", values, "svrMsgSpareCont4");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareCont4Between(String value1, String value2) {
            addCriterion("SVR_MSG_SPARE_CONT4 between", value1, value2, "svrMsgSpareCont4");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareCont4NotBetween(String value1, String value2) {
            addCriterion("SVR_MSG_SPARE_CONT4 not between", value1, value2, "svrMsgSpareCont4");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareCont5IsNull() {
            addCriterion("SVR_MSG_SPARE_CONT5 is null");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareCont5IsNotNull() {
            addCriterion("SVR_MSG_SPARE_CONT5 is not null");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareCont5EqualTo(String value) {
            addCriterion("SVR_MSG_SPARE_CONT5 =", value, "svrMsgSpareCont5");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareCont5NotEqualTo(String value) {
            addCriterion("SVR_MSG_SPARE_CONT5 <>", value, "svrMsgSpareCont5");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareCont5GreaterThan(String value) {
            addCriterion("SVR_MSG_SPARE_CONT5 >", value, "svrMsgSpareCont5");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareCont5GreaterThanOrEqualTo(String value) {
            addCriterion("SVR_MSG_SPARE_CONT5 >=", value, "svrMsgSpareCont5");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareCont5LessThan(String value) {
            addCriterion("SVR_MSG_SPARE_CONT5 <", value, "svrMsgSpareCont5");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareCont5LessThanOrEqualTo(String value) {
            addCriterion("SVR_MSG_SPARE_CONT5 <=", value, "svrMsgSpareCont5");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareCont5Like(String value) {
            addCriterion("SVR_MSG_SPARE_CONT5 like", value, "svrMsgSpareCont5");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareCont5NotLike(String value) {
            addCriterion("SVR_MSG_SPARE_CONT5 not like", value, "svrMsgSpareCont5");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareCont5In(List<String> values) {
            addCriterion("SVR_MSG_SPARE_CONT5 in", values, "svrMsgSpareCont5");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareCont5NotIn(List<String> values) {
            addCriterion("SVR_MSG_SPARE_CONT5 not in", values, "svrMsgSpareCont5");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareCont5Between(String value1, String value2) {
            addCriterion("SVR_MSG_SPARE_CONT5 between", value1, value2, "svrMsgSpareCont5");
            return (Criteria) this;
        }

        public Criteria andSvrMsgSpareCont5NotBetween(String value1, String value2) {
            addCriterion("SVR_MSG_SPARE_CONT5 not between", value1, value2, "svrMsgSpareCont5");
            return (Criteria) this;
        }

        public Criteria andExclusiveKeyIsNull() {
            addCriterion("EXCLUSIVE_KEY is null");
            return (Criteria) this;
        }

        public Criteria andExclusiveKeyIsNotNull() {
            addCriterion("EXCLUSIVE_KEY is not null");
            return (Criteria) this;
        }

        public Criteria andExclusiveKeyEqualTo(Long value) {
            addCriterion("EXCLUSIVE_KEY =", value, "exclusiveKey");
            return (Criteria) this;
        }

        public Criteria andExclusiveKeyNotEqualTo(Long value) {
            addCriterion("EXCLUSIVE_KEY <>", value, "exclusiveKey");
            return (Criteria) this;
        }

        public Criteria andExclusiveKeyGreaterThan(Long value) {
            addCriterion("EXCLUSIVE_KEY >", value, "exclusiveKey");
            return (Criteria) this;
        }

        public Criteria andExclusiveKeyGreaterThanOrEqualTo(Long value) {
            addCriterion("EXCLUSIVE_KEY >=", value, "exclusiveKey");
            return (Criteria) this;
        }

        public Criteria andExclusiveKeyLessThan(Long value) {
            addCriterion("EXCLUSIVE_KEY <", value, "exclusiveKey");
            return (Criteria) this;
        }

        public Criteria andExclusiveKeyLessThanOrEqualTo(Long value) {
            addCriterion("EXCLUSIVE_KEY <=", value, "exclusiveKey");
            return (Criteria) this;
        }

        public Criteria andExclusiveKeyIn(List<Long> values) {
            addCriterion("EXCLUSIVE_KEY in", values, "exclusiveKey");
            return (Criteria) this;
        }

        public Criteria andExclusiveKeyNotIn(List<Long> values) {
            addCriterion("EXCLUSIVE_KEY not in", values, "exclusiveKey");
            return (Criteria) this;
        }

        public Criteria andExclusiveKeyBetween(Long value1, Long value2) {
            addCriterion("EXCLUSIVE_KEY between", value1, value2, "exclusiveKey");
            return (Criteria) this;
        }

        public Criteria andExclusiveKeyNotBetween(Long value1, Long value2) {
            addCriterion("EXCLUSIVE_KEY not between", value1, value2, "exclusiveKey");
            return (Criteria) this;
        }

        public Criteria andEntryTimeIsNull() {
            addCriterion("ENTRY_TIME is null");
            return (Criteria) this;
        }

        public Criteria andEntryTimeIsNotNull() {
            addCriterion("ENTRY_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andEntryTimeEqualTo(String value) {
            addCriterion("ENTRY_TIME =", value, "entryTime");
            return (Criteria) this;
        }

        public Criteria andEntryTimeNotEqualTo(String value) {
            addCriterion("ENTRY_TIME <>", value, "entryTime");
            return (Criteria) this;
        }

        public Criteria andEntryTimeGreaterThan(String value) {
            addCriterion("ENTRY_TIME >", value, "entryTime");
            return (Criteria) this;
        }

        public Criteria andEntryTimeGreaterThanOrEqualTo(String value) {
            addCriterion("ENTRY_TIME >=", value, "entryTime");
            return (Criteria) this;
        }

        public Criteria andEntryTimeLessThan(String value) {
            addCriterion("ENTRY_TIME <", value, "entryTime");
            return (Criteria) this;
        }

        public Criteria andEntryTimeLessThanOrEqualTo(String value) {
            addCriterion("ENTRY_TIME <=", value, "entryTime");
            return (Criteria) this;
        }

        public Criteria andEntryTimeLike(String value) {
            addCriterion("ENTRY_TIME like", value, "entryTime");
            return (Criteria) this;
        }

        public Criteria andEntryTimeNotLike(String value) {
            addCriterion("ENTRY_TIME not like", value, "entryTime");
            return (Criteria) this;
        }

        public Criteria andEntryTimeIn(List<String> values) {
            addCriterion("ENTRY_TIME in", values, "entryTime");
            return (Criteria) this;
        }

        public Criteria andEntryTimeNotIn(List<String> values) {
            addCriterion("ENTRY_TIME not in", values, "entryTime");
            return (Criteria) this;
        }

        public Criteria andEntryTimeBetween(String value1, String value2) {
            addCriterion("ENTRY_TIME between", value1, value2, "entryTime");
            return (Criteria) this;
        }

        public Criteria andEntryTimeNotBetween(String value1, String value2) {
            addCriterion("ENTRY_TIME not between", value1, value2, "entryTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdTimeIsNull() {
            addCriterion("LAST_UPD_TIME is null");
            return (Criteria) this;
        }

        public Criteria andLastUpdTimeIsNotNull() {
            addCriterion("LAST_UPD_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andLastUpdTimeEqualTo(String value) {
            addCriterion("LAST_UPD_TIME =", value, "lastUpdTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdTimeNotEqualTo(String value) {
            addCriterion("LAST_UPD_TIME <>", value, "lastUpdTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdTimeGreaterThan(String value) {
            addCriterion("LAST_UPD_TIME >", value, "lastUpdTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdTimeGreaterThanOrEqualTo(String value) {
            addCriterion("LAST_UPD_TIME >=", value, "lastUpdTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdTimeLessThan(String value) {
            addCriterion("LAST_UPD_TIME <", value, "lastUpdTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdTimeLessThanOrEqualTo(String value) {
            addCriterion("LAST_UPD_TIME <=", value, "lastUpdTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdTimeLike(String value) {
            addCriterion("LAST_UPD_TIME like", value, "lastUpdTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdTimeNotLike(String value) {
            addCriterion("LAST_UPD_TIME not like", value, "lastUpdTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdTimeIn(List<String> values) {
            addCriterion("LAST_UPD_TIME in", values, "lastUpdTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdTimeNotIn(List<String> values) {
            addCriterion("LAST_UPD_TIME not in", values, "lastUpdTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdTimeBetween(String value1, String value2) {
            addCriterion("LAST_UPD_TIME between", value1, value2, "lastUpdTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdTimeNotBetween(String value1, String value2) {
            addCriterion("LAST_UPD_TIME not between", value1, value2, "lastUpdTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdPrgIsNull() {
            addCriterion("LAST_UPD_PRG is null");
            return (Criteria) this;
        }

        public Criteria andLastUpdPrgIsNotNull() {
            addCriterion("LAST_UPD_PRG is not null");
            return (Criteria) this;
        }

        public Criteria andLastUpdPrgEqualTo(String value) {
            addCriterion("LAST_UPD_PRG =", value, "lastUpdPrg");
            return (Criteria) this;
        }

        public Criteria andLastUpdPrgNotEqualTo(String value) {
            addCriterion("LAST_UPD_PRG <>", value, "lastUpdPrg");
            return (Criteria) this;
        }

        public Criteria andLastUpdPrgGreaterThan(String value) {
            addCriterion("LAST_UPD_PRG >", value, "lastUpdPrg");
            return (Criteria) this;
        }

        public Criteria andLastUpdPrgGreaterThanOrEqualTo(String value) {
            addCriterion("LAST_UPD_PRG >=", value, "lastUpdPrg");
            return (Criteria) this;
        }

        public Criteria andLastUpdPrgLessThan(String value) {
            addCriterion("LAST_UPD_PRG <", value, "lastUpdPrg");
            return (Criteria) this;
        }

        public Criteria andLastUpdPrgLessThanOrEqualTo(String value) {
            addCriterion("LAST_UPD_PRG <=", value, "lastUpdPrg");
            return (Criteria) this;
        }

        public Criteria andLastUpdPrgLike(String value) {
            addCriterion("LAST_UPD_PRG like", value, "lastUpdPrg");
            return (Criteria) this;
        }

        public Criteria andLastUpdPrgNotLike(String value) {
            addCriterion("LAST_UPD_PRG not like", value, "lastUpdPrg");
            return (Criteria) this;
        }

        public Criteria andLastUpdPrgIn(List<String> values) {
            addCriterion("LAST_UPD_PRG in", values, "lastUpdPrg");
            return (Criteria) this;
        }

        public Criteria andLastUpdPrgNotIn(List<String> values) {
            addCriterion("LAST_UPD_PRG not in", values, "lastUpdPrg");
            return (Criteria) this;
        }

        public Criteria andLastUpdPrgBetween(String value1, String value2) {
            addCriterion("LAST_UPD_PRG between", value1, value2, "lastUpdPrg");
            return (Criteria) this;
        }

        public Criteria andLastUpdPrgNotBetween(String value1, String value2) {
            addCriterion("LAST_UPD_PRG not between", value1, value2, "lastUpdPrg");
            return (Criteria) this;
        }

        public Criteria andLastUpdUsrIsNull() {
            addCriterion("LAST_UPD_USR is null");
            return (Criteria) this;
        }

        public Criteria andLastUpdUsrIsNotNull() {
            addCriterion("LAST_UPD_USR is not null");
            return (Criteria) this;
        }

        public Criteria andLastUpdUsrEqualTo(String value) {
            addCriterion("LAST_UPD_USR =", value, "lastUpdUsr");
            return (Criteria) this;
        }

        public Criteria andLastUpdUsrNotEqualTo(String value) {
            addCriterion("LAST_UPD_USR <>", value, "lastUpdUsr");
            return (Criteria) this;
        }

        public Criteria andLastUpdUsrGreaterThan(String value) {
            addCriterion("LAST_UPD_USR >", value, "lastUpdUsr");
            return (Criteria) this;
        }

        public Criteria andLastUpdUsrGreaterThanOrEqualTo(String value) {
            addCriterion("LAST_UPD_USR >=", value, "lastUpdUsr");
            return (Criteria) this;
        }

        public Criteria andLastUpdUsrLessThan(String value) {
            addCriterion("LAST_UPD_USR <", value, "lastUpdUsr");
            return (Criteria) this;
        }

        public Criteria andLastUpdUsrLessThanOrEqualTo(String value) {
            addCriterion("LAST_UPD_USR <=", value, "lastUpdUsr");
            return (Criteria) this;
        }

        public Criteria andLastUpdUsrLike(String value) {
            addCriterion("LAST_UPD_USR like", value, "lastUpdUsr");
            return (Criteria) this;
        }

        public Criteria andLastUpdUsrNotLike(String value) {
            addCriterion("LAST_UPD_USR not like", value, "lastUpdUsr");
            return (Criteria) this;
        }

        public Criteria andLastUpdUsrIn(List<String> values) {
            addCriterion("LAST_UPD_USR in", values, "lastUpdUsr");
            return (Criteria) this;
        }

        public Criteria andLastUpdUsrNotIn(List<String> values) {
            addCriterion("LAST_UPD_USR not in", values, "lastUpdUsr");
            return (Criteria) this;
        }

        public Criteria andLastUpdUsrBetween(String value1, String value2) {
            addCriterion("LAST_UPD_USR between", value1, value2, "lastUpdUsr");
            return (Criteria) this;
        }

        public Criteria andLastUpdUsrNotBetween(String value1, String value2) {
            addCriterion("LAST_UPD_USR not between", value1, value2, "lastUpdUsr");
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