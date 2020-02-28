package com.cg.javafullstack.exception;

public class TestB {

	public static void main(String[] args) {
		System.out.println("Main started");
		int a[]=new int[4];
		try {
			a[10]=90;
		}catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Dont cross index");
		}





		System.out.println("Main started");
	}
}
