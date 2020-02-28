package com.cg.javafullstack.Lamda;

import java.util.function.Supplier;

public class SupplierEx {

	public static void main(String[] args) {
		
		Supplier<Student> s=() -> new Student();
		Student r=s.get();
		Student d=s.get();
		Student x=s.get();
		
		System.out.println(r);
		System.out.println(d);
		System.out.println(x);
		
	}
}
