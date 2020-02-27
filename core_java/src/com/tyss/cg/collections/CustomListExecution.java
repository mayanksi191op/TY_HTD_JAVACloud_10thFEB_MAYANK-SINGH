package com.tyss.cg.collections;

import java.util.ArrayList;
import java.util.Collections;

public class CustomListExecution {
	public static void main(String[] args) {
		CustomList customList = new CustomList(4);
		customList.add("1");
		customList.add("4");
		customList.add("12");
		customList.add("2");
		customList.add("1");
		customList.add("2");
		
		System.out.println("CustomList size: " + customList.size());
		System.out.println("******************************");
		
		
		for (int i = 0; i < customList.size(); i++) {
			System.out.println("Element at: " + i + " index: " + customList.get(i));
		}
		
		System.out.println("******************************");
		boolean isThere = customList.contains("12");
		System.out.println("customList.contains(12): " + isThere);
		System.out.println("******************************");
		
		System.out.println(customList.getIndex("1672"));
		
	}
}
