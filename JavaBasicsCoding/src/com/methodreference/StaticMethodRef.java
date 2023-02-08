package com.methodreference;

public class StaticMethodRef {

	public static void main(String[] args) {
		Payment p=StaticMethodRef::creditPay;
	            p.pay();
	
	     Sample s=StaticMethodRef::testSample;
	        s.test("welcome");
	
	}
      public static void creditPay() {
      System.out.println("Paying through the credit card");
      }
	
      public static void testSample(String s) {
          System.out.println(s);
          }


         }
      interface Payment{
	   void pay();
       }
      interface Sample{
   	   void test(String s);
          }