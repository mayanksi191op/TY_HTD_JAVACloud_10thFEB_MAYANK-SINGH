package com.tyss.capgemini.loanproject.dao;

import java.util.HashMap;
import java.util.LinkedHashMap;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import com.tyss.capgemini.loanproject.exceptions.InvalidDataException;
import com.tyss.capgemini.loanproject.repository.Repository;
import com.tyss.capgemini.loanproject.validation.ValidationClass;

public class AdminDaoImplementation implements AdminDaoDeclaration {
	Logger logger = LogManager.getLogger(AdminDaoImplementation.class);
	Repository repo = new Repository();
	ValidationClass validationClass = new ValidationClass();

	@Override
	public boolean loanUpdate(String typechoice, int choice2, String choice3) {
		for (int i = 0; i < Repository.loanTypeList.size(); i++) {
			if (typechoice.equalsIgnoreCase((String) Repository.loanTypeList.get(i).get("Type"))) {
				switch (choice2) {
				case 1:
					Repository.loanTypeList.get(i).put("Type", choice3);
					logger.info("Updated");
					return true;
				case 2:
					Repository.loanTypeList.get(i).put("Time-Period", choice3);
					logger.info("Updated");
					return true;
				case 3:
					Repository.loanTypeList.get(i).put("Interest-Rates", choice3);
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

	@Override
	public boolean insertLoan(String type, String time, String rates) {
		HashMap<String, Object> hashMap = new LinkedHashMap<String, Object>();
		hashMap.put("Type", type);
		hashMap.put("Time-Period", time + " years(Max)");
		hashMap.put("Interest-Rates", rates + " %");
		Repository.loanTypeList.add(hashMap);
		for (int j = 0; j < Repository.loanTypeList.size(); j++) {
			logger.info(Repository.loanTypeList.get(j));
		}
		return true;
	}

	@Override
	public boolean deleteLoan(String loantype) {
		for (int i = 0; i < Repository.loanTypeList.size(); i++) {
			if (loantype.equals(Repository.loanTypeList.get(i).get("Type"))) {
				Repository.loanTypeList.remove(i);
				logger.info("Loan Deleted");
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean viewLoanPrograms() {
		if (Repository.loanTypeList.size() != 0) {
			for (int k = 0; k < Repository.loanTypeList.size(); k++) {
				logger.info(Repository.loanTypeList.get(k));
			}
			return true;
		} else
			return false;
	}

	@Override
	public boolean approvedForms() {
		if (Repository.loanFormList.size() != 0) {
			for (int i = 0; i < Repository.loanFormList.size(); i++) {
				if (((String) Repository.loanFormList.get(i).get("LoanStatus")).toLowerCase().equals("approved")) {
					logger.info(Repository.loanFormList.get(i));
				}
			} return true;
		} else return false;
	}

	@Override
	public boolean rejectedForms() {
		if (Repository.loanFormList.size() != 0) {
			for (int i = 0; i < Repository.loanFormList.size(); i++) {
				if (((String) Repository.loanFormList.get(i).get("LoanStatus")).toLowerCase().equals("rejected")) {
					logger.info(Repository.loanFormList.get(i));
				}
			} return true;
		} else return false;
	}

	@Override
	public boolean requestedForms() {
		if (Repository.loanFormList.size() != 0) {
			for (int i = 0; i < Repository.loanFormList.size(); i++) {
				if (((String) Repository.loanFormList.get(i).get("LoanStatus")).toLowerCase().equals("requested")) {
					logger.info(Repository.loanFormList.get(i));
				}
			} return true;
		} else return false;
	}

	@Override
	public boolean addClients(String appidString) {
		int count2 = 0;
		for (int i = 0; i < Repository.loanFormList.size(); i++) {
			if (appidString.equals((String) Repository.loanFormList.get(i).get("ApplicationId"))) {
				for (int j = 0; j < Repository.clientList.size(); j++) {
					if (((String) Repository.loanFormList.get(i).get("ApplicationId"))
							.equalsIgnoreCase((String) Repository.clientList.get(j).get("ApplicationId"))) {
						logger.info("Client already exist.");
						count2++;
						return true;
					}
				}
				if (count2 > 0) {
					return true;
				}
				if ("approved".equalsIgnoreCase((String) Repository.loanFormList.get(i).get("LoanStatus"))) {
					Repository.clientList.add(Repository.loanFormList.get(i));
					logger.info("Client added");
					return true;
				} else {
					logger.info("Status is not approved");
					return true;
				}
			}
		} return false;
	}

	@Override
	public boolean viewClients() {
		if (Repository.clientList.size() != 0) {
			for (int i = 0; i < Repository.clientList.size(); i++) {
				logger.info(Repository.clientList.get(i));
			}
			return true;
		} else
			return false;
	}
	
	@Override
	public boolean loanTypes() {
		for (int i = 0; i < Repository.loanTypeList.size(); i++) {
			logger.info((i+1) + "> " + Repository.loanTypeList.get(i).get("Type"));
		}
		return true;
	}
	
	@Override
	public String loanTypes(String k) {
		
		int j = Integer.parseInt(k);
		for (int i = 0; i < Repository.loanTypeList.size(); i++) {
			if ((i+1)==j) {
				return (String) Repository.loanTypeList.get(i).get("Type");
			}
		}
		logger.info("Invalid choice, enter again please!!!");
		return "invalid choice";
	}
	
}
