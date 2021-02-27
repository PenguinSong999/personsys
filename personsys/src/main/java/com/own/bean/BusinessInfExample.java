package com.own.bean;

import java.util.ArrayList;
import java.util.List;

public class BusinessInfExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BusinessInfExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andMailmarketingIsNull() {
            addCriterion("mailmarketing is null");
            return (Criteria) this;
        }

        public Criteria andMailmarketingIsNotNull() {
            addCriterion("mailmarketing is not null");
            return (Criteria) this;
        }

        public Criteria andMailmarketingEqualTo(Integer value) {
            addCriterion("mailmarketing =", value, "mailmarketing");
            return (Criteria) this;
        }

        public Criteria andMailmarketingNotEqualTo(Integer value) {
            addCriterion("mailmarketing <>", value, "mailmarketing");
            return (Criteria) this;
        }

        public Criteria andMailmarketingGreaterThan(Integer value) {
            addCriterion("mailmarketing >", value, "mailmarketing");
            return (Criteria) this;
        }

        public Criteria andMailmarketingGreaterThanOrEqualTo(Integer value) {
            addCriterion("mailmarketing >=", value, "mailmarketing");
            return (Criteria) this;
        }

        public Criteria andMailmarketingLessThan(Integer value) {
            addCriterion("mailmarketing <", value, "mailmarketing");
            return (Criteria) this;
        }

        public Criteria andMailmarketingLessThanOrEqualTo(Integer value) {
            addCriterion("mailmarketing <=", value, "mailmarketing");
            return (Criteria) this;
        }

        public Criteria andMailmarketingIn(List<Integer> values) {
            addCriterion("mailmarketing in", values, "mailmarketing");
            return (Criteria) this;
        }

        public Criteria andMailmarketingNotIn(List<Integer> values) {
            addCriterion("mailmarketing not in", values, "mailmarketing");
            return (Criteria) this;
        }

        public Criteria andMailmarketingBetween(Integer value1, Integer value2) {
            addCriterion("mailmarketing between", value1, value2, "mailmarketing");
            return (Criteria) this;
        }

        public Criteria andMailmarketingNotBetween(Integer value1, Integer value2) {
            addCriterion("mailmarketing not between", value1, value2, "mailmarketing");
            return (Criteria) this;
        }

        public Criteria andAllianceadvertisingIsNull() {
            addCriterion("allianceadvertising is null");
            return (Criteria) this;
        }

        public Criteria andAllianceadvertisingIsNotNull() {
            addCriterion("allianceadvertising is not null");
            return (Criteria) this;
        }

        public Criteria andAllianceadvertisingEqualTo(Integer value) {
            addCriterion("allianceadvertising =", value, "allianceadvertising");
            return (Criteria) this;
        }

        public Criteria andAllianceadvertisingNotEqualTo(Integer value) {
            addCriterion("allianceadvertising <>", value, "allianceadvertising");
            return (Criteria) this;
        }

        public Criteria andAllianceadvertisingGreaterThan(Integer value) {
            addCriterion("allianceadvertising >", value, "allianceadvertising");
            return (Criteria) this;
        }

        public Criteria andAllianceadvertisingGreaterThanOrEqualTo(Integer value) {
            addCriterion("allianceadvertising >=", value, "allianceadvertising");
            return (Criteria) this;
        }

        public Criteria andAllianceadvertisingLessThan(Integer value) {
            addCriterion("allianceadvertising <", value, "allianceadvertising");
            return (Criteria) this;
        }

        public Criteria andAllianceadvertisingLessThanOrEqualTo(Integer value) {
            addCriterion("allianceadvertising <=", value, "allianceadvertising");
            return (Criteria) this;
        }

        public Criteria andAllianceadvertisingIn(List<Integer> values) {
            addCriterion("allianceadvertising in", values, "allianceadvertising");
            return (Criteria) this;
        }

        public Criteria andAllianceadvertisingNotIn(List<Integer> values) {
            addCriterion("allianceadvertising not in", values, "allianceadvertising");
            return (Criteria) this;
        }

        public Criteria andAllianceadvertisingBetween(Integer value1, Integer value2) {
            addCriterion("allianceadvertising between", value1, value2, "allianceadvertising");
            return (Criteria) this;
        }

        public Criteria andAllianceadvertisingNotBetween(Integer value1, Integer value2) {
            addCriterion("allianceadvertising not between", value1, value2, "allianceadvertising");
            return (Criteria) this;
        }

        public Criteria andVideoadvertisingIsNull() {
            addCriterion("videoadvertising is null");
            return (Criteria) this;
        }

        public Criteria andVideoadvertisingIsNotNull() {
            addCriterion("videoadvertising is not null");
            return (Criteria) this;
        }

        public Criteria andVideoadvertisingEqualTo(Integer value) {
            addCriterion("videoadvertising =", value, "videoadvertising");
            return (Criteria) this;
        }

        public Criteria andVideoadvertisingNotEqualTo(Integer value) {
            addCriterion("videoadvertising <>", value, "videoadvertising");
            return (Criteria) this;
        }

        public Criteria andVideoadvertisingGreaterThan(Integer value) {
            addCriterion("videoadvertising >", value, "videoadvertising");
            return (Criteria) this;
        }

        public Criteria andVideoadvertisingGreaterThanOrEqualTo(Integer value) {
            addCriterion("videoadvertising >=", value, "videoadvertising");
            return (Criteria) this;
        }

        public Criteria andVideoadvertisingLessThan(Integer value) {
            addCriterion("videoadvertising <", value, "videoadvertising");
            return (Criteria) this;
        }

        public Criteria andVideoadvertisingLessThanOrEqualTo(Integer value) {
            addCriterion("videoadvertising <=", value, "videoadvertising");
            return (Criteria) this;
        }

        public Criteria andVideoadvertisingIn(List<Integer> values) {
            addCriterion("videoadvertising in", values, "videoadvertising");
            return (Criteria) this;
        }

        public Criteria andVideoadvertisingNotIn(List<Integer> values) {
            addCriterion("videoadvertising not in", values, "videoadvertising");
            return (Criteria) this;
        }

        public Criteria andVideoadvertisingBetween(Integer value1, Integer value2) {
            addCriterion("videoadvertising between", value1, value2, "videoadvertising");
            return (Criteria) this;
        }

        public Criteria andVideoadvertisingNotBetween(Integer value1, Integer value2) {
            addCriterion("videoadvertising not between", value1, value2, "videoadvertising");
            return (Criteria) this;
        }

        public Criteria andDirectaccessIsNull() {
            addCriterion("directaccess is null");
            return (Criteria) this;
        }

        public Criteria andDirectaccessIsNotNull() {
            addCriterion("directaccess is not null");
            return (Criteria) this;
        }

        public Criteria andDirectaccessEqualTo(Integer value) {
            addCriterion("directaccess =", value, "directaccess");
            return (Criteria) this;
        }

        public Criteria andDirectaccessNotEqualTo(Integer value) {
            addCriterion("directaccess <>", value, "directaccess");
            return (Criteria) this;
        }

        public Criteria andDirectaccessGreaterThan(Integer value) {
            addCriterion("directaccess >", value, "directaccess");
            return (Criteria) this;
        }

        public Criteria andDirectaccessGreaterThanOrEqualTo(Integer value) {
            addCriterion("directaccess >=", value, "directaccess");
            return (Criteria) this;
        }

        public Criteria andDirectaccessLessThan(Integer value) {
            addCriterion("directaccess <", value, "directaccess");
            return (Criteria) this;
        }

        public Criteria andDirectaccessLessThanOrEqualTo(Integer value) {
            addCriterion("directaccess <=", value, "directaccess");
            return (Criteria) this;
        }

        public Criteria andDirectaccessIn(List<Integer> values) {
            addCriterion("directaccess in", values, "directaccess");
            return (Criteria) this;
        }

        public Criteria andDirectaccessNotIn(List<Integer> values) {
            addCriterion("directaccess not in", values, "directaccess");
            return (Criteria) this;
        }

        public Criteria andDirectaccessBetween(Integer value1, Integer value2) {
            addCriterion("directaccess between", value1, value2, "directaccess");
            return (Criteria) this;
        }

        public Criteria andDirectaccessNotBetween(Integer value1, Integer value2) {
            addCriterion("directaccess not between", value1, value2, "directaccess");
            return (Criteria) this;
        }

        public Criteria andSearchengineIsNull() {
            addCriterion("searchengine is null");
            return (Criteria) this;
        }

        public Criteria andSearchengineIsNotNull() {
            addCriterion("searchengine is not null");
            return (Criteria) this;
        }

        public Criteria andSearchengineEqualTo(Integer value) {
            addCriterion("searchengine =", value, "searchengine");
            return (Criteria) this;
        }

        public Criteria andSearchengineNotEqualTo(Integer value) {
            addCriterion("searchengine <>", value, "searchengine");
            return (Criteria) this;
        }

        public Criteria andSearchengineGreaterThan(Integer value) {
            addCriterion("searchengine >", value, "searchengine");
            return (Criteria) this;
        }

        public Criteria andSearchengineGreaterThanOrEqualTo(Integer value) {
            addCriterion("searchengine >=", value, "searchengine");
            return (Criteria) this;
        }

        public Criteria andSearchengineLessThan(Integer value) {
            addCriterion("searchengine <", value, "searchengine");
            return (Criteria) this;
        }

        public Criteria andSearchengineLessThanOrEqualTo(Integer value) {
            addCriterion("searchengine <=", value, "searchengine");
            return (Criteria) this;
        }

        public Criteria andSearchengineIn(List<Integer> values) {
            addCriterion("searchengine in", values, "searchengine");
            return (Criteria) this;
        }

        public Criteria andSearchengineNotIn(List<Integer> values) {
            addCriterion("searchengine not in", values, "searchengine");
            return (Criteria) this;
        }

        public Criteria andSearchengineBetween(Integer value1, Integer value2) {
            addCriterion("searchengine between", value1, value2, "searchengine");
            return (Criteria) this;
        }

        public Criteria andSearchengineNotBetween(Integer value1, Integer value2) {
            addCriterion("searchengine not between", value1, value2, "searchengine");
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