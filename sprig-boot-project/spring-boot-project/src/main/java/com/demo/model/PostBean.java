package com.demo.model;

import java.util.HashMap;
import java.util.Map;

import javax.validation.constraints.NotEmpty;

public class PostBean {
	@NotEmpty
	public String name;
	@NotEmpty
	public String loc;
	@NotEmpty	
	public String sal;
	@NotEmpty
	public String type;
	@NotEmpty
		public String qual;
		
	public Map<String,String> jobs= new HashMap<>();

	public PostBean() {
		jobs.put("wb","Web Development");
		jobs.put("edu","Eduction & Traning");
		jobs.put("php","PHP Programming");
		jobs.put("wdg","Web Designer ");
	}

	

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

	public Map<String, String> getJobs() {
		return jobs;
	}

	public void setJobs(Map<String, String> jobs) {
		this.jobs = jobs;
	}



}
