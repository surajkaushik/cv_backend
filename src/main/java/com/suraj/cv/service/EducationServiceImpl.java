package com.suraj.cv.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.suraj.cv.dao.EducationDAO;
import com.suraj.cv.model.Education;
@Service(value = "EducationService")
@Transactional
public class EducationServiceImpl implements EducationService {
	
	@Autowired
	private EducationDAO educationDAO;

	@Override
	public List<Education> getEducationList() throws Exception {
		return educationDAO.getEducationList();
	}

	@Override
	public String addEducation(Education education) throws Exception {
		return educationDAO.addEducation(education);
	}

}
