package com.own.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CheckworkInfExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CheckworkInfExample() {
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
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andDeptIdIsNull() {
            addCriterion("DEPT_ID is null");
            return (Criteria) this;
        }

        public Criteria andDeptIdIsNotNull() {
            addCriterion("DEPT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDeptIdEqualTo(Integer value) {
            addCriterion("DEPT_ID =", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdNotEqualTo(Integer value) {
            addCriterion("DEPT_ID <>", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdGreaterThan(Integer value) {
            addCriterion("DEPT_ID >", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("DEPT_ID >=", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdLessThan(Integer value) {
            addCriterion("DEPT_ID <", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdLessThanOrEqualTo(Integer value) {
            addCriterion("DEPT_ID <=", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdIn(List<Integer> values) {
            addCriterion("DEPT_ID in", values, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdNotIn(List<Integer> values) {
            addCriterion("DEPT_ID not in", values, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdBetween(Integer value1, Integer value2) {
            addCriterion("DEPT_ID between", value1, value2, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdNotBetween(Integer value1, Integer value2) {
            addCriterion("DEPT_ID not between", value1, value2, "deptId");
            return (Criteria) this;
        }

        public Criteria andJobIdIsNull() {
            addCriterion("JOB_ID is null");
            return (Criteria) this;
        }

        public Criteria andJobIdIsNotNull() {
            addCriterion("JOB_ID is not null");
            return (Criteria) this;
        }

        public Criteria andJobIdEqualTo(Integer value) {
            addCriterion("JOB_ID =", value, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdNotEqualTo(Integer value) {
            addCriterion("JOB_ID <>", value, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdGreaterThan(Integer value) {
            addCriterion("JOB_ID >", value, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("JOB_ID >=", value, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdLessThan(Integer value) {
            addCriterion("JOB_ID <", value, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdLessThanOrEqualTo(Integer value) {
            addCriterion("JOB_ID <=", value, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdIn(List<Integer> values) {
            addCriterion("JOB_ID in", values, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdNotIn(List<Integer> values) {
            addCriterion("JOB_ID not in", values, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdBetween(Integer value1, Integer value2) {
            addCriterion("JOB_ID between", value1, value2, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdNotBetween(Integer value1, Integer value2) {
            addCriterion("JOB_ID not between", value1, value2, "jobId");
            return (Criteria) this;
        }

        public Criteria andEmpIdIsNull() {
            addCriterion("EMP_ID is null");
            return (Criteria) this;
        }

        public Criteria andEmpIdIsNotNull() {
            addCriterion("EMP_ID is not null");
            return (Criteria) this;
        }

        public Criteria andEmpIdEqualTo(Integer value) {
            addCriterion("EMP_ID =", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdNotEqualTo(Integer value) {
            addCriterion("EMP_ID <>", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdGreaterThan(Integer value) {
            addCriterion("EMP_ID >", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("EMP_ID >=", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdLessThan(Integer value) {
            addCriterion("EMP_ID <", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdLessThanOrEqualTo(Integer value) {
            addCriterion("EMP_ID <=", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdIn(List<Integer> values) {
            addCriterion("EMP_ID in", values, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdNotIn(List<Integer> values) {
            addCriterion("EMP_ID not in", values, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdBetween(Integer value1, Integer value2) {
            addCriterion("EMP_ID between", value1, value2, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdNotBetween(Integer value1, Integer value2) {
            addCriterion("EMP_ID not between", value1, value2, "empId");
            return (Criteria) this;
        }

        public Criteria andWorkingdaysIsNull() {
            addCriterion("WORKINGDAYS is null");
            return (Criteria) this;
        }

        public Criteria andWorkingdaysIsNotNull() {
            addCriterion("WORKINGDAYS is not null");
            return (Criteria) this;
        }

        public Criteria andWorkingdaysEqualTo(Integer value) {
            addCriterion("WORKINGDAYS =", value, "workingdays");
            return (Criteria) this;
        }

        public Criteria andWorkingdaysNotEqualTo(Integer value) {
            addCriterion("WORKINGDAYS <>", value, "workingdays");
            return (Criteria) this;
        }

        public Criteria andWorkingdaysGreaterThan(Integer value) {
            addCriterion("WORKINGDAYS >", value, "workingdays");
            return (Criteria) this;
        }

        public Criteria andWorkingdaysGreaterThanOrEqualTo(Integer value) {
            addCriterion("WORKINGDAYS >=", value, "workingdays");
            return (Criteria) this;
        }

        public Criteria andWorkingdaysLessThan(Integer value) {
            addCriterion("WORKINGDAYS <", value, "workingdays");
            return (Criteria) this;
        }

        public Criteria andWorkingdaysLessThanOrEqualTo(Integer value) {
            addCriterion("WORKINGDAYS <=", value, "workingdays");
            return (Criteria) this;
        }

        public Criteria andWorkingdaysIn(List<Integer> values) {
            addCriterion("WORKINGDAYS in", values, "workingdays");
            return (Criteria) this;
        }

        public Criteria andWorkingdaysNotIn(List<Integer> values) {
            addCriterion("WORKINGDAYS not in", values, "workingdays");
            return (Criteria) this;
        }

        public Criteria andWorkingdaysBetween(Integer value1, Integer value2) {
            addCriterion("WORKINGDAYS between", value1, value2, "workingdays");
            return (Criteria) this;
        }

        public Criteria andWorkingdaysNotBetween(Integer value1, Integer value2) {
            addCriterion("WORKINGDAYS not between", value1, value2, "workingdays");
            return (Criteria) this;
        }

        public Criteria andDaysleaveIsNull() {
            addCriterion("DAYSLEAVE is null");
            return (Criteria) this;
        }

        public Criteria andDaysleaveIsNotNull() {
            addCriterion("DAYSLEAVE is not null");
            return (Criteria) this;
        }

        public Criteria andDaysleaveEqualTo(Integer value) {
            addCriterion("DAYSLEAVE =", value, "daysleave");
            return (Criteria) this;
        }

        public Criteria andDaysleaveNotEqualTo(Integer value) {
            addCriterion("DAYSLEAVE <>", value, "daysleave");
            return (Criteria) this;
        }

        public Criteria andDaysleaveGreaterThan(Integer value) {
            addCriterion("DAYSLEAVE >", value, "daysleave");
            return (Criteria) this;
        }

        public Criteria andDaysleaveGreaterThanOrEqualTo(Integer value) {
            addCriterion("DAYSLEAVE >=", value, "daysleave");
            return (Criteria) this;
        }

        public Criteria andDaysleaveLessThan(Integer value) {
            addCriterion("DAYSLEAVE <", value, "daysleave");
            return (Criteria) this;
        }

        public Criteria andDaysleaveLessThanOrEqualTo(Integer value) {
            addCriterion("DAYSLEAVE <=", value, "daysleave");
            return (Criteria) this;
        }

        public Criteria andDaysleaveIn(List<Integer> values) {
            addCriterion("DAYSLEAVE in", values, "daysleave");
            return (Criteria) this;
        }

        public Criteria andDaysleaveNotIn(List<Integer> values) {
            addCriterion("DAYSLEAVE not in", values, "daysleave");
            return (Criteria) this;
        }

        public Criteria andDaysleaveBetween(Integer value1, Integer value2) {
            addCriterion("DAYSLEAVE between", value1, value2, "daysleave");
            return (Criteria) this;
        }

        public Criteria andDaysleaveNotBetween(Integer value1, Integer value2) {
            addCriterion("DAYSLEAVE not between", value1, value2, "daysleave");
            return (Criteria) this;
        }

        public Criteria andCreatedateIsNull() {
            addCriterion("CREATEDATE is null");
            return (Criteria) this;
        }

        public Criteria andCreatedateIsNotNull() {
            addCriterion("CREATEDATE is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedateEqualTo(Date value) {
            addCriterion("CREATEDATE =", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotEqualTo(Date value) {
            addCriterion("CREATEDATE <>", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateGreaterThan(Date value) {
            addCriterion("CREATEDATE >", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATEDATE >=", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateLessThan(Date value) {
            addCriterion("CREATEDATE <", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateLessThanOrEqualTo(Date value) {
            addCriterion("CREATEDATE <=", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateIn(List<Date> values) {
            addCriterion("CREATEDATE in", values, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotIn(List<Date> values) {
            addCriterion("CREATEDATE not in", values, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateBetween(Date value1, Date value2) {
            addCriterion("CREATEDATE between", value1, value2, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotBetween(Date value1, Date value2) {
            addCriterion("CREATEDATE not between", value1, value2, "createdate");
            return (Criteria) this;
        }

        public Criteria andDaysoutIsNull() {
            addCriterion("DAYSOUT is null");
            return (Criteria) this;
        }

        public Criteria andDaysoutIsNotNull() {
            addCriterion("DAYSOUT is not null");
            return (Criteria) this;
        }

        public Criteria andDaysoutEqualTo(Integer value) {
            addCriterion("DAYSOUT =", value, "daysout");
            return (Criteria) this;
        }

        public Criteria andDaysoutNotEqualTo(Integer value) {
            addCriterion("DAYSOUT <>", value, "daysout");
            return (Criteria) this;
        }

        public Criteria andDaysoutGreaterThan(Integer value) {
            addCriterion("DAYSOUT >", value, "daysout");
            return (Criteria) this;
        }

        public Criteria andDaysoutGreaterThanOrEqualTo(Integer value) {
            addCriterion("DAYSOUT >=", value, "daysout");
            return (Criteria) this;
        }

        public Criteria andDaysoutLessThan(Integer value) {
            addCriterion("DAYSOUT <", value, "daysout");
            return (Criteria) this;
        }

        public Criteria andDaysoutLessThanOrEqualTo(Integer value) {
            addCriterion("DAYSOUT <=", value, "daysout");
            return (Criteria) this;
        }

        public Criteria andDaysoutIn(List<Integer> values) {
            addCriterion("DAYSOUT in", values, "daysout");
            return (Criteria) this;
        }

        public Criteria andDaysoutNotIn(List<Integer> values) {
            addCriterion("DAYSOUT not in", values, "daysout");
            return (Criteria) this;
        }

        public Criteria andDaysoutBetween(Integer value1, Integer value2) {
            addCriterion("DAYSOUT between", value1, value2, "daysout");
            return (Criteria) this;
        }

        public Criteria andDaysoutNotBetween(Integer value1, Integer value2) {
            addCriterion("DAYSOUT not between", value1, value2, "daysout");
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