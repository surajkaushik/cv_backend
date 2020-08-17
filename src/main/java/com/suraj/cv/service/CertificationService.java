package com.suraj.cv.service;

import java.util.List;

import com.suraj.cv.model.Certification;

public interface CertificationService {
	
	public List<Certification> getCertifications() throws Exception;
	public String addCertificate(Certification certificate) throws Exception;

}
