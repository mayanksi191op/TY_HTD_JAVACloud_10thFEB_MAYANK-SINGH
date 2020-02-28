package com.cg.javafullstack.array;

public class TestA {

	public static void main(String[] args) {
		int[] a=new int[5];
		
		a[0]=25;
		a[1]=4;
		a[2]=8;
		a[3]=29;
		a[4]=33;
		
		for(int x: a)
		{
			//System.out.println("a["+x+"] = "+a[x]);
			System.out.println(x);
		}
	}
}
