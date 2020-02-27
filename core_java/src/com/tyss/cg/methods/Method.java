package com.tyss.cg.methods;

public class Method {
	public static String dispMessage() {
		return "Static dispMessage()";
	}
	
	public String printMessage() {
		return "non-staticprintMessage()";
	}
	
	int addingTwoInteger(int i, int j)
	{
		return i+j;
	}
	
	protected String welcomeMessage() {
		return "Hello World";
	}

	private String messageDisplay() {
		return "private messageDisplay()";
	}

}
