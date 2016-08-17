package com.ol.entity.system;

import java.util.Date;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;



public class ExamStu {
    private Integer examStuId;
    @NotEmpty(message="姓名不能为空")
    private String examStuName;
    @NotEmpty(message="学号不能为空")
    private String examStuNumber;
    @NotEmpty(message="密码不能为空")
    private String examStuPassword;
    @NotEmpty(message="请选择性别")
    private String examStuSex;
    @NotNull(message="请选择日期")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date examStuBirthday;
    
    private String examStuTel;

    private String examStuAddress;

    private Integer examStuDone;

    private String birthday;
    
    public Integer getExamStuId() {
        return examStuId;
    }
    public void setExamStuId(Integer examStuId) {
        this.examStuId = examStuId;
    }

    public String getExamStuName() {
        return examStuName;
    }

    public void setExamStuName(String examStuName) {
        this.examStuName = examStuName;
    }

    public String getExamStuNumber() {
        return examStuNumber;
    }

    public void setExamStuNumber(String examStuNumber) {
        this.examStuNumber = examStuNumber;
    }

    public String getExamStuPassword() {
        return examStuPassword;
    }

    public void setExamStuPassword(String examStuPassword) {
        this.examStuPassword = examStuPassword;
    }

    public String getExamStuSex() {
        return examStuSex;
    }

    public void setExamStuSex(String examStuSex) {
        this.examStuSex = examStuSex;
    }

    public Date getExamStuBirthday() {
        return examStuBirthday;
    }

    public void setExamStuBirthday(Date examStuBirthday) {
        this.examStuBirthday = examStuBirthday;
    }

    public String getExamStuTel() {
        return examStuTel;
    }

    public void setExamStuTel(String examStuTel) {
        this.examStuTel = examStuTel;
    }

    public String getExamStuAddress() {
        return examStuAddress;
    }

    public void setExamStuAddress(String examStuAddress) {
        this.examStuAddress = examStuAddress;
    }

    public Integer getExamStuDone() {
        return examStuDone;
    }

    public void setExamStuDone(Integer examStuDone) {
        this.examStuDone = examStuDone;
    }
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
}