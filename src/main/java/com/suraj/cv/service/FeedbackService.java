package com.suraj.cv.service;

import java.util.List;
import com.suraj.cv.model.Feedback;

public interface FeedbackService {
	
	public List<Feedback> getFeedbacks() throws Exception;
	public void addFeedback(Feedback feedback) throws Exception;
}
