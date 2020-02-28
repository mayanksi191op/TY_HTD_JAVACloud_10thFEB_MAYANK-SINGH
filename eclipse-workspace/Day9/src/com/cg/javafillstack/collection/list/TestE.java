package com.cg.javafillstack.collection.list;

import java.util.ArrayList;
import java.util.Iterator;

public class TestE {
	public static void main(String[] args) {
		ArrayList<Student> al=new ArrayList<Student>();
		
		Student s1=new Student(1, "Manu", 72.3);
		Student s2=new Student(2, "Priya", 56.3);
		Student s3=new Student(3, "Pankaj", 67.9);
		Student s4=new Student(4, "Tanya", 90.0);
		
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		
		Iterator<Student> it=al.iterator();
		while(it.hasNext())
		{
			Student k=it.next();
			System.out.println(k.id);
			System.out.println(k.name);
			System.out.println(k.perc);
			System.out.println("***********************");
			
		}
	}

}
