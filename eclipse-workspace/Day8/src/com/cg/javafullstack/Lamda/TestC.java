package com.cg.javafullstack.Lamda;

public class TestC {

	public static void main(String[] args) {
		BMI b=(w,h) -> w/(h*h);
		double d=b.calculate(400, 5);
		System.out.println("BMI is "+d);
	}
}
