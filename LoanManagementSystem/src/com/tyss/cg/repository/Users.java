package com.tyss.cg.repository;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Users {
	static Scanner scanner = new Scanner(System.in);
	static List<HashMap<String, Object>> adminList = new LinkedList<>();
	static List<HashMap<String, Object>> customerList = new LinkedList<>();
	static List<HashMap<String, Object>> approvalDeptList = new LinkedList<HashMap<String, Object>>();
	static List<HashMap<String, Object>> mainList = new LinkedList<HashMap<String, Object>>();
	static List<HashMap<String, Object>> loanTypeList = new LinkedList<HashMap<String,Object>>();
	public static void UserTable() {

		// Admins
		HashMap<String, Object> user1 = new HashMap<>();
		user1.put("userid", "ad01");
		user1.put("password", "pass1");
		user1.put("username", "Mayank.p");
		user1.put("email", "mayank.p@gmail.com");
		user1.put("firstname", "Mayank");
		user1.put("lastname", "Singh");
		user1.put("phone", "7618723945");
		adminList.add(user1);
		mainList.add(user1);

		HashMap<String, Object> user2 = new HashMap<String, Object>();
		user2.put("userid", "ad02");
		user2.put("password", "pass2");
		user2.put("username", "Ritam.p");
		user2.put("email", "ritam.p@gmail.com");
		user2.put("firstname", "Ritam");
		user2.put("lastname", "Roy");
		user2.put("phone", "7618711145");
		adminList.add(user2);
		mainList.add(user2);

		HashMap<String, Object> user3 = new HashMap<String, Object>();
		user3.put("userid", "ad03");
		user3.put("password", "pass3");
		user3.put("username", "Amlan.p");
		user3.put("email", "amlan.p@gmail.com");
		user3.put("firstname", "Amlan");
		user3.put("lastname", "Dutta");
		user3.put("phone", "7612341145");
		adminList.add(user3);
		mainList.add(user3);

		HashMap<String, Object> user4 = new HashMap<String, Object>();
		user4.put("userid", "ad04");
		user4.put("password", "pass4");
		user4.put("username", "Rahul.p");
		user4.put("email", "rahul.p@gmail.com");
		user4.put("firstname", "Rahul");
		user4.put("lastname", "Yadav");
		user4.put("phone", "7618711678");
		adminList.add(user4);
		mainList.add(user4);

		HashMap<String, Object> user5 = new HashMap<String, Object>();
		user5.put("userid", "ad05");
		user5.put("password", "pass5");
		user5.put("username", "Anand.p");
		user5.put("email", "anand.p@gmail.com");
		user5.put("firstname", "Anand");
		user5.put("lastname", "Sharma");
		user5.put("phone", "7618312345");
		adminList.add(user5);
		mainList.add(user5);

		// Customer.
		HashMap<String, Object> user6 = new HashMap<String, Object>();
		user6.put("userid", "cus01");
		user6.put("password", "pass6");
		user6.put("username", "Praveen.p");
		user6.put("email", "praveen.p@gmail.com");
		user6.put("firstname", "Praveen");
		user6.put("lastname", "Sharma");
		user6.put("phone", "7613412385");
		customerList.add(user6);
		mainList.add(user6);

		HashMap<String, Object> user7 = new HashMap<String, Object>();
		user7.put("userid", "cus02");
		user7.put("password", "pass7");
		user7.put("username", "Shreya.p");
		user7.put("email", "shreya.p@gmail.com");
		user7.put("firstname", "Shreya");
		user7.put("lastname", "Singh");
		user7.put("phone", "7613423385");
		customerList.add(user7);
		mainList.add(user7);

		HashMap<String, Object> user8 = new HashMap<String, Object>();
		user8.put("userid", "cus03");
		user8.put("password", "pass8");
		user8.put("username", "senku.p");
		user8.put("email", "senku.p@gmail.com");
		user8.put("firstname", "Senku");
		user8.put("lastname", "Manohar");
		user8.put("phone", "7613412345");
		customerList.add(user8);
		mainList.add(user8);

		HashMap<String, Object> user9 = new HashMap<String, Object>();
		user9.put("userid", "cus04");
		user9.put("password", "pass9");
		user9.put("username", "Tarushi.p");
		user9.put("email", "tarushi.p@gmail.com");
		user9.put("firstname", "Tarushi");
		user9.put("lastname", "Verma");
		user9.put("phone", "7613423445");
		customerList.add(user9);
		mainList.add(user9);

		HashMap<String, Object> user10 = new HashMap<String, Object>();
		user10.put("userid", "cus05");
		user10.put("password", "pass10");
		user10.put("username", "Poonam.p");
		user10.put("email", "poonam.p@gmail.com");
		user10.put("firstname", "Poonam");
		user10.put("lastname", "Raghuwanshi");
		user10.put("phone", "7613423490");
		customerList.add(user10);
		mainList.add(user10);

		// LoanApprovalDepartment
		HashMap<String, Object> user11 = new LinkedHashMap<String, Object>();
		user11.put("userid", "lad01");
		user11.put("password", "pass11");
		user11.put("username", "saswat.p");
		user11.put("email", "Saswat.p@gmail.com");
		user11.put("firstname", "Saswat");
		user11.put("lastname", "Biswas");
		user11.put("phone", "7613412345");
		approvalDeptList.add(user11);
		mainList.add(user11);

		HashMap<String, Object> user12 = new LinkedHashMap<String, Object>();
		user12.put("userid", "lad02");
		user12.put("password", "pass12");
		user12.put("username", "Shrawni.p");
		user12.put("email", "shrawni.p@gmail.com");
		user12.put("firstname", "Shrawni");
		user12.put("lastname", "Rowdy");
		user12.put("phone", "7613423445");
		approvalDeptList.add(user12);
		mainList.add(user12);

		HashMap<String, Object> user13 = new LinkedHashMap<String, Object>();
		user13.put("userid", "lad03");
		user13.put("password", "pass13");
		user13.put("username", "Divya.p");
		user13.put("email", "divya.p@gmail.com");
		user13.put("firstname", "Divya");
		user13.put("lastname", "Somaraju");
		user13.put("phone", "7613423490");
		approvalDeptList.add(user13);
		mainList.add(user13);

		for (int i = 0; i < adminList.size(); i++) {
			System.out.println(adminList.get(i));
		}

		System.out.println(" ");
		System.out.println(" ");

		for (Object object : customerList) {
			System.out.println(object);
		}

		System.out.println(" ");
		System.out.println(" ");
		for (Object object : approvalDeptList) {
			System.out.println(object);
		}
		
		HashMap<String, Object> loan1= new LinkedHashMap<String, Object>();
		loan1.put("No.", 1);
		loan1.put("Type", "House Loans");
		loan1.put("Time-Period","20 years(Max)");
		loan1.put("Interest-Rates", "9.75-10.25%");
		loanTypeList.add(loan1);
		
		HashMap<String, Object> loan2= new LinkedHashMap<String, Object>();
		loan2.put("No.", 2);
		loan2.put("Type", "Vehicle Loan");
		loan2.put("Time-Period","36 months - 60 months(Max)");
		loan2.put("Interest-Rates", "11.0-14.75%");
		loanTypeList.add(loan2);
		
		HashMap<String, Object> loan3= new LinkedHashMap<String, Object>();
		loan3.put("No.", 3);
		loan3.put("Type", "Educational Loans");
		loan3.put("Time-Period","5 years(Max)");
		loan3.put("Interest-Rates", "11.5-12.50%");
		loanTypeList.add(loan3);
		
		HashMap<String, Object> loan4= new LinkedHashMap<String, Object>();
		loan4.put("No.", 4);
		loan4.put("Type", "Credit Card Loans");
		loan4.put("Time-Period","20 days(Max)");
		loan4.put("Interest-Rates", "16.25-18.0%");
		loanTypeList.add(loan4);
		
		HashMap<String, Object> loan5= new LinkedHashMap<String, Object>();
		loan5.put("No.", 5);
		loan5.put("Type", "Payday Loans");
		loan5.put("Time-Period","1 month(Max)");
		loan5.put("Interest-Rates", "20.75-23.0%");
		loanTypeList.add(loan5);
		
		HashMap<String, Object> loan6= new LinkedHashMap<String, Object>();
		loan6.put("No.", 6);
		loan6.put("Type", "Personal Loans");
		loan6.put("Time-Period","5 years(Max)");
		loan6.put("Interest-Rates", "12.0-12.50%");
		loanTypeList.add(loan5);
		
		System.out.println(" ");
		System.out.println(" ");
		for (int i = 0; i < loanTypeList.size(); i++) {
			System.out.println(loanTypeList.get(i));
		}



	}

	public static void main(String[] args) {
		UserTable();
		System.out.println("enter the id");
		String userid = scanner.nextLine();
		System.out.println("enter the pass");
		String password = scanner.nextLine();
		
		int count=0;
		if(mainList.isEmpty() != true) {
		for (int i = 0; i < mainList.size(); i++) {
			if (mainList.get(i).get("userid").equals(userid) && mainList.get(i).get("password").equals(password)) {
				//System.out.println("found");
				count++;
				break;
			}
		}
		if(count > 0) {
			System.out.println("data found");
		} else System.out.println("data is not present");
		} else System.out.println("list is empty");
		
		
		
//		for (int i = 0; i < customerList.size() + adminList.size() +approvalDeptList.size(); i++) {
//			if ((customerList.get(i).get("userid").equals(idString)
//					&& customerList.get(i).get("password").equals(passString))
//					|| (adminList.get(i).get("userid").equals(idString)
//							&& adminList.get(i).get("password").equals(passString))
//					|| (approvalDeptList.get(i).get("userid").equals(idString)
//							&& approvalDeptList.get(i).get("password").equals(passString))) 

//			if((customerList.get(i).get("userid").equals(idString)
//					&& customerList.get(i).get("password").equals(passString))){
//				System.out.println("loggedin");
//				break;
//			} else if ((adminList.get(i).get("userid").equals(idString)
//							&& adminList.get(i).get("password").equals(passString))) {
//				System.out.println("loggedin");
//				break;	
//			} else if((approvalDeptList.get(i).get("userid").equals(idString)
//							&& approvalDeptList.get(i).get("password").equals(passString))) {
//				System.out.println("loggedin");
//				break;	
//			}
//				
//			else {
//				System.out.println("nope");
//			}
//		}

		// way2

//		int count=0;
//		
//			
//		for (int i = 0; i < customerList.size(); i++) {
//			if((customerList.get(i).get("userid").equals(idString)
//					&& customerList.get(i).get("password").equals(passString))){
//				System.out.println("loggedin");
//				count++;
//				break;
//		}}
//		for (int j = 0; j < adminList.size(); j++) {
//			if((adminList.get(j).get("userid").equals(idString)
//					&& adminList.get(j).get("password").equals(passString))){
//				System.out.println("loggedin");
//				count++;
//				break;
//		}}
//		for (int i = 0; i < approvalDeptList.size(); i++) {
//			if((approvalDeptList.get(i).get("userid").equals(idString)
//					&& approvalDeptList.get(i).get("password").equals(passString))){
//				System.out.println("loggedin");
//				count++;
//				break;
//		}}
//		if(count==customerList.size()+adminList.size()+approvalDeptList.size()) {
//			System.out.println("user not available");
//			} else {
//				System.out.println("asd");
//			}
		
		
		
	}
}
