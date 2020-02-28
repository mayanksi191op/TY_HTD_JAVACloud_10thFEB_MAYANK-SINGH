package com.cg.javafullstack.array;

public class TestC {

	public static void main(String[] args) {
		String[] s=new String[5];
		s[1]="apple";
		s[2]="mango";
		s[3]="banana";
		s[0]="orange";
		s[4]="pineapple";
		
		for(int i=0;i<s.length; i++)
		{
			System.out.println(s[i]);
		}
		
	}
}
