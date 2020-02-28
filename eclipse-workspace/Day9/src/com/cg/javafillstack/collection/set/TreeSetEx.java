package com.cg.javafillstack.collection.set;

import java.util.TreeSet;

public class TreeSetEx {

	public static void main(String[] args) {
		TreeSet ts=new TreeSet();
		ts.add(89);
		ts.add(98);
		ts.add(12);
		ts.add(2);
		
		for(Object o:ts)
		{
			System.out.println(o);
		}
	}
}
