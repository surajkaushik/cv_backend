package com.suraj.cv.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="PERSON")
public class PersonEntity {
	@Id
	@Column(name = "EMAIL_ID")
	private String emailId;
	
	@Column(name="NAME")
	private String name;
		
	@Column(name="PHONE_NUMBER")
	private String phoneNumber;
	
	@Column(name="LINKEDIN")
	private String linkedIn;
	
	@Column(name="GIT")
	private String git;

	
	public String getLinkedIn() {
		return linkedIn;
	}

	public void setLinkedIn(String linkedIn) {
		this.linkedIn = linkedIn;
	}

	public String getGit() {
		return git;
	}

	public void setGit(String git) {
		this.git = git;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	 
}
