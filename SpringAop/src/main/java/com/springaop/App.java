package com.springaop;

import org.springframework.aop.framework.AopProxyUtils;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
    	Payment payment = context.getBean("temp", Payment.class);
    	try {
			payment.makePayment(123);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
    	System.out.println("=================================================");
    	payment.showPayment();
    }
}
