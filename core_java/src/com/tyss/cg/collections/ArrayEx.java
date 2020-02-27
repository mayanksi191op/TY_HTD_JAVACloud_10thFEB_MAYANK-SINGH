package com.tyss.cg.collections;

public class ArrayEx { // Array:-homogeneous collection of similar data.
	public static void main(String[] args) {

		int[] intArray1 = new int[6]; 
		int[] intArray2 = { 10, 20, 30, 40, 50, 60 };

		intArray1[0] = 1;
		intArray1[1] = 2;
		intArray1[2] = 3;
		intArray1[3] = 4;
		intArray1[4] = 5;
		intArray1[5] = 6; // by default it'll take 0.
		// intArray1[5]=Integer.parseInt("123123123");
		// intArray1[5]=Integer.parseInt("qwerty"); //throws number format exception.

		for (int i = 0; i < intArray1.length; i++) {
			System.out.println("Ele at intArray1 index: " + i + " = " + intArray1[i]);
		}
		
		//for (int i : intArray2) {			//assumes size to be 10 at first then increases by 10 again so arrayindexoutofbounds exp will come.
		//	System.out.println("Ele at intArray2 index: "+ i+ " = "+ intArray2[i]);
		
		for (int i = 0; i < intArray2.length; i++) {
			System.out.println("Ele at intArray2 index: "+ i+ " = "+ intArray2[i]);
		}
	
		}
	}


