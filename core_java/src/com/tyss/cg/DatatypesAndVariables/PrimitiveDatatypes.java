package com.tyss.cg.DatatypesAndVariables;

public class PrimitiveDatatypes {
	public static void main(String[] args) {

		byte b=15 ;						//declaration & initialization
		short s=151;
		int i=1515;
		long l=11231252341L;			//if outside the range of integer we need to specify type while initialization.
		float f=12.56F; 				//by default all decimals are taken as double so we need to specify of we want float
		double d=12.987;
		char c='a';						//single quotes '_' to initialise a single char.
		boolean isTrue= true;
		
		System.out.println(b);			//utilization
		System.out.println(s);
		System.out.println(i);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
		System.out.println(c);
		System.out.println(isTrue);
	}
}


