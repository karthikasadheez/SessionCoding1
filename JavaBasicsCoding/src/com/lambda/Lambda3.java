package com.lambda;

public class Lambda3 {

	public static void main(String[] args) {
      Runnable r= () ->{
    	System.out.println("Thread is Running");  
      };
      Thread t=new Thread(r);
      t.start();
	}

}
