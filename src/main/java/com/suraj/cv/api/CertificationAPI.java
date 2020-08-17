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

import com.suraj.cv.model.Certification;
import com.suraj.cv.model.Education;
import com.suraj.cv.service.CertificationService;

@CrossOrigin
@RestController
@RequestMapping("CertificationAPI")
public class CertificationAPI {
	
	@Autowired
	private CertificationService certificationService;
	
	@Autowired
	private Environment environment;
	
	@GetMapping(value = "/getCertifications")
	public ResponseEntity<List<Certification>> getCertifications() throws Exception{
		try {
		List<Certification> all=certificationService.getCertifications();
		return new ResponseEntity<List<Certification>>(all, HttpStatus.OK);
		}
		catch (Exception e) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, environment.getProperty(e.getMessage()));
		}
		
	}
	
	@PostMapping(value = "/addCertificate")
	public ResponseEntity<String> addCertificate(@RequestBody Certification certification) throws Exception{
		try {
			String i=certificationService.addCertificate(certification);
			
			String message=environment.getProperty("CERTIFICATION_API_ADDED")+i;

			return new ResponseEntity<String>(message,HttpStatus.CREATED);
			}
			catch (Exception e) {
				throw new ResponseStatusException(HttpStatus.BAD_REQUEST, environment.getProperty(e.getMessage()));
			}
	}

}
