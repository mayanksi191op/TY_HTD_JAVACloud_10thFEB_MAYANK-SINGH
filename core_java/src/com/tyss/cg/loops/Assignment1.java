package com.tyss.cg.loops;

import java.util.Scanner;

public class Assignment1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("enter the number: ");
		int n = scanner.nextInt();
		if (n % 2 == 0) {
			for (int i = 0; i < n; i++) {
				System.out.println("num is Even");
			}
		} else
			System.out.println("num is odd");
		scanner.close();
	}
	
}
