package com.tyss.cg.cfs;

public class If_ElseExample {
	public static void main(String[] args) {
		int time = 2359;

		if (time >= 2300) {
			System.out.println("Include late night delivery charges");
		} else {
			System.out.println("Exclude late night delivery chargesF");
		}
		
		System.out.println("pizza delivered");
	}
}
