package com.cg.javafullstack.polymorphism;

public class TestG {
	public static void main(String[] args) {
		StoreEmployee sm=new StoreEmployee();
		Employee e=new Employee();
		//Employee e=new Employee();
		e.setAddress("Bangalore");
		e.setAge(15);
		e.setDesig("stud");
		e.setEmail("mayanksi@gmail.com");
		e.setGender("Male");
		e.setName("Mayank");
		e.setPhone(7866);
		e.setSalary(0);
		
		sm.save(e);
		
		
	}

}
