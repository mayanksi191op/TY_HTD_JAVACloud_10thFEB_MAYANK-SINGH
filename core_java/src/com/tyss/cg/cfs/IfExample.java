package com.tyss.cg.cfs;

public class IfExample {
	public static void main(String[] args) {

		int age = 18;

		if (age >= 18) {
			System.out.println("allowed to vote");
			System.out.println("another line inside if block"); // if we have only single line of code which needs to be
																// executed the braces are optional
		}
		System.out.println("code outside the if block");

	}

}
