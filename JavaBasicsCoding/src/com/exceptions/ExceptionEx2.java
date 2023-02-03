package com.exceptions;

public class ExceptionEx2 {

	public static void main(String[] args) {
        try {
        	int i= 20/0;
        System.out.println(i);	
        }catch(ArithmeticException ae) {
        	ae.printStackTrace();
        	
        }
	   finally {
		   System.out.println("Always get executed");
	   }
        System.out.println("maintaining the flow of application");

	
	}
	
	

}
