package org.java201913.huitao_zhanggezuoye.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AdminExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AdminExample() {
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

        public Criteria andAdIdIsNull() {
            addCriterion("ad_id is null");
            return (Criteria) this;
        }

        public Criteria andAdIdIsNotNull() {
            addCriterion("ad_id is not null");
            return (Criteria) this;
        }

        public Criteria andAdIdEqualTo(Integer value) {
            addCriterion("ad_id =", value, "adId");
            return (Criteria) this;
        }

        public Criteria andAdIdNotEqualTo(Integer value) {
            addCriterion("ad_id <>", value, "adId");
            return (Criteria) this;
        }

        public Criteria andAdIdGreaterThan(Integer value) {
            addCriterion("ad_id >", value, "adId");
            return (Criteria) this;
        }

        public Criteria andAdIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ad_id >=", value, "adId");
            return (Criteria) this;
        }

        public Criteria andAdIdLessThan(Integer value) {
            addCriterion("ad_id <", value, "adId");
            return (Criteria) this;
        }

        public Criteria andAdIdLessThanOrEqualTo(Integer value) {
            addCriterion("ad_id <=", value, "adId");
            return (Criteria) this;
        }

        public Criteria andAdIdIn(List<Integer> values) {
            addCriterion("ad_id in", values, "adId");
            return (Criteria) this;
        }

        public Criteria andAdIdNotIn(List<Integer> values) {
            addCriterion("ad_id not in", values, "adId");
            return (Criteria) this;
        }

        public Criteria andAdIdBetween(Integer value1, Integer value2) {
            addCriterion("ad_id between", value1, value2, "adId");
            return (Criteria) this;
        }

        public Criteria andAdIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ad_id not between", value1, value2, "adId");
            return (Criteria) this;
        }

        public Criteria andAdNameIsNull() {
            addCriterion("ad_name is null");
            return (Criteria) this;
        }

        public Criteria andAdNameIsNotNull() {
            addCriterion("ad_name is not null");
            return (Criteria) this;
        }

        public Criteria andAdNameEqualTo(String value) {
            addCriterion("ad_name =", value, "adName");
            return (Criteria) this;
        }

        public Criteria andAdNameNotEqualTo(String value) {
            addCriterion("ad_name <>", value, "adName");
            return (Criteria) this;
        }

        public Criteria andAdNameGreaterThan(String value) {
            addCriterion("ad_name >", value, "adName");
            return (Criteria) this;
        }

        public Criteria andAdNameGreaterThanOrEqualTo(String value) {
            addCriterion("ad_name >=", value, "adName");
            return (Criteria) this;
        }

        public Criteria andAdNameLessThan(String value) {
            addCriterion("ad_name <", value, "adName");
            return (Criteria) this;
        }

        public Criteria andAdNameLessThanOrEqualTo(String value) {
            addCriterion("ad_name <=", value, "adName");
            return (Criteria) this;
        }

        public Criteria andAdNameLike(String value) {
            addCriterion("ad_name like", value, "adName");
            return (Criteria) this;
        }

        public Criteria andAdNameNotLike(String value) {
            addCriterion("ad_name not like", value, "adName");
            return (Criteria) this;
        }

        public Criteria andAdNameIn(List<String> values) {
            addCriterion("ad_name in", values, "adName");
            return (Criteria) this;
        }

        public Criteria andAdNameNotIn(List<String> values) {
            addCriterion("ad_name not in", values, "adName");
            return (Criteria) this;
        }

        public Criteria andAdNameBetween(String value1, String value2) {
            addCriterion("ad_name between", value1, value2, "adName");
            return (Criteria) this;
        }

        public Criteria andAdNameNotBetween(String value1, String value2) {
            addCriterion("ad_name not between", value1, value2, "adName");
            return (Criteria) this;
        }

        public Criteria andAdPassIsNull() {
            addCriterion("ad_pass is null");
            return (Criteria) this;
        }

        public Criteria andAdPassIsNotNull() {
            addCriterion("ad_pass is not null");
            return (Criteria) this;
        }

        public Criteria andAdPassEqualTo(String value) {
            addCriterion("ad_pass =", value, "adPass");
            return (Criteria) this;
        }

        public Criteria andAdPassNotEqualTo(String value) {
            addCriterion("ad_pass <>", value, "adPass");
            return (Criteria) this;
        }

        public Criteria andAdPassGreaterThan(String value) {
            addCriterion("ad_pass >", value, "adPass");
            return (Criteria) this;
        }

        public Criteria andAdPassGreaterThanOrEqualTo(String value) {
            addCriterion("ad_pass >=", value, "adPass");
            return (Criteria) this;
        }

        public Criteria andAdPassLessThan(String value) {
            addCriterion("ad_pass <", value, "adPass");
            return (Criteria) this;
        }

        public Criteria andAdPassLessThanOrEqualTo(String value) {
            addCriterion("ad_pass <=", value, "adPass");
            return (Criteria) this;
        }

        public Criteria andAdPassLike(String value) {
            addCriterion("ad_pass like", value, "adPass");
            return (Criteria) this;
        }

        public Criteria andAdPassNotLike(String value) {
            addCriterion("ad_pass not like", value, "adPass");
            return (Criteria) this;
        }

        public Criteria andAdPassIn(List<String> values) {
            addCriterion("ad_pass in", values, "adPass");
            return (Criteria) this;
        }

        public Criteria andAdPassNotIn(List<String> values) {
            addCriterion("ad_pass not in", values, "adPass");
            return (Criteria) this;
        }

        public Criteria andAdPassBetween(String value1, String value2) {
            addCriterion("ad_pass between", value1, value2, "adPass");
            return (Criteria) this;
        }

        public Criteria andAdPassNotBetween(String value1, String value2) {
            addCriterion("ad_pass not between", value1, value2, "adPass");
            return (Criteria) this;
        }

        public Criteria andAdAddtimeIsNull() {
            addCriterion("ad_addtime is null");
            return (Criteria) this;
        }

        public Criteria andAdAddtimeIsNotNull() {
            addCriterion("ad_addtime is not null");
            return (Criteria) this;
        }

        public Criteria andAdAddtimeEqualTo(Date value) {
            addCriterion("ad_addtime =", value, "adAddtime");
            return (Criteria) this;
        }

        public Criteria andAdAddtimeNotEqualTo(Date value) {
            addCriterion("ad_addtime <>", value, "adAddtime");
            return (Criteria) this;
        }

        public Criteria andAdAddtimeGreaterThan(Date value) {
            addCriterion("ad_addtime >", value, "adAddtime");
            return (Criteria) this;
        }

        public Criteria andAdAddtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ad_addtime >=", value, "adAddtime");
            return (Criteria) this;
        }

        public Criteria andAdAddtimeLessThan(Date value) {
            addCriterion("ad_addtime <", value, "adAddtime");
            return (Criteria) this;
        }

        public Criteria andAdAddtimeLessThanOrEqualTo(Date value) {
            addCriterion("ad_addtime <=", value, "adAddtime");
            return (Criteria) this;
        }

        public Criteria andAdAddtimeIn(List<Date> values) {
            addCriterion("ad_addtime in", values, "adAddtime");
            return (Criteria) this;
        }

        public Criteria andAdAddtimeNotIn(List<Date> values) {
            addCriterion("ad_addtime not in", values, "adAddtime");
            return (Criteria) this;
        }

        public Criteria andAdAddtimeBetween(Date value1, Date value2) {
            addCriterion("ad_addtime between", value1, value2, "adAddtime");
            return (Criteria) this;
        }

        public Criteria andAdAddtimeNotBetween(Date value1, Date value2) {
            addCriterion("ad_addtime not between", value1, value2, "adAddtime");
            return (Criteria) this;
        }

        public Criteria andAdStatusIsNull() {
            addCriterion("ad_status is null");
            return (Criteria) this;
        }

        public Criteria andAdStatusIsNotNull() {
            addCriterion("ad_status is not null");
            return (Criteria) this;
        }

        public Criteria andAdStatusEqualTo(Integer value) {
            addCriterion("ad_status =", value, "adStatus");
            return (Criteria) this;
        }

        public Criteria andAdStatusNotEqualTo(Integer value) {
            addCriterion("ad_status <>", value, "adStatus");
            return (Criteria) this;
        }

        public Criteria andAdStatusGreaterThan(Integer value) {
            addCriterion("ad_status >", value, "adStatus");
            return (Criteria) this;
        }

        public Criteria andAdStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("ad_status >=", value, "adStatus");
            return (Criteria) this;
        }

        public Criteria andAdStatusLessThan(Integer value) {
            addCriterion("ad_status <", value, "adStatus");
            return (Criteria) this;
        }

        public Criteria andAdStatusLessThanOrEqualTo(Integer value) {
            addCriterion("ad_status <=", value, "adStatus");
            return (Criteria) this;
        }

        public Criteria andAdStatusIn(List<Integer> values) {
            addCriterion("ad_status in", values, "adStatus");
            return (Criteria) this;
        }

        public Criteria andAdStatusNotIn(List<Integer> values) {
            addCriterion("ad_status not in", values, "adStatus");
            return (Criteria) this;
        }

        public Criteria andAdStatusBetween(Integer value1, Integer value2) {
            addCriterion("ad_status between", value1, value2, "adStatus");
            return (Criteria) this;
        }

        public Criteria andAdStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("ad_status not between", value1, value2, "adStatus");
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