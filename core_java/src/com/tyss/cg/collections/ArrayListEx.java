package com.tyss.cg.collections;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListEx { // size of arraylist is dynamic in nature.
	public static void main(String[] args) {
		ArrayList<Integer> arraylist = new ArrayList<Integer>(10);
		arraylist.add(12);
		arraylist.add(22);
		arraylist.add(32);
		arraylist.add(42);
		arraylist.add(52);
		arraylist.add(62);
		arraylist.add(72);
		arraylist.add(82);
		arraylist.add(92);
		// arraylist.add(null);

		// arraylist can store null value too
		// arraylist.add(4,34);
		System.out.println("Size of arraylist: " + arraylist.size());

		Collections.sort(arraylist); // for null it'll show error if its there

		System.out.println("++++++++using for each+++++++++");
		for (Integer integer : arraylist) {
			System.out.println(integer);
		}
		
		System.out.println("+++++using SOP arraylist+++++");
		System.out.println(arraylist);

		System.out.println("+++++++using for loop and get()+++++++");
		for (int i = 0; i < arraylist.size(); i++) {
			System.out.print(arraylist.get(i) + "  ");
		}

		System.out.println("");

		arraylist.remove(4); // takes index value and removes.
		System.out.println("Size of arraylist after remove: " + arraylist.size());

		Collections.rotate(arraylist, -(arraylist.size() - 1));	//for len-1 rotaions, if len then same array comes. (Anticlock rotation from start)
		
		System.out.println(arraylist);
		System.out.println("");

		boolean isThere1 = arraylist.contains(22); // contains():-to chk if the value is there inside the arraylist or
													// not.
		boolean isThere2 = arraylist.contains(null);
		System.out.println("Output of arrayList.contains(22): " + isThere1);
		System.out.println("Output of arrayList.contains(null): " + isThere2);
		// if we are entering any char or string value it'll always give false
		// irrespective of its asci value.

//		System.out.println(arraylist.get(0));
//		System.out.println(arraylist.get(1));
//		System.out.println(arraylist.get(3));		//throws exception since size is 2.
	}
}
