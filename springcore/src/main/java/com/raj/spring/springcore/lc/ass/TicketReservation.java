package com.raj.spring.springcore.lc.ass;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class TicketReservation {

	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		System.out.println("Inside Setter Method");
		this.id = id;
	}

	@PostConstruct
	public void initialize() {
		System.out.println("Inside initialize Method");
	}
	
	@PreDestroy
	public void cleanUp() {
		System.out.println("Inside cleanUp Method");
	}

	@Override
	public String toString() {
		return "Patient [id=" + id + "]";
	}
}
