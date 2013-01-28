package ru.vrn.com.server.interceptors;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;


@Aspect
public class Interceptors {
	
	@Before("execution(* ru.vrn.com.server.GreetingServiceImpl.greetServer(..))")
	public void logBefore1(JoinPoint joinPoint){
		System.out.println("logBefore() is running!");
		System.out.println("------------ : " + joinPoint.getSignature().getName());
		System.out.println("****************************************");
	}
	
	@After("execution(* ru.vrn.com.server.GreetingServiceImpl.greetServer(..))")
	public void logAfter(JoinPoint joinPoint){
		System.out.println("logAfter() is running!");
		System.out.println("-----------: " + joinPoint.getSignature().getName());
		System.out.println("****************************************");
	}
	
	@Around("execution(* ru.vrn.com.server.GreetingServiceImpl.greetServer(..))")
	public void logAround(JoinPoint joinPoint){
		System.out.println("logAround is rinning now!");
		System.out.println("---------: " + joinPoint.getSignature().getName());
		System.out.println("****************************************");
	}
}
