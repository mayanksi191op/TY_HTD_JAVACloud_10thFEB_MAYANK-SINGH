package com.tyss.capgemini.loanproject.services;

import com.tyss.capgemini.loanproject.factory.FactoryClass;
import com.tyss.capgemini.loanproject.validation.ValidationClass;

public class LadServicesImplementation implements LadServicesDeclaration{
	ValidationClass validationClass = new ValidationClass();
	
	@Override
	public boolean viewLoanPrograms() {
		if (FactoryClass.getLadDao().viewLoanPrograms()) {
			return true;
		} else return false;
	}
	
	@Override
	public boolean ladReviewForms(String apid, String status) {
		if (FactoryClass.getLadDao().ladReviewForms(apid, status)) {
			return true;
		} else return false;
	}

	@Override
	public boolean ladViewForms(String planString) {
		if (FactoryClass.getLadDao().ladViewForms(planString)) {
			return true;
		} else return false;
	}
	
	@Override
	public boolean requestedForms() {
		if (FactoryClass.getLadDao().requestedForms()) {
			return true;
		} else return false;
	}

}
