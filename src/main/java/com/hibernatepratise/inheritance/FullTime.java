package com.hibernatepratise.inheritance;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("FE")
public class FullTime extends Employee {

	private float salary;

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public FullTime(Long eid, String ename, String email) {
		super(eid, ename, email);
		// TODO Auto-generated constructor stub
	}

	public FullTime(){
		
	}
}
