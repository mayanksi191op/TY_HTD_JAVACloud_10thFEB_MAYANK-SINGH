package com.practice;

import java.util.Scanner;

public class prac1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		double d = sc.nextDouble();
		sc.nextLine(); // nextInt or any will consume the next newLine when we enter so put nextLine
						// after it.
		String str = sc.nextLine();

		System.out.println("String: " + str);
		System.out.println("Double: " + d);
		System.out.println("Int: " + i);

		// sc.close();

	}
}