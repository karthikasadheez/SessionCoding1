package com.bridgedesignpattern;

public class BridgeDesignPattern {

	public static void main(String[] args) {
		PaymentSys order=new CardPayment();
		
		 order.payment=new CitiPaymentSystem();
	     order.MakePayment();
	
	     order.payment=new IDBIPaymentSystem();
	     order.MakePayment();
	
	     order=new NetBankingPayment();
	     order.payment=new CitiPaymentSystem();
	     order.MakePayment();
	
	
	
	}

}
