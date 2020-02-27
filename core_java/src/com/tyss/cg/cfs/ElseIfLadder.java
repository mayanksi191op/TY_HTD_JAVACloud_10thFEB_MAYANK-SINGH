package com.tyss.cg.cfs;

public class ElseIfLadder {
	public static void main(String[] args) {
		int number = 21;

		if (number < 13) {
			System.out.println("not a teen number (number below 13)");
		} else if (number >= 13 && number <= 19) {
			System.out.println("teen number");
		} else
			System.out.println("not a teen number (number above 19)");
	}

}
