package com.suraj.cv.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.suraj.cv.dao.FeedbackDAO;
import com.suraj.cv.model.Feedback;

@Service(value = "FeedbackService")
@Transactional
public class FeedbackServiceImpl implements FeedbackService {
	
	@Autowired
	private FeedbackDAO feedbackDAO;
	
	@Override
	public List<Feedback> getFeedbacks() throws Exception {
		// TODO Auto-generated method stub
		return feedbackDAO.getFeedbacks();
	}

	@Override
	public void addFeedback(Feedback feedback) throws Exception {
		// TODO Auto-generated method stub
		feedbackDAO.addFeedback(feedback);
	}

}
