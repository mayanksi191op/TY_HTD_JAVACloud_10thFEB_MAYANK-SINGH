package com.tyss.capgemini.loanproject.services;

import com.tyss.capgemini.loanproject.exceptions.DateLimitException;
import com.tyss.capgemini.loanproject.exceptions.InsufficientBalanceException;
import com.tyss.capgemini.loanproject.exceptions.InvalidDateFormatException;
import com.tyss.capgemini.loanproject.exceptions.InvalidPasswordException;
import com.tyss.capgemini.loanproject.exceptions.LoanExcessException;
import com.tyss.capgemini.loanproject.factory.FactoryClass;
import com.tyss.capgemini.loanproject.repository.Repository;
import com.tyss.capgemini.loanproject.validation.ValidationClass;

public class CustomerServicesImplementation implements CustomerServicesDeclaration {

	ValidationClass validationClass = new ValidationClass();

	/**
	 * @return true if all the loan programs are viewed, false otherwise
	 */
	@Override
	public boolean viewLoanPrograms() {
		return FactoryClass.getCustomerDao().viewLoanPrograms();
	}

	/**
	 * @param String customerUsername, 
	 * @param String newPassword
	 * @return true if all the password is changed, false otherwise
	 */
	@Override
	public boolean changePassword(String custUsername, String newPass) {
		if (validationClass.passValid(newPass)) {
			FactoryClass.getCustomerDao().changePassword(custUsername, newPass);
			return true;
		} else {
			throw new InvalidPasswordException("Password not strong enough.");
		}
	}

	@Override
	public boolean checkBalance(String custUsername) {
		if (FactoryClass.getCustomerDao().checkBalance(custUsername)) {
			return true;
		} else
			return false;
	}

	/**
	 *@param String applicationId,
	 *@param String accountNo,
	 *@param String email,
	 *@param String applicantFirstName,
	 *@param String applicantMiddleName,
	 *@param String applicantLastName,
	 *@param String dateOfBirth,
	 *@param String coapplicantFirstName,
	 *@param String coapplicantMiddleName,
	 *@param String coapplicantLastName,
	 *@param String loanChoice,
	 *@param String branchCode,
	 *@param String branchName,
	 *@param String openDate,
	 *@param String requestDate,
	 *@param String loanAmount
	 *@return true if application is submitted successfully, false otherwise
	 */
	@Override
	public boolean loanApplicationForm(String applicationId, String accountNo, String email, String applicantFirstName,
			String applicantMiddleName, String applicantLastName, String dateOfBirth, String coapplicantFirstName,
			String coapplicantMiddleName, String coapplicantLastName, String loanChoice, String branchCode,
			String branchName, String loanAmount) {
		if (validationClass.dateValid(dateOfBirth)) {
			String[] dateOfBirthArr = dateOfBirth.split("/");
			int dobmonth = Integer.parseInt(dateOfBirthArr[1]);
			int dobyear = Integer.parseInt(dateOfBirthArr[2]);
			if ((dobmonth > 3) && (dobyear >= 2020)) {
				throw new DateLimitException("Not inside date limit.");
					} else
						FactoryClass.getCustomerDao().loanApplicationForm(applicationId, accountNo, email, applicantFirstName,
								applicantMiddleName, applicantLastName, dateOfBirth, coapplicantFirstName,
								coapplicantMiddleName, coapplicantLastName, loanChoice, branchCode, branchName,
								loanAmount);
					return true;
				} else
					throw new InvalidDateFormatException("Enter correct date format (DD/MM/YYYY).");
	}

	@Override
	public boolean payLoan(String custUsername, Double loanPay) {
		for (int i = 0; i < Repository.CUSTOMER_LIST.size(); i++) {
			if (custUsername.equals(Repository.CUSTOMER_LIST.get(i).get("username"))) {
				Double loan = (Double) Repository.CUSTOMER_LIST.get(i).get("loanAmount");
				if (loanPay > loan) {
					throw new LoanExcessException("Enter amount less than your loan amount.");
				}
				if (loanPay > (Double) Repository.CUSTOMER_LIST.get(i).get("AccountBal")) {
					throw new InsufficientBalanceException("Insufficient balance in account.");
				} else {
					FactoryClass.getCustomerDao().payLoan(custUsername, loanPay);
					return true;
				}
			}
		}
		return false;
	}

	@Override
	public boolean checkLoan(String custUsername) {
		if (FactoryClass.getCustomerDao().checkLoan(custUsername)) {
			return true;
		} else
			return false;
	}

	/**
	 * @return true if  all the loan types are shown, false otherwise
	 */
	@Override
	public boolean loanTypes() {
		if (FactoryClass.getCustomerDao().loanTypes()) {
			return true;
		}else {
			return false;
		}
	}
	
	@Override
	public String loanTypes(int k) {
		return FactoryClass.getCustomerDao().loanTypes(k);
	}

	/**@param String customerUsername
	 * @return true if all the Applications are displayed, false otherwise
	 */
	@Override
	public boolean viewApplications(String custUsername) {
		FactoryClass.getCustomerDao().viewApplications(custUsername);
		return true;
	}
	
	/**
	 * @param String email
	 * @return true if email already exists, false otherwise
	 */
	@Override
	public boolean emailExists(String email) {
		return FactoryClass.getLoginDao().emailExists(email);
	}

	/**
	 * @param String userName
	 * @return true if userName already exists, false otherwise
	 */
	@Override
	public boolean usernameExists(String username) {
		return FactoryClass.getLoginDao().usernameExists(username);
	}
	
	/**
	 * @param String id
	 * @return true if id already exists, false otherwise
	 */
	@Override
	public boolean applicationExist(String id) {
		return FactoryClass.getCustomerDao().applicationExist(id);
	}
	
	/**
	 * @param String userName
	 * @return the email searched by the userName
	 */
	@Override
	public String fetchMail(String username) {
		return FactoryClass.getCustomerDao().fetchMail(username);
	}

	/**
	 * @param String userName
	 * @return return the firstName searched by the userName
	 */
	@Override
	public String fetchFirstName(String username) {
		return FactoryClass.getCustomerDao().fetchFirstName(username);
	}

	/**
	 * @param String userName
	 * @return the lastName searched by the userName
	 */
	@Override
	public String fetchLastName(String username) {
		return FactoryClass.getCustomerDao().fetchLastName(username);
	}

	/**
	 * @param String userName
	 * @return balance searched by the userName
	 */
	@Override
	public Double returnBal(String username) {
		return FactoryClass.getCustomerDao().returnBal(username);
	}
	
	/**
	 * returns auto generated id 
	 */
	@Override
	public String autoGenerateId() {
		return FactoryClass.getCustomerDao().autoGenerateId();
	}
	
	/**
	 * @param username of string type
	 * returns true if the viewDetails() method returns true 
	 */
	@Override
	public boolean viewDetails(String username) {
		if (FactoryClass.getCustomerDao().viewDetails(username)) {
			return true;
		}
		return false;
	}
	
}
