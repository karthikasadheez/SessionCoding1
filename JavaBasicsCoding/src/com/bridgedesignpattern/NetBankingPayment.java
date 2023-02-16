package com.bridgedesignpattern;

public class NetBankingPayment extends PaymentSys {
//Refined Abstraction
	@Override
	public void MakePayment() {
		payment.ProcessPayment("NetBanking Payment");
		
	}

}
