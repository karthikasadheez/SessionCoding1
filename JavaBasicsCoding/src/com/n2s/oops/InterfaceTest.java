package com.n2s.oops;

public class InterfaceTest implements InterfaceExample,InterfaceExample2{

	public static void main(String[] args) {
		InterfaceTest it=new InterfaceTest();
	    System.out.println(it.add(InterfaceExample_x,InterfaceExample2_y));
	  //  InterfaceExample_x=3;
	    InterfaceExample.test2();
	     it.test();
	
	    //we can create object in interface using anonymous inner type
	     
	     /* InterfaceExample2 ife=new InterfaceExample2() {
			
			@Override
			public int sub(int x, int y) {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public int mult(int x, int y) {
				// TODO Auto-generated method stub
				return 0;
			}*/
		};
	
		

	@Override
	public int sub(int x, int y) {
		// TODO Auto-generated method stub
		return x-y;
	}

	@Override
	public int add(int x, int y) {
		// TODO Auto-generated method stub
		return x+y;
	}

	@Override
	public int mult(int x, int y) {
		// TODO Auto-generated method stub
		return 0;
	}

}
