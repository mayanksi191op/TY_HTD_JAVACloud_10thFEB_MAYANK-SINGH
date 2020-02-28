package com.cg.javafullstack.polymorphism;

public class StoreEmployee {

	void save(Employee e)
	{
		System.out.println("ID is "+e.getId());
		System.out.println("Name is "+e.getName());
		System.out.println("Salary is "+e.getSalary());
		System.out.println("Desig is "+e.getDesig());
		System.out.println("Age is "+e.getAge());
		System.out.println("Email is "+e.getEmail());
		System.out.println("Phone is "+e.getPhone());
		System.out.println("Gender is "+e.getGender());
		System.out.println("Address is "+e.getAddress());
		
	}
}
