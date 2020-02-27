package com.tyss.cg.questions;

public class que1 {
	public static void main(String[] args) {
		int n=50;
		int sum=0;
		for(int i=1; i<=n; i++)
		{
			if(i%2==0)
			{
				sum=sum+i;
			}
		}
		System.out.println("sum of even nos upto 50 is: "+sum);
	}

}
