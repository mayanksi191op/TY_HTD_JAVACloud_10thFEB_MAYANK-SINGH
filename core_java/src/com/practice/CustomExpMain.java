package com.practice;

import java.util.Scanner;

public class CustomExpMain {
	public static void main(String[] args) {
		CustomExpImpl customExpImpl = new CustomExpImpl();
		Scanner scanner =new Scanner(System.in);
		boolean count = false; 
		while(count != true) {
		System.out.println("1> try catch");
		System.out.println("2> print trial");
		System.out.println("3> exit");
		int k = scanner.nextInt();
		switch (k) {
		case 1:
			try {
			customExpImpl.impl(24);
			} catch (CustomExp e) {
				e.printStackTrace();
			}
			System.out.println("all is done 2");
			break;
		case 2:
			System.out.println("trial 2");
			break;
		
		case 3:
			count = true;
			break;

		default:
			break;
		}
		}
		scanner.close();
	}
}
