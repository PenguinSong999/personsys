package com.own.bean;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class CheckworkInf {
    private Integer id;

    private Integer deptId;

    private Integer jobId;

    private Integer empId;

    private EmployeeInf employeeInf;

    private Integer workingdays;

    private Integer daysleave;

    @JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date createdate;

    private Integer daysout;

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

    public Integer getWorkingdays() {
        return workingdays;
    }

    public void setWorkingdays(Integer workingdays) {
        this.workingdays = workingdays;
    }

    public Integer getDaysleave() {
        return daysleave;
    }

    public void setDaysleave(Integer daysleave) {
        this.daysleave = daysleave;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public Integer getDaysout() {
        return daysout;
    }

    public void setDaysout(Integer daysout) {
        this.daysout = daysout;
    }

    public EmployeeInf getEmployeeInf() {
        return employeeInf;
    }

    public void setEmployeeInf(EmployeeInf employeeInf) {
        this.employeeInf = employeeInf;
    }
}