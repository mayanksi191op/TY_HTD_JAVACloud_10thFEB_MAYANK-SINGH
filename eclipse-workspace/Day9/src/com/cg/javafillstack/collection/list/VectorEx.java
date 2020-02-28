package com.cg.javafillstack.collection.list;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class VectorEx {

	public static void main(String[] args) {
		
		Vector<Character> v=new Vector<Character>();
		v.add('a');
		v.add('e');
		v.add('f');
		v.add('g');
		
		System.out.println("*********using for*********");
		for(int i=0; i<v.size(); i++)
		{
			Character c=v.get(i);
			System.out.println(c);
		}
		
		
		System.out.println("*******using for-each*********");
		for(Character c: v)
		{
			System.out.println(c);
		}
		
		
		System.out.println("*********using iterator********");
		Iterator<Character> it=v.iterator();
		while(it.hasNext())
		{
			Character c=it.next();
			System.out.println(c);
		}
		
		
		
		System.out.println("************using ListIterator*********");
		ListIterator<Character> lit=v.listIterator();
		System.out.println("--------FWD------");
		while(lit.hasNext())
		{
			Character c=lit.next();
			System.out.println(c);
		}
		
		System.out.println("-------BACK--------");
		while(lit.hasPrevious())
		{
			Character c=lit.previous();
			System.out.println(c);
		}
		
		
	}
}
