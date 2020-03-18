package org.java201913.huitao_zhanggezuoye.pojo;

import java.util.ArrayList;
import java.util.List;

public class StylechildExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StylechildExample() {
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

        public Criteria andStcidIsNull() {
            addCriterion("stcid is null");
            return (Criteria) this;
        }

        public Criteria andStcidIsNotNull() {
            addCriterion("stcid is not null");
            return (Criteria) this;
        }

        public Criteria andStcidEqualTo(Integer value) {
            addCriterion("stcid =", value, "stcid");
            return (Criteria) this;
        }

        public Criteria andStcidNotEqualTo(Integer value) {
            addCriterion("stcid <>", value, "stcid");
            return (Criteria) this;
        }

        public Criteria andStcidGreaterThan(Integer value) {
            addCriterion("stcid >", value, "stcid");
            return (Criteria) this;
        }

        public Criteria andStcidGreaterThanOrEqualTo(Integer value) {
            addCriterion("stcid >=", value, "stcid");
            return (Criteria) this;
        }

        public Criteria andStcidLessThan(Integer value) {
            addCriterion("stcid <", value, "stcid");
            return (Criteria) this;
        }

        public Criteria andStcidLessThanOrEqualTo(Integer value) {
            addCriterion("stcid <=", value, "stcid");
            return (Criteria) this;
        }

        public Criteria andStcidIn(List<Integer> values) {
            addCriterion("stcid in", values, "stcid");
            return (Criteria) this;
        }

        public Criteria andStcidNotIn(List<Integer> values) {
            addCriterion("stcid not in", values, "stcid");
            return (Criteria) this;
        }

        public Criteria andStcidBetween(Integer value1, Integer value2) {
            addCriterion("stcid between", value1, value2, "stcid");
            return (Criteria) this;
        }

        public Criteria andStcidNotBetween(Integer value1, Integer value2) {
            addCriterion("stcid not between", value1, value2, "stcid");
            return (Criteria) this;
        }

        public Criteria andStcnameIsNull() {
            addCriterion("stcname is null");
            return (Criteria) this;
        }

        public Criteria andStcnameIsNotNull() {
            addCriterion("stcname is not null");
            return (Criteria) this;
        }

        public Criteria andStcnameEqualTo(String value) {
            addCriterion("stcname =", value, "stcname");
            return (Criteria) this;
        }

        public Criteria andStcnameNotEqualTo(String value) {
            addCriterion("stcname <>", value, "stcname");
            return (Criteria) this;
        }

        public Criteria andStcnameGreaterThan(String value) {
            addCriterion("stcname >", value, "stcname");
            return (Criteria) this;
        }

        public Criteria andStcnameGreaterThanOrEqualTo(String value) {
            addCriterion("stcname >=", value, "stcname");
            return (Criteria) this;
        }

        public Criteria andStcnameLessThan(String value) {
            addCriterion("stcname <", value, "stcname");
            return (Criteria) this;
        }

        public Criteria andStcnameLessThanOrEqualTo(String value) {
            addCriterion("stcname <=", value, "stcname");
            return (Criteria) this;
        }

        public Criteria andStcnameLike(String value) {
            addCriterion("stcname like", value, "stcname");
            return (Criteria) this;
        }

        public Criteria andStcnameNotLike(String value) {
            addCriterion("stcname not like", value, "stcname");
            return (Criteria) this;
        }

        public Criteria andStcnameIn(List<String> values) {
            addCriterion("stcname in", values, "stcname");
            return (Criteria) this;
        }

        public Criteria andStcnameNotIn(List<String> values) {
            addCriterion("stcname not in", values, "stcname");
            return (Criteria) this;
        }

        public Criteria andStcnameBetween(String value1, String value2) {
            addCriterion("stcname between", value1, value2, "stcname");
            return (Criteria) this;
        }

        public Criteria andStcnameNotBetween(String value1, String value2) {
            addCriterion("stcname not between", value1, value2, "stcname");
            return (Criteria) this;
        }

        public Criteria andStBidIsNull() {
            addCriterion("st_bid is null");
            return (Criteria) this;
        }

        public Criteria andStBidIsNotNull() {
            addCriterion("st_bid is not null");
            return (Criteria) this;
        }

        public Criteria andStBidEqualTo(Integer value) {
            addCriterion("st_bid =", value, "stBid");
            return (Criteria) this;
        }

        public Criteria andStBidNotEqualTo(Integer value) {
            addCriterion("st_bid <>", value, "stBid");
            return (Criteria) this;
        }

        public Criteria andStBidGreaterThan(Integer value) {
            addCriterion("st_bid >", value, "stBid");
            return (Criteria) this;
        }

        public Criteria andStBidGreaterThanOrEqualTo(Integer value) {
            addCriterion("st_bid >=", value, "stBid");
            return (Criteria) this;
        }

        public Criteria andStBidLessThan(Integer value) {
            addCriterion("st_bid <", value, "stBid");
            return (Criteria) this;
        }

        public Criteria andStBidLessThanOrEqualTo(Integer value) {
            addCriterion("st_bid <=", value, "stBid");
            return (Criteria) this;
        }

        public Criteria andStBidIn(List<Integer> values) {
            addCriterion("st_bid in", values, "stBid");
            return (Criteria) this;
        }

        public Criteria andStBidNotIn(List<Integer> values) {
            addCriterion("st_bid not in", values, "stBid");
            return (Criteria) this;
        }

        public Criteria andStBidBetween(Integer value1, Integer value2) {
            addCriterion("st_bid between", value1, value2, "stBid");
            return (Criteria) this;
        }

        public Criteria andStBidNotBetween(Integer value1, Integer value2) {
            addCriterion("st_bid not between", value1, value2, "stBid");
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