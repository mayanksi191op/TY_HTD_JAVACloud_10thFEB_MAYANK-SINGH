package com.cg.javafullstack.hasa;

public class TestB {
	public static void main(String[] args) {

		Student s=new Student();
		s.name="Mayank Singh";
		s.m.work();
		s.m.cost=100;
		s.use();
		System.out.println("Student name is "+s.name);
		System.out.println("Cost of mobile is "+s.m.cost);

	}
}
