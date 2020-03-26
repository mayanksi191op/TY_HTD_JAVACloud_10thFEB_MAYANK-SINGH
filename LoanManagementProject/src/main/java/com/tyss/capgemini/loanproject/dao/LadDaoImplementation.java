package com.tyss.capgemini.loanproject.dao;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import com.tyss.capgemini.loanproject.repository.Repository;

public class LadDaoImplementation implements LadDaoDeclaration{
	Logger logger = LogManager.getLogger(DAOImplementation.class);
	Repository repo = new Repository();
	
	@Override
	public void viewLoanPrograms() {
		for (int k = 0; k < Repository.loanTypeList.size(); k++) {
			logger.info(Repository.loanTypeList.get(k));
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
	public void requestedForms() {
		for (int i = 0; i < Repository.loanFormList.size(); i++) {
			if (((String) Repository.loanFormList.get(i).get("LoanStatus")).toLowerCase().equals("requested")) {
				logger.info(Repository.loanFormList.get(i));
			}
		}
	}
}
