package com.raj.spring.springcore.sec6ass;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/raj/spring/springcore/sec6ass/config.xml");
		University university = (University) context.getBean("university");
		System.out.println(university);

		
	}

}
