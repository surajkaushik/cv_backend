package com.suraj.cv.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="FEEDBACK" )
public class FeedbackEntity {

	@Id
	@Column(name = "EMAIL_ID")
	private String emailId;
	
	@Column(name = "NAME")
	private String name;
	
	@Column(name = "COM")
	private String comments;

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

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}
	
	
}
