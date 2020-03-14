package com.tyss.cg.repository;

//import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
//import java.util.Map;
import java.util.Scanner;

public class Users {

	static Scanner scanner = new Scanner(System.in);
	static List<HashMap<String, Object>> adminList = new LinkedList<>();
	static List<HashMap<String, Object>> customerList = new LinkedList<>();
	static List<HashMap<String, Object>> approvalDeptList = new LinkedList<HashMap<String, Object>>();
	static List<HashMap<String, Object>> mainList = new LinkedList<HashMap<String, Object>>();
	static List<HashMap<String, Object>> loanTypeList = new LinkedList<HashMap<String, Object>>();

	public static void UserTable() {
		BeanClass bean1 = new BeanClass("Mayank.p", "ad01", "mayank.p@gmail.com", "pass1", "Mayank", "Singh",
				7618723945L, "admin");

		// Admins
		// public bean(String username, String userid, String email, String password,
		// String firstname, String lastname,
		// long phone, String role)
		HashMap<String, Object> user1 = new LinkedHashMap<String, Object>();

		user1.put("userid", bean1.getUserid());
		user1.put("password", bean1.getPassword());
		user1.put("username", bean1.getUsername());
		user1.put("email", bean1.getEmail());
		user1.put("firstname", bean1.getFirstname());
		user1.put("lastname", bean1.getLastname());
		user1.put("phone", bean1.getPhone());
		user1.put("role", bean1.getRole());
		adminList.add(user1);
		mainList.add(user1);

		BeanClass bean2 = new BeanClass("Ritam.p", "ad02", "ritam.p@gmail.com", "pass2", "Ritam", "Roy", 7618721134L,
				"admin");
		HashMap<String, Object> user2 = new LinkedHashMap<String, Object>();
		user2.put("userid", bean2.getUserid());
		user2.put("password", bean2.getPassword());
		user2.put("username", bean2.getUsername());
		user2.put("email", bean2.getEmail());
		user2.put("firstname", bean2.getFirstname());
		user2.put("lastname", bean2.getLastname());
		user2.put("phone", bean2.getPhone());
		adminList.add(user2);
		mainList.add(user2);

		BeanClass bean3 = new BeanClass("Amlan.p", "ad03", "amlan.p@gmail.com", "pass3", "Amlan", "Dutta", 7612321135L,
				"admin");
		HashMap<String, Object> user3 = new LinkedHashMap<String, Object>();
		user3.put("userid", bean3.getUserid());
		user3.put("password", bean3.getPassword());
		user3.put("username", bean3.getUsername());
		user3.put("email", bean3.getEmail());
		user3.put("firstname", bean3.getFirstname());
		user3.put("lastname", bean3.getLastname());
		user3.put("phone", bean3.getPhone());
		adminList.add(user3);
		mainList.add(user3);

		BeanClass bean4 = new BeanClass("Rahul.p", "ad04", "rahul.p@gmail.com", "pass4", "Rahul", "Yadav", 7618711678L,
				"admin");
		HashMap<String, Object> user4 = new LinkedHashMap<String, Object>();
		user4.put("userid", bean4.getUserid());
		user4.put("password", bean4.getPassword());
		user4.put("username", bean4.getUsername());
		user4.put("email", bean4.getEmail());
		user4.put("firstname", bean4.getFirstname());
		user4.put("lastname", bean4.getLastname());
		user4.put("phone", bean4.getPhone());
		adminList.add(user4);
		mainList.add(user4);

		BeanClass bean5 = new BeanClass("Anand.p", "ad05", "anand.p@gmail.com", "pass5", "Anand", "Sharma", 7618312345L,
				"admin");
		HashMap<String, Object> user5 = new LinkedHashMap<String, Object>();
		user5.put("userid", bean5.getUserid());
		user5.put("password", bean5.getPassword());
		user5.put("username", bean5.getUsername());
		user5.put("email", bean5.getEmail());
		user5.put("firstname", bean5.getFirstname());
		user5.put("lastname", bean5.getLastname());
		user5.put("phone", bean5.getPhone());
		adminList.add(user5);
		mainList.add(user5);

		// Customer.
		BeanClass bean6 = new BeanClass("Praveen.p", "cus01", "praveen.p@gmail.com", "pass6", "Praveen", "Sharma",
				7613412385L, "customer");
		HashMap<String, Object> user6 = new LinkedHashMap<String, Object>();
		user6.put("userid", bean6.getUserid());
		user6.put("password", bean6.getPassword());
		user6.put("username", bean6.getUsername());
		user6.put("email", bean6.getEmail());
		user6.put("firstname", bean6.getFirstname());
		user6.put("lastname", bean6.getLastname());
		user6.put("phone", bean6.getPhone());
		customerList.add(user6);
		mainList.add(user6);

		BeanClass bean7 = new BeanClass("Shreya.p", "cus02", "shreya.p@gmail.com", "pass7", "Shreya", "Singh",
				7613423385L, "customer");
		HashMap<String, Object> user7 = new LinkedHashMap<String, Object>();
		user7.put("userid", bean7.getUserid());
		user7.put("password", bean7.getPassword());
		user7.put("username", bean7.getUsername());
		user7.put("email", bean7.getEmail());
		user7.put("firstname", bean7.getFirstname());
		user7.put("lastname", bean7.getLastname());
		user7.put("phone", bean7.getPhone());
		customerList.add(user7);
		mainList.add(user7);

		BeanClass bean8 = new BeanClass("Senku.p", "cus03", "senku.p@gmail.com", "pass8", "Senku", "Manohar",
				7613412345L, "customer");
		HashMap<String, Object> user8 = new LinkedHashMap<String, Object>();
		user8.put("userid", bean8.getUserid());
		user8.put("password", bean8.getPassword());
		user8.put("username", bean8.getUsername());
		user8.put("email", bean8.getEmail());
		user8.put("firstname", bean8.getFirstname());
		user8.put("lastname", bean8.getLastname());
		user8.put("phone", bean8.getPhone());
		customerList.add(user8);
		mainList.add(user8);

		BeanClass bean9 = new BeanClass("Tarushi.p", "cus04", "tarushi.p@gmail.com", "pass9", "Tarushi", "Verma",
				7613423445L, "customer");
		HashMap<String, Object> user9 = new LinkedHashMap<String, Object>();
		user9.put("userid", bean9.getUserid());
		user9.put("password", bean9.getPassword());
		user9.put("username", bean9.getUsername());
		user9.put("email", bean9.getEmail());
		user9.put("firstname", bean9.getFirstname());
		user9.put("lastname", bean9.getLastname());
		user9.put("phone", bean9.getPhone());
		customerList.add(user9);
		mainList.add(user9);

		BeanClass bean10 = new BeanClass("Poonam.p", "cus05", "poonam.p@gmail.com", "pass10", "Poonam", "Raghuwanshi",
				7613423490L, "customer");
		HashMap<String, Object> user10 = new LinkedHashMap<String, Object>();
		user10.put("userid", bean10.getUserid());
		user10.put("password", bean10.getPassword());
		user10.put("username", bean10.getUsername());
		user10.put("email", bean10.getEmail());
		user10.put("firstname", bean10.getFirstname());
		user10.put("lastname", bean10.getLastname());
		user10.put("phone", bean10.getPhone());
		customerList.add(user10);
		mainList.add(user10);

		// LoanApprovalDepartment
		BeanClass bean11 = new BeanClass("saswat.p", "lad01", "Saswat.p@gmail.com", "pass11", "Saswat", "Biswas",
				7613424567L, "L.A.O");
		HashMap<String, Object> user11 = new LinkedHashMap<String, Object>();
		user11.put("userid", bean11.getUserid());
		user11.put("password", bean11.getPassword());
		user11.put("username", bean11.getUsername());
		user11.put("email", bean11.getEmail());
		user11.put("firstname", bean11.getFirstname());
		user11.put("lastname", bean11.getLastname());
		user11.put("phone", bean11.getPhone());
		approvalDeptList.add(user11);
		mainList.add(user11);

		BeanClass bean12 = new BeanClass("shrawni.p", "lad02", "shrawni.p@gmail.com", "pass12", "Shrawni", "Rowdy",
				7613423445L, "L.A.O");
		HashMap<String, Object> user12 = new LinkedHashMap<String, Object>();
		user12.put("userid", bean12.getUserid());
		user12.put("password", bean12.getPassword());
		user12.put("username", bean12.getUsername());
		user12.put("email", bean12.getEmail());
		user12.put("firstname", bean12.getFirstname());
		user12.put("lastname", bean12.getLastname());
		user12.put("phone", bean12.getPhone());
		approvalDeptList.add(user12);
		mainList.add(user12);

		BeanClass bean13 = new BeanClass("Divya.p", "lad03", "divya.p@gmail.com", "pass13", "Divya", "Somaraju",
				7613423490L, "L.A.O");
		HashMap<String, Object> user13 = new LinkedHashMap<String, Object>();
		user13.put("userid", bean13.getUserid());
		user13.put("password", bean13.getPassword());
		user13.put("username", bean13.getUsername());
		user13.put("email", bean13.getEmail());
		user13.put("firstname", bean13.getFirstname());
		user13.put("lastname", bean13.getLastname());
		user13.put("phone", bean13.getPhone());
		approvalDeptList.add(user13);
		mainList.add(user13);

//		for (int i = 0; i < adminList.size(); i++) {
//			System.out.println(adminList.get(i));
//		}
//
//		System.out.println(" ");
//		System.out.println(" ");
//
//		for (Object object : customerList) {
//			System.out.println(object);
//		}
//
//		System.out.println(" ");
//		System.out.println(" ");
//		for (Object object : approvalDeptList) {
//			System.out.println(object);
//		}

		// LoanTable
		BeanClass loanBean1 = new BeanClass(1, "House Loans", "20 years(Max)", "9.75-10.25%");
		HashMap<String, Object> loan1 = new LinkedHashMap<String, Object>();
		loan1.put("LoanNo", loanBean1.getLoanNo());
		loan1.put("Type", loanBean1.getLoanType());
		loan1.put("Time-Period", loanBean1.getTimePeriod());
		loan1.put("Interest-Rates", loanBean1.getInterestRates());
		loanTypeList.add(loan1);

		BeanClass loanBean2 = new BeanClass(2, "Vehicle Loans", "36 months - 60 months(Max)", "11.0-14.75%");
		HashMap<String, Object> loan2 = new LinkedHashMap<String, Object>();
		loan2.put("LoanNo", loanBean2.getLoanNo());
		loan2.put("Type", loanBean2.getLoanType());
		loan2.put("Time-Period", loanBean2.getTimePeriod());
		loan2.put("Interest-Rates", loanBean2.getInterestRates());
		loanTypeList.add(loan2);

		BeanClass loanBean3 = new BeanClass(3, "Educational Loans", "5 years(Max)", "11.5-12.50%");
		HashMap<String, Object> loan3 = new LinkedHashMap<String, Object>();
		loan3.put("LoanNo", loanBean3.getLoanNo());
		loan3.put("Type", loanBean3.getLoanType());
		loan3.put("Time-Period", loanBean3.getTimePeriod());
		loan3.put("Interest-Rates", loanBean3.getInterestRates());
		loanTypeList.add(loan3);

		BeanClass loanBean4 = new BeanClass(4, "Credit Card Loans", "20 days(Max)", "16.25-18.0%");
		HashMap<String, Object> loan4 = new LinkedHashMap<String, Object>();
		loan4.put("LoanNo", loanBean4.getLoanNo());
		loan4.put("Type", loanBean4.getLoanType());
		loan4.put("Time-Period", loanBean4.getTimePeriod());
		loan4.put("Interest-Rates", loanBean4.getInterestRates());
		loanTypeList.add(loan4);

		BeanClass loanBean5 = new BeanClass(5, "Payday Loans", "1 month(Max)", "20.75-23.0%");
		HashMap<String, Object> loan5 = new LinkedHashMap<String, Object>();
		loan5.put("LoanNo", loanBean5.getLoanNo());
		loan5.put("Type", loanBean5.getLoanType());
		loan5.put("Time-Period", loanBean5.getTimePeriod());
		loan5.put("Interest-Rates", loanBean5.getInterestRates());
		loanTypeList.add(loan5);

		BeanClass loanBean6 = new BeanClass(6, "Personal Loans", "5 years(Max)", "12.0-12.50%");
		HashMap<String, Object> loan6 = new LinkedHashMap<String, Object>();
		loan6.put("LoanNo", loanBean6.getLoanNo());
		loan6.put("Type", loanBean6.getLoanType());
		loan6.put("Time-Period", loanBean6.getTimePeriod());
		loan6.put("Interest-Rates", loanBean6.getInterestRates());
		loanTypeList.add(loan5);

//		System.out.println(" ");
//		System.out.println(" ");
//		for (int i = 0; i < loanTypeList.size(); i++) {
//			System.out.println(loanTypeList.get(i));
//		}

	}
	
	static void loadInsert() {
		System.out.println("enter the Loan");
	}
	
	
	
	static void loanUpdate() {
		//update
		System.out.println("enter the loan type number: ");
		
		for (int i = 0; i < loanTypeList.size(); i++) {
			System.out.println(loanTypeList.get(i));
		}
		
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
				HashMap<String, Object> hashMap = new HashMap<String, Object>();
				switch (choice2) {
				case 1:
					System.out.println("print the new value");
					String string=scanner.nextLine();
					hashMap.put("Type", string);
					//hashMap.
					loanTypeList.get(i).put("Type", string);
					
					for (int j = 0; j < loanTypeList.size(); j++) {
						System.out.println(loanTypeList.get(j));
					}
					
					
					
					break;
				case 2:
					System.out.println("print the new value");
					String string1=scanner.nextLine();
					hashMap.put("Time-Period", string1);
					//hashMap.
					loanTypeList.get(i).put("Time-Period", string1);
					
					for (int j = 0; j < loanTypeList.size(); j++) {
						System.out.println(loanTypeList.get(j));
					}
					break;
				case 3:
					System.out.println("print the new value");
					String string3=scanner.nextLine();
					hashMap.put("Interest-Rates", string3);
					//hashMap.
					loanTypeList.get(i).put("Interest-Rates", string3);
					
					for (int j = 0; j < loanTypeList.size(); j++) {
						System.out.println(loanTypeList.get(j));
					}
					
					break;
				default:
					
					break;
				}
				break;
			}
		}
		
	}

	public static void main(String[] args) {
		UserTable();
		loanUpdate();
//		loanApplicationForm();
//		System.out.println("enter the id");
//		String userid = scanner.nextLine();
//		System.out.println("enter the pass");
//		String password = scanner.nextLine();
//
//		int count = 0;
//		if (mainList.isEmpty() != true) {
//			for (int i = 0; i < mainList.size(); i++) {
//				if (mainList.get(i).get("userid").equals(userid) && mainList.get(i).get("password").equals(password)) {
//					// System.out.println("found");
//					count++;
//					break;
//				}
//			}
//			if (count > 0) {
//				System.out.println("data found");
//			} else
//				System.out.println("data is not present");
//		} else
//			System.out.println("list is empty");
//


	}

	static void loanApplicationForm() {
		LinkedList<HashMap<String, Object>> loanFormList = new LinkedList<HashMap<String, Object>>();

		System.out.println("enter the loan account number: ");
		String accountNo = scanner.nextLine();

		System.out.println("enter the Applicant First Name: ");
		String applicantFirstName = scanner.nextLine();

		System.out.println("enter the Middle Name: ");
		String applicantMiddleName = scanner.nextLine();

		System.out.println("enter the Last Name");
		String applicantLastName = scanner.nextLine();
		String applicantName = applicantFirstName + " " + applicantMiddleName + " " + applicantLastName;

		System.out.println("enter the Co-Applicant First Name: ");
		String coapplicantFirstName = scanner.nextLine();

		System.out.println("enter the Middle Name");
		String coapplicantMiddleName = scanner.nextLine();

		System.out.println("enter the Last Name");
		String coapplicantLastName = scanner.nextLine();
		String coapplicantName = coapplicantFirstName + " " + coapplicantMiddleName + " " + coapplicantLastName;

		System.out.println("enter the Loan Type");
		int loanChoice = scanner.nextInt();
		scanner.nextLine();

		System.out.println("enter the Branch Code");
		String branchCode = scanner.nextLine();

		System.out.println("enter the Branch Name");
		String branchName = scanner.nextLine();

		System.out.println("enter the Open Date");
		String openDate = scanner.nextLine();

		System.out.println("enter the Request Date");
		String requestDate = scanner.nextLine();

		BeanClass loanForm1 = new BeanClass(accountNo, applicantFirstName, applicantMiddleName, applicantLastName,
				coapplicantFirstName, coapplicantMiddleName, coapplicantLastName, loanChoice, branchCode, branchName,
				openDate, requestDate);

		HashMap<String, Object> loanHashMap = new LinkedHashMap<String, Object>();
		loanHashMap.put("LoanAccountNo", loanForm1.getAccountNo());
		loanHashMap.put("ApplicantName", applicantName);
		loanHashMap.put("CoapplicantName", coapplicantName);
		loanHashMap.put("LoanType", loanForm1.getLoanChoice());
		loanHashMap.put("BranchCode", loanForm1.getBranchCode());
		loanHashMap.put("BranchName", loanForm1.getBranchName());
		loanHashMap.put("OpenDate", loanForm1.getOpenDate());
		loanHashMap.put("RequestDate", loanForm1.getRequestDate());
		loanFormList.add(loanHashMap);
		for (int i = 0; i < loanFormList.size(); i++) {
			System.out.println(loanFormList.get(i));
		}
		
	}
}
