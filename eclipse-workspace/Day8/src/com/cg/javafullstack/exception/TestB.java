package com.cg.javafullstack.exception;

public class TestB {
	public static void main(String[] args) {
		
	System.out.println("main started");
	BalanceValidation bv=new BalanceValidation();
	
	
	bv.verify(111150);
	
	System.out.println("give cash");
	System.out.println("main ended");

	
}
}