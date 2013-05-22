package ru.vrn.com.shared.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import ru.vrn.com.shared.model.superclass.Versioned;

@Entity
@Table(name = "AccessFileResoursesDetail")
public class AccessFileResoursesDetail extends Versioned {

	// @OneToMany(mappedBy = "id", targetEntity = AccessFileResourses.class)
	// private Set<AccessFileResourses> accessFileResoursesItems;

	@ManyToOne
	@JoinColumn(name = "id_AccessFileResourses")
	private AccessFileResourses accessFileResourses;

	@Column(name = "PATH", columnDefinition = "VARCHAR", nullable = false)
	private String path;

	// public Set<AccessFileResourses> getAccessFileResoursesItems() {
	// return accessFileResoursesItems;
	// }

	public AccessFileResourses getDictionary() {
		return accessFileResourses;
	}

	public String getPath() {
		return path;
	}

	// public void setAccessFileResoursesItems(
	// Set<AccessFileResourses> accessFileResoursesItems) {
	// this.accessFileResoursesItems = accessFileResoursesItems;
	// }

	public void setDictionary(AccessFileResourses dictionary) {
		this.accessFileResourses = dictionary;
	}

	public void setPath(String path) {
		this.path = path;
	}
}
