package com.demo.entity;

import java.util.HashMap;
import java.util.Map;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="postjob")
public class PostEntity {
	@Id
	public String name;
	public String loc;

	public String sal;
	public String type;
	public String qual;





public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

public String getType() {
	return type;
}

public void setType(String type) {
	this.type = type;
}

public String getLoc() {
	return loc;
}

public void setLoc(String loc) {
	this.loc = loc;
}

public String getQual() {
	return qual;
}

public void setQual(String qual) {
	this.qual = qual;
}

public String getSal() {
	return sal;
}

public void setSal(String sal) {
	this.sal = sal;
}



}
