package com.springaop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sprinaop.exception.MyException;
import com.springaop.Service.Product;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
    	Product product = context.getBean("product", Product.class);
    	try {
			product.productTransaction(1000);
		} catch (MyException e) {
			
			System.out.println("message "+e);
			
		}
    	System.out.println("===============================");
    	System.out.println(product.getAmount(3000));
    	System.out.println("===============================");
    	product.getName("ankita");
    }
}
