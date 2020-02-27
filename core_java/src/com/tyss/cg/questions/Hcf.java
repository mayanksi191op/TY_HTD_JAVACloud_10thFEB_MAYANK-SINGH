package com.tyss.cg.questions;

public class Hcf {
	public static void main(String[] args) {
		
	int k=10;
	int j=5;
	int hcf=0;
	
	for(int i=0; i<=k || i<=j; i++)
	{
		if((i%j==0) && (i%k==0))
				{
					hcf=i;
				}
	}
	System.out.println("hcf of "+ j +" and "+ k +" is: "+ hcf);
	

}
}