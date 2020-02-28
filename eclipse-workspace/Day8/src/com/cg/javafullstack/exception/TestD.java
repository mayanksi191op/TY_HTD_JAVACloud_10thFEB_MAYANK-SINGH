package com.cg.javafullstack.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestD {

	public static void main(String[] args) {
		{
			try(Scanner sc=new Scanner(System.in))
			{
				System.out.println("Enter the name");
				String name=sc.nextLine();
				System.out.println("Name is "+name);
			} catch(InputMismatchException im)        //Optional while inputing.
			{
				im.printStackTrace();
			}finally {									//to continue if exception came.
				System.out.println("We ended");
			}
		}
	}
}
