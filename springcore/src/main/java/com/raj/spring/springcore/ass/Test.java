package com.raj.spring.springcore.ass;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/raj/spring/springcore/ass/config.xml");
		ShoppingCart shoppingcart = (ShoppingCart) context.getBean("shoppingcart");
		System.out.println(shoppingcart);
	}

}
