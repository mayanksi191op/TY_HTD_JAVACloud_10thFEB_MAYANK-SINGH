package com.tyss.capgemini.loanproject.dao;

public interface CustomerDaoDeclaration {
	public void viewLoanPrograms();
	public boolean changePassword(String custUsername, String newPass);
	public void checkBalance(String custUsername);
	public void loanApplicationForm(String applicationId, String accountNo, String applicantFirstName,
			String applicantMiddleName, String applicantLastName, String dateOfBirth, String coapplicantFirstName,
			String coapplicantMiddleName, String coapplicantLastName, String loanChoice, String branchCode,
			String branchName, String openDate, String requestDate, String sub);

}
