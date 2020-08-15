package com.suraj.cv.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.suraj.cv.entity.PersonEntity;
import com.suraj.cv.model.Person;
@Repository(value ="PersonDAO")
public class PersonDAOImpl implements PersonDAO{
	
	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public List<Person> getAllPerson() {
		List<Person> listOfPerson= new ArrayList<Person>();
		Query q=entityManager.createQuery("SELECT p FROM PersonEntity p");
		List<PersonEntity> receivedList=q.getResultList();
		for (PersonEntity personEntity : receivedList) {
			Person person = new Person();
			person.setEmailId(personEntity.getEmailId());
			person.setName(personEntity.getName());
			person.setPhoneNumber(personEntity.getPhoneNumber());
			listOfPerson.add(person);
		}
		return listOfPerson;
	}

}
