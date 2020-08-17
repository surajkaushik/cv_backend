package com.suraj.cv.dao;

import java.util.List;
import com.suraj.cv.model.Experince;

public interface ExperienceDAO {
	
	public List<Experince> getExperienceList();
	public String addExperince(Experince experince);
	
}
