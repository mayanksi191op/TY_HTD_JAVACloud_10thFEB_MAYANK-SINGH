package com.tyss.capgemini.loanproject.dao;

import java.util.HashMap;
import java.util.LinkedHashMap;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import com.tyss.capgemini.loanproject.repository.Repository;

public class CustomerDaoImplementation implements CustomerDaoDeclaration {
	Logger logger = LogManager.getLogger(CustomerDaoImplementation.class);
	Repository repo = new Repository();


	/**
	 * Makes use of the Repository to find the LOANTYPE_LIST list and prints 
	 * the values of keys stored in HashMap objects stores in the list.
	 *
	 * @return true if data is present in LOANTYPE_LIST list and prints the 
	 * 			the respective data associated with the list, or false
	 * 			if the list is empty.
	 */
	@Override
	public boolean viewLoanPrograms() {
		if (Repository.LOANTYPE_LIST.size() != 0) {
			for (int k = 0; k < Repository.LOANTYPE_LIST.size(); k++) {
				logger.info("**********************");
				logger.info("Type: " + Repository.LOANTYPE_LIST.get(k).get("Type"));
				logger.info("Time Period: " + Repository.LOANTYPE_LIST.get(k).get("Time-Period"));
				logger.info("Interest Rates: " + Repository.LOANTYPE_LIST.get(k).get("Interest-Rates"));
				logger.info("**********************");
			}
			return true;
		} else return false;
	}

	/**
	 * Adds key value data to HashMap using put(),then
	 * adds the created HashMap object to the LOANFORM_LIST
	 * list.
	 *
	 * @param hash hash for key
	 * @param applicationId of String type
	 * @param accountNo of String type
	 * @param email of String type
	 * @param applicantFirstName of String type
	 * @param applicantMiddleName of String type
	 * @param applicantLastName of String type
	 * @param dateOfBirth of String type
	 * @param coapplicantFirstName of String type
	 * @param coapplicantMiddleName of String type
	 * @param coappllicantLastName of String type
	 * @param loanChoice of String type
	 * @param branchCode of String type
	 * @param branchName of String type
	 * @param openDate of String type
	 * @param requestDate of String type
	 * @param loanAmount of String type
	 * @return true if the data is being added to the 
	 * 		LOANFORM_LIST list, or false if the data is 
	 * 		not added.
	 * 
	 */
	@Override
	public boolean loanApplicationForm(String applicationId, String accountNo, String email, String applicantFirstName,
			String applicantMiddleName, String applicantLastName, String dateOfBirth, String coapplicantFirstName,
			String coapplicantMiddleName, String coapplicantLastName, String loanChoice, String branchCode,
			String branchName, String loanAmount) {

		HashMap<String, Object> loanHashMap = new LinkedHashMap<String, Object>();
		loanHashMap.put("ApplicationId", applicationId);
		loanHashMap.put("AccountNo", accountNo);
		loanHashMap.put("Email", email);
		loanHashMap.put("ApplicantName", applicantFirstName + " " + applicantMiddleName + " " + applicantLastName);
		loanHashMap.put("CoApplicantName",
				coapplicantFirstName + " " + coapplicantMiddleName + " " + coapplicantLastName);
		loanHashMap.put("DateOfBirth", dateOfBirth);
		loanHashMap.put("LoanType", loanChoice);
		loanHashMap.put("BranchCode", branchCode);
		loanHashMap.put("BranchName", branchName);
		loanHashMap.put("LoanAmount", loanAmount);
		loanHashMap.put("LoanStatus", "requested");
		Repository.LOANFORM_LIST.add(loanHashMap);
		logger.info("Your loan application form has been submitted successfully.");
		//logger.info(loanHashMap);
		logger.info("*******************************");
		logger.info("ApplicationId: " +loanHashMap.get("ApplicationId"));
		logger.info("AccountNo: " + loanHashMap.get("AccountNo"));
		logger.info("Email: " + loanHashMap.get("Email"));
		logger.info("ApplicantName: " + loanHashMap.get("ApplicantName"));
		logger.info("DateOfBirth: " + loanHashMap.get("DateOfBirth"));
		logger.info("CoApplicantName: " + loanHashMap.get("CoApplicantName"));
		logger.info("LoanType: " + loanHashMap.get("LoanType"));
		logger.info("BranchCode: " + loanHashMap.get("BranchCode"));
		logger.info("BranchName: " + loanHashMap.get("BranchName"));
		logger.info("LoanStatus: " + loanHashMap.get("LoanStatus"));
		logger.info("*******************************");
		return true;
	}	
	
	/**
	 * Checks whether the username is present in the HashMap object stored in the
	 * list then changes the value of "password" key present in the object to 
	 * newPass argument value. 
	 *
	 * @param custUsername of String type
	 * @param newPass of String type
	 * @return true if username is present in the any of the Hashmap objects
	 * 			stored in the list, or false if the username is not present.
	 */
	@Override
	public boolean changePassword(String custUsername, String newPass) {
		for (int j = 0; j < Repository.CUSTOMER_LIST.size(); j++) {
			if (custUsername.equals(Repository.CUSTOMER_LIST.get(j).get("username"))) {
				Repository.CUSTOMER_LIST.get(j).put("password", newPass);
				logger.info("Password has been changed successfully.");
				return true;
			}
		} return false;
	}
	
	/**
	 * Checks whether the username value passed as argument is
	 * present in any of the HashMap objects stored in CUSTOMER_LIST
	 * list and prints the "AccountBal" key value.
	 *
	 * @param custUsername of String type
	 * @return true if username is present in the any of the Hashmap objects
	 * 			stored in the list, or false if the username is not present.
	 */
	@Override
	public boolean checkBalance(String custUsername) {
		for (int i = 0; i < Repository.CUSTOMER_LIST.size(); i++) {
			if (custUsername.equals(Repository.CUSTOMER_LIST.get(i).get("username"))) {
				logger.info("Balance available: " + Repository.CUSTOMER_LIST.get(i).get("AccountBal"));
				return true;
			}
		} return false;
	}
	
	/**
	 * Checks whether the username and is present in the CUSTOMER_LIST and deduces the
	 * loanPay argument amount from the "AccountBal" key value of the particular HashMap
	 * object stored in the list.
	 * 
	 * @param custUsername of String type
	 * @param loanPay of Double type
	 * @return true if the operation performed with loanPay argument value and "AccountBal"
	 * 			key value is successful, or false if the operation is unsuccessful. 
	 */
	@Override
	public boolean payLoan(String custUsername, Double loanPay) {
		for (int i = 0; i < Repository.CUSTOMER_LIST.size(); i++) {
			if (custUsername.equals(Repository.CUSTOMER_LIST.get(i).get("username"))) {
				Double loan = (Double) Repository.CUSTOMER_LIST.get(i).get("loanAmount");
				Double bal = (Double) Repository.CUSTOMER_LIST.get(i).get("AccountBal");
				logger.info("Amount paid successfully");
				Double newbal = bal - loanPay;
				Double newloan = loan - loanPay;
				Repository.CUSTOMER_LIST.get(i).put("AccountBal", newbal);
				Repository.CUSTOMER_LIST.get(i).put("loanAmount", newloan);
				return true;
			}
		}
		return false;
	}
	
	/**
	 * Checks whether the username value passed as argument is
	 * present in any of the HashMap objects stored in CUSTOMER_LIST
	 * list and prints the "loanAmount" key value.
	 *
	 * @param custUsername of String type
	 * @return true if username is present in the any of the Hashmap objects
	 * 			stored in the list, or false if the username is not present.
	 */
	@Override
	public boolean checkLoan(String custUsername) {
		for (int i = 0; i < Repository.CUSTOMER_LIST.size(); i++) {
			if (custUsername.equals(Repository.CUSTOMER_LIST.get(i).get("username"))) {
				logger.info("Loan to pay: " + Repository.CUSTOMER_LIST.get(i).get("loanAmount"));
				return true;
			}
		} return false;
	}

	/**
	 * Prints all the "Type" key values present in the HashMap objects in 
	 * LOANTYPE_LIST list.
	 *
	 * @return true if the data is present in the LOANTYPE_LIST list, or false
	 * 			if the data is not present or the list is empty
	 */
	@Override
	public boolean loanTypes() {
		for (int i = 0; i < Repository.LOANTYPE_LIST.size(); i++) {
			logger.info((i+1) + "> " + Repository.LOANTYPE_LIST.get(i).get("Type"));
		}
		return true;
	}
	
	/**
	 * Checks if the object at particular index is present and returns the
	 * "Type" key value of the particular HashMap object in the list.
	 * 
	 * @param k of int Type
	 * @return String value of "Type" key present in the particular HashMap
	 * 			object stored in the LOANTYPE_LIST list.
	 */
	@Override
	public String loanTypes(int k) {
		for (int i = 0; i < Repository.LOANTYPE_LIST.size(); i++) {
			if ((i+1)==k) {
				return (String) Repository.LOANTYPE_LIST.get(i).get("Type");
			}
		}
		return "invalid choice";
	}
	
	/**
	 * Checks whether the username value passed as 
	 * argument of the method is present in the CUSTOMER_LIST list 
	 * stored in Repository and prints the related key values of
	 * the HashMap object stored in particular index.
	 *
	 * @param custUsername of String type
	 * @return true if the argument value passed is present in the list
	 * 			or false if the argument values are not present in the
	 * 			list and displayes the message.
	 */
	@Override
	public boolean viewApplications(String custUsername) {
		String email = null;
		for (int i = 0; i < Repository.CUSTOMER_LIST.size(); i++) {
			if (custUsername.equals(Repository.CUSTOMER_LIST.get(i).get("username"))) {
				email = (String) Repository.CUSTOMER_LIST.get(i).get("email"); 
			}
		}
		int count = 0;
		for (int i = 0; i < Repository.LOANFORM_LIST.size(); i++) {
			if(email.equals(Repository.LOANFORM_LIST.get(i).get("Email"))){
				logger.info("*******************************");
				logger.info("ApplicationId: " + Repository.LOANFORM_LIST.get(i).get("ApplicationId"));
				logger.info("AccountNo: " + Repository.LOANFORM_LIST.get(i).get("AccountNo"));
				logger.info("Email: " + Repository.LOANFORM_LIST.get(i).get("Email"));
				logger.info("ApplicantName: " + Repository.LOANFORM_LIST.get(i).get("ApplicantName"));
				logger.info("DateOfBirth: " + Repository.LOANFORM_LIST.get(i).get("DateOfBirth"));
				logger.info("CoApplicantName: " + Repository.LOANFORM_LIST.get(i).get("CoApplicantName"));
				logger.info("LoanType: " + Repository.LOANFORM_LIST.get(i).get("LoanType"));
				logger.info("BranchCode: " + Repository.LOANFORM_LIST.get(i).get("BranchCode"));
				logger.info("BranchName: " + Repository.LOANFORM_LIST.get(i).get("BranchName"));
				logger.info("LoanStatus: " + Repository.LOANFORM_LIST.get(i).get("LoanStatus"));
				logger.info("*******************************");
				count ++;
			}
		}
		if (count == 0) {
			logger.info("No loan applications found.");
			return false;
		} else {
			return true;
		}
	}
	
	/**
	 * Checks whether the email value passed as argument is
	 * present in MAIN_LIST list.
	 *
	 * @param email of String type
	 * @return false if the data is present in the MAIN_LIST
	 * 			list, or true if the data is not found.
	 */
	@Override
	public boolean emailExists(String email) {
		int count = 0;
		for (int i = 0; i < Repository.MAIN_LIST.size(); i++) {
			if (email.equalsIgnoreCase((String) Repository.MAIN_LIST.get(i).get("email"))) {
				count++;
			}
		}

		if (count > 0) {
			return false;
		} else {
			return true;
		}
	}

	/**
	 * Checks whether the username value passed as argument is
	 * present in MAIN_LIST list.
	 *
	 * @param username of String type
	 * @return false if the data is present in the MAIN_LIST
	 * 			list, or true if the data is not found.
	 */
	@Override
	public boolean usernameExists(String username) {
		for (int i = 0; i < Repository.MAIN_LIST.size(); i++) {
			if (username.equalsIgnoreCase((String) Repository.MAIN_LIST.get(i).get("username"))) {
				return true;
			}
		}
		return false;

	}
	
	/**
	 * Checks whether the id value passed as argument is
	 * present in any of the HashMap objects stored in LOANFORM_LIST
	 * list.
	 *
	 * @param id of String type
	 * @return true if id is present in the any of the Hashmap objects
	 * 			stored in the list, or false if the id is not present.
	 */
	@Override
	public boolean applicationExist(String id) {
		for (int i = 0; i < Repository.LOANFORM_LIST.size(); i++) {
			if (id.equalsIgnoreCase((String) Repository.LOANFORM_LIST.get(i).get("ApplicationId"))) {
				return true;
			}
		}
		return false;
	}
	
	/**
	 * Checks whether the username value passed as argument is
	 * present in MAIN_LIST list to fetch the value stored in
	 * "email" key in the particular HashMap object.
	 *
	 * @param username of String type
	 * @return String value of the "email" key in HashMap
	 * 			object present in the list, or null is the username
	 * 			is not present in any of the objects in the list.
	 */
	@Override
	public String fetchMail(String username) {
		for (int i = 0; i < Repository.CUSTOMER_LIST.size(); i++) {
			if (username.equalsIgnoreCase((String) Repository.CUSTOMER_LIST.get(i).get("username"))) {
				return (String) Repository.CUSTOMER_LIST.get(i).get("email");
			}
		}
		return username;
	}
	
	/**
	 * Checks whether the username value passed as argument is
	 * present in CUSTOMER_LIST list to fetch the value stored in
	 * "firstname" key in the particular HashMap object.
	 *
	 * @param username of String type
	 * @return String value of the "firstname" key in HashMap
	 * 			object present in the list, or null if the username
	 * 			is not present in any of the objects in the list.
	 */
	@Override
	public String fetchFirstName(String username) {
		for (int i = 0; i < Repository.CUSTOMER_LIST.size(); i++) {
			if (username.equalsIgnoreCase((String) Repository.CUSTOMER_LIST.get(i).get("username"))) {
				return (String) Repository.CUSTOMER_LIST.get(i).get("firstname");
			}
		}
		return null;
	}
	
	@Override
	public boolean viewDetails(String username) {
		for (int i = 0; i < Repository.CUSTOMER_LIST.size(); i++) {
			if (username.equalsIgnoreCase((String) Repository.CUSTOMER_LIST.get(i).get("username"))) {
				logger.info("*******************************");
				logger.info("Username: " + Repository.CUSTOMER_LIST.get(i).get("username"));
				logger.info("Email: " + Repository.CUSTOMER_LIST.get(i).get("email"));
				logger.info("First name: " + Repository.CUSTOMER_LIST.get(i).get("firstname"));
				logger.info("Last name: " + Repository.CUSTOMER_LIST.get(i).get("lastname"));
				logger.info("Phone: " + Repository.CUSTOMER_LIST.get(i).get("phone"));
				logger.info("Loan Amount: " + Repository.CUSTOMER_LIST.get(i).get("loanAmount"));
				logger.info("Role: " + Repository.CUSTOMER_LIST.get(i).get("role"));
				logger.info("*******************************");
				return true;
			}
		}
		return false;
	}

	/**
	 * Checks whether the username value passed as argument is
	 * present in MAIN_LIST list to fetch the value stored in
	 * "lastname" key in the particular HashMap object.
	 *
	 * @param username of String type
	 * @return String value of the "lastname" key in HashMap
	 * 			object present in the list, or null if the username
	 * 			is not present in any of the objects in the list.
	 */
	@Override
	public String fetchLastName(String username) {
		for (int i = 0; i < Repository.CUSTOMER_LIST.size(); i++) {
			if (username.equalsIgnoreCase((String) Repository.CUSTOMER_LIST.get(i).get("username"))) {
				return (String) Repository.CUSTOMER_LIST.get(i).get("lastname");
			}
		}
		return null;
	}
	
	/**
	 * Checks whether the username value passed as argument is
	 * present in MAIN_LIST list to fetch the value stored in
	 * "AccountBal" key in the particular HashMap object.
	 *
	 * @param custUsername of String type
	 * @return Double value of the "AccountBal" key in HashMap
	 * 			object present in the list, or null if the username
	 * 			is not present in any of the objects in the list.
	 */
	@Override
	public Double returnBal(String custUsername) {
		Double loanDouble;
		for (int i = 0; i < Repository.CUSTOMER_LIST.size(); i++) {
			if (custUsername.equals(Repository.CUSTOMER_LIST.get(i).get("username"))) {
				loanDouble = (Double) Repository.CUSTOMER_LIST.get(i).get("AccountBal");
				return loanDouble;
			}
		}
		return null; 
	}
	
	/**
	 * Fetches the latest application id in the APPLICATION_ID_LIST
	 * and increments it by 1 then returns it.
	 *
	 * @return the new generated string value of the id.
	 */
	@Override
	public String autoGenerateId() {
		Integer autoGenInteger = Repository.APPLICATION_ID_LIST.size() + 1;
		Repository.APPLICATION_ID_LIST.add(autoGenInteger);
		String autoGenIdString = Integer.toString(autoGenInteger);
		return autoGenIdString;
	}
}
