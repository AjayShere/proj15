package com.split.bean;

import javax.validation.constraints.NotNull;

public class userBean {
	
	@NotNull
	private String firstname;
	
	private String lastname;
	
	@NotNull
	private String emailId;
	
	
	
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
}
