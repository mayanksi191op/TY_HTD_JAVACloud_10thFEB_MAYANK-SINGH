package com.cg.javafullstack.Lamda;

public class TestB {

	public static void main(String[] args) {
		MyCircle mc=r -> 3.14*r*r;
		double d=mc.area(5);
		System.out.println("Result is "+d);
		
	}
}
