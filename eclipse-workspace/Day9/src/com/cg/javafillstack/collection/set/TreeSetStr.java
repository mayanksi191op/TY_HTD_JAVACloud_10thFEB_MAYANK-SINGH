package com.cg.javafillstack.collection.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetStr {

	public static void main(String[] args) {
		TreeSet<String> ts=new TreeSet<String>();
		
		ts.add("Manu");
		ts.add("Kavya");
		ts.add("Manju");
		ts.add("Puneet");
		
		Iterator<String> it=ts.iterator();
		while(it.hasNext())
		{
			String s=it.next();
			System.out.println(s);
		}
	}
}
