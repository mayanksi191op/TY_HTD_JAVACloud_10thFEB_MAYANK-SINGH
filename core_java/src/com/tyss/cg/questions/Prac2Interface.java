package com.tyss.cg.questions;

public interface Prac2Interface {
	
	int A(int a, int b);
	double B( double d, int b);
	
	static void print() {
		System.out.println("hello Print()");
	}
	
	default void show() {
		System.out.println("hello Show()");
	}

}
