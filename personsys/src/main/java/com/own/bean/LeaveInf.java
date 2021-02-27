package com.own.bean;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class LeaveInf {
    private Integer id;

    private Integer empId;

    private EmployeeInf employeeInf;

    private Integer deptId;

    private Integer jobId;

    private String startdata;

    private String enddata;

    private String leavedays;

    private Integer leavetypeId;

    private LeavetypeInf leavetypeInf;

    private String content;

    private Integer leavestatusId;

    private LeavestatusInf leavestatusInf;

    @JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date leavetime;

    public EmployeeInf getEmployeeInf() {
        return employeeInf;
    }

    public void setEmployeeInf(EmployeeInf employeeInf) {
        this.employeeInf = employeeInf;
    }

    public LeavetypeInf getLeavetypeInf() {
        return leavetypeInf;
    }

    public void setLeavetypeInf(LeavetypeInf leavetypeInf) {
        this.leavetypeInf = leavetypeInf;
    }

    public LeavestatusInf getLeavestatusInf() {
        return leavestatusInf;
    }

    public void setLeavestatusInf(LeavestatusInf leavestatusInf) {
        this.leavestatusInf = leavestatusInf;
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

    public String getLeavedays() {
        return leavedays;
    }

    public void setLeavedays(String leavedays) {
        this.leavedays = leavedays == null ? null : leavedays.trim();
    }

    public Integer getLeavetypeId() {
        return leavetypeId;
    }

    public void setLeavetypeId(Integer leavetypeId) {
        this.leavetypeId = leavetypeId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Integer getLeavestatusId() {
        return leavestatusId;
    }

    public void setLeavestatusId(Integer leavestatusId) {
        this.leavestatusId = leavestatusId;
    }

    public Date getLeavetime() {
        return leavetime;
    }

    public void setLeavetime(Date leavetime) {
        this.leavetime = leavetime;
    }
}