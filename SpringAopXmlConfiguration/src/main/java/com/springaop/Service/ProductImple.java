package com.springaop.Service;

import com.sprinaop.exception.MyException;

public class ProductImple implements Product{

	public void productTransaction(int amount) throws MyException {
		
		if(amount<2000) {
			throw new MyException();
		}
		else {
			System.out.println("correct amount");
		}
	}
	
	public double getAmount(int amount) {
		System.out.println("amount: "+ amount);
		return amount;
	}

	public String getName(String name) {
		System.out.println("Name: " +name);
		return name;
	}

}
