package ru.vrn.com.shared.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import ru.vrn.com.shared.model.superclass.Modification;

@Entity
@Table(name = "ListOfMonitoring")
public class ListOfMonitoring extends Modification {

	@Column(name = "PATH", columnDefinition = "VARCHAR(255)", nullable = false)
	private String path;

	@Column(name = "SERVER", columnDefinition = "VARCHAR(50)", nullable = false)
	private String server;

	public String getPath() {
		return path;
	}

	public String getServer() {
		return server;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public void setServer(String server) {
		this.server = server;
	}
}
