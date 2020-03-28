package com.tyss.capgemini.loanproject.dao;

import java.util.HashMap;
import java.util.LinkedHashMap;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import com.tyss.capgemini.loanproject.repository.Repository;

public class AdminDaoImplementation implements AdminDaoDeclaration {
	Logger logger = LogManager.getLogger(DAOImplementation.class);
	Repository repo = new Repository();

	@Override
	public void loanUpdate(String typechoice, int choice2, String choice3) {
		for (int i = 0; i < Repository.loanTypeList.size(); i++) {
			if (typechoice.equalsIgnoreCase((String) Repository.loanTypeList.get(i).get("Type"))) {
				// logger.info("found");
				switch (choice2) {
				case 1:
					Repository.loanTypeList.get(i).put("Type", choice3);
					logger.info("Updated");
					break;
				case 2:
					Repository.loanTypeList.get(i).put("Time-Period", choice3);
					logger.info("Updated");
					break;
				case 3:
					Repository.loanTypeList.get(i).put("Interest-Rates", choice3);
					logger.info("Updated");
					break;
				default:
					logger.info("Wrong choice, enter again: ");
					break;
				}
				break;
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
				logger.info("Loan Deleted");
//				for (int k = 0; k < Repository.loanTypeList.size(); k++) {
//					logger.info(Repository.loanTypeList.get(k));
//				}
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
	public void addClients(String appidString) {
		int count1 = 0;
		int count2 = 0;
		for (int i = 0; i < Repository.loanFormList.size(); i++) {
			if (appidString.equals((String) Repository.loanFormList.get(i).get("ApplicationId"))) {
				for (int j = 0; j < Repository.clientList.size(); j++) {
					if (((String) Repository.loanFormList.get(i).get("ApplicationId"))
							.equalsIgnoreCase((String) Repository.clientList.get(j).get("ApplicationId"))) {
						logger.info("Client already exist.");
						count2++;
						break;
					}
				}
				if (count2 > 0) {
					break;
				}
				if ("approved".equalsIgnoreCase((String) Repository.loanFormList.get(i).get("LoanStatus"))) {
						Repository.clientList.add(Repository.loanFormList.get(i));
						logger.info("Client added");
						count1++;
						break;
				} else {
					logger.info("Status is not approved");
					break;
				}
			}
		}
	}

	@Override
	public void viewClients() {
		for (int i = 0; i < Repository.clientList.size(); i++) {
			logger.info(Repository.clientList.get(i));
		}
	}
}
