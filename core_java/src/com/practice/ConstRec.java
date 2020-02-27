package com.practice;

import com.tyss.cg.exceptions.CustomExceptionTester1;

public class ConstRec {
	static int j=0;
	ConstRec()
	{
		if(j==3)
		{
			System.exit(0);
		}
		j++;
		System.out.println(j);
		new ConstRec();
	}
	public static void main(String[] args) {
		ConstRec cr=new ConstRec();
	}
}



