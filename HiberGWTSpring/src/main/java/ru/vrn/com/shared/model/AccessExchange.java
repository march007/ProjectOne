package ru.vrn.com.shared.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import ru.vrn.com.shared.model.superclass.Access;

@Entity
@Table(name = "AccessExchange")
public class AccessExchange extends Access{

	@Column(name = "EXCHANGE_ACCESS", columnDefinition = "VARCHAR")
	private String exchangeAccess;

	public String getExchangeAccess() {
		return exchangeAccess;
	}

	public void setExchangeAccess(String exchangeAccess) {
		this.exchangeAccess = exchangeAccess;
	}
}
