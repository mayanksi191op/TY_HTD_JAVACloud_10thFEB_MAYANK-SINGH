package com.cg.javafullstack.array;

public class TestG {
	public static void main(String[] args) {
		
		Demo d=new Demo();
	
		
		
		int []a=new int[5];
		a[0]=24;
		a[1]=1;
		a[2]=2;
		a[3]=4;
		a[4]=6;
		
		String s[]=new String[5];
		s[1]="apple";
		s[2]="mango";
		s[3]="banana";
		s[0]="orange";
		s[4]="pineapple";
		
		d.displayArray(a);
		d.display(s);
	}

}
