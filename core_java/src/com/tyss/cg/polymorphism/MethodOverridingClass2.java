package com.tyss.cg.polymorphism;

public class MethodOverridingClass2 implements MethodsInterface {
	
	@Override
	public String displayMessage() {
		return "overriden displayMessage() of MethodsInterface from MethodOverridingClass2";
	}
	
	@Override
	public String printMessage() {
		return "overring printMessage() of MethodInterface from MethodOverridingClass2";
	}
}
