package com.tyss.cg.inheritence;

import com.tyss.cg.methods.*;

public class DifferentPackageMethodOverridingClass extends Method {

	@Override
	public String printMessage() {
		return "DifferentPackageMethodOverridingClass.printMessage()";
	}

	@Override
	protected String welcomeMessage() {
		return "Hello world from DifferentPackageMethodOverridingClass ";
	}

	public static void main(String[] args) {
		DifferentPackageMethodOverridingClass differentPackageMethodOverridingClass=new DifferentPackageMethodOverridingClass();
		
		System.out.println(differentPackageMethodOverridingClass.printMessage());
		System.out.println(differentPackageMethodOverridingClass.welcomeMessage());
	}

}
