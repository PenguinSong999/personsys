package com.own.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ContractInfExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ContractInfExample() {
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

        public Criteria andStatusIdIsNull() {
            addCriterion("STATUS_ID is null");
            return (Criteria) this;
        }

        public Criteria andStatusIdIsNotNull() {
            addCriterion("STATUS_ID is not null");
            return (Criteria) this;
        }

        public Criteria andStatusIdEqualTo(Integer value) {
            addCriterion("STATUS_ID =", value, "statusId");
            return (Criteria) this;
        }

        public Criteria andStatusIdNotEqualTo(Integer value) {
            addCriterion("STATUS_ID <>", value, "statusId");
            return (Criteria) this;
        }

        public Criteria andStatusIdGreaterThan(Integer value) {
            addCriterion("STATUS_ID >", value, "statusId");
            return (Criteria) this;
        }

        public Criteria andStatusIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("STATUS_ID >=", value, "statusId");
            return (Criteria) this;
        }

        public Criteria andStatusIdLessThan(Integer value) {
            addCriterion("STATUS_ID <", value, "statusId");
            return (Criteria) this;
        }

        public Criteria andStatusIdLessThanOrEqualTo(Integer value) {
            addCriterion("STATUS_ID <=", value, "statusId");
            return (Criteria) this;
        }

        public Criteria andStatusIdIn(List<Integer> values) {
            addCriterion("STATUS_ID in", values, "statusId");
            return (Criteria) this;
        }

        public Criteria andStatusIdNotIn(List<Integer> values) {
            addCriterion("STATUS_ID not in", values, "statusId");
            return (Criteria) this;
        }

        public Criteria andStatusIdBetween(Integer value1, Integer value2) {
            addCriterion("STATUS_ID between", value1, value2, "statusId");
            return (Criteria) this;
        }

        public Criteria andStatusIdNotBetween(Integer value1, Integer value2) {
            addCriterion("STATUS_ID not between", value1, value2, "statusId");
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

        public Criteria andTraincontractIdIsNull() {
            addCriterion("TRAINCONTRACT_ID is null");
            return (Criteria) this;
        }

        public Criteria andTraincontractIdIsNotNull() {
            addCriterion("TRAINCONTRACT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTraincontractIdEqualTo(Integer value) {
            addCriterion("TRAINCONTRACT_ID =", value, "traincontractId");
            return (Criteria) this;
        }

        public Criteria andTraincontractIdNotEqualTo(Integer value) {
            addCriterion("TRAINCONTRACT_ID <>", value, "traincontractId");
            return (Criteria) this;
        }

        public Criteria andTraincontractIdGreaterThan(Integer value) {
            addCriterion("TRAINCONTRACT_ID >", value, "traincontractId");
            return (Criteria) this;
        }

        public Criteria andTraincontractIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("TRAINCONTRACT_ID >=", value, "traincontractId");
            return (Criteria) this;
        }

        public Criteria andTraincontractIdLessThan(Integer value) {
            addCriterion("TRAINCONTRACT_ID <", value, "traincontractId");
            return (Criteria) this;
        }

        public Criteria andTraincontractIdLessThanOrEqualTo(Integer value) {
            addCriterion("TRAINCONTRACT_ID <=", value, "traincontractId");
            return (Criteria) this;
        }

        public Criteria andTraincontractIdIn(List<Integer> values) {
            addCriterion("TRAINCONTRACT_ID in", values, "traincontractId");
            return (Criteria) this;
        }

        public Criteria andTraincontractIdNotIn(List<Integer> values) {
            addCriterion("TRAINCONTRACT_ID not in", values, "traincontractId");
            return (Criteria) this;
        }

        public Criteria andTraincontractIdBetween(Integer value1, Integer value2) {
            addCriterion("TRAINCONTRACT_ID between", value1, value2, "traincontractId");
            return (Criteria) this;
        }

        public Criteria andTraincontractIdNotBetween(Integer value1, Integer value2) {
            addCriterion("TRAINCONTRACT_ID not between", value1, value2, "traincontractId");
            return (Criteria) this;
        }

        public Criteria andLaborcontractIdIsNull() {
            addCriterion("LABORCONTRACT_ID is null");
            return (Criteria) this;
        }

        public Criteria andLaborcontractIdIsNotNull() {
            addCriterion("LABORCONTRACT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andLaborcontractIdEqualTo(Integer value) {
            addCriterion("LABORCONTRACT_ID =", value, "laborcontractId");
            return (Criteria) this;
        }

        public Criteria andLaborcontractIdNotEqualTo(Integer value) {
            addCriterion("LABORCONTRACT_ID <>", value, "laborcontractId");
            return (Criteria) this;
        }

        public Criteria andLaborcontractIdGreaterThan(Integer value) {
            addCriterion("LABORCONTRACT_ID >", value, "laborcontractId");
            return (Criteria) this;
        }

        public Criteria andLaborcontractIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("LABORCONTRACT_ID >=", value, "laborcontractId");
            return (Criteria) this;
        }

        public Criteria andLaborcontractIdLessThan(Integer value) {
            addCriterion("LABORCONTRACT_ID <", value, "laborcontractId");
            return (Criteria) this;
        }

        public Criteria andLaborcontractIdLessThanOrEqualTo(Integer value) {
            addCriterion("LABORCONTRACT_ID <=", value, "laborcontractId");
            return (Criteria) this;
        }

        public Criteria andLaborcontractIdIn(List<Integer> values) {
            addCriterion("LABORCONTRACT_ID in", values, "laborcontractId");
            return (Criteria) this;
        }

        public Criteria andLaborcontractIdNotIn(List<Integer> values) {
            addCriterion("LABORCONTRACT_ID not in", values, "laborcontractId");
            return (Criteria) this;
        }

        public Criteria andLaborcontractIdBetween(Integer value1, Integer value2) {
            addCriterion("LABORCONTRACT_ID between", value1, value2, "laborcontractId");
            return (Criteria) this;
        }

        public Criteria andLaborcontractIdNotBetween(Integer value1, Integer value2) {
            addCriterion("LABORCONTRACT_ID not between", value1, value2, "laborcontractId");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNull() {
            addCriterion("CREATE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("CREATE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualTo(Date value) {
            addCriterion("CREATE_DATE =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(Date value) {
            addCriterion("CREATE_DATE <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(Date value) {
            addCriterion("CREATE_DATE >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATE_DATE >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(Date value) {
            addCriterion("CREATE_DATE <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("CREATE_DATE <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<Date> values) {
            addCriterion("CREATE_DATE in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<Date> values) {
            addCriterion("CREATE_DATE not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(Date value1, Date value2) {
            addCriterion("CREATE_DATE between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(Date value1, Date value2) {
            addCriterion("CREATE_DATE not between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andConfidentialitycontractIdIsNull() {
            addCriterion("CONFIDENTIALITYCONTRACT_ID is null");
            return (Criteria) this;
        }

        public Criteria andConfidentialitycontractIdIsNotNull() {
            addCriterion("CONFIDENTIALITYCONTRACT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andConfidentialitycontractIdEqualTo(Integer value) {
            addCriterion("CONFIDENTIALITYCONTRACT_ID =", value, "confidentialitycontractId");
            return (Criteria) this;
        }

        public Criteria andConfidentialitycontractIdNotEqualTo(Integer value) {
            addCriterion("CONFIDENTIALITYCONTRACT_ID <>", value, "confidentialitycontractId");
            return (Criteria) this;
        }

        public Criteria andConfidentialitycontractIdGreaterThan(Integer value) {
            addCriterion("CONFIDENTIALITYCONTRACT_ID >", value, "confidentialitycontractId");
            return (Criteria) this;
        }

        public Criteria andConfidentialitycontractIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("CONFIDENTIALITYCONTRACT_ID >=", value, "confidentialitycontractId");
            return (Criteria) this;
        }

        public Criteria andConfidentialitycontractIdLessThan(Integer value) {
            addCriterion("CONFIDENTIALITYCONTRACT_ID <", value, "confidentialitycontractId");
            return (Criteria) this;
        }

        public Criteria andConfidentialitycontractIdLessThanOrEqualTo(Integer value) {
            addCriterion("CONFIDENTIALITYCONTRACT_ID <=", value, "confidentialitycontractId");
            return (Criteria) this;
        }

        public Criteria andConfidentialitycontractIdIn(List<Integer> values) {
            addCriterion("CONFIDENTIALITYCONTRACT_ID in", values, "confidentialitycontractId");
            return (Criteria) this;
        }

        public Criteria andConfidentialitycontractIdNotIn(List<Integer> values) {
            addCriterion("CONFIDENTIALITYCONTRACT_ID not in", values, "confidentialitycontractId");
            return (Criteria) this;
        }

        public Criteria andConfidentialitycontractIdBetween(Integer value1, Integer value2) {
            addCriterion("CONFIDENTIALITYCONTRACT_ID between", value1, value2, "confidentialitycontractId");
            return (Criteria) this;
        }

        public Criteria andConfidentialitycontractIdNotBetween(Integer value1, Integer value2) {
            addCriterion("CONFIDENTIALITYCONTRACT_ID not between", value1, value2, "confidentialitycontractId");
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