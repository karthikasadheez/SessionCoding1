package com.n2s.oops;

public class MethodOverLoading {

	public static void main(String[] args) {
		MethodOverLoading mo=new MethodOverLoading();
		System.out.println(mo.add("Mango"));
		System.out.println(mo.add(5, 3));
        System.out.println(mo.add(2.5f, 3.7f));
	
	}

public int add(int x,int y) {
	return x+y;
}
public int add(int x,int y,int z) {
	return x+y+z;
}
public float add(float x,float y) {
	return x+y;
}
public String add(String s) {
	return s;
}



}
