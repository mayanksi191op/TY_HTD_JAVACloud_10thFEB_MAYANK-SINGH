package com.tyss.cg.operators;

public class CharIncrDecr {
	public static void main(String[] args) {
		
		char ch='c';
		System.out.println("value with post decr: "+ ch--);
		System.out.println("value is: "+ch);
		System.out.println("value with pre derc: "+ --ch);
		System.out.println("value is: "+ch);
		
		System.out.println("value with post incr: "+ ch++);
		System.out.println("value is: "+ch);
		System.out.println("value with pre incr: "+ ++ch);
		System.out.println("value is: "+ch);
	}
}
