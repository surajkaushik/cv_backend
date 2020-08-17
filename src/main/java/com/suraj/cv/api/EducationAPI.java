package com.suraj.cv.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.suraj.cv.model.Education;
import com.suraj.cv.service.EducationService;


@CrossOrigin
@RestController
@RequestMapping("EducationAPI")
public class EducationAPI {
	
	@Autowired
	private EducationService educationService;
	
	@Autowired
	private Environment environment;
	
	@GetMapping(value = "/getEducationList")
	public ResponseEntity<List<Education>> getEducationList() throws Exception{
		try {
		List<Education> all=educationService.getEducationList();
		return new ResponseEntity<List<Education>>(all, HttpStatus.OK);
		}
		catch (Exception e) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, environment.getProperty(e.getMessage()));
		}
		
	}
	
	@PostMapping(value = "/addEducation")
	public ResponseEntity<String> addEducation(@RequestBody Education education) throws Exception{
		try {
			String i= educationService.addEducation(education);
			String message=environment.getProperty("EDUCATION_API_ADDED")+i;

			return new ResponseEntity<String>(message,HttpStatus.CREATED);
			}
			catch (Exception e) {
				throw new ResponseStatusException(HttpStatus.BAD_REQUEST, environment.getProperty(e.getMessage()));
			}
	}
}
