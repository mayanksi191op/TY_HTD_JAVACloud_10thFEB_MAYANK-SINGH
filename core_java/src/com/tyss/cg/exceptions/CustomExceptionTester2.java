package com.tyss.cg.exceptions;

import java.util.Scanner;

public class CustomExceptionTester2 {
	public static void main(String[] args)  {
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the number: ");
		int num = scanner.nextInt();

		scanner.close();
		try {
			System.out.println(10 / num);
		} catch (Exception e) {
			throw new InvalidNumCustomException("Any Message");
		}
	}
}
