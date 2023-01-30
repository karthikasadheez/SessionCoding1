package com.collection;

import java.util.Iterator;
import java.util.PriorityQueue;

public class ProrityQueDemo {

	public static void main(String[] args) {
     PriorityQueue<String>pq=new PriorityQueue();
     pq.add("Abi");
     pq.add("Baanu");
     pq.add("Sai");
     pq.add("Ravi");

	
	Iterator<String> it=pq.iterator();
 	while(it.hasNext()) {
 		System.out.println(it.next());
 	}
 	System.out.println("head:"+pq.element());//if list is empty it throws NOSuchElement exception
 	System.out.println("head:"+pq.peek());//if the list is empty it return null
 	 
 	pq.remove();
     pq.poll();
     System.out.println("After Removing two elements");
     Iterator<String> it2=pq.iterator();
  	while(it2.hasNext()) {
  		System.out.println(it2.next());
  	}

	
	
	}

}
