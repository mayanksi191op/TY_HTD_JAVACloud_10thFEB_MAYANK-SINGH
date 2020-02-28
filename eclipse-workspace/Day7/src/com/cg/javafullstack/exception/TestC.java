package com.cg.javafullstack.exception;

public class TestC {
	public static void main(String[] args) {
		System.out.println("Main started");
		
		Cow w=null;
		try {
		w.eat();
		}
		catch(NullPointerException a)
		{
			System.out.println("Dont deal with null");
		}
		
		
		
		System.out.println("Main ended");
	}

}
