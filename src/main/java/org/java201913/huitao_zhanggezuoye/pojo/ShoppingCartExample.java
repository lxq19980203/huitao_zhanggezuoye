package org.java201913.huitao_zhanggezuoye.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ShoppingCartExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ShoppingCartExample() {
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

        public Criteria andScidIsNull() {
            addCriterion("scid is null");
            return (Criteria) this;
        }

        public Criteria andScidIsNotNull() {
            addCriterion("scid is not null");
            return (Criteria) this;
        }

        public Criteria andScidEqualTo(Integer value) {
            addCriterion("scid =", value, "scid");
            return (Criteria) this;
        }

        public Criteria andScidNotEqualTo(Integer value) {
            addCriterion("scid <>", value, "scid");
            return (Criteria) this;
        }

        public Criteria andScidGreaterThan(Integer value) {
            addCriterion("scid >", value, "scid");
            return (Criteria) this;
        }

        public Criteria andScidGreaterThanOrEqualTo(Integer value) {
            addCriterion("scid >=", value, "scid");
            return (Criteria) this;
        }

        public Criteria andScidLessThan(Integer value) {
            addCriterion("scid <", value, "scid");
            return (Criteria) this;
        }

        public Criteria andScidLessThanOrEqualTo(Integer value) {
            addCriterion("scid <=", value, "scid");
            return (Criteria) this;
        }

        public Criteria andScidIn(List<Integer> values) {
            addCriterion("scid in", values, "scid");
            return (Criteria) this;
        }

        public Criteria andScidNotIn(List<Integer> values) {
            addCriterion("scid not in", values, "scid");
            return (Criteria) this;
        }

        public Criteria andScidBetween(Integer value1, Integer value2) {
            addCriterion("scid between", value1, value2, "scid");
            return (Criteria) this;
        }

        public Criteria andScidNotBetween(Integer value1, Integer value2) {
            addCriterion("scid not between", value1, value2, "scid");
            return (Criteria) this;
        }

        public Criteria andScUsidIsNull() {
            addCriterion("sc_usid is null");
            return (Criteria) this;
        }

        public Criteria andScUsidIsNotNull() {
            addCriterion("sc_usid is not null");
            return (Criteria) this;
        }

        public Criteria andScUsidEqualTo(Integer value) {
            addCriterion("sc_usid =", value, "scUsid");
            return (Criteria) this;
        }

        public Criteria andScUsidNotEqualTo(Integer value) {
            addCriterion("sc_usid <>", value, "scUsid");
            return (Criteria) this;
        }

        public Criteria andScUsidGreaterThan(Integer value) {
            addCriterion("sc_usid >", value, "scUsid");
            return (Criteria) this;
        }

        public Criteria andScUsidGreaterThanOrEqualTo(Integer value) {
            addCriterion("sc_usid >=", value, "scUsid");
            return (Criteria) this;
        }

        public Criteria andScUsidLessThan(Integer value) {
            addCriterion("sc_usid <", value, "scUsid");
            return (Criteria) this;
        }

        public Criteria andScUsidLessThanOrEqualTo(Integer value) {
            addCriterion("sc_usid <=", value, "scUsid");
            return (Criteria) this;
        }

        public Criteria andScUsidIn(List<Integer> values) {
            addCriterion("sc_usid in", values, "scUsid");
            return (Criteria) this;
        }

        public Criteria andScUsidNotIn(List<Integer> values) {
            addCriterion("sc_usid not in", values, "scUsid");
            return (Criteria) this;
        }

        public Criteria andScUsidBetween(Integer value1, Integer value2) {
            addCriterion("sc_usid between", value1, value2, "scUsid");
            return (Criteria) this;
        }

        public Criteria andScUsidNotBetween(Integer value1, Integer value2) {
            addCriterion("sc_usid not between", value1, value2, "scUsid");
            return (Criteria) this;
        }

        public Criteria andScSidIsNull() {
            addCriterion("sc_sid is null");
            return (Criteria) this;
        }

        public Criteria andScSidIsNotNull() {
            addCriterion("sc_sid is not null");
            return (Criteria) this;
        }

        public Criteria andScSidEqualTo(Integer value) {
            addCriterion("sc_sid =", value, "scSid");
            return (Criteria) this;
        }

        public Criteria andScSidNotEqualTo(Integer value) {
            addCriterion("sc_sid <>", value, "scSid");
            return (Criteria) this;
        }

        public Criteria andScSidGreaterThan(Integer value) {
            addCriterion("sc_sid >", value, "scSid");
            return (Criteria) this;
        }

        public Criteria andScSidGreaterThanOrEqualTo(Integer value) {
            addCriterion("sc_sid >=", value, "scSid");
            return (Criteria) this;
        }

        public Criteria andScSidLessThan(Integer value) {
            addCriterion("sc_sid <", value, "scSid");
            return (Criteria) this;
        }

        public Criteria andScSidLessThanOrEqualTo(Integer value) {
            addCriterion("sc_sid <=", value, "scSid");
            return (Criteria) this;
        }

        public Criteria andScSidIn(List<Integer> values) {
            addCriterion("sc_sid in", values, "scSid");
            return (Criteria) this;
        }

        public Criteria andScSidNotIn(List<Integer> values) {
            addCriterion("sc_sid not in", values, "scSid");
            return (Criteria) this;
        }

        public Criteria andScSidBetween(Integer value1, Integer value2) {
            addCriterion("sc_sid between", value1, value2, "scSid");
            return (Criteria) this;
        }

        public Criteria andScSidNotBetween(Integer value1, Integer value2) {
            addCriterion("sc_sid not between", value1, value2, "scSid");
            return (Criteria) this;
        }

        public Criteria andScnumIsNull() {
            addCriterion("scnum is null");
            return (Criteria) this;
        }

        public Criteria andScnumIsNotNull() {
            addCriterion("scnum is not null");
            return (Criteria) this;
        }

        public Criteria andScnumEqualTo(Integer value) {
            addCriterion("scnum =", value, "scnum");
            return (Criteria) this;
        }

        public Criteria andScnumNotEqualTo(Integer value) {
            addCriterion("scnum <>", value, "scnum");
            return (Criteria) this;
        }

        public Criteria andScnumGreaterThan(Integer value) {
            addCriterion("scnum >", value, "scnum");
            return (Criteria) this;
        }

        public Criteria andScnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("scnum >=", value, "scnum");
            return (Criteria) this;
        }

        public Criteria andScnumLessThan(Integer value) {
            addCriterion("scnum <", value, "scnum");
            return (Criteria) this;
        }

        public Criteria andScnumLessThanOrEqualTo(Integer value) {
            addCriterion("scnum <=", value, "scnum");
            return (Criteria) this;
        }

        public Criteria andScnumIn(List<Integer> values) {
            addCriterion("scnum in", values, "scnum");
            return (Criteria) this;
        }

        public Criteria andScnumNotIn(List<Integer> values) {
            addCriterion("scnum not in", values, "scnum");
            return (Criteria) this;
        }

        public Criteria andScnumBetween(Integer value1, Integer value2) {
            addCriterion("scnum between", value1, value2, "scnum");
            return (Criteria) this;
        }

        public Criteria andScnumNotBetween(Integer value1, Integer value2) {
            addCriterion("scnum not between", value1, value2, "scnum");
            return (Criteria) this;
        }

        public Criteria andScaddtimeIsNull() {
            addCriterion("scaddtime is null");
            return (Criteria) this;
        }

        public Criteria andScaddtimeIsNotNull() {
            addCriterion("scaddtime is not null");
            return (Criteria) this;
        }

        public Criteria andScaddtimeEqualTo(Date value) {
            addCriterion("scaddtime =", value, "scaddtime");
            return (Criteria) this;
        }

        public Criteria andScaddtimeNotEqualTo(Date value) {
            addCriterion("scaddtime <>", value, "scaddtime");
            return (Criteria) this;
        }

        public Criteria andScaddtimeGreaterThan(Date value) {
            addCriterion("scaddtime >", value, "scaddtime");
            return (Criteria) this;
        }

        public Criteria andScaddtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("scaddtime >=", value, "scaddtime");
            return (Criteria) this;
        }

        public Criteria andScaddtimeLessThan(Date value) {
            addCriterion("scaddtime <", value, "scaddtime");
            return (Criteria) this;
        }

        public Criteria andScaddtimeLessThanOrEqualTo(Date value) {
            addCriterion("scaddtime <=", value, "scaddtime");
            return (Criteria) this;
        }

        public Criteria andScaddtimeIn(List<Date> values) {
            addCriterion("scaddtime in", values, "scaddtime");
            return (Criteria) this;
        }

        public Criteria andScaddtimeNotIn(List<Date> values) {
            addCriterion("scaddtime not in", values, "scaddtime");
            return (Criteria) this;
        }

        public Criteria andScaddtimeBetween(Date value1, Date value2) {
            addCriterion("scaddtime between", value1, value2, "scaddtime");
            return (Criteria) this;
        }

        public Criteria andScaddtimeNotBetween(Date value1, Date value2) {
            addCriterion("scaddtime not between", value1, value2, "scaddtime");
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