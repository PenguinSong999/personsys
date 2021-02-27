package com.own.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SalaryInfExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SalaryInfExample() {
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

        public Criteria andSalaryStationIsNull() {
            addCriterion("SALARY_STATION is null");
            return (Criteria) this;
        }

        public Criteria andSalaryStationIsNotNull() {
            addCriterion("SALARY_STATION is not null");
            return (Criteria) this;
        }

        public Criteria andSalaryStationEqualTo(Integer value) {
            addCriterion("SALARY_STATION =", value, "salaryStation");
            return (Criteria) this;
        }

        public Criteria andSalaryStationNotEqualTo(Integer value) {
            addCriterion("SALARY_STATION <>", value, "salaryStation");
            return (Criteria) this;
        }

        public Criteria andSalaryStationGreaterThan(Integer value) {
            addCriterion("SALARY_STATION >", value, "salaryStation");
            return (Criteria) this;
        }

        public Criteria andSalaryStationGreaterThanOrEqualTo(Integer value) {
            addCriterion("SALARY_STATION >=", value, "salaryStation");
            return (Criteria) this;
        }

        public Criteria andSalaryStationLessThan(Integer value) {
            addCriterion("SALARY_STATION <", value, "salaryStation");
            return (Criteria) this;
        }

        public Criteria andSalaryStationLessThanOrEqualTo(Integer value) {
            addCriterion("SALARY_STATION <=", value, "salaryStation");
            return (Criteria) this;
        }

        public Criteria andSalaryStationIn(List<Integer> values) {
            addCriterion("SALARY_STATION in", values, "salaryStation");
            return (Criteria) this;
        }

        public Criteria andSalaryStationNotIn(List<Integer> values) {
            addCriterion("SALARY_STATION not in", values, "salaryStation");
            return (Criteria) this;
        }

        public Criteria andSalaryStationBetween(Integer value1, Integer value2) {
            addCriterion("SALARY_STATION between", value1, value2, "salaryStation");
            return (Criteria) this;
        }

        public Criteria andSalaryStationNotBetween(Integer value1, Integer value2) {
            addCriterion("SALARY_STATION not between", value1, value2, "salaryStation");
            return (Criteria) this;
        }

        public Criteria andSalaryLevelIsNull() {
            addCriterion("SALARY_LEVEL is null");
            return (Criteria) this;
        }

        public Criteria andSalaryLevelIsNotNull() {
            addCriterion("SALARY_LEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andSalaryLevelEqualTo(Integer value) {
            addCriterion("SALARY_LEVEL =", value, "salaryLevel");
            return (Criteria) this;
        }

        public Criteria andSalaryLevelNotEqualTo(Integer value) {
            addCriterion("SALARY_LEVEL <>", value, "salaryLevel");
            return (Criteria) this;
        }

        public Criteria andSalaryLevelGreaterThan(Integer value) {
            addCriterion("SALARY_LEVEL >", value, "salaryLevel");
            return (Criteria) this;
        }

        public Criteria andSalaryLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("SALARY_LEVEL >=", value, "salaryLevel");
            return (Criteria) this;
        }

        public Criteria andSalaryLevelLessThan(Integer value) {
            addCriterion("SALARY_LEVEL <", value, "salaryLevel");
            return (Criteria) this;
        }

        public Criteria andSalaryLevelLessThanOrEqualTo(Integer value) {
            addCriterion("SALARY_LEVEL <=", value, "salaryLevel");
            return (Criteria) this;
        }

        public Criteria andSalaryLevelIn(List<Integer> values) {
            addCriterion("SALARY_LEVEL in", values, "salaryLevel");
            return (Criteria) this;
        }

        public Criteria andSalaryLevelNotIn(List<Integer> values) {
            addCriterion("SALARY_LEVEL not in", values, "salaryLevel");
            return (Criteria) this;
        }

        public Criteria andSalaryLevelBetween(Integer value1, Integer value2) {
            addCriterion("SALARY_LEVEL between", value1, value2, "salaryLevel");
            return (Criteria) this;
        }

        public Criteria andSalaryLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("SALARY_LEVEL not between", value1, value2, "salaryLevel");
            return (Criteria) this;
        }

        public Criteria andSeniorityPayIsNull() {
            addCriterion("SENIORITY_PAY is null");
            return (Criteria) this;
        }

        public Criteria andSeniorityPayIsNotNull() {
            addCriterion("SENIORITY_PAY is not null");
            return (Criteria) this;
        }

        public Criteria andSeniorityPayEqualTo(Integer value) {
            addCriterion("SENIORITY_PAY =", value, "seniorityPay");
            return (Criteria) this;
        }

        public Criteria andSeniorityPayNotEqualTo(Integer value) {
            addCriterion("SENIORITY_PAY <>", value, "seniorityPay");
            return (Criteria) this;
        }

        public Criteria andSeniorityPayGreaterThan(Integer value) {
            addCriterion("SENIORITY_PAY >", value, "seniorityPay");
            return (Criteria) this;
        }

        public Criteria andSeniorityPayGreaterThanOrEqualTo(Integer value) {
            addCriterion("SENIORITY_PAY >=", value, "seniorityPay");
            return (Criteria) this;
        }

        public Criteria andSeniorityPayLessThan(Integer value) {
            addCriterion("SENIORITY_PAY <", value, "seniorityPay");
            return (Criteria) this;
        }

        public Criteria andSeniorityPayLessThanOrEqualTo(Integer value) {
            addCriterion("SENIORITY_PAY <=", value, "seniorityPay");
            return (Criteria) this;
        }

        public Criteria andSeniorityPayIn(List<Integer> values) {
            addCriterion("SENIORITY_PAY in", values, "seniorityPay");
            return (Criteria) this;
        }

        public Criteria andSeniorityPayNotIn(List<Integer> values) {
            addCriterion("SENIORITY_PAY not in", values, "seniorityPay");
            return (Criteria) this;
        }

        public Criteria andSeniorityPayBetween(Integer value1, Integer value2) {
            addCriterion("SENIORITY_PAY between", value1, value2, "seniorityPay");
            return (Criteria) this;
        }

        public Criteria andSeniorityPayNotBetween(Integer value1, Integer value2) {
            addCriterion("SENIORITY_PAY not between", value1, value2, "seniorityPay");
            return (Criteria) this;
        }

        public Criteria andPerformanceIsNull() {
            addCriterion("PERFORMANCE is null");
            return (Criteria) this;
        }

        public Criteria andPerformanceIsNotNull() {
            addCriterion("PERFORMANCE is not null");
            return (Criteria) this;
        }

        public Criteria andPerformanceEqualTo(Integer value) {
            addCriterion("PERFORMANCE =", value, "performance");
            return (Criteria) this;
        }

        public Criteria andPerformanceNotEqualTo(Integer value) {
            addCriterion("PERFORMANCE <>", value, "performance");
            return (Criteria) this;
        }

        public Criteria andPerformanceGreaterThan(Integer value) {
            addCriterion("PERFORMANCE >", value, "performance");
            return (Criteria) this;
        }

        public Criteria andPerformanceGreaterThanOrEqualTo(Integer value) {
            addCriterion("PERFORMANCE >=", value, "performance");
            return (Criteria) this;
        }

        public Criteria andPerformanceLessThan(Integer value) {
            addCriterion("PERFORMANCE <", value, "performance");
            return (Criteria) this;
        }

        public Criteria andPerformanceLessThanOrEqualTo(Integer value) {
            addCriterion("PERFORMANCE <=", value, "performance");
            return (Criteria) this;
        }

        public Criteria andPerformanceIn(List<Integer> values) {
            addCriterion("PERFORMANCE in", values, "performance");
            return (Criteria) this;
        }

        public Criteria andPerformanceNotIn(List<Integer> values) {
            addCriterion("PERFORMANCE not in", values, "performance");
            return (Criteria) this;
        }

        public Criteria andPerformanceBetween(Integer value1, Integer value2) {
            addCriterion("PERFORMANCE between", value1, value2, "performance");
            return (Criteria) this;
        }

        public Criteria andPerformanceNotBetween(Integer value1, Integer value2) {
            addCriterion("PERFORMANCE not between", value1, value2, "performance");
            return (Criteria) this;
        }

        public Criteria andIndividualIncomeIsNull() {
            addCriterion("INDIVIDUAL_INCOME is null");
            return (Criteria) this;
        }

        public Criteria andIndividualIncomeIsNotNull() {
            addCriterion("INDIVIDUAL_INCOME is not null");
            return (Criteria) this;
        }

        public Criteria andIndividualIncomeEqualTo(Float value) {
            addCriterion("INDIVIDUAL_INCOME =", value, "individualIncome");
            return (Criteria) this;
        }

        public Criteria andIndividualIncomeNotEqualTo(Float value) {
            addCriterion("INDIVIDUAL_INCOME <>", value, "individualIncome");
            return (Criteria) this;
        }

        public Criteria andIndividualIncomeGreaterThan(Float value) {
            addCriterion("INDIVIDUAL_INCOME >", value, "individualIncome");
            return (Criteria) this;
        }

        public Criteria andIndividualIncomeGreaterThanOrEqualTo(Float value) {
            addCriterion("INDIVIDUAL_INCOME >=", value, "individualIncome");
            return (Criteria) this;
        }

        public Criteria andIndividualIncomeLessThan(Float value) {
            addCriterion("INDIVIDUAL_INCOME <", value, "individualIncome");
            return (Criteria) this;
        }

        public Criteria andIndividualIncomeLessThanOrEqualTo(Float value) {
            addCriterion("INDIVIDUAL_INCOME <=", value, "individualIncome");
            return (Criteria) this;
        }

        public Criteria andIndividualIncomeIn(List<Float> values) {
            addCriterion("INDIVIDUAL_INCOME in", values, "individualIncome");
            return (Criteria) this;
        }

        public Criteria andIndividualIncomeNotIn(List<Float> values) {
            addCriterion("INDIVIDUAL_INCOME not in", values, "individualIncome");
            return (Criteria) this;
        }

        public Criteria andIndividualIncomeBetween(Float value1, Float value2) {
            addCriterion("INDIVIDUAL_INCOME between", value1, value2, "individualIncome");
            return (Criteria) this;
        }

        public Criteria andIndividualIncomeNotBetween(Float value1, Float value2) {
            addCriterion("INDIVIDUAL_INCOME not between", value1, value2, "individualIncome");
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