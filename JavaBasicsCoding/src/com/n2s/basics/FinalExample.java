package com.n2s.basics;
final class SuperClass{
	public final void superdisplay() {
		System.out.println("Inside the super class");
	}
}
public class FinalExample {
    static int x;
    static String s;
    
    //decalred final need to initialize the variable otherwise will get error
    public static  final int y=2;
	public static void main(String[] args) {
    System.out.println(x);//0
    System.out.println(s);//null
	}

}
