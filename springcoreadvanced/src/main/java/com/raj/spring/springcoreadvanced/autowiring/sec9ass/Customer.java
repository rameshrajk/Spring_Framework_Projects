package com.raj.spring.springcoreadvanced.autowiring.sec9ass;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Customer {

	private String name;

	@Autowired
	private Reservation Reservation;

	public Reservation getReservation() {
		return Reservation;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Customer [Reservation=" + Reservation + ", name=" + name + "]";
	}

}
