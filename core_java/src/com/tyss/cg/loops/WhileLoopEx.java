package com.tyss.cg.loops;

public class WhileLoopEx {

	public static void main(String[] args) {

		int i = 1;
		while (i <= 10) {
			System.out.println(i * 2);
			i++;
		}
		
		
		//Infinite loop
		while(true)
		{
			System.out.println("hello");
		}
		
		//System.out.println(); 
		//wont execute as outside the infinite while loop.
	}

}
