package com.tyss.cg.inheritence;

public class FunctionalInterfaceImpl implements FunctionalInterfaceEx, FunctionalInterfaceEx2 {
	@Override
	public void showMessage() {
		System.out.println("Overriden showMessage() of FunctionalInterfaceEx");
	}
	
	@Override
	public int add(int i, int j) {
		return i+j;
	}
	
	public static void main(String[] args) {
		FunctionalInterfaceImpl functionalInterfaceImpl=new FunctionalInterfaceImpl();
		
		//FunctionalInterfaceEx1
		functionalInterfaceImpl.dispMessage();
		functionalInterfaceImpl.showMessage();
		FunctionalInterfaceEx.printMessage();
		
		
		
		//FunctionalInterfaceEx2
		System.out.println(functionalInterfaceImpl.add(4, 6));
		functionalInterfaceImpl.dispMessage2();
		FunctionalInterfaceEx2.printMessage2();
		
		
	}
}
