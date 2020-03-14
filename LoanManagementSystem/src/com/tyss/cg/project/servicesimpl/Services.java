package com.tyss.cg.project.servicesimpl;

import java.util.HashMap;
import java.util.Scanner;

public class Services {
	static Scanner scanner = new Scanner(System.in);
	static void loanUpdate() {
		//update
		System.out.println("enter the loan type number: ");
		
//		for (int i = 0; i < loanTypeList.size(); i++) {
//			System.out.println(loanTypeList.get(i));
//		}
		
		Integer choice = scanner.nextInt();
		scanner.nextLine();
		
		for (int i = 0; i < loanTypeList.size(); i++) {
			if(choice==loanTypeList.get(i).get("LoanNo")) {
				System.out.println("found");
				
				
				System.out.println("what detail you want to update?");
				System.out.println("1> Type ");
				System.out.println("2> Time-Period");
				System.out.println("3> Interest-Rates");
				System.out.println("enter choice:-");
				Integer choice2=scanner.nextInt();
				scanner.nextLine();
				switch (choice2) {
				case 1:
					System.out.println("print the new value");
					String string=scanner.nextLine();
					HashMap<String, Object> hashMap = new HashMap<String, Object>();
					hashMap.put("Type", string);
					hashMap = loanTypeList.get(i);
					
					for (int j = 0; j < loanTypeList.size(); j++) {
						System.out.println(loanTypeList.get(j));
					}
					
					
					
					break;
				case 2:
					
					break;
				case 3:
					
					break;
				default:
					
					break;
				}
				break;
			}
		}
		
	}

}
