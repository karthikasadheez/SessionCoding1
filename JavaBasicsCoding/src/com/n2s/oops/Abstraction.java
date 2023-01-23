package com.n2s.oops;

public class Abstraction extends Calc {

	public static void main(String[] args) {

	}

	@Override
	public int add(int a, int b) {
		return a+b;
	}

	@Override
	public int sub(int a, int b) {
		// TODO Auto-generated method stub
		return 0;
	}

}
abstract class Calc{
	public abstract int add(int a,int b);
	
	public abstract int sub(int a,int b);

	public  int mult(int a,int b) {
	      return a*b;

	}
    
}