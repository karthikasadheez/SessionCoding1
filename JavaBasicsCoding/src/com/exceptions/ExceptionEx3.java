package com.exceptions;

public class ExceptionEx3 {

	public static void main(String[] args) {
        int i=5;
        try {
        if(i==5) {
        	throw new ArithmeticException("Invalid number");
        }
        else
        	System.out.println(" correct number");
        }catch(ArithmeticException ae) {
        	ae.printStackTrace();
        }
            System.out.println("maintaining the flow of application");

	}

}
