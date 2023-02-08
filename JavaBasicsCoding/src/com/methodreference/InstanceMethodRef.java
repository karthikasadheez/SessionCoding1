package com.methodreference;

public class InstanceMethodRef {

	public static void main(String[] args) {
		InstanceMethodRef imr=new InstanceMethodRef();
		Payment1 p1=imr::debitPay;
		p1.pay();
		Payment1 p1a=new InstanceMethodRef()::debitPay;
		p1a.pay();
	}
	public  void debitPay() {
	      System.out.println("Paying through debitcard");
	      }
		   
}
@FunctionalInterface
interface Payment1{
	   void pay();
    }