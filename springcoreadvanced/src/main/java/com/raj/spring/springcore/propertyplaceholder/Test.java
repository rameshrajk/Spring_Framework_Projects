package com.raj.spring.springcore.propertyplaceholder;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/raj/spring/springcore/sec8ass/config.xml");
		MyDAO mydao = (MyDAO) context.getBean("MyDAO");
		System.out.println(mydao);
	}

}
