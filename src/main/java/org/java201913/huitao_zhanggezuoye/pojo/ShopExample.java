package org.java201913.huitao_zhanggezuoye.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ShopExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ShopExample() {
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

        public Criteria andSidIsNull() {
            addCriterion("sid is null");
            return (Criteria) this;
        }

        public Criteria andSidIsNotNull() {
            addCriterion("sid is not null");
            return (Criteria) this;
        }

        public Criteria andSidEqualTo(Integer value) {
            addCriterion("sid =", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotEqualTo(Integer value) {
            addCriterion("sid <>", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidGreaterThan(Integer value) {
            addCriterion("sid >", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidGreaterThanOrEqualTo(Integer value) {
            addCriterion("sid >=", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidLessThan(Integer value) {
            addCriterion("sid <", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidLessThanOrEqualTo(Integer value) {
            addCriterion("sid <=", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidIn(List<Integer> values) {
            addCriterion("sid in", values, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotIn(List<Integer> values) {
            addCriterion("sid not in", values, "sid");
            return (Criteria) this;
        }

        public Criteria andSidBetween(Integer value1, Integer value2) {
            addCriterion("sid between", value1, value2, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotBetween(Integer value1, Integer value2) {
            addCriterion("sid not between", value1, value2, "sid");
            return (Criteria) this;
        }

        public Criteria andSnameIsNull() {
            addCriterion("sname is null");
            return (Criteria) this;
        }

        public Criteria andSnameIsNotNull() {
            addCriterion("sname is not null");
            return (Criteria) this;
        }

        public Criteria andSnameEqualTo(String value) {
            addCriterion("sname =", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameNotEqualTo(String value) {
            addCriterion("sname <>", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameGreaterThan(String value) {
            addCriterion("sname >", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameGreaterThanOrEqualTo(String value) {
            addCriterion("sname >=", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameLessThan(String value) {
            addCriterion("sname <", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameLessThanOrEqualTo(String value) {
            addCriterion("sname <=", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameLike(String value) {
            addCriterion("sname like", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameNotLike(String value) {
            addCriterion("sname not like", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameIn(List<String> values) {
            addCriterion("sname in", values, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameNotIn(List<String> values) {
            addCriterion("sname not in", values, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameBetween(String value1, String value2) {
            addCriterion("sname between", value1, value2, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameNotBetween(String value1, String value2) {
            addCriterion("sname not between", value1, value2, "sname");
            return (Criteria) this;
        }

        public Criteria andScodeIsNull() {
            addCriterion("scode is null");
            return (Criteria) this;
        }

        public Criteria andScodeIsNotNull() {
            addCriterion("scode is not null");
            return (Criteria) this;
        }

        public Criteria andScodeEqualTo(String value) {
            addCriterion("scode =", value, "scode");
            return (Criteria) this;
        }

        public Criteria andScodeNotEqualTo(String value) {
            addCriterion("scode <>", value, "scode");
            return (Criteria) this;
        }

        public Criteria andScodeGreaterThan(String value) {
            addCriterion("scode >", value, "scode");
            return (Criteria) this;
        }

        public Criteria andScodeGreaterThanOrEqualTo(String value) {
            addCriterion("scode >=", value, "scode");
            return (Criteria) this;
        }

        public Criteria andScodeLessThan(String value) {
            addCriterion("scode <", value, "scode");
            return (Criteria) this;
        }

        public Criteria andScodeLessThanOrEqualTo(String value) {
            addCriterion("scode <=", value, "scode");
            return (Criteria) this;
        }

        public Criteria andScodeLike(String value) {
            addCriterion("scode like", value, "scode");
            return (Criteria) this;
        }

        public Criteria andScodeNotLike(String value) {
            addCriterion("scode not like", value, "scode");
            return (Criteria) this;
        }

        public Criteria andScodeIn(List<String> values) {
            addCriterion("scode in", values, "scode");
            return (Criteria) this;
        }

        public Criteria andScodeNotIn(List<String> values) {
            addCriterion("scode not in", values, "scode");
            return (Criteria) this;
        }

        public Criteria andScodeBetween(String value1, String value2) {
            addCriterion("scode between", value1, value2, "scode");
            return (Criteria) this;
        }

        public Criteria andScodeNotBetween(String value1, String value2) {
            addCriterion("scode not between", value1, value2, "scode");
            return (Criteria) this;
        }

        public Criteria andSweightIsNull() {
            addCriterion("sweight is null");
            return (Criteria) this;
        }

        public Criteria andSweightIsNotNull() {
            addCriterion("sweight is not null");
            return (Criteria) this;
        }

        public Criteria andSweightEqualTo(Double value) {
            addCriterion("sweight =", value, "sweight");
            return (Criteria) this;
        }

        public Criteria andSweightNotEqualTo(Double value) {
            addCriterion("sweight <>", value, "sweight");
            return (Criteria) this;
        }

        public Criteria andSweightGreaterThan(Double value) {
            addCriterion("sweight >", value, "sweight");
            return (Criteria) this;
        }

        public Criteria andSweightGreaterThanOrEqualTo(Double value) {
            addCriterion("sweight >=", value, "sweight");
            return (Criteria) this;
        }

        public Criteria andSweightLessThan(Double value) {
            addCriterion("sweight <", value, "sweight");
            return (Criteria) this;
        }

        public Criteria andSweightLessThanOrEqualTo(Double value) {
            addCriterion("sweight <=", value, "sweight");
            return (Criteria) this;
        }

        public Criteria andSweightIn(List<Double> values) {
            addCriterion("sweight in", values, "sweight");
            return (Criteria) this;
        }

        public Criteria andSweightNotIn(List<Double> values) {
            addCriterion("sweight not in", values, "sweight");
            return (Criteria) this;
        }

        public Criteria andSweightBetween(Double value1, Double value2) {
            addCriterion("sweight between", value1, value2, "sweight");
            return (Criteria) this;
        }

        public Criteria andSweightNotBetween(Double value1, Double value2) {
            addCriterion("sweight not between", value1, value2, "sweight");
            return (Criteria) this;
        }

        public Criteria andSStoreIdIsNull() {
            addCriterion("s_store_id is null");
            return (Criteria) this;
        }

        public Criteria andSStoreIdIsNotNull() {
            addCriterion("s_store_id is not null");
            return (Criteria) this;
        }

        public Criteria andSStoreIdEqualTo(Integer value) {
            addCriterion("s_store_id =", value, "sStoreId");
            return (Criteria) this;
        }

        public Criteria andSStoreIdNotEqualTo(Integer value) {
            addCriterion("s_store_id <>", value, "sStoreId");
            return (Criteria) this;
        }

        public Criteria andSStoreIdGreaterThan(Integer value) {
            addCriterion("s_store_id >", value, "sStoreId");
            return (Criteria) this;
        }

        public Criteria andSStoreIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("s_store_id >=", value, "sStoreId");
            return (Criteria) this;
        }

        public Criteria andSStoreIdLessThan(Integer value) {
            addCriterion("s_store_id <", value, "sStoreId");
            return (Criteria) this;
        }

        public Criteria andSStoreIdLessThanOrEqualTo(Integer value) {
            addCriterion("s_store_id <=", value, "sStoreId");
            return (Criteria) this;
        }

        public Criteria andSStoreIdIn(List<Integer> values) {
            addCriterion("s_store_id in", values, "sStoreId");
            return (Criteria) this;
        }

        public Criteria andSStoreIdNotIn(List<Integer> values) {
            addCriterion("s_store_id not in", values, "sStoreId");
            return (Criteria) this;
        }

        public Criteria andSStoreIdBetween(Integer value1, Integer value2) {
            addCriterion("s_store_id between", value1, value2, "sStoreId");
            return (Criteria) this;
        }

        public Criteria andSStoreIdNotBetween(Integer value1, Integer value2) {
            addCriterion("s_store_id not between", value1, value2, "sStoreId");
            return (Criteria) this;
        }

        public Criteria andSmaterialIsNull() {
            addCriterion("smaterial is null");
            return (Criteria) this;
        }

        public Criteria andSmaterialIsNotNull() {
            addCriterion("smaterial is not null");
            return (Criteria) this;
        }

        public Criteria andSmaterialEqualTo(String value) {
            addCriterion("smaterial =", value, "smaterial");
            return (Criteria) this;
        }

        public Criteria andSmaterialNotEqualTo(String value) {
            addCriterion("smaterial <>", value, "smaterial");
            return (Criteria) this;
        }

        public Criteria andSmaterialGreaterThan(String value) {
            addCriterion("smaterial >", value, "smaterial");
            return (Criteria) this;
        }

        public Criteria andSmaterialGreaterThanOrEqualTo(String value) {
            addCriterion("smaterial >=", value, "smaterial");
            return (Criteria) this;
        }

        public Criteria andSmaterialLessThan(String value) {
            addCriterion("smaterial <", value, "smaterial");
            return (Criteria) this;
        }

        public Criteria andSmaterialLessThanOrEqualTo(String value) {
            addCriterion("smaterial <=", value, "smaterial");
            return (Criteria) this;
        }

        public Criteria andSmaterialLike(String value) {
            addCriterion("smaterial like", value, "smaterial");
            return (Criteria) this;
        }

        public Criteria andSmaterialNotLike(String value) {
            addCriterion("smaterial not like", value, "smaterial");
            return (Criteria) this;
        }

        public Criteria andSmaterialIn(List<String> values) {
            addCriterion("smaterial in", values, "smaterial");
            return (Criteria) this;
        }

        public Criteria andSmaterialNotIn(List<String> values) {
            addCriterion("smaterial not in", values, "smaterial");
            return (Criteria) this;
        }

        public Criteria andSmaterialBetween(String value1, String value2) {
            addCriterion("smaterial between", value1, value2, "smaterial");
            return (Criteria) this;
        }

        public Criteria andSmaterialNotBetween(String value1, String value2) {
            addCriterion("smaterial not between", value1, value2, "smaterial");
            return (Criteria) this;
        }

        public Criteria andSaddtimeIsNull() {
            addCriterion("saddtime is null");
            return (Criteria) this;
        }

        public Criteria andSaddtimeIsNotNull() {
            addCriterion("saddtime is not null");
            return (Criteria) this;
        }

        public Criteria andSaddtimeEqualTo(Date value) {
            addCriterion("saddtime =", value, "saddtime");
            return (Criteria) this;
        }

        public Criteria andSaddtimeNotEqualTo(Date value) {
            addCriterion("saddtime <>", value, "saddtime");
            return (Criteria) this;
        }

        public Criteria andSaddtimeGreaterThan(Date value) {
            addCriterion("saddtime >", value, "saddtime");
            return (Criteria) this;
        }

        public Criteria andSaddtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("saddtime >=", value, "saddtime");
            return (Criteria) this;
        }

        public Criteria andSaddtimeLessThan(Date value) {
            addCriterion("saddtime <", value, "saddtime");
            return (Criteria) this;
        }

        public Criteria andSaddtimeLessThanOrEqualTo(Date value) {
            addCriterion("saddtime <=", value, "saddtime");
            return (Criteria) this;
        }

        public Criteria andSaddtimeIn(List<Date> values) {
            addCriterion("saddtime in", values, "saddtime");
            return (Criteria) this;
        }

        public Criteria andSaddtimeNotIn(List<Date> values) {
            addCriterion("saddtime not in", values, "saddtime");
            return (Criteria) this;
        }

        public Criteria andSaddtimeBetween(Date value1, Date value2) {
            addCriterion("saddtime between", value1, value2, "saddtime");
            return (Criteria) this;
        }

        public Criteria andSaddtimeNotBetween(Date value1, Date value2) {
            addCriterion("saddtime not between", value1, value2, "saddtime");
            return (Criteria) this;
        }

        public Criteria andSStcidIsNull() {
            addCriterion("s_stcid is null");
            return (Criteria) this;
        }

        public Criteria andSStcidIsNotNull() {
            addCriterion("s_stcid is not null");
            return (Criteria) this;
        }

        public Criteria andSStcidEqualTo(Integer value) {
            addCriterion("s_stcid =", value, "sStcid");
            return (Criteria) this;
        }

        public Criteria andSStcidNotEqualTo(Integer value) {
            addCriterion("s_stcid <>", value, "sStcid");
            return (Criteria) this;
        }

        public Criteria andSStcidGreaterThan(Integer value) {
            addCriterion("s_stcid >", value, "sStcid");
            return (Criteria) this;
        }

        public Criteria andSStcidGreaterThanOrEqualTo(Integer value) {
            addCriterion("s_stcid >=", value, "sStcid");
            return (Criteria) this;
        }

        public Criteria andSStcidLessThan(Integer value) {
            addCriterion("s_stcid <", value, "sStcid");
            return (Criteria) this;
        }

        public Criteria andSStcidLessThanOrEqualTo(Integer value) {
            addCriterion("s_stcid <=", value, "sStcid");
            return (Criteria) this;
        }

        public Criteria andSStcidIn(List<Integer> values) {
            addCriterion("s_stcid in", values, "sStcid");
            return (Criteria) this;
        }

        public Criteria andSStcidNotIn(List<Integer> values) {
            addCriterion("s_stcid not in", values, "sStcid");
            return (Criteria) this;
        }

        public Criteria andSStcidBetween(Integer value1, Integer value2) {
            addCriterion("s_stcid between", value1, value2, "sStcid");
            return (Criteria) this;
        }

        public Criteria andSStcidNotBetween(Integer value1, Integer value2) {
            addCriterion("s_stcid not between", value1, value2, "sStcid");
            return (Criteria) this;
        }

        public Criteria andSpriceIsNull() {
            addCriterion("sprice is null");
            return (Criteria) this;
        }

        public Criteria andSpriceIsNotNull() {
            addCriterion("sprice is not null");
            return (Criteria) this;
        }

        public Criteria andSpriceEqualTo(Double value) {
            addCriterion("sprice =", value, "sprice");
            return (Criteria) this;
        }

        public Criteria andSpriceNotEqualTo(Double value) {
            addCriterion("sprice <>", value, "sprice");
            return (Criteria) this;
        }

        public Criteria andSpriceGreaterThan(Double value) {
            addCriterion("sprice >", value, "sprice");
            return (Criteria) this;
        }

        public Criteria andSpriceGreaterThanOrEqualTo(Double value) {
            addCriterion("sprice >=", value, "sprice");
            return (Criteria) this;
        }

        public Criteria andSpriceLessThan(Double value) {
            addCriterion("sprice <", value, "sprice");
            return (Criteria) this;
        }

        public Criteria andSpriceLessThanOrEqualTo(Double value) {
            addCriterion("sprice <=", value, "sprice");
            return (Criteria) this;
        }

        public Criteria andSpriceIn(List<Double> values) {
            addCriterion("sprice in", values, "sprice");
            return (Criteria) this;
        }

        public Criteria andSpriceNotIn(List<Double> values) {
            addCriterion("sprice not in", values, "sprice");
            return (Criteria) this;
        }

        public Criteria andSpriceBetween(Double value1, Double value2) {
            addCriterion("sprice between", value1, value2, "sprice");
            return (Criteria) this;
        }

        public Criteria andSpriceNotBetween(Double value1, Double value2) {
            addCriterion("sprice not between", value1, value2, "sprice");
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