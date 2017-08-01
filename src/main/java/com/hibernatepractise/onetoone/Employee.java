package com.hibernatepractise.onetoone;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Employee implements Serializable {



	private static final long serialVersionUID = 1L;
	
	public Employee(String ename, Address address) {
		super();
		this.ename = ename;
		this.address = address;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long eid;

	private String ename;
	
	@OneToOne(cascade=CascadeType.ALL)
	private Address address;
	
	public Employee() {

	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getEname() {
		return ename;
	}

	public Long getEid() {
		return eid;
	}

	public void setEid(Long eid) {
		this.eid = eid;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

}
