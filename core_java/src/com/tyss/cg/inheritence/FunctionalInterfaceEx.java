package com.tyss.cg.inheritence;

@FunctionalInterface			//it'll show error if we have more than one abstract method inside this.
public interface FunctionalInterfaceEx {

	public void showMessage();
	
	default void dispMessage() {
		System.out.println("default dispMessage() of FunctionalInterfaceEx");
	}
	
	public static void printMessage() {
		System.out.println("static printMessage() of FunctionalInterfaceEx");
	}
	
	
}
