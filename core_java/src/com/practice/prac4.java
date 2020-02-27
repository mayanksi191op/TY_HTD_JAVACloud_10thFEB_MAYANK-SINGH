package com.practice;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//not correct...

public class prac4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int count=0;
		int i=sc.nextInt();
		String str5=sc.nextLine();
		
		System.out.println(str5);
		System.out.println(i);
		
		/*String str1=sc.nextLine();
		String str2=sc.nextLine();
		
		char[] l=str1.toCharArray();
		char[] m=str2.toCharArray();
		for(int i=0; i<str1.length(); i++)
		{
			for(int j=0; j<str2.length(); j++)
			{
				if(l[i]==m[j])
				{
					
					count+=1;
					break;
				} 
			}
		}
		if(count==str1.length())
		{
			System.out.println("Anagrams");
		} else System.out.println("Not Anagrams"); */
	}

}
