package com.hibernatepractise.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Address implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long addressId;
	
	private String city;

	private String state;


	public Address(String city, String state) {
		super();
		this.city = city;
		this.state = state;
	}


	public Long getAddressId() {
		return addressId;
	}

	
	public void setAddressId(Long addressId) {
		this.addressId = addressId;
	}



	
	public Address() {
		super();
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

}
