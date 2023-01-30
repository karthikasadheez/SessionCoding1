package com.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedSample {

	public static void main(String[] args) {
	 LinkedList<String>ll=new LinkedList<String>();
		 ll.add("Abi");
	     ll.add("Baanu");
	     ll.add("Sai");
	     ll.add("Ravi");
	     ll.add("Abi");
	     ListIterator<String> lit=ll.listIterator();
	     while(lit.hasNext()) {
	    	 System.out.println(lit.next());
	     }
	     System.out.println("-----------------------");
        while(lit.hasPrevious()) {
    	  System.out.println(lit.previous());
         }
	
	
	
	}

}
