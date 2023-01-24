package com.n2s.oops;

public class Constructor {
public static void main(String[] args) {
	Constructor ct=new Constructor(5);
	ChildCons cc=new ChildCons();    


}
    Constructor(){
	System.out.println("Default constructor");
}
    Constructor(int x){
    	System.out.println("single parameter constructor"+x);
    }
    Constructor(int x,float y)
    
    {
    	this();
    	System.out.println("double parameter constructor"+ x+""+y);
    }
}
class ChildCons  extends Constructor{
	ChildCons(){
	 super();   // always first statement inside the constructor
	System.out.println("i am child");

	
	}
}