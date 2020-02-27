package com.tyss.cg.methods;

public class MethodEx2 {
	public void disp() {									//called method
		System.out.println("start of disp()");
		System.out.println("hello world");						//non static objects are stored in heap area while static are stored in static pool
		System.out.println("end of disp() method");				//non static are only called by using class objects while static can be called by using class as well as objects
		System.out.println("returning to calling method");
	}															
	
	public static void main(String[] args) {
		MethodEx2 me=new MethodEx2();						//object creation of class MethodEx2
		System.out.println("called disp() method via obj");
		me.disp();											//calling method
		System.out.println("end of main method");

	}

}
															//to go back to calling method we use return statement.