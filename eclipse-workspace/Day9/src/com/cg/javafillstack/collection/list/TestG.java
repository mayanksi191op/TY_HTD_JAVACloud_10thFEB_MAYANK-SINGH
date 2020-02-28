package com.cg.javafillstack.collection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class TestG {
	
	public static void main(String[] args) {
		ArrayList<Person> al=new ArrayList<Person>();
		
		Comparator<Person> ComByHeight =(p1,p2) ->
		{
			if(p1.height > p2.height)
			{
				return 1;
			}
			else if(p1.height < p2.height)
			{
				return -1;
			}
			else
			{
				return 0;
			}
		};
		
		Comparator<Person> ComById =(p1,p2) ->
		{
			if(p1.id > p2.id)
			{
				return 1;
			}
			else if(p1.id < p2.id)
			{
				return -1;
			}
			else
			{
				return 0;
			}
		};
		
		Comparator<Person> ComByName = (p1,p2) ->
		{
			return p1.name.compareTo(p2.name);
		};
		
		Person p1=new Person(5, "Ramesh", 9.2);
		Person p2=new Person(1, "Manju", 5.9);
		Person p3=new Person(8, "Anil", 5.5);
		Person p4=new Person(4, "Sneha", 5.2);
		
		al.add(p1);
		al.add(p2);
		al.add(p3);
		al.add(p4);
		
		//PersonById pid=new PersonById();
		//PersonByHeight pbh=new PersonByHeight();
		//PersonByName pbn=new PersonByName();
		Collections.sort(al, ComByName);
		
		
		Iterator<Person> it=al.iterator();
		while(it.hasNext())
		{
			Person p=it.next();
			System.out.println(p.id);
			System.out.println(p.name);
			System.out.println(p.height);
			System.out.println("*******************");
		}
				
	}

}
