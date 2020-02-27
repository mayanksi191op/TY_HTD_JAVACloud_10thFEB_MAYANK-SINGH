package com.tyss.cg.methods;

public class AreaCalculator {
	public int calcSqArea(int side) {
		return side * side;
	}

	public int calcRectArea(int len, int wid) {
		return len * wid;
	}
	
	public double calcCircArea(int rad) {
		return 3.14*rad*rad;
	}

}
