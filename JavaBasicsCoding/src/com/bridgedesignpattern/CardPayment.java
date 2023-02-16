package com.bridgedesignpattern;

public class CardPayment extends PaymentSys {

	@Override
	public void MakePayment() {
		payment.ProcessPayment("Card Payment");
		
	}

}
