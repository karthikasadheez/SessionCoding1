package com.collection;

import java.util.Enumeration;
import java.util.Vector;

public class VectorSample {

	public static void main(String[] args) {
     Vector<String>vec=new Vector();
     vec.add("Abi");
     vec.add("Baanu");
     vec.add("Sai");
     vec.add("Ravi");
	 // addelement instead of add in vector
     vec.addElement("benny");
	Enumeration<String>e=vec.elements();
	while(e.hasMoreElements()){
	// it is only in vector
	System.out.println(e.nextElement());
	
	}

}
}