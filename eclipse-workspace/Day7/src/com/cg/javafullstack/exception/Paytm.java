package com.cg.javafullstack.exception;

public class Paytm {

	
		void book(){
		System.out.println("book started");
		
		IRCTC i=new IRCTC();
		
		try {
			
		i.confirm();
		}catch(ArithmeticException a)
		{
			System.out.println("@book");
			//throw a;
		}
		System.out.println("book ended");
		}
	}

