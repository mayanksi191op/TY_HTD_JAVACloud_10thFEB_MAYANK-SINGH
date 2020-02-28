package com.cg.javafillstack.collection.set;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class TestStudent {
	
	public static void main(String[] args) {
		SortId sid=new SortId();
		SortName sn=new SortName();
		SortPerc sp=new SortPerc();
		TreeSet<Student> ts= new TreeSet<Student>();
		
		Comparator<Student> SortId = (s1,s2) ->
		{
			if(s1.id > s2.id)
			{
				return 1;
			}
			else if (s1.id < s2.id)
			{
				return -1;
			}
			else
			{
				return 0;
			}
		};
		
		Student s1=new Student(9, "Manu", 56.2);
		Student s2=new Student(2, "Neeraj", 78.2);
		Student s3=new Student(3, "Pankaj", 67.3);
		
		ts.add(s1);
		ts.add(s2);
		ts.add(s3);
		
		Iterator<Student> it=ts.iterator();
		while(it.hasNext())
		{
			Student s= it.next();
			System.out.println(s.id);
			System.out.println(s.name);
			System.out.println(s.perc);
			System.out.println("*************");
		}
	}

}
