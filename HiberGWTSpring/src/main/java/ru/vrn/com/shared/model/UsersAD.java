package ru.vrn.com.shared.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import ru.vrn.com.shared.model.superclass.Access;
import ru.vrn.com.shared.model.superclass.Versioned;

@Entity
@Table(name ="UsersAD")
public class UsersAD extends Versioned{
	
	@Column(name ="NAME", columnDefinition = "VARCHAR(255)", nullable = false)
	private String name;
	
//	@OneToOne(cascade = CascadeType.ALL) 
   
//    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//    @JoinColumn(name="")
//    private Access access; 
    
    @OneToOne(mappedBy="person", fetch = FetchType.LAZY)
//    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//    private PersonInfo personInfo;
    private Access access; 
    
//    @OneToOne(mappedBy="customer", cascade = CascadeType.ALL)
//	private CustomerDetails customerDetails;
	
	@Column(name = "DEPARTMENT", columnDefinition = "VARCHAR(70)", nullable = false)
	private String department;
	
	@Column(name = "ACCOUNT", columnDefinition = "VARCHAR(70)", nullable = false)
	private String account; 
	
	@Column(name="DESCRIPTION", columnDefinition = "VARCHAR(255)", nullable = false)
	private String description;
	
	@Column(name="STATUS", columnDefinition = "BIT", nullable = false)
	private boolean status;

	public String getName() {
		return name;
	}

	public Access getAccess() {
		return access;
	}

	public String getDepartment() {
		return department;
	}

	public String getAccount() {
		return account;
	}

	public String getDescription() {
		return description;
	}

	public boolean isStatus() {
		return status;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAccess(Access access) {
		this.access = access;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
}

