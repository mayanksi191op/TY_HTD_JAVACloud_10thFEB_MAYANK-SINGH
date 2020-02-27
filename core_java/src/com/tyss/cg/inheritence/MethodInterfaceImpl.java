package com.tyss.cg.inheritence;

public class MethodInterfaceImpl implements MethodsInterface {
	
	@Override
	public void dispMessage() {
		System.out.println("Overriden dispMessage() of MethodsInterface...");
	}
	
	@Override
	public void printMessage() {
		System.out.println("Overriden printMessage() of MethodsInterface...");
	}
	
	public static void main(String[] args) {
		MethodInterfaceImpl methodInterfaceImpl=
				new MethodInterfaceImpl();
		
		methodInterfaceImpl.dispMessage();
		methodInterfaceImpl.printMessage();
		methodInterfaceImpl.defaultMethodMessage();
		
		MethodsInterface.showMessage();			//static
	}

}
