package com.tyss.javacloud.loanproject.services;

import com.tyss.javacloud.loanproject.exceptions.FormReviewChoiceException;
import com.tyss.javacloud.loanproject.factory.FactoryClass;
import com.tyss.javacloud.loanproject.validation.ValidationClass;

public class LadServicesImplementation implements LadServicesDeclaration{
	ValidationClass validationClass = new ValidationClass();
	
	/**
	 * @return true if all the loan programs are viewed, false o
	 */
	@Override
	public boolean viewLoanPrograms() {
		if (FactoryClass.getLadDao().viewLoanPrograms()) {
			return true;
		} else return false;
	}
	
	/**
	 * @param String appId, String status
	 * @return true if status is changed to approved or rejected, false otherwise
	 */
	@Override
	public boolean ladReviewForms(String apid, String status) {
		if ((status.equalsIgnoreCase("approved")) || (status.equalsIgnoreCase("rejected"))) {
			FactoryClass.getLadDao().ladReviewForms(apid, status);
			return true;
		} else throw new FormReviewChoiceException("please write only approved or rejected.");
	}

	/**
	 * @param String planString 
	 * @return true if the application forms are shown to the LAD, false otherwise
	 */
	@Override
	public boolean ladViewForms(String planString) {
		if (FactoryClass.getLadDao().ladViewForms(planString)) {
			return true;
		} else return false;
	}
	
	/**
	 * @return true if all the requested forms are displayed 
	 */
	@Override
	public boolean requestedForms() {
		if (FactoryClass.getLadDao().requestedForms() == true) {
			return true;
		} else return false;
	}

	/**
	 * @return true if all the loans are displayed 
	 */
	@Override
	public boolean loanTypes() {
		return FactoryClass.getLadDao().loanTypes();
	}

	@Override
	public String loanTypes(String k) {
		return  FactoryClass.getLadDao().loanTypes(k);
	}
	
	@Override
	public boolean applicationExist(String id) {
		return FactoryClass.getLadDao().applicationExist(id);
	}

}
