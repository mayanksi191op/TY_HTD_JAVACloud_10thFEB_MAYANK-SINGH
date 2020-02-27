package com.tyss.cg.inheritence;

import com.tyss.cg.methods.BasicArithematicOperation;

public class SomeArithematicOperations	extends BasicArithematicOperation {
	
	public SomeArithematicOperations() {
		//super();
		System.out.println("SomeArithematicOperations constructor");
	}
	public static void main(String[] args) {
		
		SomeArithematicOperations sOperations=new SomeArithematicOperations();
		
		
		System.out.println("add method of super class: "+ add(5,6));
		System.out.println("sub method of super class: "+ sub(6,2));
		System.out.println("div method of super class: "+ div(6,5));
		System.out.println("mul method of super class: "+ mul(4, 3));
	}

}
