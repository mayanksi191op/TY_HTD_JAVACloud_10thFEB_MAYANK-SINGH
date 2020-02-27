package com.tyss.cg.inheritence;

public class FunctionalInterfaceLambdaEx {

	static String string = "Lambda Expression Example for FunctionalInterfaceExample";
	static FunctionalInterfaceEx functionalInterfaceEx = () -> {
		System.out.println(string);
		System.out.println("Another line of implementation");
	};

	static FunctionalInterfaceEx2 functionalInterfaceEx2 = (i, j) -> i + j;

	public static void main(String[] args) {
		functionalInterfaceEx.dispMessage();
		functionalInterfaceEx.showMessage();
		FunctionalInterfaceEx.printMessage();
		
		System.out.println(functionalInterfaceEx2.add(5, 6));
		functionalInterfaceEx2.dispMessage2();
		FunctionalInterfaceEx2.printMessage2();

	}
}
