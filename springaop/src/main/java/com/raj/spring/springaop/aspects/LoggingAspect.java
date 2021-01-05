package com.raj.spring.springaop.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggingAspect {

	@Before("execution(* com.raj.spring.springaop.ProductServiceImpl.multiply(..))")
	public void logBefore(JoinPoint jointPoint) {
		System.out.println("Before calling the method");
	}

	@After("execution(* com.raj.spring.springaop.ProductServiceImpl.multiply(..))")
	public void logAfter(JoinPoint jointPoint) {
		System.out.println("After calling the method");
	}
}
