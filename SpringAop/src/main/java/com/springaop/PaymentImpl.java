package com.springaop;

import org.springframework.stereotype.Component;

@Component("temp")

public class PaymentImpl implements Payment {

	public void makePayment(int amount)throws Exception {
		System.out.println("amount debited");
		
//		System.out.println(amount/0);
		
		System.out.println("amount credited");
	}
	
	public int showPayment() {
		System.out.println("list of payment");
		return 3;
	}

}
