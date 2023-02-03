package com.exceptions;

public class ExceptionEx4 {

	public static void main(String[] args) {
		ExceptionEx4 eex=new ExceptionEx4();
		try {
			eex.AgeValidation(12);
		} catch (InvalidAgeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("maintaining the flow of application");
	}
public void AgeValidation(int age) throws InvalidAgeException {
	if(age<18) 
		throw new InvalidAgeException ("Not eligible to vote");
	else
		System.out.println("Eligible to vote");
}
}
