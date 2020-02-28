package com.cg.javafullstack.hasa;

public class TestE {
	public static void main(String[] args) {
		
	
	HDFC h=new HDFC();
	ICICI i=new ICICI();
	SBI s=new SBI();
	
	ATMmachine a=new ATMmachine();
	a.slot(h);
	a.slot(i);
	a.slot(s);
	
	}
}
