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
