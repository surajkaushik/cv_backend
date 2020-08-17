package com.suraj.cv.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="EXPERIENCE")
public class ExperienceEntity {
	
	@Id
	@Column(name = "EXPERIENCE_ID")
	private String experienceId;

	@Column(name = "YEAR")
	private String year;
	
	@Column(name="NAME")
	private String name;
		
	@Column(name="FIELD")
	private String field;

	public String getExperienceId() {
		return experienceId;
	}

	public void setExperienceId(String experienceId) {
		this.experienceId = experienceId;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getField() {
		return field;
	}

	public void setField(String field) {
		this.field = field;
	}
	
	
	
	

}
