package com.suraj.cv.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CERTIFICATION")
public class CertificationEntity {
	
	@Id
	@Column(name = "CERTIFICATE_ID")
	private String certificateId;
	
	@Column(name = "CERTIFICATE_NAME")
	private String certificateName;
	
	@Column(name = "CERTIFICATE_LINK")
	private String certificateURL;

	public String getCertificateId() {
		return certificateId;
	}

	public void setCertificateId(String certificateId) {
		this.certificateId = certificateId;
	}

	public String getCertificateName() {
		return certificateName;
	}

	public void setCertificateName(String certificateName) {
		this.certificateName = certificateName;
	}

	public String getCertificateURL() {
		return certificateURL;
	}

	public void setCertificateURL(String certificateURL) {
		this.certificateURL = certificateURL;
	}
	
}
