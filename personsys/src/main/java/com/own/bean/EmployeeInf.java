package com.own.bean;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.ToString;

import java.util.Date;

@ToString
public class EmployeeInf {
    private Integer id;

    private Integer deptId;

    private DeptInf deptInf;

    private Integer jobId;

    private JobInf jobInf;

    private String name;

    private String cardId;

    private String address;

    private String phone;

    private Integer sexId;

    private SexInf sexInf;

    private Integer educationId;

    private EducationInf educationInf;

    @JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date createdate;

    private Integer userId;

    private UserInf userInf;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId == null ? null : cardId.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public Integer getSexId() {
        return sexId;
    }

    public void setSexId(Integer sexId) {
        this.sexId = sexId;
    }

    public Integer getEducationId() {
        return educationId;
    }

    public void setEducationId(Integer educationId) {
        this.educationId = educationId;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
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

    public SexInf getSexInf() {
        return sexInf;
    }

    public void setSexInf(SexInf sexInf) {
        this.sexInf = sexInf;
    }

    public EducationInf getEducationInf() {
        return educationInf;
    }

    public void setEducationInf(EducationInf educationInf) {
        this.educationInf = educationInf;
    }

    public UserInf getUserInf() {
        return userInf;
    }

    public void setUserInf(UserInf userInf) {
        this.userInf = userInf;
    }
}