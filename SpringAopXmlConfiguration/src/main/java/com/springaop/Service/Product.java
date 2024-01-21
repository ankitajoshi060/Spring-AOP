package com.springaop.Service;

import com.sprinaop.exception.MyException;

public interface Product {

	public void productTransaction(int amount) throws MyException;
	
	public double getAmount(int amount);
	
	String getName(String name);
}
