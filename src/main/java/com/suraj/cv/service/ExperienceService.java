package com.suraj.cv.service;

import java.util.List;

import com.suraj.cv.model.Experince;

public interface ExperienceService {
	public List<Experince> getExperienceList() throws Exception;
	public String addExperince(Experince experince) throws Exception;

}
