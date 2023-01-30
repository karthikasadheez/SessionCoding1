package com.collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapSample {
    //it will allow one null key,no of null values
	//morethan one null keyit will override
	//values can be duplicate
	//it will not sorting the key
	public static void main(String[] args) {
    HashMap<Integer,String>hm=new HashMap();
	hm.put(100,"Vijay");
	hm.put(75,"Anu");
	hm.put(null,"Vijay");
	hm.put(125,"sai");
	hm.put(115,"Dhrasti");
	hm.put(null,"Abi");
	hm.put(150,null);
	hm.put(135,"sam");
	hm.put(200, null);

	for(Map.Entry<Integer,String>entry:hm.entrySet()) {
		System.out.println(entry.getKey()+""+entry.getValue());
	}
	}

}
