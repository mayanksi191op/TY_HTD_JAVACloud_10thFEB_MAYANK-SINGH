package com.tyss.cg.methods;

public class MethodCallingClass {
	public static void main(String[] args) {
		AreaCalculator areaCal=new AreaCalculator();
		System.out.println("Area of square: " + areaCal.calcSqArea(4));
		System.out.println("Area of rectangle: "+ areaCal.calcRectArea(3, 5));
		System.out.println("Area of Circle: "+ areaCal.calcCircArea(5));
	}

}


