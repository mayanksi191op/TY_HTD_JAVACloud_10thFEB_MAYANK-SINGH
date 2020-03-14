package com.tyss.capgemini.loanproject.services;

public interface ServicesDeclaration {

	public void login(String userid, String password);
	public void loanUpdate(String typechoice, int choice2, String choice3);
	public void insertLoan(String type, String time, String rates);
	public void deleteLoan(String loantype);
	public void viewLoanPrograms();
	public void changePassword(String userid, String newPass);
	public void checkBalance(String userid);
	public void loanApplicationForm(String applicationId, String accountNo, String applicantFirstName,
			String applicantMiddleName, String applicantLastName, String coapplicantFirstName,
			String coapplicantMiddleName, String coapplicantLastName, String loanChoice, String branchCode,
			String branchName, String openDate, String requestDate);
	public void approvedForms();
	public void rejectedForms();
	public void requestedForms();
	
	public void ladReviewForms();
	
}
