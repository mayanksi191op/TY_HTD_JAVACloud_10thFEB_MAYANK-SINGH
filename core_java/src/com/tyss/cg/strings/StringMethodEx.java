package com.tyss.cg.strings;

public class StringMethodEx {
	public static void main(String[] args) {

		String string1 = "Some string";
		String string2 = "";
		String string3 = "sOmE sTrInG";

		System.out.println("length of string1: " + string1.length());
		System.out.println("length of string2: " + string2.length());

		System.out.println("isEmpty() of String for string1: " + string1.isEmpty());
		System.out.println("isEmpty() of String for string2: " + string2.isEmpty());

		System.out.println(string1.charAt(string1.length() - 1));
		// System.out.println(string2.charAt(7));

		System.out.println("equals() of String: " + string1.equals(string3));
		System.out.println("equalsIgnoreCase() of String: " + string1.equalsIgnoreCase(string3));

		string1.concat(" concatenated string"); // this is immutability, value wont change till we assign the value
												// ourself
		String string4 = string1.concat(" concatenated string");

		System.out.println(string1);
		System.out.println(string4);

		String string5 = string1.replace('S', 's');
		System.out.println("replace() output: " + string5);

		String string6 = String.valueOf(12345); // converts data into string
		System.out.println(string6);

		System.out.println(string1.toUpperCase()); // converts to upper case
		System.out.println(string1.toLowerCase()); // converts to lower case

		System.out.println("substring(int st_indx) of String: " + string1.substring(5));
		System.out.println("substring(int st_indx, int end_indx)" + string1.substring(5, 9));
		
		System.out.println("startWith(String prefix) of String: " + string1.startsWith("A"));
		System.out.println("endsWith(String suffix) of String: "+ string1.endsWith("l"));
		//string1.contentEquals()
		System.out.println(string1);    //prints some string as string is immutable
	}
}
