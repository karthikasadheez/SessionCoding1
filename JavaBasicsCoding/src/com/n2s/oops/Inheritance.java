package com.n2s.oops;

public class Inheritance {

	public static void main(String[] args) {
		SubChild sc = new SubChild();
		sc.method1();
		sc.method2();
		sc.method3();
	}

}

class Parent {
	public void method1() {

	}
}

class Child extends Parent {
	public void method2() {

	}
}

class SubChild extends Child {
	public void method3() {

	}

}
