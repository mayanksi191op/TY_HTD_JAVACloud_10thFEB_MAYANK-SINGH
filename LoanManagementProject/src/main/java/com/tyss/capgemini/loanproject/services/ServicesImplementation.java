package com.tyss.capgemini.loanproject.services;

import com.tyss.capgemini.loanproject.factory.FactoryClass;

public class ServicesImplementation implements ServicesDeclaration {
	
	@Override
	public void custLogin(String custId, String custPass) {
		FactoryClass.getDAO().custLogin(custId, custPass);
	}
	
	@Override
	public void empLogin(String empid, String empPass) {
		FactoryClass.getDAO().empLogin(empid, empPass);
	}
	@Override
	public void loanUpdate(String typechoice, int choice2, String choice3) {
		FactoryClass.getDAO().loanUpdate(typechoice, choice2, choice3);
	}

	@Override
	public void insertLoan(String type, String time, String rates) {
		FactoryClass.getDAO().insertLoan(type, time, rates);
	}

	@Override
	public void deleteLoan(String loantype) {
		FactoryClass.getDAO().deleteLoan(loantype);
	}

	@Override
	public void viewLoanPrograms() {
		FactoryClass.getDAO().viewLoanPrograms();
	}

	@Override
	public void changePassword(String userid, String newPass) {
		FactoryClass.getDAO().changePassword(userid, newPass);
	}

	@Override
	public void checkBalance(String userid) {
		FactoryClass.getDAO().checkBalance(userid);
	}

	@Override
	public void approvedForms() {
		FactoryClass.getDAO().approvedForms();
	}

	@Override
	public void rejectedForms() {
		FactoryClass.getDAO().rejectedForms();
	}
	
	@Override
	public void requestedForms() {
		FactoryClass.getDAO().requestedForms();
	}

	@Override
	public void loanApplicationForm(String applicationId, String accountNo, String applicantFirstName,
			String applicantMiddleName, String applicantLastName, String coapplicantFirstName,
			String coapplicantMiddleName, String coapplicantLastName, String loanChoice, String branchCode,
			String branchName, String openDate, String requestDate, String sub) {
		FactoryClass.getDAO().loanApplicationForm(applicationId, accountNo, applicantFirstName, applicantMiddleName,
				applicantLastName, coapplicantFirstName, coapplicantMiddleName, coapplicantLastName, loanChoice,
				branchCode, branchName, openDate, requestDate, sub);
	}

	@Override
	public void addClients(String appidString) {
		FactoryClass.getDAO().addClients(appidString);
	}
	
	@Override
	public void viewClients() {
		FactoryClass.getDAO().viewClients();
	}
	@Override
	public void ladReviewForms(String apid, String status) {
		FactoryClass.getDAO().ladReviewForms(apid, status);
	}
	
	@Override
	public void submitButton(String sub) {
		FactoryClass.getDAO().submitButton(sub);
	}

	@Override
	public void ladViewForms(String planString) {
		FactoryClass.getDAO().ladViewForms(planString);
	}
}
