package com.tyss.cg.DatatypesAndVariables;

public class VariablesEx {
	static byte sGByte;
	static short sGShort;
	static int sGInt;
	static long sGLong;
	static float sGFloat;
	static double sGDouble;
	static char sGChar;
	static boolean sGIsTrue;
	static String sGString;
	
	@SuppressWarnings("unused")				//this will suppress warnings (annotation)
	public static void main(String[] args) { // if we want to use global var in 'static' main method we need to make
												// them static as static context will search static pool mem loc.
												//for local variable initialization is mandatory while for global it is not
	//local variables	
	byte lByte;
	short lShort;
	int lInt;
	long lLong;
	float lFloat;
	double lDouble;
	char lChar;
	boolean lIsTrue;
	String lString;

		System.out.println(sGByte);
		System.out.println(sGShort);
		System.out.println(sGInt);
		System.out.println(sGLong);
		System.out.println(sGFloat);
		System.out.println(sGDouble);
		System.out.println(sGChar);
		System.out.println(sGIsTrue);
		System.out.println(sGString);

		
		/*
		 * We need to initialize the local variables or error will show
		 * 
		 * System.out.println(lByte); System.out.println(lShort);
		 * System.out.println(lInt); System.out.println(lLong);
		 * System.out.println(lFloat); System.out.println(lDouble);
		 * System.out.println(lChar); System.out.println(lIsTrue);
		 * System.out.println(lString);
		 */
	}

}
