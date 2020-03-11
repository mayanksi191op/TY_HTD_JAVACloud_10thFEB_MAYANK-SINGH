package com.tyss.cg.collections;

import java.util.HashMap;
import java.util.*;

public class LinkedHashMapExample {
	public static void main(String[] args) {
		LinkedHashMap<String, Integer> linkedHashMap=new LinkedHashMap<String, Integer>();
		
		System.out.println("Size of LinkedHashMap: "+ linkedHashMap.size());
		System.out.println("+++++++++++++++++++++++++++");
		
		linkedHashMap.put("1st-Key", 1);
		linkedHashMap.put("2nd-Key", 2);
		linkedHashMap.put("3rd-Key", 3);
		linkedHashMap.put("4th-Key", 4);
		
		System.out.println("Size of HashMap after put(): " + linkedHashMap.size());
		System.out.println("+++++++++++++++++++++++++++");
		
		System.out.println(linkedHashMap);
		System.out.println("+++++++++++++++++++++++++++");
		
		System.out.println("isEmpty() on HashMap: "+ linkedHashMap.isEmpty());
		System.out.println("+++++++++++++++++++++++++++");
		
		System.out.println("remove() on hashMap: " + linkedHashMap.remove("4th-Key"));
		System.out.println("+++++++++++++++++++++++++++");
		
		System.out.println("hashMap after remove(): "+ linkedHashMap);
		System.out.println("+++++++++++++++++++++++++++");
		
		System.out.println("size of HashMap after remove(): "+ linkedHashMap.size());
		System.out.println("+++++++++++++++++++++++++++");
	}

}
