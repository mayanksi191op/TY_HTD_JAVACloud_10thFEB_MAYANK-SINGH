package com.tyss.capgemini.loanproject.services;

import com.tyss.capgemini.loanproject.factory.FactoryClass;

public class AdminServicesImplementation implements AdminServicesDeclaration {
	@Override
	public void addClients(String appidString) {
		FactoryClass.getAdminDao().addClients(appidString);
	}

	@Override
	public void viewClients() {
		FactoryClass.getAdminDao().viewClients();
	}
	
	@Override
	public void loanUpdate(String typechoice, int choice2, String choice3) {
		FactoryClass.getAdminDao().loanUpdate(typechoice, choice2, choice3);
	}

	@Override
	public void insertLoan(String type, String time, String rates) {
		FactoryClass.getAdminDao().insertLoan(type, time, rates);
	}

	@Override
	public void deleteLoan(String loantype) {
		FactoryClass.getAdminDao().deleteLoan(loantype);
	}
	
	@Override
	public void viewLoanPrograms() {
		FactoryClass.getAdminDao().viewLoanPrograms();
	}
	
	@Override
	public void approvedForms() {
		FactoryClass.getAdminDao().approvedForms();
	}

	@Override
	public void rejectedForms() {
		FactoryClass.getAdminDao().rejectedForms();
	}

	@Override
	public void requestedForms() {
		FactoryClass.getAdminDao().requestedForms();
	}

}
