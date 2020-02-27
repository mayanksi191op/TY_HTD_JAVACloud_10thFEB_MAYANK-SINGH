package com.tyss.cg.abstraction;

import com.tyss.cg.polymorphism.MethodsInterface;

public abstract class AbstractClassEx implements MethodsInterface {
	
	abstract String print();
	abstract String display();
	
	@Override
	public String printMessage() {
		return "printMessage() of MethodsInterface";
	}
}
