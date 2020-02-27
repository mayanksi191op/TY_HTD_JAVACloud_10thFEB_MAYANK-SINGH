package com.tyss.cg.strings;

public class StringBufferEx {
	public static void main(String[] args) {
		String string="Some String";
		StringBuffer stringBuffer=new StringBuffer(string);		// String Buffer not immutable
		System.out.println(stringBuffer.getClass());
		
		System.out.println(stringBuffer.length());
		
		stringBuffer.append("Buffer");
		System.out.println(stringBuffer);
		
		System.out.println(stringBuffer.reverse());
		System.out.println(stringBuffer.reverse());
		
		stringBuffer.replace(0, 1,"s");					//will change acc gto range
		System.out.println(stringBuffer);
		
		stringBuffer.insert(5, "ABC");
		System.out.println(stringBuffer); 				//used to insert char or string...not there in string.
	
		int index=stringBuffer.indexOf("xyz");			//checks if the substring is present and then returns the index value. returns int.
		System.out.println(index);
		
	}

}
