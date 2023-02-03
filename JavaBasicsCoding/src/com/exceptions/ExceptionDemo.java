package com.exceptions;

public class ExceptionDemo {

	public static void main(String[] args) {
        try {
        int i=20;
        i=20/0;
	System.out.println(i);
        }
        catch(ArithmeticException e) {
         e.printStackTrace();
        }
	System.out.println("welcome");
        
	
	}

}
