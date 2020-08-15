package com.suraj.cv.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.suraj.cv.model.Person;
import com.suraj.cv.service.PersonService;

@CrossOrigin
@RestController
@RequestMapping("PersonAPI")
public class PersonAPI {

	@Autowired
	private PersonService personService;
	
	@Autowired
	private Environment environment;
	
	@GetMapping(value = "/getAllPerson")
	public ResponseEntity<List<Person>> getAllPerson() throws Exception{
		try {
		List<Person> allPerson=personService.getAllPerson();
		return new ResponseEntity<List<Person>>(allPerson, HttpStatus.OK);
		}
		catch (Exception e) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, environment.getProperty(e.getMessage()));
		}
		
	}
}
