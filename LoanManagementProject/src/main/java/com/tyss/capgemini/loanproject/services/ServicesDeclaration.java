package com.tyss.capgemini.loanproject.services;

public interface ServicesDeclaration {

	public void custLogin(String custUsername, String password);
	public void empLogin(String empUsername, String empPass);
	public void loanUpdate(String typechoice, int choice2, String choice3);
	public void insertLoan(String type, String time, String rates);
	public void deleteLoan(String loantype);
	public void viewLoanPrograms();
	public boolean changePassword(String custUsername, String newPass);
	public void checkBalance(String custUsername);
	public void loanApplicationForm(String applicationId, String accountNo, String applicantFirstName,
			String applicantMiddleName, String applicantLastName, String dateOfBirth, String coapplicantFirstName,
			String coapplicantMiddleName, String coapplicantLastName, String loanChoice, String branchCode,
			String branchName, String openDate, String requestDate, String sub);
	public void approvedForms();
	public void rejectedForms();
	public void requestedForms();
	public void addClients(String appidString);
	public void viewClients();
	public void ladReviewForms(String apid, String status);
	public void ladViewForms(String planString);
	public void submitButton(String sub);
	public void register(String occupation, String dob, String gender, String username, String userid, String email, String password, String firstname, String lastname, long phone, double accountBal);
	public void payLoan(String custUsername, Double loanPay);
	public void checkLoan(String custUsername);
}
