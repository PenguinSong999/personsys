package com.own.bean;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class SalaryInf {
    private Integer id;

    private Integer deptId;

    private Integer jobId;

    private Integer empId;

    private EmployeeInf employeeInf;

    private Integer salaryStation;   //基本工资

    private Integer salaryLevel;

    private Integer seniorityPay;   //工龄工资

    private Integer performance;  //绩效

    private Float individualIncome;  //个人收入

    @JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createDate;


    public EmployeeInf getEmployeeInf() {
        return employeeInf;
    }

    public void setEmployeeInf(EmployeeInf employeeInf) {
        this.employeeInf = employeeInf;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    public Integer getJobId() {
        return jobId;
    }

    public void setJobId(Integer jobId) {
        this.jobId = jobId;
    }

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public Integer getSalaryStation() {
        return salaryStation;
    }

    public void setSalaryStation(Integer salaryStation) {
        this.salaryStation = salaryStation;
    }

    public Integer getSalaryLevel() {
        return salaryLevel;
    }

    public void setSalaryLevel(Integer salaryLevel) {
        this.salaryLevel = salaryLevel;
    }

    public Integer getSeniorityPay() {
        return seniorityPay;
    }

    public void setSeniorityPay(Integer seniorityPay) {
        this.seniorityPay = seniorityPay;
    }

    public Integer getPerformance() {
        return performance;
    }

    public void setPerformance(Integer performance) {
        this.performance = performance;
    }

    public Float getIndividualIncome() {
        return individualIncome;
    }

    public void setIndividualIncome(Float individualIncome) {
        this.individualIncome = individualIncome;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}