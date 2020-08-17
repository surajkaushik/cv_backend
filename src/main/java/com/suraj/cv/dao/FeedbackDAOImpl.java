package com.suraj.cv.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.suraj.cv.entity.FeedbackEntity;
import com.suraj.cv.model.Feedback;
@Repository(value = "FeedbackDAO")
public class FeedbackDAOImpl implements FeedbackDAO {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public List<Feedback> getFeedbacks() {
		// TODO Auto-generated method stub
		List<Feedback> feedbackList= new ArrayList<Feedback>();
		
		Query q=entityManager.createQuery("SELECT f FROM FeedbackEntity f");
		List<FeedbackEntity> fbList=q.getResultList();
		
		for (FeedbackEntity feedbackEntity : fbList) {
			Feedback f=new Feedback();
			f.setComments(feedbackEntity.getComments());
			f.setEmailId(feedbackEntity.getEmailId());
			f.setName(feedbackEntity.getName());
			feedbackList.add(f);
		}
		
		return feedbackList;
	}

	@Override
	public void addFeedback(Feedback feedback) {
		
		FeedbackEntity fe= new FeedbackEntity();
		
		fe.setComments(feedback.getComments());
		fe.setEmailId(feedback.getEmailId());
		fe.setName(feedback.getName());
		
		entityManager.persist(fe);
	}

}
