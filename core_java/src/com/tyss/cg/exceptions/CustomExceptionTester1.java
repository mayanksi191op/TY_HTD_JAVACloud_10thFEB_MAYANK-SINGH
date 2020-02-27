package com.tyss.cg.exceptions;

import java.util.Scanner;

public class CustomExceptionTester1 {
	public static void main(String[] args) throws InvalidNumCustomException {
		Scanner sc = new Scanner(System.in);

		System.out.println("enter the number: ");
		int num = sc.nextInt();

		sc.close();

		if (num >= 0 && num <= 10) {
			System.out.println(num * 10);
		} else
			throw new InvalidNumCustomException("InvalidNumCustomException message");

		// System.out.println("Mayank"); -> her we are only throwing the exception not
		// handling it.

	}

}
