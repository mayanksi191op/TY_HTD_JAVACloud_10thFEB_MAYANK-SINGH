package com.tyss.cg.exceptions;

public class ExceptionEx {
	public static void main(String[] args) {
		String string ="";					//two types of exceptions are there
											//checked(compile time) and unchecked(runtime)
											//error:- problem which cant be handled in code
											//exception:- which we can handle.
		try {
			//System.out.println(string.charAt(3));  //runtime exception
			int i=10/0;
			System.out.println(i);
		} catch (StringIndexOutOfBoundsException e) {		//exception is also a class in java.lang
			//e.printStackTrace();				//method 1 to show exception
			System.err.println("This method should not be called on null string");	//method 2 to show
			System.out.println(e.getClass()); 			//to get the exception class.
			System.out.println(e.getCause());  			//throws the cause
			
			System.err.println(e.getMessage());		//method 3 to show exception
		} catch (ArithmeticException e)	{	//we can have multiple catch blocks
			System.out.println("should not divide by zero");
			System.out.println(e.getClass());
			System.out.println(e.getCause());
			System.out.println(e.getMessage());
		} /*catch (Exception e) {				//common catch block statement for all exceptions.
			System.err.println("Exception caught in the code");
			System.out.println(e.getClass());
			System.out.println(e.getMessage());
			e.printStackTrace();
			
		}*/
		
		System.out.println("Mayank");
		
	}

}
