package com.Stream;

import java.util.Optional;
import java.util.stream.Stream;

public class StringTerminal {

	public static void main(String[] args) {
     Stream<Integer>numbers=Stream.of(1,2,3,4,5);
	Optional<Integer>intOp=numbers.reduce((i,j)->{
		return i*j;
	});
	
	if(intOp.isPresent()) {
		System.out.println(intOp.get());
	}
	// once pipeline is processed
	//numbers.count()is not possible in this line it will throw exception
	Stream<Integer>numbers1=Stream.of(1,2,3,4,5);
	System.out.println(numbers1.count());
	}

}
