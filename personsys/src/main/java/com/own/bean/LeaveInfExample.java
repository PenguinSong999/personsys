package com.own.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LeaveInfExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LeaveInfExample() {
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

        public Criteria andEmpIdIsNull() {
            addCriterion("emp_id is null");
            return (Criteria) this;
        }

        public Criteria andEmpIdIsNotNull() {
            addCriterion("emp_id is not null");
            return (Criteria) this;
        }

        public Criteria andEmpIdEqualTo(Integer value) {
            addCriterion("emp_id =", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdNotEqualTo(Integer value) {
            addCriterion("emp_id <>", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdGreaterThan(Integer value) {
            addCriterion("emp_id >", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("emp_id >=", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdLessThan(Integer value) {
            addCriterion("emp_id <", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdLessThanOrEqualTo(Integer value) {
            addCriterion("emp_id <=", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdIn(List<Integer> values) {
            addCriterion("emp_id in", values, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdNotIn(List<Integer> values) {
            addCriterion("emp_id not in", values, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdBetween(Integer value1, Integer value2) {
            addCriterion("emp_id between", value1, value2, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdNotBetween(Integer value1, Integer value2) {
            addCriterion("emp_id not between", value1, value2, "empId");
            return (Criteria) this;
        }

        public Criteria andDeptIdIsNull() {
            addCriterion("dept_id is null");
            return (Criteria) this;
        }

        public Criteria andDeptIdIsNotNull() {
            addCriterion("dept_id is not null");
            return (Criteria) this;
        }

        public Criteria andDeptIdEqualTo(Integer value) {
            addCriterion("dept_id =", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdNotEqualTo(Integer value) {
            addCriterion("dept_id <>", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdGreaterThan(Integer value) {
            addCriterion("dept_id >", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("dept_id >=", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdLessThan(Integer value) {
            addCriterion("dept_id <", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdLessThanOrEqualTo(Integer value) {
            addCriterion("dept_id <=", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdIn(List<Integer> values) {
            addCriterion("dept_id in", values, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdNotIn(List<Integer> values) {
            addCriterion("dept_id not in", values, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdBetween(Integer value1, Integer value2) {
            addCriterion("dept_id between", value1, value2, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdNotBetween(Integer value1, Integer value2) {
            addCriterion("dept_id not between", value1, value2, "deptId");
            return (Criteria) this;
        }

        public Criteria andJobIdIsNull() {
            addCriterion("job_id is null");
            return (Criteria) this;
        }

        public Criteria andJobIdIsNotNull() {
            addCriterion("job_id is not null");
            return (Criteria) this;
        }

        public Criteria andJobIdEqualTo(Integer value) {
            addCriterion("job_id =", value, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdNotEqualTo(Integer value) {
            addCriterion("job_id <>", value, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdGreaterThan(Integer value) {
            addCriterion("job_id >", value, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("job_id >=", value, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdLessThan(Integer value) {
            addCriterion("job_id <", value, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdLessThanOrEqualTo(Integer value) {
            addCriterion("job_id <=", value, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdIn(List<Integer> values) {
            addCriterion("job_id in", values, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdNotIn(List<Integer> values) {
            addCriterion("job_id not in", values, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdBetween(Integer value1, Integer value2) {
            addCriterion("job_id between", value1, value2, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdNotBetween(Integer value1, Integer value2) {
            addCriterion("job_id not between", value1, value2, "jobId");
            return (Criteria) this;
        }

        public Criteria andStartdataIsNull() {
            addCriterion("startdata is null");
            return (Criteria) this;
        }

        public Criteria andStartdataIsNotNull() {
            addCriterion("startdata is not null");
            return (Criteria) this;
        }

        public Criteria andStartdataEqualTo(String value) {
            addCriterion("startdata =", value, "startdata");
            return (Criteria) this;
        }

        public Criteria andStartdataNotEqualTo(String value) {
            addCriterion("startdata <>", value, "startdata");
            return (Criteria) this;
        }

        public Criteria andStartdataGreaterThan(String value) {
            addCriterion("startdata >", value, "startdata");
            return (Criteria) this;
        }

        public Criteria andStartdataGreaterThanOrEqualTo(String value) {
            addCriterion("startdata >=", value, "startdata");
            return (Criteria) this;
        }

        public Criteria andStartdataLessThan(String value) {
            addCriterion("startdata <", value, "startdata");
            return (Criteria) this;
        }

        public Criteria andStartdataLessThanOrEqualTo(String value) {
            addCriterion("startdata <=", value, "startdata");
            return (Criteria) this;
        }

        public Criteria andStartdataLike(String value) {
            addCriterion("startdata like", value, "startdata");
            return (Criteria) this;
        }

        public Criteria andStartdataNotLike(String value) {
            addCriterion("startdata not like", value, "startdata");
            return (Criteria) this;
        }

        public Criteria andStartdataIn(List<String> values) {
            addCriterion("startdata in", values, "startdata");
            return (Criteria) this;
        }

        public Criteria andStartdataNotIn(List<String> values) {
            addCriterion("startdata not in", values, "startdata");
            return (Criteria) this;
        }

        public Criteria andStartdataBetween(String value1, String value2) {
            addCriterion("startdata between", value1, value2, "startdata");
            return (Criteria) this;
        }

        public Criteria andStartdataNotBetween(String value1, String value2) {
            addCriterion("startdata not between", value1, value2, "startdata");
            return (Criteria) this;
        }

        public Criteria andEnddataIsNull() {
            addCriterion("enddata is null");
            return (Criteria) this;
        }

        public Criteria andEnddataIsNotNull() {
            addCriterion("enddata is not null");
            return (Criteria) this;
        }

        public Criteria andEnddataEqualTo(String value) {
            addCriterion("enddata =", value, "enddata");
            return (Criteria) this;
        }

        public Criteria andEnddataNotEqualTo(String value) {
            addCriterion("enddata <>", value, "enddata");
            return (Criteria) this;
        }

        public Criteria andEnddataGreaterThan(String value) {
            addCriterion("enddata >", value, "enddata");
            return (Criteria) this;
        }

        public Criteria andEnddataGreaterThanOrEqualTo(String value) {
            addCriterion("enddata >=", value, "enddata");
            return (Criteria) this;
        }

        public Criteria andEnddataLessThan(String value) {
            addCriterion("enddata <", value, "enddata");
            return (Criteria) this;
        }

        public Criteria andEnddataLessThanOrEqualTo(String value) {
            addCriterion("enddata <=", value, "enddata");
            return (Criteria) this;
        }

        public Criteria andEnddataLike(String value) {
            addCriterion("enddata like", value, "enddata");
            return (Criteria) this;
        }

        public Criteria andEnddataNotLike(String value) {
            addCriterion("enddata not like", value, "enddata");
            return (Criteria) this;
        }

        public Criteria andEnddataIn(List<String> values) {
            addCriterion("enddata in", values, "enddata");
            return (Criteria) this;
        }

        public Criteria andEnddataNotIn(List<String> values) {
            addCriterion("enddata not in", values, "enddata");
            return (Criteria) this;
        }

        public Criteria andEnddataBetween(String value1, String value2) {
            addCriterion("enddata between", value1, value2, "enddata");
            return (Criteria) this;
        }

        public Criteria andEnddataNotBetween(String value1, String value2) {
            addCriterion("enddata not between", value1, value2, "enddata");
            return (Criteria) this;
        }

        public Criteria andLeavedaysIsNull() {
            addCriterion("leavedays is null");
            return (Criteria) this;
        }

        public Criteria andLeavedaysIsNotNull() {
            addCriterion("leavedays is not null");
            return (Criteria) this;
        }

        public Criteria andLeavedaysEqualTo(String value) {
            addCriterion("leavedays =", value, "leavedays");
            return (Criteria) this;
        }

        public Criteria andLeavedaysNotEqualTo(String value) {
            addCriterion("leavedays <>", value, "leavedays");
            return (Criteria) this;
        }

        public Criteria andLeavedaysGreaterThan(String value) {
            addCriterion("leavedays >", value, "leavedays");
            return (Criteria) this;
        }

        public Criteria andLeavedaysGreaterThanOrEqualTo(String value) {
            addCriterion("leavedays >=", value, "leavedays");
            return (Criteria) this;
        }

        public Criteria andLeavedaysLessThan(String value) {
            addCriterion("leavedays <", value, "leavedays");
            return (Criteria) this;
        }

        public Criteria andLeavedaysLessThanOrEqualTo(String value) {
            addCriterion("leavedays <=", value, "leavedays");
            return (Criteria) this;
        }

        public Criteria andLeavedaysLike(String value) {
            addCriterion("leavedays like", value, "leavedays");
            return (Criteria) this;
        }

        public Criteria andLeavedaysNotLike(String value) {
            addCriterion("leavedays not like", value, "leavedays");
            return (Criteria) this;
        }

        public Criteria andLeavedaysIn(List<String> values) {
            addCriterion("leavedays in", values, "leavedays");
            return (Criteria) this;
        }

        public Criteria andLeavedaysNotIn(List<String> values) {
            addCriterion("leavedays not in", values, "leavedays");
            return (Criteria) this;
        }

        public Criteria andLeavedaysBetween(String value1, String value2) {
            addCriterion("leavedays between", value1, value2, "leavedays");
            return (Criteria) this;
        }

        public Criteria andLeavedaysNotBetween(String value1, String value2) {
            addCriterion("leavedays not between", value1, value2, "leavedays");
            return (Criteria) this;
        }

        public Criteria andLeavetypeIdIsNull() {
            addCriterion("leavetype_id is null");
            return (Criteria) this;
        }

        public Criteria andLeavetypeIdIsNotNull() {
            addCriterion("leavetype_id is not null");
            return (Criteria) this;
        }

        public Criteria andLeavetypeIdEqualTo(Integer value) {
            addCriterion("leavetype_id =", value, "leavetypeId");
            return (Criteria) this;
        }

        public Criteria andLeavetypeIdNotEqualTo(Integer value) {
            addCriterion("leavetype_id <>", value, "leavetypeId");
            return (Criteria) this;
        }

        public Criteria andLeavetypeIdGreaterThan(Integer value) {
            addCriterion("leavetype_id >", value, "leavetypeId");
            return (Criteria) this;
        }

        public Criteria andLeavetypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("leavetype_id >=", value, "leavetypeId");
            return (Criteria) this;
        }

        public Criteria andLeavetypeIdLessThan(Integer value) {
            addCriterion("leavetype_id <", value, "leavetypeId");
            return (Criteria) this;
        }

        public Criteria andLeavetypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("leavetype_id <=", value, "leavetypeId");
            return (Criteria) this;
        }

        public Criteria andLeavetypeIdIn(List<Integer> values) {
            addCriterion("leavetype_id in", values, "leavetypeId");
            return (Criteria) this;
        }

        public Criteria andLeavetypeIdNotIn(List<Integer> values) {
            addCriterion("leavetype_id not in", values, "leavetypeId");
            return (Criteria) this;
        }

        public Criteria andLeavetypeIdBetween(Integer value1, Integer value2) {
            addCriterion("leavetype_id between", value1, value2, "leavetypeId");
            return (Criteria) this;
        }

        public Criteria andLeavetypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("leavetype_id not between", value1, value2, "leavetypeId");
            return (Criteria) this;
        }

        public Criteria andContentIsNull() {
            addCriterion("content is null");
            return (Criteria) this;
        }

        public Criteria andContentIsNotNull() {
            addCriterion("content is not null");
            return (Criteria) this;
        }

        public Criteria andContentEqualTo(String value) {
            addCriterion("content =", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotEqualTo(String value) {
            addCriterion("content <>", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThan(String value) {
            addCriterion("content >", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThanOrEqualTo(String value) {
            addCriterion("content >=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThan(String value) {
            addCriterion("content <", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThanOrEqualTo(String value) {
            addCriterion("content <=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLike(String value) {
            addCriterion("content like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotLike(String value) {
            addCriterion("content not like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentIn(List<String> values) {
            addCriterion("content in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotIn(List<String> values) {
            addCriterion("content not in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentBetween(String value1, String value2) {
            addCriterion("content between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotBetween(String value1, String value2) {
            addCriterion("content not between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andLeavestatusIdIsNull() {
            addCriterion("leavestatus_id is null");
            return (Criteria) this;
        }

        public Criteria andLeavestatusIdIsNotNull() {
            addCriterion("leavestatus_id is not null");
            return (Criteria) this;
        }

        public Criteria andLeavestatusIdEqualTo(Integer value) {
            addCriterion("leavestatus_id =", value, "leavestatusId");
            return (Criteria) this;
        }

        public Criteria andLeavestatusIdNotEqualTo(Integer value) {
            addCriterion("leavestatus_id <>", value, "leavestatusId");
            return (Criteria) this;
        }

        public Criteria andLeavestatusIdGreaterThan(Integer value) {
            addCriterion("leavestatus_id >", value, "leavestatusId");
            return (Criteria) this;
        }

        public Criteria andLeavestatusIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("leavestatus_id >=", value, "leavestatusId");
            return (Criteria) this;
        }

        public Criteria andLeavestatusIdLessThan(Integer value) {
            addCriterion("leavestatus_id <", value, "leavestatusId");
            return (Criteria) this;
        }

        public Criteria andLeavestatusIdLessThanOrEqualTo(Integer value) {
            addCriterion("leavestatus_id <=", value, "leavestatusId");
            return (Criteria) this;
        }

        public Criteria andLeavestatusIdIn(List<Integer> values) {
            addCriterion("leavestatus_id in", values, "leavestatusId");
            return (Criteria) this;
        }

        public Criteria andLeavestatusIdNotIn(List<Integer> values) {
            addCriterion("leavestatus_id not in", values, "leavestatusId");
            return (Criteria) this;
        }

        public Criteria andLeavestatusIdBetween(Integer value1, Integer value2) {
            addCriterion("leavestatus_id between", value1, value2, "leavestatusId");
            return (Criteria) this;
        }

        public Criteria andLeavestatusIdNotBetween(Integer value1, Integer value2) {
            addCriterion("leavestatus_id not between", value1, value2, "leavestatusId");
            return (Criteria) this;
        }

        public Criteria andLeavetimeIsNull() {
            addCriterion("leavetime is null");
            return (Criteria) this;
        }

        public Criteria andLeavetimeIsNotNull() {
            addCriterion("leavetime is not null");
            return (Criteria) this;
        }

        public Criteria andLeavetimeEqualTo(Date value) {
            addCriterion("leavetime =", value, "leavetime");
            return (Criteria) this;
        }

        public Criteria andLeavetimeNotEqualTo(Date value) {
            addCriterion("leavetime <>", value, "leavetime");
            return (Criteria) this;
        }

        public Criteria andLeavetimeGreaterThan(Date value) {
            addCriterion("leavetime >", value, "leavetime");
            return (Criteria) this;
        }

        public Criteria andLeavetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("leavetime >=", value, "leavetime");
            return (Criteria) this;
        }

        public Criteria andLeavetimeLessThan(Date value) {
            addCriterion("leavetime <", value, "leavetime");
            return (Criteria) this;
        }

        public Criteria andLeavetimeLessThanOrEqualTo(Date value) {
            addCriterion("leavetime <=", value, "leavetime");
            return (Criteria) this;
        }

        public Criteria andLeavetimeIn(List<Date> values) {
            addCriterion("leavetime in", values, "leavetime");
            return (Criteria) this;
        }

        public Criteria andLeavetimeNotIn(List<Date> values) {
            addCriterion("leavetime not in", values, "leavetime");
            return (Criteria) this;
        }

        public Criteria andLeavetimeBetween(Date value1, Date value2) {
            addCriterion("leavetime between", value1, value2, "leavetime");
            return (Criteria) this;
        }

        public Criteria andLeavetimeNotBetween(Date value1, Date value2) {
            addCriterion("leavetime not between", value1, value2, "leavetime");
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