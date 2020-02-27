package com.tyss.cg.classandobjects;

import com.tyss.cg.methods.BasicArithematicOperation; //to access class from other package we use import

public class DiffPackageMethodsEx extends BasicArithematicOperation {
	public static void main(String[] args) {
	DiffPackageMethodsEx dEx=new DiffPackageMethodsEx();
	
	System.out.println(dEx.toString());
	System.out.println(dEx.hashCode());
	
	System.out.println("Add method of superclass: "+ add(8,9));
	System.out.println("Sub method of superclass: "+ sub(10,2));
	System.out.println("div method of superclass: "+ div(15,4));
	System.out.println("mul method of superclass: "+ mul(2,6));
	}

}
