package com.practice;


public class CustomExpImpl {
	public void impl(int age) {
			if(age > 20) {
				throw new CustomExp("age is too much");
			} else {
				System.out.println("good");
			}
			System.out.println("all is good");
	}
}
