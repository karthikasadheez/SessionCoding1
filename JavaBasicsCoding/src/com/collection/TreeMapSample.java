package com.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapSample {
//treemap doesnot allow the key as null
// sorting based on key	
// number of null values can allowed	
	public static void main(String[] args) {
		TreeMap<Integer,String>tm=new TreeMap();
		tm.put(100,"Vijay");
		tm.put(75,"Anu");
	//	tm.put(null,"Vijay");
		tm.put(125,"sai");
		tm.put(115,"Dhrasti");
		//tm.put(null,"Abi");
		tm.put(150,null);
		tm.put(135,"sam");
		tm.put(200, null);

		for(Map.Entry<Integer,String>entry:tm.entrySet()) {
			System.out.println(entry.getKey()+""+entry.getValue());
		}
		}


	}

