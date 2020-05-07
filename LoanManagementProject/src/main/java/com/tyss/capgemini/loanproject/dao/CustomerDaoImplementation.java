package com.tyss.capgemini.loanproject.dao;

import java.util.HashMap;
import java.util.LinkedHashMap;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import com.tyss.capgemini.loanproject.repository.Repository;

public class CustomerDaoImplementation implements CustomerDaoDeclaration {
	Logger logger = LogManager.getLogger(CustomerDaoImplementation.class);
	Repository repo = new Repository();
	
	@Override
	public boolean viewLoanPrograms() {
		if (Repository.loanTypeList.size() != 0) {
			for (int k = 0; k < Repository.loanTypeList.size(); k++) {
				logger.info("**********************");
				logger.info("Type: " + Repository.loanTypeList.get(k).get("Type"));
				logger.info("Time Period: " + Repository.loanTypeList.get(k).get("Time-Period"));
				logger.info("Interest Rates: " + Repository.loanTypeList.get(k).get("Interest-Rates"));
				logger.info("**********************");
			}
			return true;
		} else return false;
	}
	
	@Override
	public boolean loanApplicationForm(String applicationId, String accountNo, String email, String applicantFirstName,
			String applicantMiddleName, String applicantLastName, String dateOfBirth, String coapplicantFirstName,
			String coapplicantMiddleName, String coapplicantLastName, String loanChoice, String branchCode,
			String branchName, String openDate, String requestDate) {

		HashMap<String, Object> loanHashMap = new LinkedHashMap<String, Object>();
		loanHashMap.put("ApplicationId", applicationId);
		loanHashMap.put("AccountNo", accountNo);
		loanHashMap.put("Email", email);
		loanHashMap.put("ApplicantName", applicantFirstName + " " + applicantMiddleName + " " + applicantLastName);
		loanHashMap.put("CoapplicantName",
				coapplicantFirstName + " " + coapplicantMiddleName + " " + coapplicantLastName);
		loanHashMap.put("DateOfBirth", dateOfBirth);
		loanHashMap.put("LoanType", loanChoice);
		loanHashMap.put("BranchCode", branchCode);
		loanHashMap.put("BranchName", branchName);
		loanHashMap.put("OpenDate", openDate);
		loanHashMap.put("RequestDate", requestDate);
		loanHashMap.put("LoanStatus", "requested");
		Repository.loanFormList.add(loanHashMap);
		logger.info("Your loan application form has been submitted successfully.");
		logger.info(loanHashMap);
		return true;
	}
	
	@Override
	public boolean changePassword(String custUsername, String newPass) {
		for (int j = 0; j < Repository.customerList.size(); j++) {
			if (custUsername.equals(Repository.customerList.get(j).get("username"))) {
				Repository.customerList.get(j).put("password", newPass);
				logger.info("Password has been changed successfully.");
				return true;
			}
		} return false;
	}

	@Override
	public boolean checkBalance(String custUsername) {
		for (int i = 0; i < Repository.customerList.size(); i++) {
			if (custUsername.equals(Repository.customerList.get(i).get("username"))) {
				logger.info("Balance available: " + Repository.customerList.get(i).get("AccountBal"));
				return true;
			}
		} return false;
	}
	
	@Override
	public boolean payLoan(String custUsername, Double loanPay) {
		for (int i = 0; i < Repository.customerList.size(); i++) {
			if (custUsername.equals(Repository.customerList.get(i).get("username"))) {
				Double loan = (Double) Repository.customerList.get(i).get("loanAmount");
				Double bal = (Double) Repository.customerList.get(i).get("AccountBal");
					logger.info("Amount paid successfully");
					Double newbal = bal - loanPay;
					Double newloan = loan - loanPay;
					Repository.customerList.get(i).put("AccountBal", newbal);
					Repository.customerList.get(i).put("loanAmount", newloan);
					return true;
				}
		}
		return false;
	}
	
	@Override
	public boolean checkLoan(String custUsername) {
		for (int i = 0; i < Repository.customerList.size(); i++) {
			if (custUsername.equals(Repository.customerList.get(i).get("username"))) {
				logger.info("Loan to pay: " + Repository.customerList.get(i).get("loanAmount"));
				return true;
			}
		} return false;
	}
	
	
	@Override
	public boolean loanTypes() {
		for (int i = 0; i < Repository.loanTypeList.size(); i++) {
			logger.info((i+1) + "> " + Repository.loanTypeList.get(i).get("Type"));
		}
		return true;
	}
	
	@Override
	public String loanTypes(int k) {
		for (int i = 1; i <= Repository.loanTypeList.size(); i++) {
			if (i==k) {
				return (String) Repository.loanTypeList.get(i).get("Type");
			}
			logger.info(i + "> " + Repository.loanTypeList.get(i).get("Type"));
		}
		return "invalid choice";
	}
							
	public boolean viewApplications(String custUsername) {
		String email = null;
		for (int i = 0; i < Repository.customerList.size(); i++) {
			if (custUsername.equals(Repository.customerList.get(i).get("username"))) {
				email = (String) Repository.customerList.get(i).get("email"); 
			}
		}
		int count = 0;
		for (int i = 0; i < Repository.loanFormList.size(); i++) {
			if(email.equals(Repository.loanFormList.get(i).get("Email"))){
				logger.info("*******************************");
				logger.info("ApplicationId: " + Repository.loanFormList.get(i).get("ApplicationId"));
				logger.info("AccountNo: " + Repository.loanFormList.get(i).get("AccountNo"));
				logger.info("Email: " + Repository.loanFormList.get(i).get("Email"));
				logger.info("ApplicantName: " + Repository.loanFormList.get(i).get("ApplicantName"));
				logger.info("DateOfBirth: " + Repository.loanFormList.get(i).get("DateOfBirth"));
				logger.info("CoApplicantName: " + Repository.loanFormList.get(i).get("CoApplicantName"));
				logger.info("LoanType: " + Repository.loanFormList.get(i).get("LoanType"));
				logger.info("BranchCode: " + Repository.loanFormList.get(i).get("BranchCode"));
				logger.info("BranchName: " + Repository.loanFormList.get(i).get("BranchName"));
				logger.info("OpenDate: " + Repository.loanFormList.get(i).get("OpenDate"));
				logger.info("RequestDate: " + Repository.loanFormList.get(i).get("RequestDate"));
				logger.info("LoanStatus: " + Repository.loanFormList.get(i).get("LoanStatus"));
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
	
	@Override
	public boolean emailExists(String email) {
		int count = 0;
		for (int i = 0; i < Repository.mainList.size(); i++) {
			if (email.equalsIgnoreCase((String) Repository.mainList.get(i).get("email"))) {
				count++;
			}
		}

		if (count > 0) {
			return false;
		} else {
			return true;
		}

	}


	@Override
	public boolean usernameExists(String username) {
		for (int i = 0; i < Repository.mainList.size(); i++) {
			if (username.equalsIgnoreCase((String) Repository.mainList.get(i).get("username"))) {
				return true;
			}
		}
		return false;

	}
	
	@Override
	public boolean applicationExist(String id) {
		for (int i = 0; i < Repository.loanFormList.size(); i++) {
			if (id.equalsIgnoreCase((String) Repository.loanFormList.get(i).get("ApplicationId"))) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public String fetchMail(String username) {
		for (int i = 0; i < Repository.customerList.size(); i++) {
			if (username.equalsIgnoreCase((String) Repository.customerList.get(i).get("username"))) {
				return (String) Repository.customerList.get(i).get("email");
			}
		}
		return username;
	}
}
