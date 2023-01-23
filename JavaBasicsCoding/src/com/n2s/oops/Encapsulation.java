package com.n2s.oops;

public class Encapsulation {

	public static void main(String[] args) {
		Test t = new Test();
		t.display();
	}

}

class Test {
	public int x = 8;
	private int y = 6;

	InnerTest it = new InnerTest();

	public void display() {
		System.out.println("Display1");
		it.display2();
		display3();
	}

	private static void display3() {
		System.out.println("Display3");
	}

	private class InnerTest {
		public void display2() {
			System.out.println("Display2");
			y = 2;

		}
	}
}
