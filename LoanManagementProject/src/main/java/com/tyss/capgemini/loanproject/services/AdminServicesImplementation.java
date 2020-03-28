package com.tyss.capgemini.loanproject.services;

import com.tyss.capgemini.loanproject.exceptions.ClientNotExistException;
import com.tyss.capgemini.loanproject.exceptions.InvalidLoanTypeException;
import com.tyss.capgemini.loanproject.factory.FactoryClass;
import com.tyss.capgemini.loanproject.repository.Repository;

public class AdminServicesImplementation implements AdminServicesDeclaration {
	@Override
	public void addClients(String appidString) {
		int count = 0;
		for (int i = 0; i < Repository.loanFormList.size(); i++) {
			if (appidString.equalsIgnoreCase((String) Repository.loanFormList.get(i).get("ApplicationId"))) {
				count ++;
				FactoryClass.getAdminDao().addClients(appidString);
				break;
			}
		}
		if(count == 0) {
			throw new ClientNotExistException("Applicant doesnt exist");
		}
	}

	@Override
	public void viewClients() {
		FactoryClass.getAdminDao().viewClients();
	}
	
	@Override
	public void loanUpdate(String typechoice, int choice2, String choice3) {
		int count = 0;
		for (int i = 0; i < Repository.loanTypeList.size(); i++) {
			if (typechoice.equalsIgnoreCase((String) Repository.loanTypeList.get(i).get("Type"))) {
				count ++;
				FactoryClass.getAdminDao().loanUpdate(typechoice, choice2, choice3);
				break;
			}
		}
		if(count == 0) {
			throw new InvalidLoanTypeException("Loan type doesnt exist");
		}
	}

	@Override
	public void insertLoan(String type, String time, String rates) {
		FactoryClass.getAdminDao().insertLoan(type, time, rates);
	}

	@Override
	public void deleteLoan(String loantype) {
		int count = 0;
		for (int i = 0; i < Repository.loanTypeList.size(); i++) {
			if (loantype.equalsIgnoreCase((String) Repository.loanTypeList.get(i).get("Type"))) {
				count ++;
				FactoryClass.getAdminDao().deleteLoan(loantype);
				break;
			}
		}
		if(count == 0) {
			throw new InvalidLoanTypeException("Loan type doesnt exist");
		}
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
