package com.ol.entity.form;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class StuForm {
	private Long stuNumber;
	private String stuName;
	private String sex;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date date;
	private Long stuTel;
	private String stuAddress;
	public Long getStuNumber() {
		return stuNumber;
	}
	public void setStuNumber(Long stuNumber) {
		this.stuNumber = stuNumber;
	}
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Long getStuTel() {
		return stuTel;
	}
	public void setStuTel(Long stuTel) {
		this.stuTel = stuTel;
	}
	public String getStuAddress() {
		return stuAddress;
	}
	public void setStuAddress(String stuAddress) {
		this.stuAddress = stuAddress;
	}
}
