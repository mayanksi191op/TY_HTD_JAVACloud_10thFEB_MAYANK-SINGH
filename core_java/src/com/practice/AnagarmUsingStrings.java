package com.practice;

import java.util.Scanner;

public class AnagarmUsingStrings {
	public boolean AnagramString() {
		Scanner sc=new Scanner(System.in);
		String a=sc.nextLine();
		String b=sc.nextLine();
		int count=0;
		
		if(a.length()==b.length())
			return false;
		
		for(int i=0; i<a.length()-1; i++) {
			i--;
			for(int j=0; j<b.length(); j++) {
				if((a.charAt(i)+"").equalsIgnoreCase(b.charAt(j)+"")) {
					count++;
				}
				a=a.replaceFirst(a.charAt(i)+"", "");
				b=b.replaceFirst(b.charAt(j)+"", "");
			}
			
		}
		if(count==b.length()) {
			return true;
		} else return false;
	}
}
