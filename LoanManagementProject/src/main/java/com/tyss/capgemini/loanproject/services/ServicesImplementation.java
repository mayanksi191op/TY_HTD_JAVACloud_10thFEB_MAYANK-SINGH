package com.tyss.capgemini.loanproject.services;

import com.tyss.capgemini.loanproject.dao.DAODeclaration;
import com.tyss.capgemini.loanproject.dao.DAOImplementation;

public class ServicesImplementation implements ServicesDeclaration {
	DAODeclaration daoDeclaration = new DAOImplementation();
	
	
	@Override
	public void login(String userid, String password) {
		daoDeclaration.login(userid, password);
	}

	@Override
	public void loanUpdate(String typechoice, int choice2, String choice3) {
		daoDeclaration.loanUpdate(typechoice, choice2, choice3);
	}

	@Override
	public void insertLoan(String type, String time, String rates) {
		daoDeclaration.insertLoan(type, time, rates);
	}

	@Override
	public void deleteLoan(String loantype) {
		daoDeclaration.deleteLoan(loantype);
	}

	@Override
	public void viewLoanPrograms() {
		daoDeclaration.viewLoanPrograms();
	}

	@Override
	public void changePassword(String userid, String newPass) {
		daoDeclaration.changePassword(userid, newPass);
	}

	@Override
	public void checkBalance(String userid) {
		daoDeclaration.checkBalance(userid);
	}

	@Override
	public void approvedForms() {
		daoDeclaration.approvedForms();
	}

	@Override
	public void rejectedForms() {
		daoDeclaration.rejectedForms();
	}

	@Override
	public void requestedForms() {
		daoDeclaration.requestedForms();
	}

	@Override
	public void loanApplicationForm(String applicationId, String accountNo, String applicantFirstName,
			String applicantMiddleName, String applicantLastName, String coapplicantFirstName,
			String coapplicantMiddleName, String coapplicantLastName, String loanChoice, String branchCode,
			String branchName, String openDate, String requestDate) {
		daoDeclaration.loanApplicationForm(applicationId, accountNo, applicantFirstName, applicantMiddleName,
				applicantLastName, coapplicantFirstName, coapplicantMiddleName, coapplicantLastName, loanChoice,
				branchCode, branchName, openDate, requestDate);
	}

	@Override
	public void ladReviewForms() {
		
		
	}
}
