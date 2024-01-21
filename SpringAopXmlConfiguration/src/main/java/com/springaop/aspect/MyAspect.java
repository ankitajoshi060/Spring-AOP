package com.springaop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;


public class MyAspect {

	public void myadvice() {
		
		System.out.println("Before Transaction started");
		
	}
	
	public void afterMyAdvice() {
		System.out.println("After transcation ended");
	}
	
	public void afterReturningMyAdvice(JoinPoint point, Object result) {
		System.out.println("additional concern");
		System.out.println("returning result"+ result);
		System.out.println("AfterReturning transcation ended");
	}
	
	public void afterThrowingMyAdvice(JoinPoint point, Object error) {
		System.out.println("additional concern");
		System.out.println("returning result "+ error);
		System.out.println("AfterThrowing transcation ended");
	}
	
	public Object aroundMyAdvice(ProceedingJoinPoint point) throws Throwable {
		
		System.out.println("Additional concern before");
		Object obj = point.proceed();
		System.out.println("Additional concern after");
		return obj;
		
	}
}
