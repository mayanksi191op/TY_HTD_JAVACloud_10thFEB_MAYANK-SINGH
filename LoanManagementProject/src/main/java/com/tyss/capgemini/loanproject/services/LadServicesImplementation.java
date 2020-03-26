package com.tyss.capgemini.loanproject.services;

import com.tyss.capgemini.loanproject.factory.FactoryClass;
import com.tyss.capgemini.loanproject.validation.ValidationClass;

public class LadServicesImplementation implements LadServicesDeclaration{
	ValidationClass validationClass = new ValidationClass();
	
	@Override
	public void viewLoanPrograms() {
		FactoryClass.getDAO().viewLoanPrograms();
	}
	
	@Override
	public void ladReviewForms(String apid, String status) {
		FactoryClass.getDAO().ladReviewForms(apid, status);
	}

	@Override
	public void ladViewForms(String planString) {
		FactoryClass.getDAO().ladViewForms(planString);
	}
	
	@Override
	public void requestedForms() {
		FactoryClass.getDAO().requestedForms();
	}

}
