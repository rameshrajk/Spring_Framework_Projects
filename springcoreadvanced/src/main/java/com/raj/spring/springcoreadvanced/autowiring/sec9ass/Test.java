package com.raj.spring.springcoreadvanced.autowiring.sec9ass;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/raj/spring/springcoreadvanced/autowiring/sec9ass/config.xml");
		Customer c = (Customer) context.getBean("Raj");
		System.out.println(c);
	}

}
