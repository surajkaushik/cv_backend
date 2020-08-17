package com.suraj.cv.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.suraj.cv.entity.ExperienceEntity;
import com.suraj.cv.model.Experince;
@Repository(value = "ExperienceDAO")
public class ExperienceDAOImpl implements ExperienceDAO {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public List<Experince> getExperienceList() {
		List<Experince> experincelist= new ArrayList<Experince>();
		
		Query q= entityManager.createQuery("SELECT e FROM ExperienceEntity e");
		List<ExperienceEntity> experienceEntityList=q.getResultList();
		
		for (ExperienceEntity experienceEntity : experienceEntityList) {
			Experince e=new Experince();
			e.setExperienceId(experienceEntity.getExperienceId());
			e.setField(experienceEntity.getField());
			e.setName(experienceEntity.getName());
			e.setYear(experienceEntity.getYear());
			
			experincelist.add(e);
		}
		
		return experincelist;
	}

	@Override
	public String addExperince(Experince experince) {
		ExperienceEntity ee= new ExperienceEntity();
		
		ee.setExperienceId(experince.getExperienceId());
		ee.setField(experince.getField());
		ee.setName(experince.getName());
		ee.setYear(experince.getYear());
		
		entityManager.persist(ee);
		
		return ee.getExperienceId();
	}

}
