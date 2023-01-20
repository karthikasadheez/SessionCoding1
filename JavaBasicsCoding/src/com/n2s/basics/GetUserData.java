package com.n2s.basics;

import java.util.Scanner;

public class GetUserData {

	public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
	  System.out.println("Enter your Name");
	
	  String name=sc.next();
	  System.out.println("Enter your Age");
	  int age=sc.nextInt();
	  System.out.println("Name"+name+"Age" +age );
	   sc.close();
	
	}

}
