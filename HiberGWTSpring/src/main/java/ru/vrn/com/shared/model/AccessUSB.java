package ru.vrn.com.shared.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import ru.vrn.com.shared.model.superclass.Access;

@Entity
@Table(name = "AccessUSB")
public class AccessUSB extends Access {

	@Column(name = "USB_ACCESS", columnDefinition = "VARCHAR", nullable = false)
	private String accessUSB;

	public String getAccessUSB() {
		return accessUSB;
	}

	public void setAccessUSB(String accessUSB) {
		this.accessUSB = accessUSB;
	}

}