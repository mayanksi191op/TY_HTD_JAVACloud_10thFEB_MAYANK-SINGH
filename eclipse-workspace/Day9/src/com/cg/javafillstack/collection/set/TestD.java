package com.cg.javafillstack.collection.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class TestD {
	public static void main(String[] args) {
		LinkedHashSet<Double> lhs=new LinkedHashSet<Double>();
		lhs.add(2.44);
		lhs.add(23.1);
		lhs.add(1.4);
		lhs.add(87.2);
		
		System.out.println("Using Iterator");
		Iterator<Double> it=lhs.iterator();
		while(it.hasNext())
		{
			Double d=it.next();
			System.out.println(d);
		}
		
		
		System.out.println("using foreach loop");
		for(Double d : lhs)
		{
			System.out.println(d);
		}
		
	}

}
