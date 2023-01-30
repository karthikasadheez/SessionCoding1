package com.collection;

import java.util.*;
public class ALDemo {

	public static void main(String[] args) {
    ArrayList<String>al=new ArrayList<String>();
	     al.add("Abi");
	     al.add("Baanu");
	     al.add("Sai");
	     al.add("Ravi");
	     al.add("Abi");
	     al.add(null);
	        
	     System.out.println(al);
	     ArrayList<String>al2=new ArrayList<String>();
	     al2.add("Amily");
	     al2.add("benny");
	     al.addAll(al2);
	     
	     
	  Iterator<String> it=al.iterator();
	while(it.hasNext()) {
		System.out.println(it.next());
	}
	}

}
