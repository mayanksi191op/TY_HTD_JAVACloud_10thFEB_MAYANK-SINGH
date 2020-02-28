package com.cg.javafullstack.exception;

public class Demo {
	public static void main(String[] args) {
		
		System.out.println("Main started");
		Paytm p=new Paytm();
		try {
			p.book();
		}catch(ArithmeticException a) {
			System.out.println("@main");
		}
		System.out.println("main ended");
	}

}
