package com.tyss.cg.methods;

public class BasicArithematicOperation {
	public BasicArithematicOperation() {
		System.out.println("BasicArithematicConstructor const");
	}

	/**
	 * This method returns the sum of two given integers.
	 * 
	 * @param i
	 * @param j
	 * @return int i + int j
	 */

	public static int add(int i, int j) {
		// int sum=i+j;
		// return sum;
		return i + j;
	}
	
	/**
	 * This method returns the division of two given numbers
	 * 
	 * @param i
	 * @param j
	 * @return double i, double j
	 */
	public static double div(double i, double j) {
		return i / j;
	}
	
	/**
	 * This method returns the difference of two given numbers
	 * 
	 * @param i
	 * @param j
	 * @return
	 */
	public static int sub(int i, int j) {
		return i - j;
	}
	
	/**
	 * This method is used to return the division with double value at return.
	 * 
	 * @param i
	 * @param j
	 * @return
	 */
	public static double div(int i, int j) {
		return (i / j) * 1.0;
	}
	
	/**
	 * This method is used to return the multiplication of two given numbers.
	 * 
	 * @param i
	 * @param j
	 * @return
	 */
	public static int mul(int i, int j) {
		return (i * j);
	}

	public static void main(String[] args) {

		int sum = add(12, 13);
		System.out.println("sum: " + sum);
		System.out.println("sum: " + add(45, 45));
		System.out.println("sub: " + sub(44, 32));
		System.out.println("div: " + div(15, 2));
		System.out.println("mul: " + mul(2, 5));
	}
}
