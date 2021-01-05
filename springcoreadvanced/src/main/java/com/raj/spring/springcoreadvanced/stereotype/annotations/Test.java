package com.raj.spring.springcoreadvanced.stereotype.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/raj/spring/springcoreadvanced/stereotype/annotations/config.xml");
		Instructor i = (Instructor) context.getBean("inst");
		System.out.println(i);
		Instructor i2 = (Instructor) context.getBean("inst");
		System.out.println(i2);

	}

}
