package com.cg.javafillstack.collection.list;

import java.util.ArrayList;
import java.util.ListIterator;

public class TestListIterator {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(5);
		al.add("mayank");
		al.add(2.5);
		
		
		
		ListIterator lit= al.listIterator();		//using ListIterator
		
		 System.out.println("...........Forward");
		while(lit.hasNext())
		{
			Object o=lit.next();
			System.out.println(o);
		} 
		
		System.out.println("...........Backward");
		while(lit.hasPrevious())
		{
			Object o=lit.previous();
			System.out.println(o);
		}
		
	}

}
