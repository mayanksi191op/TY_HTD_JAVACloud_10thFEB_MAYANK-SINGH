package com.practice;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class pracproj {
	static void map() {
		HashMap<String, Object> hs = new LinkedHashMap<String, Object>();
		hs.put("Abc", "AD01");
		System.out.println(((String) hs.get("Abc")).toLowerCase());
	}
	public static void main(String[] args) {
		map();
	}
}
