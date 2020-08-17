package com.suraj.cv.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.suraj.cv.dao.ExperienceDAO;
import com.suraj.cv.model.Experince;

@Service(value = "ExperienceService")
@Transactional
public class ExperienceServiceImpl implements ExperienceService {
	
	@Autowired
	private ExperienceDAO experienceDAO;

	@Override
	public List<Experince> getExperienceList() throws Exception {
		// TODO Auto-generated method stub
		return experienceDAO.getExperienceList();
	}

	@Override
	public String addExperince(Experince experince) throws Exception {
		// TODO Auto-generated method stub
		return experienceDAO.addExperince(experince);
	}

}
