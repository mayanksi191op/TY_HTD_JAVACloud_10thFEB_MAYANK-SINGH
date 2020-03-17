package com.tyss.capgemini.loanproject.dao;

import java.util.HashMap;
import java.util.LinkedHashMap;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import com.tyss.capgemini.loanproject.controller.AdminController;
import com.tyss.capgemini.loanproject.controller.CustomerController;
import com.tyss.capgemini.loanproject.controller.LADController;
import com.tyss.capgemini.loanproject.repository.Repository;

public class DAOImplementation implements DAODeclaration {
	Logger logger = LogManager.getLogger(DAOImplementation.class);
	Repository repo = new Repository();

	@Override
	public void custLogin(String custId, String custPass) {

		int count = 0;
		if (Repository.customerList.isEmpty() != true) {
			for (int i = 0; i < Repository.customerList.size(); i++) {
				if (Repository.customerList.get(i).get("userid").equals(custId)
						&& Repository.customerList.get(i).get("password").equals(custPass)) {
					count++;
					if (Repository.customerList.get(i).get("role").equals("customer")) {
						logger.info("Welcome " + custId);
						CustomerController.custController(custId);
					}
					break;
				}
			}
			if (count == 0) {
				System.out.println("data is not present");
			}
		} else
			System.out.println("list is empty");
	}

	public void empLogin(String empid, String empPass) {
		int count = 0;
		if (Repository.employeeList.isEmpty() != true) {
			for (int i = 0; i < Repository.employeeList.size(); i++) {
				if (Repository.employeeList.get(i).get("userid").equals(empid)
						&& Repository.employeeList.get(i).get("password").equals(empPass)) {
					count++;
					if (Repository.employeeList.get(i).get("role").equals("admin")) {
						logger.info("Welcome " + empid);
						AdminController.adminCont();
					} else
						logger.info("Welcome " + empid);
					LADController.ladController();
					break;
				}
			}
			if (count == 0) {
				System.out.println("data is not present");
			}
		} else
			System.out.println("list is empty");
	}

	@Override
	public void loanUpdate(String typechoice, int choice2, String choice3) {

		for (int i = 0; i < Repository.loanTypeList.size(); i++) {
			if (typechoice.equals(Repository.loanTypeList.get(i).get("Type"))) {
				logger.info("found");
				// HashMap<String, Object> hashMap = new HashMap<String, Object>();
				switch (choice2) {
				case 1:
					// hashMap.put("Type", choice3);
					Repository.loanTypeList.get(i).put("Type", choice3);
					for (int j = 0; j < Repository.loanTypeList.size(); j++) {
						logger.info(Repository.loanTypeList.get(j));
					}
					break;
				case 2:
					// hashMap.put("Time-Period", choice3);
					Repository.loanTypeList.get(i).put("Time-Period", choice3);

					for (int j = 0; j < Repository.loanTypeList.size(); j++) {
						logger.info(Repository.loanTypeList.get(j));
					}
					break;
				case 3:
					// hashMap.put("Interest-Rates", choice3);
					Repository.loanTypeList.get(i).put("Interest-Rates", choice3);

					for (int j = 0; j < Repository.loanTypeList.size(); j++) {
						logger.info(Repository.loanTypeList.get(j));
					}
					break;
				default:

					break;
				}
			}
		}
	}

	@Override
	public void insertLoan(String type, String time, String rates) {
		HashMap<String, Object> hashMap = new LinkedHashMap<String, Object>();
		hashMap.put("Type", type);
		hashMap.put("Time-Period", time);
		hashMap.put("Interest-Rates", rates);
		Repository.loanTypeList.add(hashMap);
		for (int j = 0; j < Repository.loanTypeList.size(); j++) {
			logger.info(Repository.loanTypeList.get(j));
		}
	}

	@Override
	public void deleteLoan(String loantype) {
		for (int i = 0; i < Repository.loanTypeList.size(); i++) {
			if (loantype.equals(Repository.loanTypeList.get(i).get("Type"))) {
				Repository.loanTypeList.remove(i);
				for (int k = 0; k < Repository.loanTypeList.size(); k++) {
					logger.info(Repository.loanTypeList.get(k));
				}
				break;
			}
		}
	}

	@Override
	public void viewLoanPrograms() {
		for (int k = 0; k < Repository.loanTypeList.size(); k++) {
			logger.info(Repository.loanTypeList.get(k));
		}
	}

	@Override
	public void loanApplicationForm(String applicationId, String accountNo, String applicantFirstName,
			String applicantMiddleName, String applicantLastName, String coapplicantFirstName,
			String coapplicantMiddleName, String coapplicantLastName, String loanChoice, String branchCode,
			String branchName, String openDate, String requestDate, String sub) {

		HashMap<String, Object> loanHashMap = new LinkedHashMap<String, Object>();
		loanHashMap.put("ApplicationId", applicationId);
		loanHashMap.put("AccountNo", accountNo);
		loanHashMap.put("ApplicantName", applicantFirstName + " " + applicantMiddleName + " " + applicantLastName);
		loanHashMap.put("CoapplicantName",
				coapplicantFirstName + " " + coapplicantMiddleName + " " + coapplicantLastName);
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
	public void submitButton(String sub) {
		boolean ct = false;
		while (ct != true) {
			switch (sub.toLowerCase()) {
			case "submit":
				ct = true;
				break;
			case "cancel":
				ct = true;
				break;
			default:
				logger.info("Enter again please.");
				break;
			}
		}
	}

	@Override
	public void changePassword(String userid, String newPass) {
		for (int j = 0; j < Repository.customerList.size(); j++) {
			if (userid.toLowerCase().equals(((String) Repository.customerList.get(j).get("userid")).toLowerCase())) {
				Repository.customerList.get(j).put("password", newPass);
				break;
			}
		}
		logger.info("Password has been changed successfully.");
	}

	@Override
	public void checkBalance(String userid) {
		for (int i = 0; i < Repository.customerList.size(); i++) {
			if (userid.toLowerCase().equals(((String) Repository.customerList.get(i).get("userid")).toLowerCase())) {
				logger.info("Balance available: " + Repository.customerList.get(i).get("AccountBal"));
				break;
			}
		}
	}

	@Override
	public void approvedForms() {
		for (int i = 0; i < Repository.loanFormList.size(); i++) {
			if (((String) Repository.loanFormList.get(i).get("LoanStatus")).toLowerCase().equals("approved")) {
				logger.info(Repository.loanFormList.get(i));
			}
		}
	}

	@Override
	public void rejectedForms() {
		for (int i = 0; i < Repository.loanFormList.size(); i++) {
			if (((String) Repository.loanFormList.get(i).get("LoanStatus")).toLowerCase().equals("rejected")) {
				logger.info(Repository.loanFormList.get(i));
			}
		}
	}

	@Override
	public void requestedForms() {
		for (int i = 0; i < Repository.loanFormList.size(); i++) {
			if (((String) Repository.loanFormList.get(i).get("LoanStatus")).toLowerCase().equals("requested")) {
				logger.info(Repository.loanFormList.get(i));
			}
		}
	}

	@Override
	public void ladReviewForms(String apid, String status) {
		for (int j = 0; j < Repository.loanFormList.size(); j++) {
			if (apid.equals(Repository.loanFormList.get(j).get("ApplicationId"))) {
				if (status.equalsIgnoreCase("approved")) {
					Repository.loanFormList.get(j).put("LoanStatus", "Approved");
				} else
					Repository.loanFormList.get(j).put("LoanStatus", "Rejected");
				logger.info("Status Changed successfully.");
				break;
			}
		}
		logger.info("All applications present:-");
		for (int i = 0; i < Repository.loanFormList.size(); i++) {
			logger.info(Repository.loanFormList.get(i));
		}
	}

	@Override
	public void ladViewForms(String planString) {
		for (int i = 0; i < Repository.loanFormList.size(); i++) {
			if (planString.equals(((String) Repository.loanFormList.get(i).get("LoanType")).toLowerCase())) {
				logger.info(Repository.loanFormList.get(i));
			}
		}
	}

	@Override
	public void addClients(String appidString) {
		int count = 0;
		for (int i = 0; i < Repository.loanFormList.size(); i++) {
			if (appidString.toLowerCase().equals(Repository.loanFormList.get(i).get("ApplicationId".toLowerCase()))) {
				Repository.clientList.add(Repository.loanFormList.get(i));
				count++;
				break;
			}
		}
		if (count > 0) {
			System.out.println("Client added");
		} else
			System.out.println("Applicant not present");
	}

	@Override
	public void viewClients() {
		for (int i = 0; i < Repository.clientList.size(); i++) {
			logger.info(Repository.clientList.get(i));
		}
	}
}
