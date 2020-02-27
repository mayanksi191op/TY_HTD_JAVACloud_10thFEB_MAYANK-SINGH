package com.tyss.cg.operators;

public class UnaryOperators {
	public static void main(String[] args) {
		int i = 10;
		boolean isTrue = true;
		int j = 10;
		System.out.println(j);

		System.out.println(!isTrue);
		System.out.println("value of i with pre increment: " + ++i); // pre increment
		System.out.println("val of i: " + i); // first increment then utilized
		System.out.println("vlaue of i with post increment: " + i++); // post increment
		System.out.println("calue of i: " + i);

		System.out.println("value of j with pre decrement: " + --j); // pre decrement
		System.out.println("value of j: " + j);
		System.out.println("value of j with post decrement: " + j--); // post decrement
		System.out.println("value of j: " + j);
	}
}
