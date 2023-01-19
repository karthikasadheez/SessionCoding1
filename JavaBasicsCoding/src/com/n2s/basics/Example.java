package com.n2s.basics;

public class Example {

	public static void main(String[] args) {
    
    System.out.println("welcome"); 
    System.out.println(args.length); 
    for(int i=0;i<args.length;i++) {
    System.out.println(args [i]); 
    }
    Example obj=new Example();
    System.out.println(obj.add(3, 2));
    System.out.println(sub(5, 2));
	
	}
    public int add(int x,int y) {
    	return (x+y);
    }
    public static  int sub(int x,int y) {
    	return(x-y);
    }


}