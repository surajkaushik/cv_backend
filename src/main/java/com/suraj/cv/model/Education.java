package com.suraj.cv.model;

public class Education {
	
	private String educationId;
	private String year;
	private String nameOfIns;
	private String degree;
	private String marks;
	private String successMessage;
	
	
	public String getEducationId() {
		return educationId;
	}
	public void setEducationId(String educationId) {
		this.educationId = educationId;
	}
	public String getSuccessMessage() {
		return successMessage;
	}
	public void setSuccessMessage(String successMessage) {
		this.successMessage = successMessage;
	}
	
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getNameOfIns() {
		return nameOfIns;
	}
	public void setNameOfIns(String nameOfIns) {
		this.nameOfIns = nameOfIns;
	}
	public String getDegree() {
		return degree;
	}
	public void setDegree(String degree) {
		this.degree = degree;
	}
	public String getMarks() {
		return marks;
	}
	public void setMarks(String marks) {
		this.marks = marks;
	}
	
}
