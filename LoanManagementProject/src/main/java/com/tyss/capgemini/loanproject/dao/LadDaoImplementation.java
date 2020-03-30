package com.tyss.capgemini.loanproject.dao;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import com.tyss.capgemini.loanproject.repository.Repository;

public class LadDaoImplementation implements LadDaoDeclaration {
	Logger logger = LogManager.getLogger(LadDaoImplementation.class);
	Repository repo = new Repository();

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
	public boolean ladReviewForms(String apid, String status) {
		for (int j = 0; j < Repository.loanFormList.size(); j++) {
			if (apid.equals(Repository.loanFormList.get(j).get("ApplicationId"))) {
				if (status.equalsIgnoreCase("approved")) {
					Repository.loanFormList.get(j).put("LoanStatus", "approved");
				} else
					Repository.loanFormList.get(j).put("LoanStatus", "rejected");
				logger.info("Status Changed successfully.");
				return true;
			}
		}
		logger.info("All applications present:-");
		for (int i = 0; i < Repository.loanFormList.size(); i++) {
			logger.info(Repository.loanFormList.get(i));
		}
		return false;
	}

	@Override
	public boolean ladViewForms(String planString) {
		int count = 0;
		for (int i = 0; i < Repository.loanFormList.size(); i++) {
			if (planString.equalsIgnoreCase((String) Repository.loanFormList.get(i).get("LoanType"))) {
				count++;
				logger.info(Repository.loanFormList.get(i));
				return true;
			}
		}
		if (count == 0) {
			logger.info("No applications for this plan");
		}
		return false;
	}

	@Override
	public boolean requestedForms() {
		if (Repository.loanFormList.size() != 0) {
			for (int i = 0; i < Repository.loanFormList.size(); i++) {
				if (((String) Repository.loanFormList.get(i).get("LoanStatus")).toLowerCase().equals("requested")) {
					logger.info(Repository.loanFormList.get(i));
				}
			} return true;
		}	else return false;
	}
}
