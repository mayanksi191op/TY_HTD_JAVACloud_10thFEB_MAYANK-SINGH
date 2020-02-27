package com.tyss.cg.inheritence;

public interface MethodsInterface {
	public void dispMessage(); // by default all the methods are public abstract.

	public void printMessage();

	public static void showMessage() {
		System.out.println("public static showMessage() ofIMethodsInterface...");
	}

	default void defaultMethodMessage() { // we cant give default as static..they are always non static.
		System.out.println("defaultMethodMessage() of MethodsInterface...");
	}
}
