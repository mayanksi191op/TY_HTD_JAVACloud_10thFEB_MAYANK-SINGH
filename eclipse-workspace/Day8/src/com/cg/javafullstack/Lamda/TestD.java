package com.cg.javafullstack.Lamda;

public class TestD {
	public static void main(String[] args) {

		MyInterest mi=(p,t,r) -> (p*t*r)/100;
		double d=mi.si(100,2,15);
		System.out.println("SI is "+d);
		


	}
}
