package ru.vrn.com.shared.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import ru.vrn.com.shared.model.superclass.Versioned;

@Entity
@Table(name = "ListOfBases1C")
public class ListOfBases1C extends Versioned {

	@Column(name = "NAME_BASE", nullable = false, columnDefinition = "VARCHAR")
	private String nameOfBase;

	@Column(name = "VERSION", nullable = false, columnDefinition = "VARCHAR(10)")
	private String version;

	@Column(name = "SERVER", nullable = false, columnDefinition = "VARCHAR(150)")
	private String server;

	@Column(name = "PATH", nullable = false, columnDefinition = "VARCHAR")
	private String path;

	// true - файловая база, false - sql база
	@Column(name = "TYPE_OF_BASE", nullable = false, columnDefinition = "BIT")
	private boolean typeOfBase;

	@Column(name = "STATUS", nullable = false, columnDefinition = "BIT")
	private boolean status;

	@OneToMany(mappedBy = "listOfBases1C", targetEntity = AccessFor1CDetail.class)
	private Set<AccessFor1CDetail> accessFor1CDetail;

	public Set<AccessFor1CDetail> getAccessFor1CDetail() {
		return accessFor1CDetail;
	}

	public void setAccessFor1CDetail(Set<AccessFor1CDetail> accessFor1CDetail) {
		this.accessFor1CDetail = accessFor1CDetail;
	}

	public String getNameOfBase() {
		return nameOfBase;
	}

	public String getVersion() {
		return version;
	}

	public String getServer() {
		return server;
	}

	public String getPath() {
		return path;
	}

	public boolean isTypeOfBase() {
		return typeOfBase;
	}

	public boolean isStatus() {
		return status;
	}

	public void setNameOfBase(String nameOfBase) {
		this.nameOfBase = nameOfBase;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public void setServer(String server) {
		this.server = server;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public void setTypeOfBase(boolean typeOfBase) {
		this.typeOfBase = typeOfBase;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

}
