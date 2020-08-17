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
import com.suraj.cv.model.Feedback;
import com.suraj.cv.service.FeedbackService;

@CrossOrigin
@RestController
@RequestMapping("/FeedbackAPI")
public class FeedbackAPI {
	
	@Autowired
	private FeedbackService feedbackService;

	@Autowired
	private Environment environment;
	
	@GetMapping(value ="/getFeedbacks")
	public ResponseEntity<List<Feedback>> getFeedbacks() throws Exception{
		try {
		List<Feedback> all=feedbackService.getFeedbacks();
		return new ResponseEntity<List<Feedback>>(all, HttpStatus.OK);
		}
		catch (Exception e) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, environment.getProperty(e.getMessage()),e);
		}
		
	}
	
	@PostMapping(value = "/addFeedback")
	public ResponseEntity<String> addFeedback(@RequestBody Feedback feedback) throws Exception{
		try {
			feedbackService.addFeedback(feedback);
			String message=environment.getProperty("FEEDBACK_API_ADDED");
			return new ResponseEntity<String>(message,HttpStatus.CREATED);
			}
			catch (Exception e) {
				throw new ResponseStatusException(HttpStatus.BAD_REQUEST, environment.getProperty(e.getMessage()),e);
			}
	}
}
