package com.tyss.cg.collections;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class ArraysClassEx {
	public static void main(String[] args) {
		/*
		 * String s1="Mayank"; List<String> ch=Arrays.asList(s1); for (int i = 0; i <
		 * .length; i++) {
		 * 
		 * }
		 */
		
		int[] intArray = { 32, 45, 87, 65, 44, 99, 0, 56 };

		for (int i = 0; i < intArray.length; i++) {
			for (int j = 0; j < intArray.length; j++) {
				if (intArray[i] < intArray[j]) {
					int temp = 0;
					temp = intArray[i];
					intArray[i] = intArray[j];
					intArray[j] = temp;
				}
			}
		}
		for (int i = 0; i < intArray.length; i++) {
			System.out.println(intArray[i]);
		}

		System.out.println("+++++using sort++++++");
		Arrays.sort(intArray);
		for (int i = 0; i < intArray.length; i++) {
			System.out.println(intArray[i]);
		}

		System.out.println("++++++copyOf() of Arrays+++++");
		int[] intArray2 = Arrays.copyOf(intArray, 10);
		for (int i = 0; i < intArray2.length; i++) {
			System.out.println(intArray2[i]);
		}

		/*
		 * System.out.println("++++++Arrays.fill++++++"); Arrays.fill(intArray2, 190);
		 * for (int i = 0; i < intArray2.length; i++) {
		 * System.out.println(intArray2[i]); }
		 */

		System.out.println("++++++Arrays.fill++++++");
		Arrays.fill(intArray2, 8, 10, 190);			//8 is starting index and 10 is the ending index
		Arrays.fill(intArray2, 9, 10, 200);
		for (int i = 0; i < intArray2.length; i++) {
			System.out.println(intArray2[i]);
		}
		
		System.out.println(intArray.equals(intArray2));  				//chk the values.
		System.out.println(Arrays.equals(intArray, intArray2));			//chk the len as well as values.

	}
}
