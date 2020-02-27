package com.tyss.cg.polymorphism;

public class OverloadedMethodCallingClass {
	public static void main(String[] args) {
		OverloadedMethodsClass overloadedMethodsClass=new OverloadedMethodsClass();
		
		System.out.println("add(int i, int j): " + overloadedMethodsClass.add(5, 6));
		System.out.println("add(int i, int j, int k): " + overloadedMethodsClass.add(5, 6, 9));
		System.out.println("add(int i, double j): " + overloadedMethodsClass.add(5, 6.5));
		System.out.println("add(double i, int j): " + overloadedMethodsClass.add(5.9, 6));
	}

}
