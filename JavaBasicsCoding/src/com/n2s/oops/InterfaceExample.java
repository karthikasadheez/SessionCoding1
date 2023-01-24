package com.n2s.oops;

public interface InterfaceExample {
 public static final int InterfaceExample_x=8;//by default variable is final only without using final keyword
 public abstract int add(int x,int y);//by default method is abstract only without using abstract keyword

 public default void test() {
	 
 }

 public static  void test2() {
	 
 }
 /*private  void test3() {
	 
 }*/  
// private method is allowed from java9


}
