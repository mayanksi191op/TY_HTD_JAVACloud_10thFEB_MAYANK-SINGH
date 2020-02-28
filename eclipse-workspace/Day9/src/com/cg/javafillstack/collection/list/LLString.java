package com.cg.javafillstack.collection.list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LLString {
	
	public static void main(String[] args) {
		LinkedList<String> ll=new LinkedList<String>();
		
		ll.add("manu");
		ll.add("priya");
		ll.add("swapnil");
		
		
		System.out.println("************USING FOR LOOP***********");
		for(int i=0; i<ll.size(); i++)
		{
			String s=ll.get(i);
			System.out.println(s);
		}
		
		System.out.println("*********USING FOR-EACH LOOP***********");
		for(String s: ll)
		{
			System.out.println(s);
		}
		
		System.out.println("************USING ITERATOR**************");
		Iterator<String> it=ll.iterator();
		
		while(it.hasNext())
		{
			String s=it.next();
			System.out.println(s);
		}
		
		System.out.println("*************USING LIST-ITERATOR**************");
		ListIterator<String> lit=ll.listIterator();
		System.out.println(".........FWD");
		while(lit.hasNext())
		{
			String s=lit.next();
			System.out.println(s);
		}
		System.out.println("........BACK");
		while(lit.hasPrevious())
		{
			String s=lit.previous();
			System.out.println(s);
		}
		
		
		
	}

}
