package com.tyss.cg.operators;

public class AssignmentOperator {
	public static void main(String[] args) {
		int i = 10;
		// i = i + 10;
		// int j = i + 10;
		System.out.println(i += 10); // compound assignment operator
		System.out.println(i *= 10);
		System.out.println(i -= 10);
		System.out.println(i /= 10);
		System.out.println(i %= 10);
	}

}
