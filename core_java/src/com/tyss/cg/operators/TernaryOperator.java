package com.tyss.cg.operators;

public class TernaryOperator {
	public static void main(String[] args) {

		int i = 10;
		int j = 20;

		int res = (i > j) ? (i + j) : (i - j);
		System.out.println(res);
				
		//System.out.println((i > j) ? (i + j) : (i - j));  
	}
}