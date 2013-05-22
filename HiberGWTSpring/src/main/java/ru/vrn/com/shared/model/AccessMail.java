package ru.vrn.com.shared.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import ru.vrn.com.shared.model.superclass.Access;

@Entity
@Table(name = "AccessMail")
public class AccessMail extends Access {

	@Column(name = "MAIL_ACCESS", columnDefinition = "VARCHAR", nullable = false)
	private String mailAccess;

	public String getMailAccess() {
		return mailAccess;
	}

	public void setMailAccess(String mailAccess) {
		this.mailAccess = mailAccess;
	}
}