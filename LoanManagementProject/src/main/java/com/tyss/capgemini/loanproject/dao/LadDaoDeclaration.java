package com.tyss.capgemini.loanproject.dao;

public interface LadDaoDeclaration {
	public void viewLoanPrograms();
	public void ladReviewForms(String apid, String status);
	public void ladViewForms(String planString);
	public void requestedForms();
}
