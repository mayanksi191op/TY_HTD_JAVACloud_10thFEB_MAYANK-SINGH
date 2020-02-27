package com.tyss.cg.polymorphism;

public class MethodOverridingClass1 implements MethodsInterface{
	
	@Override
	public String displayMessage() {
		return "overriden displayMessage() of MethodsInterface from MethodOverridingClass1";
	}
	
	@Override
	public String printMessage() {
		return "overring printMessage() of MethodInterface from MethodOverridingClass1";
	}
}
