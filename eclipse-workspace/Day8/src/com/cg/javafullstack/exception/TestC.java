package com.cg.javafullstack.exception;

public class TestC {

	public static void main(String[] args) {
		
		System.out.println("main started");
		
		AgeValidator a=new AgeValidator();
		
		try {
			a.validate(9);
			System.out.println("Welcome to pub");
		}catch (InvalidAgeException e)
		{
			e.printStackTrace();
		}
	}
}
