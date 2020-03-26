package com.tyss.capgemini.loanproject.dao;

import java.util.HashMap;
import java.util.LinkedHashMap;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import com.tyss.capgemini.loanproject.repository.Repository;

public class CustomerDaoImplementation implements CustomerDaoDeclaration {
	Logger logger = LogManager.getLogger(DAOImplementation.class);
	Repository repo = new Repository();
	
	@Override
	public void viewLoanPrograms() {
		for (int k = 0; k < Repository.loanTypeList.size(); k++) {
			logger.info(Repository.loanTypeList.get(k));
		}
	}
	
	@Override
	public void loanApplicationForm(String applicationId, String accountNo, String applicantFirstName,
			String applicantMiddleName, String applicantLastName, String dateOfBirth, String coapplicantFirstName,
			String coapplicantMiddleName, String coapplicantLastName, String loanChoice, String branchCode,
			String branchName, String openDate, String requestDate, String sub) {

		HashMap<String, Object> loanHashMap = new LinkedHashMap<String, Object>();
		loanHashMap.put("ApplicationId", applicationId);
		loanHashMap.put("AccountNo", accountNo);
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
		switch (sub.toLowerCase()) {
		case "submit":
			Repository.loanFormList.add(loanHashMap);
			logger.info("Your loan application form has been submitted successfully.");
			break;
		case "cancel":
			logger.info("Cancelled");
			break;
		default:
			logger.info("Invalid option");
			break;
		}
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
	public void checkBalance(String custUsername) {
		for (int i = 0; i < Repository.customerList.size(); i++) {
			if (custUsername.equals(Repository.customerList.get(i).get("username"))) {
				logger.info("Balance available: " + Repository.customerList.get(i).get("AccountBal"));
				break;
			}
		}
	}
}
