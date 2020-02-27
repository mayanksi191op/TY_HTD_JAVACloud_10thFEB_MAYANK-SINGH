package com.practice;

import java.util.Scanner;

public class prac3reverse {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		
		StringBuffer strb=new StringBuffer(str);
		strb.reverse();
		System.out.println("strb is: "+strb);
		System.out.println("str is: "+ str);
		
		if(str.contentEquals(strb))
		{
			System.out.println("yes");
		} else System.out.println("no");
		
		
	}
}
