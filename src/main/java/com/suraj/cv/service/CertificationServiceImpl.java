package com.suraj.cv.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.suraj.cv.dao.CertificationDAO;
import com.suraj.cv.model.Certification;

@Service(value = "CertificationService")
@Transactional
public class CertificationServiceImpl implements CertificationService {

	@Autowired
	private CertificationDAO certificationDAO;
	
	@Override
	public List<Certification> getCertifications() throws Exception {
		// TODO Auto-generated method stub
		return certificationDAO.getCertifications();
	}

	@Override
	public String addCertificate(Certification certificate) throws Exception {
		// TODO Auto-generated method stub
		return certificationDAO.addCertificate(certificate);
	}

}
