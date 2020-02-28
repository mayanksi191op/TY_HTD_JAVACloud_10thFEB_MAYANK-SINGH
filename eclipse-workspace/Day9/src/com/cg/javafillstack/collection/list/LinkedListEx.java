package com.cg.javafillstack.collection.list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListEx {

	public static void main(String[] args) {
		
		LinkedList ll=new LinkedList();
		
		ll.add(5);
		ll.add("thanks");
		ll.add(3.4);
		ll.add('e');
		
		/* for(int i=0; i<ll.size(); i++)				//using for loop
		{
			Object o=ll.get(i);
			System.out.println(o);
		}  */
		
		
		/* for(Object o: ll)							//using for each loop
		{
			System.out.println(o);
		}   */
		
		
		/* Iterator it=ll.iterator();					//using iterator
		while(it.hasNext())
		{
			Object o=it.next();
			System.out.println(o);
		}   */
		
		
		ListIterator lit=ll.listIterator();				//using ListIterator
		System.out.println("..........FWD");
		while(lit.hasNext())
		{
			Object o=lit.next();
			System.out.println(o);
		}
		System.out.println("............BACK");
		while(lit.hasPrevious())
		{
			Object o=lit.previous();
			System.out.println(o);
		}
		
	}
}
