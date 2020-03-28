package com.tyss.capgemini.loanproject.dao;

public interface LadDaoDeclaration {
	public boolean viewLoanPrograms();
	public boolean ladReviewForms(String apid, String status);
	public boolean ladViewForms(String planString);
	public boolean requestedForms();
}
