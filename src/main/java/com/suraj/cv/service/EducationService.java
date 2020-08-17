package com.suraj.cv.service;

import java.util.List;

import com.suraj.cv.model.Education;

public interface EducationService {
	
	public List<Education> getEducationList() throws Exception;
	
	public String addEducation(Education education) throws Exception;
	
}
