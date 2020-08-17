package com.suraj.cv.dao;

import java.util.List;

import com.suraj.cv.model.Certification;

public interface CertificationDAO {

	public List<Certification> getCertifications();
	public String addCertificate(Certification certificate);
	
}
