package com.cg.javafullstack.polymorphism;

public class DB {

	void display(Person p)
	{
		int id=p.getId();
		String name=p.getName();
		double height=p.getHeight();
		
		System.out.println("ID is "+id);
		System.out.println("Name is "+name);
		System.out.println("Height is "+height);
	}
}
