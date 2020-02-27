package com.tyss.cg.methods;

public class VaragsInputEx { // variable argument
	public int add(int... input) { // type ... for varag
		int sum = 0;
		for (int i = 0; i < input.length; i++) {
			sum += input[i];
			// sum = sum + input[i];

		}
		return sum;
	}

	public static void main(String[] args) {
		System.out.println("Sum: " + new VaragsInputEx().add(1, 2, 345, 34, 24, 3, 65, 7)); // this is called Vararg or
																							// variable arguments
	}

}
