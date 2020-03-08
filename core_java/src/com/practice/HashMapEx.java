package com.practice;

import java.util.HashMap;

import com.tyss.cg.encapsulation.User;

public class HashMapEx {

	public static void main(String[] args) {
		HashMap<String, Integer> listHashMap = new HashMap<String, Integer>() ;
		listHashMap.put("1st-key", 10);
		listHashMap.put("2nd-key", 10);
		listHashMap.put("3rd-key", 20);
		listHashMap.put("4th-key",30);
		
		listHashMap.forEach(k,v){
			System.out.println();
		}
		//System.out.println(listHashMap);
	}
}
