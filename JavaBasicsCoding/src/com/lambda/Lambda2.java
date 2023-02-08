package com.lambda;

import java.util.ArrayList;
import java.util.List;

public class Lambda2 {

	public static void main(String[] args) {
		List<String> l=new ArrayList<String>();
	     l.add("Abi");
	     l.add("barbi");
	     l.add("catty");
	     l.add("David");
	
	     l.forEach((n)->System.out.println(n));
	
	
	}

}
