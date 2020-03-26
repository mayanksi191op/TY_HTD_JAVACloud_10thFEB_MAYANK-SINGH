package com.tyss.capgemini.loanproject.dao;

public interface AdminDaoDeclaration {
	public void loanUpdate(String typechoice, int choice2, String choice3);
	public void insertLoan(String type, String time, String rates);
	public void deleteLoan(String loantype);
	public void viewLoanPrograms();
	public void addClients(String appidString);
	public void viewClients();
	public void approvedForms();
	public void rejectedForms();
	public void requestedForms();
}
