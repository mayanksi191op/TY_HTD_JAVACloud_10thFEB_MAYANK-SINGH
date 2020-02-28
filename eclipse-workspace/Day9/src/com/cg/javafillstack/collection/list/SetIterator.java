package com.cg.javafillstack.collection.list;

import java.util.HashSet;
import java.util.Iterator;

public class SetIterator {
	
	public static void main(String[] args) {
		HashSet hs=new HashSet();
		hs.add("Ramu");
		hs.add(5.4);
		hs.add('A');
		hs.add(16);
		
		Iterator it=hs.iterator();
		while(it.hasNext())
		{
			Object o=it.next();
			System.out.println(o);
		}
	}

}
