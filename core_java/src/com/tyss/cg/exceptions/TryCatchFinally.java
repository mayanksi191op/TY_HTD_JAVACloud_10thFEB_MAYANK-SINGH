package com.tyss.cg.exceptions;

public class TryCatchFinally {
	public static void main(String[] args) {
		
		try {
			int u=10/0;
			System.exit(0);  			//compiler wont reach this part bcs of exception.
		} catch (Exception e) {
			System.err.println("Exception caught in the code...");
			//return;  			//since there is no calling method here the compiler will send control to finally.
			//System.exit(0);   //this statement shuts down the jvm so nothing will execute after this.
		} finally {			//this will work even if we dont handle the exception.
			
			System.out.println("code to be exectued be there any exception or not...");
		}
		System.out.println("hello");
	}
}
