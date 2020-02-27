package com.tyss.cg.inheritence;

public interface FunctionalInterfaceEx2 {
	public int add(int i, int j);
	
	default void dispMessage2() {
		System.out.println("default dispMessage() of FunctionalInterfaceEx2");
	}
	
	public static void printMessage2() {
		System.out.println("static printMessage() of FunctionalInterfaceEx2");
	}
	
	
	
}
