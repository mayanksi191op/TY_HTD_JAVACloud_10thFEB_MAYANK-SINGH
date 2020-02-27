package com.tyss.cg.exceptions;

import java.util.Scanner;

public class TryWithResources {
	public static void main(String[] args) {
		try(Scanner sc=new Scanner(System.in)) {		//known as try with resource.
														//this class is implementing autoclosable.
			int i=10;
			int j=sc.nextInt();
			if(j==0) {
				System.err.println("should'nt divide number by 0");
			} else
				System.out.println(i/j);
		} /*										 //we can have only try only when it is try with resource.
			 * catch (Exception e) { System.err.println(e.getMessage());
			 * System.err.println("should'nt divide the number by 0"); }
			 */
	}

}
