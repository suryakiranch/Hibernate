package com.hibernatepratise.inheritance;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("CE")
public class PartTime extends Employee {

	public PartTime(Long eid, String ename, String email) {
		super(eid, ename, email);
		// TODO Auto-generated constructor stub

	}

	private String rate;

	public String getRate() {
		return rate;
	}

	public void setRate(String rate) {
		this.rate = rate;
	}

	public PartTime() {

	}
}
