package com.collection;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeueSample {

	public static void main(String[] args) {

		//ArrayDeque class is derived from Deque interface
	 Deque<String>dq=new ArrayDeque<String>();
	  dq.offer("Abi");
	  dq.offer("John");
	  dq.add("Larry");
      dq.offerFirst("Emily");
      dq.offerLast("wendy");
      dq.offer("kavi");
      dq.offerFirst("colan");
	
	for(String s:dq) {
	System.out.println(s);	
	}
	dq.pollLast();
	System.out.println("----------------------------");
	for(String s:dq) {
		System.out.println(s);	
		}
	
	}

}
