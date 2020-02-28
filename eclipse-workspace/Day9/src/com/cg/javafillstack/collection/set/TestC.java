package com.cg.javafillstack.collection.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class TestC {
public static void main(String[] args) {
	LinkedHashSet lhs=new LinkedHashSet();
	
	lhs.add(5);
	lhs.add(6);
	lhs.add(1);
	lhs.add(18);
	
	Iterator it=lhs.iterator();
	while(it.hasNext())
	{
		Object o=it.next();
		System.out.println(o);
	}
	
}
}
