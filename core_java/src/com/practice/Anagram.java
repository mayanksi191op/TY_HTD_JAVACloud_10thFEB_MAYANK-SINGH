package com.practice;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner; //manu numa


public class Anagram {
	public static void anagram(String s1, String s2) {
		int count = 0;
		int len = s1.length();
		if (s1.length() != s2.length()) {
			System.out.println("false");
		} else {					
			s1=s1.toLowerCase();
			s2=s2.toLowerCase();
			char[] arr1 = s1.toCharArray();
			char[] arr2 = s2.toCharArray();
			Arrays.sort(arr1);
			Arrays.sort(arr2);
			System.out.println(arr1);
			System.out.println(arr2);
			
			 String s3=String.valueOf(arr1); 
			 String s4=String.valueOf(arr2);
			 System.out.println(s3);
			 System.out.println(s4);
			 
			
			if(s3.equals(s4)) {
				System.out.println("true");
			} else System.out.println("false");

		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the strings");
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();

		anagram(s1, s2);
	}

}
