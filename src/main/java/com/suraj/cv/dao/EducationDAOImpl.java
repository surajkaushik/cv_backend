package com.suraj.cv.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.suraj.cv.entity.EducationEntity;
import com.suraj.cv.model.Education;
@Repository(value = "EducationDAO")
public class EducationDAOImpl implements EducationDAO {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public List<Education> getEducationList() {
		List<Education> educationList= new ArrayList<Education>();
		Query q=entityManager.createQuery("SELECT e FROM EducationEntity e");
		
		List<EducationEntity> receivedList=q.getResultList();
		for (EducationEntity educationEntity : receivedList) {
			Education edu = new Education();
			edu.setEducationId(educationEntity.getEducationId());
			edu.setDegree(educationEntity.getDegree());
			edu.setMarks(educationEntity.getMarks());
			edu.setNameOfIns(educationEntity.getNameOfIns());
			edu.setYear(educationEntity.getYear());
			educationList.add(edu);
		}
		
		return educationList;
	}

	@Override
	public String addEducation(Education education) {
		
		EducationEntity ee= new EducationEntity();
		
		System.out.println(education.getDegree());
		System.out.println(education.getEducationId());
		System.out.println(education.getMarks());
		System.out.println(education.getNameOfIns());
		System.out.println(education.getYear());
		
		ee.setEducationId(education.getEducationId());
		ee.setDegree(education.getDegree());
		ee.setMarks(education.getMarks());
		ee.setNameOfIns(education.getNameOfIns());
		ee.setYear(education.getYear());
		
		entityManager.persist(ee);
		
		return ee.getEducationId();
	}

}
