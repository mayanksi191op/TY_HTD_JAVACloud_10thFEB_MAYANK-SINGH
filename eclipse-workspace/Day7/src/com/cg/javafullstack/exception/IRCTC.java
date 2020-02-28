package com.cg.javafullstack.exception;

public class IRCTC {

	
		void confirm() {
		System.out.println("confirm started");
		try {
		System.out.println(10/0);
		}catch(ArithmeticException a)
		{
			//String msg=a.getMessage();
			//System.out.println(msg);
			a.printStackTrace();
			//System.out.println("@confirm");
			throw a;
		}
		finally {
		System.out.println("confirm ended");
	}}}

