package com.own.bean;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class ContractInf {
    private Integer id;

    private Integer deptId;

    private Integer jobId;

    private Integer statusId;

    private StatusInf statusInf;

    private Integer empId;

    private EmployeeInf employeeInf;

    private Integer traincontractId;

    private  TraincontractInf traincontractInf;

    private Integer laborcontractId;

    private LaborcontractInf laborcontractInf;

    @JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createDate;

    private Integer confidentialitycontractId;  //保密合同

    private ConfidentialitycontractInf confidentialitycontractInf;

    public StatusInf getStatusInf() {
        return statusInf;
    }

    public void setStatusInf(StatusInf statusInf) {
        this.statusInf = statusInf;
    }

    public EmployeeInf getEmployeeInf() {
        return employeeInf;
    }

    public void setEmployeeInf(EmployeeInf employeeInf) {
        this.employeeInf = employeeInf;
    }

    public TraincontractInf getTraincontractInf() {
        return traincontractInf;
    }

    public void setTraincontractInf(TraincontractInf traincontractInf) {
        this.traincontractInf = traincontractInf;
    }

    public LaborcontractInf getLaborcontractInf() {
        return laborcontractInf;
    }

    public void setLaborcontractInf(LaborcontractInf laborcontractInf) {
        this.laborcontractInf = laborcontractInf;
    }

    public ConfidentialitycontractInf getConfidentialitycontractInf() {
        return confidentialitycontractInf;
    }

    public void setConfidentialitycontractInf(ConfidentialitycontractInf confidentialitycontractInf) {
        this.confidentialitycontractInf = confidentialitycontractInf;
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

    public Integer getStatusId() {
        return statusId;
    }

    public void setStatusId(Integer statusId) {
        this.statusId = statusId;
    }

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public Integer getTraincontractId() {
        return traincontractId;
    }

    public void setTraincontractId(Integer traincontractId) {
        this.traincontractId = traincontractId;
    }

    public Integer getLaborcontractId() {
        return laborcontractId;
    }

    public void setLaborcontractId(Integer laborcontractId) {
        this.laborcontractId = laborcontractId;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Integer getConfidentialitycontractId() {
        return confidentialitycontractId;
    }

    public void setConfidentialitycontractId(Integer confidentialitycontractId) {
        this.confidentialitycontractId = confidentialitycontractId;
    }
}