package com.tyss.capgemini.loanproject.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Scanner;

import com.tyss.capgemini.loanproject.beans.CustomerBean;
import com.tyss.capgemini.loanproject.beans.EmployeeBean;
import com.tyss.capgemini.loanproject.beans.LoanApplicationBean;
import com.tyss.capgemini.loanproject.beans.LoanTypeBean;;

public class Repository {

	static Scanner scanner = new Scanner(System.in);
	public static final List<HashMap<String, Object>> CLIENT_LIST = new ArrayList<>();
	public static final List<HashMap<String, Object>> ADMIN_LIST = new ArrayList<>();
	public static final List<HashMap<String, Object>> CUSTOMER_LIST = new ArrayList<>();
	public static final List<HashMap<String, Object>> LAD_LIST = new ArrayList<>();
	public static final List<HashMap<String, Object>> MAIN_LIST = new ArrayList<>();
	public static final List<HashMap<String, Object>> LOANTYPE_LIST = new ArrayList<>();
	public static final List<HashMap<String, Object>> LOANFORM_LIST = new ArrayList<>();
	public static final List<HashMap<String, Object>> EMPLOYEE_LIST = new ArrayList<>();
	public static final List<Integer> APPLICATION_ID_LIST = new ArrayList<>();
	public static void userTable() {
		
		APPLICATION_ID_LIST.add(1);
		APPLICATION_ID_LIST.add(2);
		APPLICATION_ID_LIST.add(3);
		APPLICATION_ID_LIST.add(4);

		// Admins
		EmployeeBean bean1 = new EmployeeBean("mayank191", "mayank.p@gmail.com", "Qwerty@123", "Mayank", "Singh",
				7618723945L, "admin");

		HashMap<String, Object> user1 = new LinkedHashMap<>();
		user1.put("password", bean1.getPassword());
		user1.put("username", bean1.getUsername());
		user1.put("email", bean1.getEmail());
		user1.put("firstname", bean1.getFirstname());
		user1.put("lastname", bean1.getLastname());
		user1.put("phone", bean1.getPhone());
		user1.put("role", bean1.getRole());
		ADMIN_LIST.add(user1);
		MAIN_LIST.add(user1);
		EMPLOYEE_LIST.add(user1);

		EmployeeBean bean2 = new EmployeeBean("ritam191", "ritam.p@gmail.com", "Qwerty@123", "Ritam", "Roy", 7618721134L,
				"admin");
		HashMap<String, Object> user2 = new LinkedHashMap<>();
		user2.put("password", bean2.getPassword());
		user2.put("username", bean2.getUsername());
		user2.put("email", bean2.getEmail());
		user2.put("firstname", bean2.getFirstname());
		user2.put("lastname", bean2.getLastname());
		user2.put("phone", bean2.getPhone());
		user2.put("role", bean2.getRole());
		ADMIN_LIST.add(user2);
		MAIN_LIST.add(user2);
		EMPLOYEE_LIST.add(user2);

		EmployeeBean bean3 = new EmployeeBean("amlan191", "amlan.p@gmail.com", "Qwerty@123", "Amlan", "Dutta", 7612321135L,
				"admin");
		HashMap<String, Object> user3 = new LinkedHashMap<>();
		user3.put("password", bean3.getPassword());
		user3.put("username", bean3.getUsername());
		user3.put("email", bean3.getEmail());
		user3.put("firstname", bean3.getFirstname());
		user3.put("lastname", bean3.getLastname());
		user3.put("phone", bean3.getPhone());
		user3.put("role", bean3.getRole());
		ADMIN_LIST.add(user3);
		MAIN_LIST.add(user3);
		EMPLOYEE_LIST.add(user3);

		EmployeeBean bean4 = new EmployeeBean("rahul191", "rahul.p@gmail.com", "Qwerty@123", "Rahul", "Yadav", 7618711678L,
				"admin");
		HashMap<String, Object> user4 = new LinkedHashMap<>();
		user4.put("password", bean4.getPassword());
		user4.put("username", bean4.getUsername());
		user4.put("email", bean4.getEmail());
		user4.put("firstname", bean4.getFirstname());
		user4.put("lastname", bean4.getLastname());
		user4.put("phone", bean4.getPhone());
		user4.put("role", bean4.getRole());
		ADMIN_LIST.add(user4);
		MAIN_LIST.add(user4);
		EMPLOYEE_LIST.add(user4);

		EmployeeBean bean5 = new EmployeeBean("anand191", "anand.p@gmail.com", "Qwerty@123", "Anand", "Sharma", 7618312345L,
				"admin");
		HashMap<String, Object> user5 = new LinkedHashMap<>();
		user5.put("password", bean5.getPassword());
		user5.put("username", bean5.getUsername());
		user5.put("email", bean5.getEmail());
		user5.put("firstname", bean5.getFirstname());
		user5.put("lastname", bean5.getLastname());
		user5.put("phone", bean5.getPhone());
		user5.put("role", bean5.getRole());
		ADMIN_LIST.add(user5);
		MAIN_LIST.add(user5);
		EMPLOYEE_LIST.add(user5);

		// Customer.
		CustomerBean bean6 = new CustomerBean();
		bean6.setUsername("manoj191");
		bean6.setEmail("manoj.p@gmail.com");
		bean6.setPassword("Qwerty@123");
		bean6.setFirstname("Manoj");
		bean6.setLastname("Sharma");
		bean6.setPhone(7613412385L);
		bean6.setRole("customer");
		bean6.setAccountBal(90987.12);
		bean6.setLoanAmount(60890);
		HashMap<String, Object> user6 = new LinkedHashMap<>();
		user6.put("password", bean6.getPassword());
		user6.put("username", bean6.getUsername());
		user6.put("email", bean6.getEmail());
		user6.put("firstname", bean6.getFirstname());
		user6.put("lastname", bean6.getLastname());
		user6.put("phone", bean6.getPhone());
		user6.put("AccountBal", bean6.getAccountBal());
		user6.put("role", bean6.getRole());
		user6.put("loanAmount", bean6.getLoanAmount());
		CUSTOMER_LIST.add(user6);
		MAIN_LIST.add(user6);

		CustomerBean bean7 = new CustomerBean();
		bean7.setUsername("shreya191");
		bean7.setEmail("shreya.p@gmail.com");
		bean7.setPassword("Qwerty@123");
		bean7.setFirstname("Shreya");
		bean7.setLastname("Singh");
		bean7.setPhone(7613412385L);
		bean7.setRole("customer");
		bean7.setAccountBal(90700);
		bean7.setLoanAmount(60890.2);
		HashMap<String, Object> user7 = new LinkedHashMap<>();
		user7.put("password", bean7.getPassword());
		user7.put("username", bean7.getUsername());
		user7.put("email", bean7.getEmail());
		user7.put("firstname", bean7.getFirstname());
		user7.put("lastname", bean7.getLastname());
		user7.put("phone", bean7.getPhone());
		user7.put("AccountBal", bean7.getAccountBal());
		user7.put("role", bean7.getRole());
		user7.put("loanAmount", bean7.getLoanAmount());
		CUSTOMER_LIST.add(user7);
		MAIN_LIST.add(user7);

		CustomerBean bean8 = new CustomerBean();
		bean8.setUsername("senku191");
		bean8.setEmail("senku.p@gmail.com");
		bean8.setPassword("Qwerty@123");
		bean8.setFirstname("Senku");
		bean8.setLastname("Manohar");
		bean8.setPhone(7613412385L);
		bean8.setRole("customer");
		bean8.setAccountBal(103568.2);
		bean8.setLoanAmount(60000);
		HashMap<String, Object> user8 = new LinkedHashMap<>();
		user8.put("password", bean8.getPassword());
		user8.put("username", bean8.getUsername());
		user8.put("email", bean8.getEmail());
		user8.put("firstname", bean8.getFirstname());
		user8.put("lastname", bean8.getLastname());
		user8.put("phone", bean8.getPhone());
		user8.put("AccountBal", bean8.getAccountBal());
		user8.put("role", bean8.getRole());
		user8.put("loanAmount", bean8.getLoanAmount());
		CUSTOMER_LIST.add(user8);
		MAIN_LIST.add(user8);

		CustomerBean bean9 = new CustomerBean();
		bean9.setUsername("tarushi191");
		bean9.setEmail("tarushi.p@gmail.com");
		bean9.setPassword("Qwerty@123");
		bean9.setFirstname("Tarushi");
		bean9.setLastname("Verma");
		bean9.setPhone(7613412385L);
		bean9.setRole("customer");
		bean9.setAccountBal(37657.0);
		bean9.setLoanAmount(30000);
		HashMap<String, Object> user9 = new LinkedHashMap<>();
		user9.put("password", bean9.getPassword());
		user9.put("username", bean9.getUsername());
		user9.put("email", bean9.getEmail());
		user9.put("firstname", bean9.getFirstname());
		user9.put("lastname", bean9.getLastname());
		user9.put("phone", bean9.getPhone());
		user9.put("AccountBal", bean9.getAccountBal());
		user9.put("role", bean9.getRole());
		user9.put("loanAmount", bean9.getLoanAmount());
		CUSTOMER_LIST.add(user9);
		MAIN_LIST.add(user9);

		// LoanApprovalDepartment
		EmployeeBean bean11 = new EmployeeBean("saswat191", "Saswat.p@gmail.com", "Qwerty@123", "Saswat", "Biswas",
				7613424567L, "L.A.D");
		HashMap<String, Object> user11 = new LinkedHashMap<>();
		user11.put("password", bean11.getPassword());
		user11.put("username", bean11.getUsername());
		user11.put("email", bean11.getEmail());
		user11.put("firstname", bean11.getFirstname());
		user11.put("lastname", bean11.getLastname());
		user11.put("phone", bean11.getPhone());
		user11.put("role", bean11.getRole());
		LAD_LIST.add(user11);
		MAIN_LIST.add(user11);
		CLIENT_LIST.add(user11);
		EMPLOYEE_LIST.add(user11);

		EmployeeBean bean12 = new EmployeeBean("shrawani191", "shrawani.p@gmail.com", "Qwerty@123", "Shrawani", "Rowdy",
				7613423445L, "L.A.D");
		HashMap<String, Object> user12 = new LinkedHashMap<>();
		user12.put("password", bean12.getPassword());
		user12.put("username", bean12.getUsername());
		user12.put("email", bean12.getEmail());
		user12.put("firstname", bean12.getFirstname());
		user12.put("lastname", bean12.getLastname());
		user12.put("phone", bean12.getPhone());
		user12.put("role", bean12.getRole());
		LAD_LIST.add(user12);
		MAIN_LIST.add(user12);
		CLIENT_LIST.add(user12);
		EMPLOYEE_LIST.add(user12);

		EmployeeBean bean13 = new EmployeeBean("divya191", "divya.p@gmail.com", "Qwerty@123", "Divya", "Somaraju",
				7613423490L, "L.A.D");
		HashMap<String, Object> user13 = new LinkedHashMap<>();
		user13.put("password", bean13.getPassword());
		user13.put("username", bean13.getUsername());
		user13.put("email", bean13.getEmail());
		user13.put("firstname", bean13.getFirstname());
		user13.put("lastname", bean13.getLastname());
		user13.put("phone", bean13.getPhone());
		user13.put("role", bean13.getRole());
		LAD_LIST.add(user13);
		MAIN_LIST.add(user13);
		CLIENT_LIST.add(user13);
		EMPLOYEE_LIST.add(user3);

		// LoanTable
		LoanTypeBean loanBean1 = new LoanTypeBean("House Loan", "20 years(Max)", "9.75 %");
		HashMap<String, Object> loan1 = new LinkedHashMap<>();
		loan1.put("Type", loanBean1.getLoanType());
		loan1.put("Time-Period", loanBean1.getTimePeriod());
		loan1.put("Interest-Rates", loanBean1.getInterestRates());
		LOANTYPE_LIST.add(loan1);

		LoanTypeBean loanBean2 = new LoanTypeBean("House Construction Loan", "40 years(Max)", "11.0 %");
		HashMap<String, Object> loan2 = new LinkedHashMap<>();
		loan2.put("Type", loanBean2.getLoanType());
		loan2.put("Time-Period", loanBean2.getTimePeriod());
		loan2.put("Interest-Rates", loanBean2.getInterestRates());
		LOANTYPE_LIST.add(loan2);

		LoanTypeBean loanBean3 = new LoanTypeBean("Educational Loan", "5 years(Max)", "11.5 %");
		HashMap<String, Object> loan3 = new LinkedHashMap<>();
		loan3.put("Type", loanBean3.getLoanType());
		loan3.put("Time-Period", loanBean3.getTimePeriod());
		loan3.put("Interest-Rates", loanBean3.getInterestRates());
		LOANTYPE_LIST.add(loan3);

		LoanTypeBean loanBean5 = new LoanTypeBean("Land Purchase Loan", "20 years(Max)", "14.2 %");
		HashMap<String, Object> loan5 = new LinkedHashMap<>();
		loan5.put("Type", loanBean5.getLoanType());
		loan5.put("Time-Period", loanBean5.getTimePeriod());
		loan5.put("Interest-Rates", loanBean5.getInterestRates());
		LOANTYPE_LIST.add(loan5);

		LoanTypeBean loanBean6 = new LoanTypeBean("Personal Loan", "5 years(Max)", "11.14 %");
		HashMap<String, Object> loan6 = new LinkedHashMap<>();
		loan6.put("Type", loanBean6.getLoanType());
		loan6.put("Time-Period", loanBean6.getTimePeriod());
		loan6.put("Interest-Rates", loanBean6.getInterestRates());
		LOANTYPE_LIST.add(loan6);


		LoanApplicationBean loanApplicationForm1 = new LoanApplicationBean();
		loanApplicationForm1.setAccountNo("BNI12345");
		loanApplicationForm1.setApplicantFirstName("Manoj");
		loanApplicationForm1.setApplicantLastName("");
		loanApplicationForm1.setApplicantMiddleName("Sharma");
		loanApplicationForm1.setApplicationId("1");
		loanApplicationForm1.setBranchCode("BNI22343456");
		loanApplicationForm1.setBranchName("Cannaught Circle");
		loanApplicationForm1.setCoapplicantFirstName("Meghna");
		loanApplicationForm1.setCoapplicantMiddleName("Singh");
		loanApplicationForm1.setCoapplicantLastName("");
		loanApplicationForm1.setDateOfBirth("14/3/1973");
		loanApplicationForm1.setEmail("manoj.p@gmail.com");
		loanApplicationForm1.setFormStatus("approved");
		loanApplicationForm1.setLoanAmount("50000");
		loanApplicationForm1.setLoanChoice("Personal Loan");
		HashMap<String, Object> form1 = new LinkedHashMap<>();
		form1.put("ApplicationId", loanApplicationForm1.getApplicationId());
		form1.put("Email", loanApplicationForm1.getEmail());
		form1.put("AccountNo", loanApplicationForm1.getAccountNo());
		form1.put("ApplicantName", loanApplicationForm1.getApplicantFirstName() + " "
				+ loanApplicationForm1.getApplicantMiddleName() + " " + loanApplicationForm1.getApplicantLastName());
		form1.put("DateOfBirth", loanApplicationForm1.getDateOfBirth());
		form1.put("CoApplicantName",
				loanApplicationForm1.getCoapplicantFirstName() + " " + loanApplicationForm1.getCoapplicantMiddleName()
				+ " " + loanApplicationForm1.getCoapplicantLastName());
		form1.put("LoanType", loanApplicationForm1.getLoanChoice());
		form1.put("BranchCode", loanApplicationForm1.getBranchCode());
		form1.put("BranchName", loanApplicationForm1.getBranchName());
		form1.put("LoanStatus", loanApplicationForm1.getFormStatus());
		form1.put("LoanAmount", loanApplicationForm1.getLoanAmount());
		LOANFORM_LIST.add(form1);
		
		LoanApplicationBean loanApplicationForm4 = new LoanApplicationBean();
		loanApplicationForm4.setAccountNo("BNI12345");
		loanApplicationForm4.setApplicantFirstName("Shreya");
		loanApplicationForm4.setApplicantLastName("");
		loanApplicationForm4.setApplicantMiddleName("Singh");
		loanApplicationForm4.setApplicationId("4");
		loanApplicationForm4.setBranchCode("BNI22343456");
		loanApplicationForm4.setBranchName("Cannaught Circle");
		loanApplicationForm4.setCoapplicantFirstName("Meghna");
		loanApplicationForm4.setCoapplicantMiddleName("Singh");
		loanApplicationForm4.setCoapplicantLastName("");
		loanApplicationForm4.setDateOfBirth("14/3/1973");
		loanApplicationForm4.setEmail("shreya.p@gmail.com");
		loanApplicationForm4.setFormStatus("approved");
		loanApplicationForm4.setLoanAmount("30000");
		loanApplicationForm4.setLoanChoice("Personal Loan");
		HashMap<String, Object> form4 = new LinkedHashMap<>();
		form4.put("ApplicationId", loanApplicationForm4.getApplicationId());
		form4.put("AccountNo", loanApplicationForm4.getAccountNo());
		form4.put("Email", loanApplicationForm4.getEmail());
		form4.put("ApplicantName", loanApplicationForm4.getApplicantFirstName() + " "
				+ loanApplicationForm4.getApplicantMiddleName() + " " + loanApplicationForm4.getApplicantLastName());
		form4.put("DateOfBirth", loanApplicationForm4.getDateOfBirth());
		form4.put("CoApplicantName",
				loanApplicationForm4.getCoapplicantFirstName() + " " + loanApplicationForm4.getCoapplicantMiddleName()
				+ " " + loanApplicationForm4.getCoapplicantLastName());
		form4.put("LoanType", loanApplicationForm4.getLoanChoice());
		form4.put("BranchCode", loanApplicationForm4.getBranchCode());
		form4.put("BranchName", loanApplicationForm4.getBranchName());
		form4.put("LoanStatus", loanApplicationForm4.getFormStatus());
		form4.put("LoanAmount", loanApplicationForm1.getLoanAmount());
		LOANFORM_LIST.add(form4);

		LoanApplicationBean loanApplicationForm2 = new LoanApplicationBean();
		loanApplicationForm2.setAccountNo("BNI22345");
		loanApplicationForm2.setApplicantFirstName("Senku");
		loanApplicationForm2.setApplicantLastName("");
		loanApplicationForm2.setApplicantMiddleName("Manohar");
		loanApplicationForm2.setApplicationId("2");
		loanApplicationForm2.setBranchCode("BNI33343456");
		loanApplicationForm2.setBranchName("Cannaught Bank");
		loanApplicationForm2.setCoapplicantFirstName("Shiv");
		loanApplicationForm2.setCoapplicantMiddleName("Kumar");
		loanApplicationForm2.setCoapplicantLastName("Rajput");
		loanApplicationForm2.setDateOfBirth("14/3/1973");
		loanApplicationForm2.setEmail("senku.p@gmail.com");
		loanApplicationForm2.setFormStatus("rejected");
		loanApplicationForm2.setLoanAmount("1000000");
		loanApplicationForm2.setLoanChoice("House Construction Loan");
		HashMap<String, Object> form2 = new LinkedHashMap<>();
		form2.put("ApplicationId", loanApplicationForm2.getApplicationId());
		form2.put("AccountNo", loanApplicationForm2.getAccountNo());
		form2.put("Email", loanApplicationForm2.getEmail());
		form2.put("ApplicantName", loanApplicationForm2.getApplicantFirstName() + " "
				+ loanApplicationForm2.getApplicantMiddleName() + " " + loanApplicationForm2.getApplicantLastName());
		form2.put("DateOfBirth",loanApplicationForm2.getDateOfBirth());
		form2.put("CoApplicantName",
				loanApplicationForm2.getCoapplicantFirstName() + " " + loanApplicationForm2.getCoapplicantMiddleName()
				+ " " + loanApplicationForm2.getCoapplicantLastName());
		form2.put("LoanType", loanApplicationForm2.getLoanChoice());
		form2.put("BranchCode", loanApplicationForm2.getBranchCode());
		form2.put("BranchName", loanApplicationForm2.getBranchName());
		form2.put("LoanStatus", loanApplicationForm2.getFormStatus());
		form2.put("LoanAmount", loanApplicationForm1.getLoanAmount());
		LOANFORM_LIST.add(form2);
		
		LoanApplicationBean loanApplicationForm3 = new LoanApplicationBean();
		loanApplicationForm3.setAccountNo("BNI21145");
		loanApplicationForm3.setApplicantFirstName("Tarushi");
		loanApplicationForm3.setApplicantLastName("");
		loanApplicationForm3.setApplicantMiddleName("Verma");
		loanApplicationForm3.setApplicationId("3");
		loanApplicationForm3.setBranchCode("BNI13311456");
		loanApplicationForm3.setBranchName("Purani Delhi");
		loanApplicationForm3.setCoapplicantFirstName("Shiv");
		loanApplicationForm3.setCoapplicantMiddleName("Kumar");
		loanApplicationForm3.setCoapplicantLastName("Rajput");
		loanApplicationForm3.setDateOfBirth("14/3/1973");
		loanApplicationForm3.setEmail("tarushi.p@gmail.com");
		loanApplicationForm3.setFormStatus("requested");
		loanApplicationForm3.setLoanAmount("20000");
		loanApplicationForm3.setLoanChoice("Educational Loan");
		HashMap<String, Object> form3 = new LinkedHashMap<>();
		form3.put("ApplicationId", loanApplicationForm3.getApplicationId());
		form3.put("AccountNo", loanApplicationForm3.getAccountNo());
		form3.put("Email", loanApplicationForm3.getEmail());
		form3.put("ApplicantName", loanApplicationForm3.getApplicantFirstName() + " "
				+ loanApplicationForm3.getApplicantMiddleName() + " " + loanApplicationForm3.getApplicantLastName());
		form3.put("DateOfBirth", loanApplicationForm3.getDateOfBirth());
		form3.put("CoApplicantName",
				loanApplicationForm3.getCoapplicantFirstName() + " " + loanApplicationForm3.getCoapplicantMiddleName()
				+ " " + loanApplicationForm3.getCoapplicantLastName());
		form3.put("LoanType", loanApplicationForm3.getLoanChoice());
		form3.put("BranchCode", loanApplicationForm3.getBranchCode());
		form3.put("BranchName", loanApplicationForm3.getBranchName());
		form3.put("LoanStatus", loanApplicationForm3.getFormStatus());
		form3.put("LoanAmount", loanApplicationForm1.getLoanAmount());
		LOANFORM_LIST.add(form3);
	}
}
