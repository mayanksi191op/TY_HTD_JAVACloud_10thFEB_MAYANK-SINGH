package com.cg.javafullstack.exception;

public class TestA {

	public static void main(String[] args) {
		System.out.println("Main started");
		
		try
		{
			
			System.out.println(10/2);
			
		}catch(ArithmeticException a)
		{
			System.out.println("Dont divide by 0");
		}
		
		System.out.println("Main ended");
	}
}
