package com.hibernatepractise.hql;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Persons_hql")

public class Person {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int PersonID;
	private String LastName; 	
	private String FirstName; 
	private String Address; 
	private String City;
	public int getPersonID() {
		return PersonID;
	}
	public void setPersonID(int personID) {
		PersonID = personID;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getCity() {
		return City;
	}
	public Person() {
		super();
	}
	public void setCity(String city) {
		City = city;
	}  

}
