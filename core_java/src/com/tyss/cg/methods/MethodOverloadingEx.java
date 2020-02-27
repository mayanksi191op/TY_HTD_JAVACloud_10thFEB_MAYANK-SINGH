package com.tyss.cg.methods;

public class MethodOverloadingEx {
	
	//both static and non static methods can be overloaded.
	//overloading can be done between static and non static methods too.

	public static void disp() {										
		System.out.println("public static void disp()...");
	}
	
	public static void disp(String str) {
		System.out.println("public static void disp(String str)...");
	}
	
	public void disp(String string, int i) {
		System.out.println("public void disp(String str,int i)...");
	}
	
	public void disp(int i, String str) {
		System.out.println("public void disp(int i, String str)...");
	}
	
	public static void main(String[] args) {
		MethodOverloadingEx mole=new MethodOverloadingEx();
		
		MethodOverloadingEx.disp();
		disp("AnyString");
		mole.disp("mayank", 24);
		mole.disp(23, "Mayank");
	}
}
