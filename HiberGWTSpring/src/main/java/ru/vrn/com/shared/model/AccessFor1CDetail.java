package ru.vrn.com.shared.model;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import ru.vrn.com.shared.model.superclass.Versioned;

@Entity
@Table(name = "AccessFor1CDetail")
public class AccessFor1CDetail extends Versioned {

	@ManyToOne
	@JoinColumn(name = "id_Access1C")
	private AccessFor1C accessFor1C;

	@ManyToOne
	@JoinColumn(name = "id_Base1C")
	private ListOfBases1C listOfBases1C;

	public AccessFor1C getAccessFor1C() {
		return accessFor1C;
	}

	public ListOfBases1C getListOfBases1C() {
		return listOfBases1C;
	}

	public void setAccessFor1C(AccessFor1C accessFor1C) {
		this.accessFor1C = accessFor1C;
	}

	public void setListOfBases1C(ListOfBases1C listOfBases1C) {
		this.listOfBases1C = listOfBases1C;
	}

}
