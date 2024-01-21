package com.springaop;

import org.springframework.stereotype.Component;

@Component
public interface Payment {

	public void makePayment(int amount) throws Exception;
	int showPayment();
}
