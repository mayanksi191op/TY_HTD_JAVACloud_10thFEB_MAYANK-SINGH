package com.tyss.cg.inheritence;

public class SubClassL2 extends SubClassL1 {
	@Override
	public void disp() {
		// TODO Auto-generated method stub
		super.disp();
		super.i=12;
		System.out.println("overridden disp() in subClass2");
	}

	@Override
	public String print() {
		// TODO Auto-generated method stub
		System.out.println("overriden print() of SuparClass in SubClass2");
		return super.print();
	}

	public static void main(String[] args) {
		SubClassL2 classL2 = new SubClassL2();
		classL2.disp();
		System.out.println(classL2.print());
		
		System.out.println("int i od SuperClass: "+ classL2.i);
	}
}
