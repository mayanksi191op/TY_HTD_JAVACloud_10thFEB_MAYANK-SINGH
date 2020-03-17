package com.tyss.capgemini.loanproject.dao;

public interface DAODeclaration {
	
	public void custLogin(String userid, String password);
	public void empLogin(String empid, String empPass);
	public void loanUpdate(String typechoice, int choice2, String choice3);
	public void insertLoan(String type, String time, String rates);
	public void deleteLoan(String loantype);
	public void viewLoanPrograms();
	public void changePassword(String userid, String newPass);
	public void checkBalance(String userid);
	public void loanApplicationForm(String applicationId, String accountNo, String applicantFirstName,
			String applicantMiddleName, String applicantLastName, String coapplicantFirstName,
			String coapplicantMiddleName, String coapplicantLastName, String loanChoice, String branchCode,
			String branchName, String openDate, String requestDate, String sub);
	public void approvedForms();
	public void rejectedForms();
	public void requestedForms();
	
	public void ladReviewForms(String apid, String status);
	public void ladViewForms(String planString);
	public void addClients(String appidString);
	public void viewClients();
	public void submitButton(String sub);
}
