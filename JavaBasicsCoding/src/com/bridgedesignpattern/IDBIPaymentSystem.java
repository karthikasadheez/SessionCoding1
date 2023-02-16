package com.bridgedesignpattern;

public class IDBIPaymentSystem implements Payment{

	@Override
	public void ProcessPayment(String PaymentSystem) {
		System.out.println("Using IDBIBank Paymentfor"+PaymentSystem);	
		
	}

}
