package com.n2s.basics;

public class StaticExample {
          static int x=8;
	public static void main(String[] args) {
	  System.out.println("Inside the main method");
	  A.show1();
	  show();
	  System.out.println ("2.value is x"+x);

	}
    public static void show() {
    	System.out.println("3.Inside the show method");
          x=5;
    
    }
    static class A{
    	public static void show1() {
        	System.out.println("4.Inside the show method");
              x=3;
    }
    }
     static {
    	 System.out.println("5.Inside the static block");
          x=6;
     }


}
