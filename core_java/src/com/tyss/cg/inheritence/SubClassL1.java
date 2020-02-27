package com.tyss.cg.inheritence;

public class SubClassL1 extends SuperClass {
	
	
	public String print() {
		return "Some Other String";
	}
	
	public void disp() {
		System.out.println("disp() of SubClassL1");
	}
	
	public static void main(String[] args) {
		SuperClass supC=new SuperClass();
		SubClassL1 subCL1=new SubClassL1();			//override will happen when subclass obj is created.
													
		SuperClass suC=new SubClassL1();		//upcasting		//override will happen. can only access super class objects
		SubClassL1 subCl12=(SubClassL1) suC;		//for downcasting we need to do upcasting first
		
		
		System.out.println(supC.print());
		System.out.println(subCL1.print());
		System.out.println(suC.print());
		subCL1.disp();
		
	}
}
