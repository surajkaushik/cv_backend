package com.suraj.cv.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.suraj.cv.entity.CertificationEntity;
import com.suraj.cv.model.Certification;

@Repository(value = "CertificationDAO")
public class CertificationDAOImpl implements CertificationDAO {
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public List<Certification> getCertifications() {
		// TODO Auto-generated method stub
		List<Certification> listOfCertificate = new ArrayList<Certification>();
		Query q= entityManager.createQuery("SELECT c FROM CertificationEntity c");
		List<CertificationEntity> certificationEntity=q.getResultList();
		for (CertificationEntity ce : certificationEntity) {
			Certification c = new Certification();
			c.setCertificateId(ce.getCertificateId());
			c.setCertificateName(ce.getCertificateName());
			c.setCertificateURL(ce.getCertificateURL());
			listOfCertificate.add(c);
		}
		return listOfCertificate;
	}

	@Override
	public String addCertificate(Certification certificate) {
		
		CertificationEntity ce = new CertificationEntity();
		
		ce.setCertificateId(certificate.getCertificateId());
		ce.setCertificateName(certificate.getCertificateName());
		ce.setCertificateURL(certificate.getCertificateURL());
		entityManager.persist(ce);
		
		return ce.getCertificateId();
	}

}
