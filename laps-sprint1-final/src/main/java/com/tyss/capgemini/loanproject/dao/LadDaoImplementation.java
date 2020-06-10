package com.tyss.capgemini.loanproject.dao;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import com.tyss.capgemini.loanproject.repository.Repository;

public class LadDaoImplementation implements LadDaoDeclaration {
	Logger logger = LogManager.getLogger(LadDaoImplementation.class);
	
	/**
	 * Checks wheater the LoanTypeList list is empty and displays all the
	 * loan programs in the repository.
	 *
	 * @return true loan programs has been fetched and list is not empty,
	 * 		   false if the LoanTypeList list is empty.
	 */
	@Override
	public boolean viewLoanPrograms() {
		if (!Repository.LOANTYPE_LIST.isEmpty()) {
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
	 * Checks weather the application is present with the particular
	 * apid and changes the loan status according to the passed status
	 * value.
	 *
	 * @param apid of String type
	 * @param status of String type
	 * @return true if the application form with application id of
	 * 		   apid is present in the list else returns false if the
	 * 		   application is not present.
	 */
	@Override
	public boolean ladReviewForms(String apid, String status) {
		for (int j = 0; j < Repository.LOANFORM_LIST.size(); j++) {
			if (apid.equalsIgnoreCase((String) Repository.LOANFORM_LIST.get(j).get("ApplicationId"))) {
				if (status.equalsIgnoreCase("approved")) {
					Repository.LOANFORM_LIST.get(j).put("LoanStatus", "approved");
				} else
					Repository.LOANFORM_LIST.get(j).put("LoanStatus", "rejected");
				logger.info("Status Changed successfully.");
				return true;
			}
		}
		logger.info("All applications present:-");
		for (int i = 0; i < Repository.LOANFORM_LIST.size(); i++) {
			logger.info("********************************");
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
			logger.info("********************************");
		}
		return false;
	}
	
	/**
	 * Checks weather the LoanFormList is empty and displays the application
	 * form of the loantype value same as planString.
	 *
	 * @param planString of String type
	 * @return true if the LoanFormList is not empty else false if the list
	 * 		   is empty.
	 */
	@Override
	public boolean ladViewForms(String planString) {
		int count = 0;
		for (int i = 0; i < Repository.LOANFORM_LIST.size(); i++) {
			if (planString.equalsIgnoreCase((String) Repository.LOANFORM_LIST.get(i).get("LoanType"))) {
				count++;
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
				return true;
			}
		}
		if (count == 0) {
			logger.info("No applications for this plan");
		}
		return false;
	}
	
	/**
	 * Checks whether the LoanFormList list is empty and displays all the
	 * application forms with status as requested.
	 *
	 * @return true if the LoanFormList is not empty and the applpications
	 * 		   has been diplayed else false if the list is empty.
	 */
	@Override
	public boolean requestedForms() {
		int count = 0;
		if (!Repository.LOANFORM_LIST.isEmpty()) {
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
					count ++;
				}
			} 
			if (count != 0) {
				return true;
			} else {
				logger.info("no requested applications present!!!");
				return false;
			}
		}	else return false;
	}
	
	/**
	 * Checks whether the LoanTypeList list is empty and displays all the
	 * loan types which are available.
	 *
	 * @return true if the LoanTypeList is not empty else false if the list
	 * 		   is empty.
	 */
	@Override
	public boolean loanTypes() {
		for (int i = 0; i < Repository.LOANTYPE_LIST.size(); i++) {
			logger.info((i+1) + "> " + Repository.LOANTYPE_LIST.get(i).get("Type"));
		}
		return true;
	}
	
	/**
	 * Checks whether the LoanTypeList list is empty and selects and returns
	 * the type of loan staying at the particular index.
	 *
	 * @param k of string type
	 * @return the loan type name if present inside the LoanTypeList list
	 * 		   else invalid choice if the type is not present.
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
	 * Checks whether the LoanFormList list is empty and if not weather the 
	 * id is present inside the list.
	 *
	 * @param id of string type
	 * @return true if the LoanFormList is not empty and the id is present inside
	 * 		   the LoanFormList list else false if the application with the 
	 * 		   particular id is not present.
	 */
	@Override
	public boolean applicationExist(String id) {
		for (int i = 0; i < Repository.LOANFORM_LIST.size(); i++) {
			if (id.equalsIgnoreCase((String) Repository.LOANFORM_LIST.get(i).get("ApplicationId")) && (Repository.LOANFORM_LIST.get(i).get("LoanStatus").equals("requested"))) {
				logger.info("application id found");
				return true;
			}
		}
		return false;
	}
}
