package com.lambda;

public class Lambda1 {

	public static void main(String[] args) {
		SingleParam sp=name ->{
		System.out.println("my name is "+name);
		};
		sp.displayName("Karthi");
	
		DoubleParam dp1=(a,b)->(a+b);
		System.out.println(dp1.add(3, 3));
	    
		
		DoubleParam dp2=(a,b)->(a+b);
		System.out.println(dp1.add(20, 10));
	}
    
}
@FunctionalInterface
interface SingleParam{
	public abstract void displayName(String name);
}

@FunctionalInterface
interface DoubleParam{
	public abstract int add(int a,int b);
}