package com.tyss.cg.methods;

public class MethodOverridingClass extends Method {
	@Override
	public String printMessage() {
		
		return "non-static MethodOverridingClass.printMessage()";
		
	}
	//static methods cant be overriden,so new method is created
	public static String dispMessage() {
		return "Static MethodOverringClass.dispMessage()";
	}
	
	@Override
	int addingTwoInteger(int i, int j) {
		return super.addingTwoInteger(i, j);
	}
	
	@Override
	protected String welcomeMessage() {
		return super.welcomeMessage();
	}
	
	
	public static void main(String[] args)
	{
		MethodOverridingClass methodOverridingClass=new MethodOverridingClass();
		
		System.out.println(methodOverridingClass.printMessage());
		System.out.println(methodOverridingClass.welcomeMessage());
		System.out.println(methodOverridingClass.addingTwoInteger(4, 5));
		System.out.println(Method.dispMessage());
		System.out.println(dispMessage());
	}
	
	
}
