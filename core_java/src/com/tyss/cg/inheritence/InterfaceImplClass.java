package com.tyss.cg.inheritence;

import com.tyss.cg.cfs.AnotherSwitchCase;

public class InterfaceImplClass implements MethodsInterface, MethodsInterface2 {
	
	@Override
	public void dispMessage() {
		System.out.println("Overriden dispMessage() of MethodInterface");
	}
	
	@Override
	public void printMessage() {
		System.out.println("Overriden printMessage() of MethodInterface");
	}
	
	@Override
	public void messageDisp() {
		System.out.println("Overriden messageDisp() of MethodsInterface2");
	}

	public static void main(String[] args) {
		MethodsInterface methodsInterface=new InterfaceImplClass();
		MethodsInterface2 methodsInterface2=new InterfaceImplClass();
		methodsInterface.printMessage();
		methodsInterface.dispMessage();
		methodsInterface2.messageDisp();
		
		
		InterfaceImplClass implClass=new InterfaceImplClass();
		implClass.dispMessage();
		implClass.printMessage();
		implClass.messageDisp();
		
			
			
	}
}
