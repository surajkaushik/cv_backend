package com.suraj.cv.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table (name="EDUCATION")
public class EducationEntity {
		
		@Id
		@Column(name = "EDUCATION_ID")
		private String educationId;
	
		@Column(name = "YEAR")
		private String year;
		
		@Column(name="NAMEOFINS")
		private String nameOfIns;
			
		@Column(name="DEGREE")
		private String degree;
		
		@Column(name="MARKS")
		private String marks;

		public String getEducationId() {
			return educationId;
		}

		public void setEducationId(String educationId) {
			this.educationId = educationId;
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
