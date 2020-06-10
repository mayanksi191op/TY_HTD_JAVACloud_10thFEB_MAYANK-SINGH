package com.tyss.capgemini.loanproject.services;

import com.tyss.capgemini.loanproject.exceptions.InvalidLoanTypeException;
import com.tyss.capgemini.loanproject.factory.FactoryClass;
import com.tyss.capgemini.loanproject.repository.Repository;

public class AdminServicesImplementation implements AdminServicesDeclaration {
	
	/**
	 * @param String 
	 * @param StringuserName,
	 * @param String email, 
	 * @param String password,
	 * @param String firstName,
	 * @param String lastName,
	 * @param String phone
	 * @return true if client is added successfully, false otherwise  
	 */
	
	@Override
	public boolean addClients(String username,String email,String password,
			String firstname,String lastname,String phone) {
		if( FactoryClass.getAdminDao().addClients(username,email,password,
				firstname, lastname, phone)) {
			return true;
		}
		else
			return false;
	}
	
	/**
	 * @return true if all the clients are viewed successfully
	 */

	@Override
	public boolean viewClients() {
		if (FactoryClass.getAdminDao().viewClients()) {
			return true;
		} else return false;
	}
	
	/**
	 * @param String typeChoice,
	 * @param String choice2
	 * @param String choice3
	 * @return true  if updated, false otherwise
	 */
	@Override
	public boolean loanUpdate(String typechoice, int choice2, String choice3) {
		int count = 0;
		for (int i = 0; i < Repository.LOANTYPE_LIST.size(); i++) {
			if (typechoice.equalsIgnoreCase((String) Repository.LOANTYPE_LIST.get(i).get("Type"))) {
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

	/**
	 * @param String type,
	 * @param String time,
	 * @param String rates
	 * @return true  if loan is inserted, false otherwise
	 */
	@Override
	public boolean insertLoan(String type, String time, String rates) {
		if (FactoryClass.getAdminDao().insertLoan(type, time, rates)) {
			return true;
		} else return false;
	}
	
	/**
	 * @param String loanType,
	 * @return true  if loan is deleted, false otherwise
	 */
	@Override
	public boolean deleteLoan(String loantype) {
		int count = 0;
		for (int i = 0; i < Repository.LOANTYPE_LIST.size(); i++) {
			if (loantype.equalsIgnoreCase((String) Repository.LOANTYPE_LIST.get(i).get("Type"))) {
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
	
	/**
	 * @return true if loan programs are viewed, false otherwise
	 */
	@Override
	public boolean viewLoanPrograms() {
		return FactoryClass.getAdminDao().viewLoanPrograms();
	}
	
	/**
	 * @return true if approved forms are viewed, false otherwise
	 */
	@Override
	public boolean approvedForms() {
		if (FactoryClass.getAdminDao().approvedForms()) {
			return true;
		} else return false;
	}

	/**
	 * @return true if rejected forms are viewed, false otherwise
	 */
	@Override
	public boolean rejectedForms() {
		if (FactoryClass.getAdminDao().rejectedForms()) {
			return true;
		} else return false;
	}

	/**
	 * @return true if requested forms are viewed, false otherwise
	 */
	@Override
	public boolean requestedForms() {
		if (FactoryClass.getAdminDao().requestedForms()) {
			return true;
		} else return false;
	}

	/**
	 * @return true if all the loan types are viewed, false otherwise
	 */
	@Override
	public boolean loanTypes() {
		return FactoryClass.getAdminDao().loanTypes();
	}

	/**
	 * @return true if approved forms are viewed, false otherwise
	 */
	@Override
	public String loanTypes(String k) {
		return FactoryClass.getAdminDao().loanTypes(k);
	}
	
	/**
	 * @param String email
	 * @return true if the email already exists, false otherwise
	 */
	@Override
	public boolean emailExists(String email) {
		return FactoryClass.getLoginDao().emailExists(email);
	}

	/**
	 * @param String userName
	 * @return true if the email already exists, false otherwise
	 */
	@Override
	public boolean usernameExists(String username) {
		return FactoryClass.getLoginDao().usernameExists(username);
	}

	/**
	 * @param String loanType,
	 * @param String newType
	 * @return true if the type is updated, false otherwise
	 */
	@Override
	public String updateType(String loanType, String newType) {
		return FactoryClass.getAdminDao().updateType(loanType, newType);
	}

	/**
	 * @param String loanType,
	 * @param String newType
	 * @return true if the time is updated, false otherwise
	 */
	@Override
	public boolean updateTimePeriod(String loanType, String newTime) {
		return FactoryClass.getAdminDao().updateTimePeriod(loanType, newTime);
	}

	/**
	 * @param String loanType,
	 * @param String newType
	 * @return true if the rate is updates, false otherwise
	 */
	@Override
	public boolean updateRates(String loanType, String newRate) {
		return FactoryClass.getAdminDao().updateRates(loanType, newRate);
	}

}
