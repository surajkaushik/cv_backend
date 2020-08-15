package com.suraj.cv.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.suraj.cv.dao.PersonDAO;
import com.suraj.cv.model.Person;
@Service(value = "PersonService")
@Transactional
public class PersonServiceImpl implements PersonService {

	@Autowired
	private PersonDAO personDAO;
	
	@Override
	public List<Person> getAllPerson() throws Exception {
		return personDAO.getAllPerson();
	}

}
