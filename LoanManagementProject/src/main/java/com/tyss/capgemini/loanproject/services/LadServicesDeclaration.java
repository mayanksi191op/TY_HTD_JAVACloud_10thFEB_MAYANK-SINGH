package com.tyss.capgemini.loanproject.services;

public interface LadServicesDeclaration {
	public boolean viewLoanPrograms();
	public boolean ladReviewForms(String apid, String status);
	public boolean ladViewForms(String planString);
	public boolean requestedForms();
}
