package com.cg.javafullstack.polymorphism;

public class TestH {
	public static void main(String[] args) {
		
	DB d=new DB();
	Person p=new Person();
	p.setName("Mayank");
	p.setHeight(6.0);
	p.setId(23);
	
	d.display(p);
	
	
	}
}
