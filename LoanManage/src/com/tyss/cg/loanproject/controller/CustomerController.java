package com.tyss.cg.loanproject.controller;

import java.util.Scanner;

import com.tyss.cg.loanproject.services.ServicesImpl;

public class CustomerController {
	public static void main(String[] args) {

		int again = 1;
		Scanner scanner = new Scanner(System.in);
		ServicesImpl servicesImpl = new ServicesImpl();
		int choice;

		while (again == 1) {
			System.out.println("CUSTOMER1 operations:");
			System.out.println("   1> Display Customer details");
			System.out.println("   2> Add Customer details");
			System.out.println("   3> Delete Customer details");
			System.out.println("   4> Update Customer details");
			System.out.println("Enter your choice: ");
			choice = scanner.nextInt();
			scanner.nextLine();
			switch (choice) {
			case 1:
				servicesImpl.displayCustomer();
				break;
			case 2:
				servicesImpl.addCustomer();
				break;
			case 3:
				servicesImpl.deleteCustomer();
				break;
			case 4:
				servicesImpl.updateCustomer();
				break;
			default:
				System.out.println("Wrong choice");
				break;
			}

			System.out.println("try again?? {{{  yes (or) no }}}");
			String tryagn = scanner.nextLine();
			if (tryagn.toLowerCase().equals("yes")) {
				again = 1;
			} else {
				again = 0;
			}
		}

		System.out.println("application ended");
		scanner.close();
	}
}
