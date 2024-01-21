package com.springaop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@Aspect
@EnableAspectJAutoProxy
public class MyAspect {

//	@Before("execution(* PaymentImpl.*(..))")
//	public void showBefore() {
//		System.out.println("transaction started");
//		
//	}
//
	@After("execution(* PaymentImpl.*(..))")
	public void showAfter() {
		System.out.println("transaction ended");
		
	}

	@AfterReturning(pointcut = "execution(* PaymentImpl.*(..))", returning = "res")
	public void show(JoinPoint point, Object res) {
		System.out.println("after returning");
		System.out.println("method signature " + point.getSignature());
		System.out.println("result returning " + res);
	}
//	@AfterThrowing(  
//            pointcut = "execution(* PaymentImpl.*(..))",  
//            throwing= "error") 
//	   public void myadvice(JoinPoint jp,Throwable error)//it is advice  
//	    {  
//	        System.out.println("additional concern");  
//	        System.out.println("Method Signature: "  + jp.getSignature());  
//	        System.out.println("Exception is: "+error);  
//	        System.out.println("end of after throwing advice...");  
//	    } 

//	@Around("execution(* PaymentImpl.*(..))")
//	public Object myadvice(ProceedingJoinPoint joinPoint) throws Throwable// it is advice
//	{
//		System.out.println("Additional Concern Before calling actual method");
//		Object obj = joinPoint.proceed();
//		System.out.println("Additional Concern After calling actual method");
//		return obj;
//	}

}
