package com.tyss.cg.classandobjects;

public class ClassEx {
	
	//Object class is the supermost class in java.
	//we can use object methods in all the classes.

	// constructors have same name as class
	// doesnt have any return type
	// can be of diff types- default(created by compiler if not defined) or user
	// defined
	// in default const ther is no functionality.

	// Zero argument constructor //we can have only one zero argument const in a
	// class
	public ClassEx() {
		System.out.println("Zero-Argument Constructor...");
	}

	// Parameterized constructor //we can have n nos of parameterized constructors
	// but with diff signatures and same name. this is called constructor
	// overloading
	// if we dont have any parameterized constructor only then compiler will create
	// the default constructor, else the error is shown
	public ClassEx(String str) {
		System.out.println("constructor with one argument...");
	}

	// parameterized constructor-2
	public ClassEx(String str, int i) {
		System.out.println("constructor with one string and one integer...");
	}

	// parameterized constructor-3
	public ClassEx(int i, String str) {
		System.out.println("constructor with one integer and one string...");
	}

	public static void main(String[] args) {
		ClassEx ce1 = new ClassEx(); // ClassEx() is also a type of constructor
		ClassEx ce2 = new ClassEx("Mayank");
		ClassEx ce3 = new ClassEx("Mayank", 1234);
		ClassEx ce4 = new ClassEx(1234, "Mayank");

	}
}
