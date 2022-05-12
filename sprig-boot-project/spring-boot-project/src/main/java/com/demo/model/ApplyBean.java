package com.demo.model;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

public class ApplyBean {
	@NotEmpty
public String name;
	@NotEmpty
	@Pattern(regexp="\\d{10}")
public String mobile;
	@NotEmpty
	@Email
public String email;
	@NotEmpty
public String degree;
	@NotEmpty
	public String address;
	@NotEmpty
	public String skill;
	
	public String job;

	public String getJob() {
	return job;
}

public void setJob(String job) {
	this.job = job;
}
	public String getSkill() {
		return skill;
	}
	public void setSkill(String skill) {
		this.skill = skill;
	}
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDegree() {
		return degree;
	}
	public void setDegree(String degree) {
		this.degree = degree;
	}
	

}
