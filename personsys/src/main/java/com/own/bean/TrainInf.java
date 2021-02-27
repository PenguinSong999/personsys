package com.own.bean;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class TrainInf {
    private Integer id;

    private Integer empId;

    private EmployeeInf employeeInf;

    private Integer deptId;

    private DeptInf deptInf;

    private Integer jobId;

    private JobInf jobInf;

    private String content;

    private String startdata;

    private String enddata;

    private Integer totallength;

    private Integer completion;

    private CompletionInf completionInf;

    private Integer grade;

    @JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date traintime;


    public CompletionInf getCompletionInf() {
        return completionInf;
    }

    public void setCompletionInf(CompletionInf completionInf) {
        this.completionInf = completionInf;
    }

    public EmployeeInf getEmployeeInf() {
        return employeeInf;
    }

    public void setEmployeeInf(EmployeeInf employeeInf) {
        this.employeeInf = employeeInf;
    }

    public DeptInf getDeptInf() {
        return deptInf;
    }

    public void setDeptInf(DeptInf deptInf) {
        this.deptInf = deptInf;
    }

    public JobInf getJobInf() {
        return jobInf;
    }

    public void setJobInf(JobInf jobInf) {
        this.jobInf = jobInf;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getStartdata() {
        return startdata;
    }

    public void setStartdata(String startdata) {
        this.startdata = startdata == null ? null : startdata.trim();
    }

    public String getEnddata() {
        return enddata;
    }

    public void setEnddata(String enddata) {
        this.enddata = enddata == null ? null : enddata.trim();
    }

    public Integer getTotallength() {
        return totallength;
    }

    public void setTotallength(Integer totallength) {
        this.totallength = totallength;
    }

    public Integer getCompletion() {
        return completion;
    }

    public void setCompletion(Integer completion) {
        this.completion = completion;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    public Date getTraintime() {
        return traintime;
    }

    public void setTraintime(Date traintime) {
        this.traintime = traintime;
    }
}