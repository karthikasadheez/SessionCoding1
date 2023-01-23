package com.n2s.oops;

public class MethodOverriding extends superriding  {

	public static void main(String[] args) {
		MethodOverriding mor=new MethodOverriding();
	    mor.mes();
	
	}
	public void mes() {
		System.out.println("Running from methodriding");
		super.mes();
	
	}

}
class superriding{
public void mes() {
	System.out.println("Running from superriding");
}
}