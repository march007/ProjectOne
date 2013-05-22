package ru.vrn.com.shared.model.superclass;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import ru.vrn.com.shared.model.UsersAD;

@Entity
public class Access extends Modification{
	@OneToOne
	@JoinColumn(name="person_id")
	private UsersAD person;

	public UsersAD getPerson() {
		return person;
	}

	public void setPerson(UsersAD person) {
		this.person = person;
	}

}
