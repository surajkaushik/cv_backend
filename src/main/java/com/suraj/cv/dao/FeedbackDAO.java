package com.suraj.cv.dao;

import java.util.List;

import com.suraj.cv.model.Feedback;


public interface FeedbackDAO {

	public List<Feedback> getFeedbacks();
	
	public void addFeedback(Feedback feedback);
}
