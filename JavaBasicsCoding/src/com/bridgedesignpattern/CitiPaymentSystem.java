package com.bridgedesignpattern;

public class CitiPaymentSystem implements Payment {

	@Override
	public void ProcessPayment(String PaymentSystem) {
		System.out.println("Using citiBank gateway for"+PaymentSystem);	
	}

}
