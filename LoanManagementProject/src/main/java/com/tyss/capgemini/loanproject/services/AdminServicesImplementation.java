package com.tyss.capgemini.loanproject.services;

import java.util.logging.Logger;

import com.tyss.capgemini.loanproject.exceptions.ClientNotExistException;
import com.tyss.capgemini.loanproject.exceptions.InvalidLoanTypeException;
import com.tyss.capgemini.loanproject.factory.FactoryClass;
import com.tyss.capgemini.loanproject.repository.Repository;

public class AdminServicesImplementation implements AdminServicesDeclaration {
	@Override
	public boolean addClients(String appidString) {
		int count = 0;
		for (int i = 0; i < Repository.loanFormList.size(); i++) {
			if (appidString.equalsIgnoreCase((String) Repository.loanFormList.get(i).get("ApplicationId"))) {
				count ++;
				FactoryClass.getAdminDao().addClients(appidString);
				return true;
			}
		}
		if(count == 0) {
			throw new ClientNotExistException("Applicant doesnt exist");
		}
		return false;
	}

	@Override
	public boolean viewClients() {
		if (FactoryClass.getAdminDao().viewClients()) {
			return true;
		} else return false;
	}
	
	@Override
	public boolean loanUpdate(String typechoice, int choice2, String choice3) {
		int count = 0;
		for (int i = 0; i < Repository.loanTypeList.size(); i++) {
			if (typechoice.equalsIgnoreCase((String) Repository.loanTypeList.get(i).get("Type"))) {
				count ++;
				FactoryClass.getAdminDao().loanUpdate(typechoice, choice2, choice3);
				return true;
			}
		}
		if(count == 0) {
			throw new InvalidLoanTypeException("Loan type doesnt exist");
		}
		return false;
	}

	@Override
	public boolean insertLoan(String type, String time, String rates) {
		if (FactoryClass.getAdminDao().insertLoan(type, time, rates)) {
			return true;
		} else return false;
	}

	@Override
	public boolean deleteLoan(String loantype) {
		int count = 0;
		for (int i = 0; i < Repository.loanTypeList.size(); i++) {
			if (loantype.equalsIgnoreCase((String) Repository.loanTypeList.get(i).get("Type"))) {
				count ++;
				FactoryClass.getAdminDao().deleteLoan(loantype);
				return true;
			}
		}
		if(count == 0) {
			throw new InvalidLoanTypeException("Loan type doesnt exist");
		}
		return false;
	}
	
	@Override
	public boolean viewLoanPrograms() {
		if (FactoryClass.getAdminDao().viewLoanPrograms()) {
			return true;
		} else return false;
	}
	
	@Override
	public boolean approvedForms() {
		if (FactoryClass.getAdminDao().approvedForms()) {
			return true;
		} else return false;
	}

	@Override
	public boolean rejectedForms() {
		if (FactoryClass.getAdminDao().rejectedForms()) {
			return true;
		} else return false;
	}

	@Override
	public boolean requestedForms() {
		if (FactoryClass.getAdminDao().requestedForms()) {
			return true;
		} else return false;
	}

}
