package com.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class HashsetSample {

	public static void main(String[] args) {
		ArrayList<String>hs=new ArrayList<String>();
	     hs.add("Abi");
	     hs.add("Baanu");
	     hs.add("Sai");
	     hs.add("Ravi");
         hs.add("Abi");
	     
         //it cannot have duplicates
         //two values are duplicates it will override the value
         Iterator<String> it=hs.iterator();
	 	while(it.hasNext()) {
	 		System.out.println(it.next());
	 	}
	}

}
