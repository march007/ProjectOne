package ru.vrn.com.shared.model.superclass;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class Modification extends Versioned{

	@Column(name = "dateLastMofification", nullable = false)
	private Timestamp DateLastMofification;

	public Timestamp getDateLastMofification() {
		return DateLastMofification;
	}

	public void setDateLastMofification(Timestamp dateLastMofification) {
		DateLastMofification = dateLastMofification;
	}

}
