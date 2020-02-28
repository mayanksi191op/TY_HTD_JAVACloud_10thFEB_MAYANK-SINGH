package com.cg.javafillstack.collection.list;

import java.util.ArrayList;
import java.util.ListIterator;

public class TestB {
	public static void main(String[] args) {
		ArrayList<Object> a=new ArrayList<Object>();
		a.add('M');
		a.add(16);
		a.add(5.4);
		a.add("divya");
		
		ListIterator<Object> lit=a.listIterator();
		while(lit.hasNext())
		{
			Object o=lit.next();
			System.out.println(o);
		}
	}

}
