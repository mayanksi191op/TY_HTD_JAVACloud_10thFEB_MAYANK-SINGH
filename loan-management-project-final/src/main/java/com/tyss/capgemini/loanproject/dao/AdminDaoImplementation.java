package com.tyss.capgemini.loanproject.dao;

import java.util.HashMap;
import java.util.LinkedHashMap;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import com.tyss.capgemini.loanproject.repository.Repository;
import com.tyss.capgemini.loanproject.validation.ValidationClass;

public class AdminDaoImplementation implements AdminDaoDeclaration {
	Logger logger = LogManager.getLogger(AdminDaoImplementation.class);
	Repository repo = new Repository();
	ValidationClass validationClass = new ValidationClass();
	
	/**
	 * Inserts the details of the new loan program in the LoanTypeList
	 * list.
	 *
	 * @param typechoice of string type
	 * @param choice2 of int type
	 * @param choice3 of string type
	 * @return true if new loan has been inserted in the LoanTypeList list
	 * 		   sucessfully.
	 */
	@Override
	public boolean loanUpdate(String typechoice, int choice2, String choice3) {
		for (int i = 0; i < Repository.LOANTYPE_LIST.size(); i++) {
			if (typechoice.equalsIgnoreCase((String) Repository.LOANTYPE_LIST.get(i).get("Type"))) {
				switch (choice2) {
				case 1:
					Repository.LOANTYPE_LIST.get(i).put("Type", choice3);
					logger.info("Updated");
					return true;
				case 2:
					Repository.LOANTYPE_LIST.get(i).put("Time-Period", choice3);
					logger.info("Updated");
					return true;
				case 3:
					Repository.LOANTYPE_LIST.get(i).put("Interest-Rates", choice3);
					logger.info("Updated");
					return true;
				default:
					logger.info("Wrong choice, enter again: ");
					return true;
				}
			}
		}
		return false;
	}
	
	/**
	 * Inserts the details of the new loan program in the LoanTypeList
	 * list.
	 *
	 * @param type of string type
	 * @param time of string type
	 * @param rates of string type
	 * @return true if new loan has been inserted in the LoanTypeList list
	 * 		   sucessfully.
	 */
	@Override
	public boolean insertLoan(String type, String time, String rates) {
		HashMap<String, Object> hashMap = new LinkedHashMap<String, Object>();
		hashMap.put("Type", type);
		hashMap.put("Time-Period", time + " years(Max)");
		hashMap.put("Interest-Rates", rates + " %");
		Repository.LOANTYPE_LIST.add(hashMap);
		for (int j = 0; j < Repository.LOANTYPE_LIST.size(); j++) {
			logger.info(Repository.LOANTYPE_LIST.get(j));
		}
		return true;
	}
	
	/**
	 * Checks wheater the LoanTypeList list is not empty and  checks weather
	 * the particular loan type exists and deletes it.
	 *
	 * @param loantype of string type
	 * @return true if the LoanTypeList is not empty and checks weather
	 * 		   the particular loan type exists and deletes it, else false
	 * 		   if the LoanTypeList is empty.
	 */
	@Override
	public boolean deleteLoan(String loantype) {
		for (int i = 0; i < Repository.LOANTYPE_LIST.size(); i++) {
			if (loantype.equals(Repository.LOANTYPE_LIST.get(i).get("Type"))) {
				Repository.LOANTYPE_LIST.remove(i);
				logger.info("Loan Deleted");
				return true;
			}
		}
		return false;
	}
	
	/**
	 * Checks wheater the LoanTypeList list is empty and displays all the
	 * loan programs in the repository.
	 *
	 * @return true loan programs has been fetched and list is not empty,
	 * 		   false if the LoanTypeList list is empty.
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
		} else
			return false;
	}
	
	/**
	 * Checks whether the LoanFormList list is empty and displays all the
	 * application forms with status as approved.
	 *
	 * @return true if the LoanFormList is not empty and the applications
	 * 		   has been diplayed else false if the list is empty.
	 */
	@Override
	public boolean approvedForms() {
		if (Repository.LOANFORM_LIST.size() != 0) {
			for (int i = 0; i < Repository.LOANFORM_LIST.size(); i++) {
				if (((String) Repository.LOANFORM_LIST.get(i).get("LoanStatus")).toLowerCase().equals("approved")) {
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
				}
			} return true;
		} else return false;
	}
	
	/**
	 * Checks whether the LoanFormList list is empty and displays all the
	 * application forms with status as rejected.
	 *
	 * @return true if the LoanFormList is not empty and the applications
	 * 		   has been diplayed else false if the list is empty.
	 */
	@Override
	public boolean rejectedForms() {
		if (Repository.LOANFORM_LIST.size() != 0) {
			for (int i = 0; i < Repository.LOANFORM_LIST.size(); i++) {
				if (((String) Repository.LOANFORM_LIST.get(i).get("LoanStatus")).toLowerCase().equals("rejected")) {
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
				}
			} return true;
		} else return false;
	}
	
	/**
	 * Checks whether the LoanFormList list is empty and displays all the
	 * application forms with status as requested.
	 *
	 * @return true if the LoanFormList is not empty and the applications
	 * 		   has been diplayed else false if the list is empty.
	 */
	@Override
	public boolean requestedForms() {
		if (Repository.LOANFORM_LIST.size() != 0) {
			for (int i = 0; i < Repository.LOANFORM_LIST.size(); i++) {
				if (((String) Repository.LOANFORM_LIST.get(i).get("LoanStatus")).toLowerCase().equals("requested")) {
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
				}
			} return true;
		} else return false;
	}
	
	/**
	 * Inserts the details of the new client in the clientlist, mainlist,
	 * employeelist lists.
	 *
	 * @param username of string type
	 * @param email of string type
	 * @param password of string type
	 * @param firstname of string type
	 * @param lastname of string type
	 * @param phone of string type
	 * @return true if new client has been inserted in the clientlist,
	 * 		   mainlist, employeelist lists sucessfully.
	 */
	@Override
	public boolean addClients(String username,String email,String password,
			String firstname,String lastname,String phone) {
		HashMap<String, Object> regHashMap = new LinkedHashMap<String, Object>();
		regHashMap.put("password", password);
		regHashMap.put("username", username);
		regHashMap.put("email", email);
		regHashMap.put("firstname", firstname);
		regHashMap.put("lastname", lastname);
		regHashMap.put("phone", phone);
		regHashMap.put("role", "L.A.D");
		Repository.CLIENT_LIST.add(regHashMap);
		Repository.MAIN_LIST.add(regHashMap);
		Repository.EMPLOYEE_LIST.add(regHashMap);
		return true;
	}
	
	/**
	 * Checks wheater the clientlist list is empty and displays all the
	 * clients in the repository.
	 *
	 * @return true clients has been fetched and list is not empty,
	 * 		   false if the CLIENT_LIST list is empty.
	 */
	@Override
	public boolean viewClients() {
		if (Repository.CLIENT_LIST.size() != 0) {
			for (int i = 0; i < Repository.CLIENT_LIST.size(); i++) {
				logger.info("***********************************");
				logger.info("Username: " + Repository.CLIENT_LIST.get(i).get("username"));
				logger.info("Password: " + Repository.CLIENT_LIST.get(i).get("password"));
				logger.info("Email: " + Repository.CLIENT_LIST.get(i).get("email"));
				logger.info("FirstName: " + Repository.CLIENT_LIST.get(i).get("firstname"));
				logger.info("LastName: " + Repository.CLIENT_LIST.get(i).get("lastname"));
				logger.info("Phone Number:" + Repository.CLIENT_LIST.get(i).get("phone"));
				logger.info("Role:" + Repository.CLIENT_LIST.get(i).get("role"));
				logger.info("***********************************");
			}
			return true;
		} else
			logger.info("No clients exist");
			return false;
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
	 * @param k of String Type
	 * @return String value of "Type" key present in the particular HashMap
	 * 		   object stored in the LOANTYPE_LIST list else returns invalid
	 * 		   choice.
	 */
	@Override
	public String loanTypes(String k) {
		
		int j = Integer.parseInt(k);
		for (int i = 0; i < Repository.LOANTYPE_LIST.size(); i++) {
			if ((i+1)==j) {
				return (String) Repository.LOANTYPE_LIST.get(i).get("Type");
			}
		}
		logger.info("Invalid choice, enter again please!!!");
		return "invalid choice";
	}
	
	/**
	 * Checks if the particular email exists in the mainlist list.
	 * 
	 * @param email of String Type
	 * @return false if the email exists in the mainlist list else
	 * 		   true if it doesnt exist.
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
	 * Checks if the particular username exists in the mainlist list.
	 * 
	 * @param username of String Type
	 * @return false if the username exists in the mainlist list else
	 * 		   true if it doesnt exist.
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
	 * Updates the value of type key with 'newType' value if the
	 * particular loan program is present in the LoanTypeList list.
	 * 
	 * @param loanType of String Type
	 * @param newType of String Type
	 * @return the Type key value when the value of the loan type has
	 * 		   been updated else returns null.
	 */
	@Override
	public String updateType(String loanType, String newType) {
		logger.info(newType);
		logger.info(loanType);
		for (int i = 0; i < Repository.LOANTYPE_LIST.size(); i++) {
			if (loanType.equalsIgnoreCase((String) Repository.LOANTYPE_LIST.get(i).get("Type"))) {
				Repository.LOANTYPE_LIST.get(i).put("Type", newType);
				return (String) Repository.LOANTYPE_LIST.get(i).get("Type");
			}
		}
		return null;
	}
	
	/**
	 * Updates the value of type key with 'newTime' value if the
	 * particular loan program is present in the LoanTypeList list.
	 * 
	 * @param loanType of String Type
	 * @param newTime of String Type
	 * @return true if the value of the time period has been updated 
	 * 		   sucessfully else return false.
	 */
	@Override
	public boolean updateTimePeriod(String loanType, String newTime) {
		for (int i = 0; i < Repository.LOANTYPE_LIST.size(); i++) {
			if (loanType.equalsIgnoreCase((String) Repository.LOANTYPE_LIST.get(i).get("Type"))) {
				Repository.LOANTYPE_LIST.get(i).put("Time-Period", newTime + " years(Max)");
				return true;
			}
		}
		return false;
	}
	
	/**
	 * Checks wheater loantype type exists in the LoanTypeList list and updates the 
	 * interest rates value.
	 *
	 * @param loantype of string type
	 * @param newRate of string type
	 * @return true if the loantype type exists in the LoanTypeList list and updates the 
	 * interest rates value else false if the loantype type is not present.
	 */
	@Override
	public boolean updateRates(String loanType, String newRate) {
		for (int i = 0; i < Repository.LOANTYPE_LIST.size(); i++) {
			if (loanType.equalsIgnoreCase((String) Repository.LOANTYPE_LIST.get(i).get("Type"))) {
				Repository.LOANTYPE_LIST.get(i).put("Interest-Rates", newRate + " %");
				return true;
			}
		}
		return false;
	}
	
}
