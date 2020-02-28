package com.cg.javafillstack.collection.set;

import java.util.HashSet;

public class TestA {
	public static void main(String[] args) {
		
		HashSet hs=new HashSet();
		hs.add("Ramu");
		hs.add(5.4);
		hs.add('A');
		hs.add(16);
		
		
		for(Object o:hs)
		{
			System.out.println(o);
		}
	}

}
