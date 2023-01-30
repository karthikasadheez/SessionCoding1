package com.collection;

import java.util.Hashtable;
import java.util.Map;
import java.util.TreeMap;

public class HashTableSample {
// not allow null values and keys
	public static void main(String[] args) {

     Hashtable<Integer,String>ht=new Hashtable<Integer, String>();
		ht.put(100,"Vijay");
		ht.put(75,"Anu");
	//	tm.put(null,"Vijay");
		ht.put(125,"sai");
		ht.put(115,"Dhrasti");
		//tm.put(null,"Abi");
		//ht.put(150,null);
		ht.put(135,"sam");
		//ht.put(200, null);

		for(Map.Entry<Integer,String>entry:ht.entrySet()) {
			System.out.println(entry.getKey()+""+entry.getValue());
		}
		}



	}


