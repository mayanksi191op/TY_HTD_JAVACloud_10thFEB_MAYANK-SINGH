package com.tyss.capgemini.loanproject.dao;

public interface AdminDaoDeclaration {
	public boolean loanUpdate(String typechoice, int choice2, String choice3);
	public boolean insertLoan(String type, String time, String rates);
	public boolean deleteLoan(String loantype);
	public boolean viewLoanPrograms();
	public boolean addClients(String appidString);
	public boolean viewClients();
	public boolean approvedForms();
	public boolean rejectedForms();
	public boolean requestedForms();
	public boolean loanTypes();
	public String loanTypes(String k);
}
