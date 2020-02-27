package com.practice;

import java.util.Scanner;

public class prac2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str1= sc.nextLine();
		String str2= sc.nextLine();
		
		int sum;
		sum= (str1.length() + str2.length());
		
		System.out.println(((str1.compareTo(str2)>0)) ? "Yes":"No");
		
		String str3=str1.substring(0,1);
		String str4=str2.substring(0,1);
		System.out.println(str3.toUpperCase()+ str1.substring(1) + " " + str4.toUpperCase()+ str2.substring(1));
		
		
			
	}

}
