package com.cg.javafillstack.collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;

public class TestIterator {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		ArrayList al=new ArrayList();
		al.add(5);
		al.add("mayank");
		al.add(2.5);
		
		/* for(int i=0; i<4; i++)			//inputing at runtime using for
		{
			String s=sc.nextLine();
			al.add(s);
			s.trim();
			
		}  */
		
		 Iterator it=al.iterator();               //using Iterator
		
		while(it.hasNext())
		{
			Object o=it.next();
			System.out.println(o);
		} 
		
		
		
	}

}
