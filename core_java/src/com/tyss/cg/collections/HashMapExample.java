package com.tyss.cg.collections;

import java.util.HashMap;

public class HashMapExample {
	public static void main(String[] args) {
		HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
		
		System.out.println("Size of HashMap: "+ hashMap.size());
		System.out.println("+++++++++++++++++++++++++++");
		
		hashMap.put("1st-Key", 1);
		hashMap.put("2nd-Key", 2);
		hashMap.put("3rd-Key", 3);
		
		System.out.println("Size of HashMap after put(): " + hashMap.size());
		System.out.println("+++++++++++++++++++++++++++");
		
		System.out.println(hashMap);
		System.out.println("+++++++++++++++++++++++++++");
		
		System.out.println("isEmpty() on HashMap: "+ hashMap.isEmpty());
		System.out.println("+++++++++++++++++++++++++++");
		
		System.out.println("remove() on hashMap: " + hashMap.remove("4th-Key"));
		System.out.println("+++++++++++++++++++++++++++");
		
		System.out.println("hashMap after remove(): "+ hashMap);
		System.out.println("+++++++++++++++++++++++++++");
		
		System.out.println("size of HashMap after remove(): "+ hashMap.size());
		System.out.println("+++++++++++++++++++++++++++");
	}
}
