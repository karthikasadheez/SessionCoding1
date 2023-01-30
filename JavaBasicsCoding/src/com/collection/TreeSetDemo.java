package com.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		TreeSet<String>ts=new TreeSet<String>();
	     ts.add("Abi");
	     ts.add("Baanu");
	     ts.add("Sai");
	     ts.add("Ravi");
         ts.add("Abi");
	     
        //it cannot have duplicates
        //two values are duplicates it will override the value
        // maintaining ascending order
        Iterator<String> it=ts.iterator();
	 	while(it.hasNext()) {
	 		System.out.println(it.next());
	 	}
	}
	}


