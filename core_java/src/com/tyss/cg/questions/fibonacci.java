package com.tyss.cg.questions;

public class fibonacci {
	public static void main(String[] args) {
		int n=7;
		int k=0;
		int l=1;
		int res=0;
		System.out.println(l);
		
		for(int i=1; i<=n-1; i++)
		{
			
			res=k+l;
			k=l;
			l=res;
			
			
			System.out.println(res);
			
		}
		
		
			
	}	
}
//1 1 2 3 5 8