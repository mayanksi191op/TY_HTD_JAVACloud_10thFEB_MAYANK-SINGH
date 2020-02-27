package com.tyss.cg.abstraction;

public class TesterClass extends AbstractClassEx {
	
	@Override
	String display() {
		return "displayMessage() of MethodsInterface";
	}
	@Override
	public String displayMessage() {
		return "display() of AbstractClassEx";
	}
	@Override
	String print() {
		return "print() of AbstractClassEx";
	}
	
	public static void main(String[] args) {
		TesterClass testerClass =new TesterClass();
		
		testerClass.displayMessage();
		System.out.println(testerClass.print());
		System.out.println(testerClass.display());
		testerClass.printMessage();
	}
}

