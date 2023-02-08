package com.Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamIntermedite {


	public static void main(String[] args) {
	   List<Integer> l=new ArrayList<Integer>();
		for(int i=0; i<=100; i++) {
        l.add(i);
		
	}
     Stream<Integer> s1=l.stream();
     Stream highernum=s1.filter(x->x>90);
     highernum.forEach(x->System.out.print(x+" "));
	
	
	Stream<String>names=Stream.of("aBc","d","ef");
	System.out.println(names.map(
			s->{return s.toUpperCase();
			}).collect(Collectors.toList()));
	
	
	
	}
}
