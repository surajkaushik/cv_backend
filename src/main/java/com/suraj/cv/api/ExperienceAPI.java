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

import com.suraj.cv.model.Experince;
import com.suraj.cv.service.ExperienceService;

@CrossOrigin
@RestController
@RequestMapping("ExperienceAPI")
public class ExperienceAPI {
	
	@Autowired
	private ExperienceService experienceService;
	
	@Autowired
	private Environment environment;
	
	@GetMapping(value = "/getExperienceList")
	public ResponseEntity<List<Experince>> getExperienceList() throws Exception{
		try {
		List<Experince> all=experienceService.getExperienceList();
		return new ResponseEntity<List<Experince>>(all, HttpStatus.OK);
		}
		catch (Exception e) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, environment.getProperty(e.getMessage()),e);
		}
		
	}
	
	@PostMapping(value = "/addExperince")
	public ResponseEntity<String> addExperince(@RequestBody Experince experince) throws Exception{
		try {
			String i= experienceService.addExperince(experince);
			String message=environment.getProperty("EXPERIENCE_API_ADDED")+i;

			return new ResponseEntity<String>(message,HttpStatus.CREATED);
			}
			catch (Exception e) {
				throw new ResponseStatusException(HttpStatus.BAD_REQUEST, environment.getProperty(e.getMessage()),e);
			}
	}

}
