package com.tyss.capgemini.loanproject.services;

import com.tyss.capgemini.loanproject.exceptions.DateLimitException;
import com.tyss.capgemini.loanproject.exceptions.InvalidDateFormatException;
import com.tyss.capgemini.loanproject.exceptions.InvalidPasswordException;
import com.tyss.capgemini.loanproject.factory.FactoryClass;
import com.tyss.capgemini.loanproject.validation.ValidationClass;

public class ServicesImplementation implements ServicesDeclaration {
	ValidationClass validationClass = new ValidationClass();

	@Override
	public void custLogin(String custUsername, String custPass) {
		FactoryClass.getDAO().custLogin(custUsername, custPass);
	}

	@Override
	public void empLogin(String empUsername, String empPass) {
		FactoryClass.getDAO().empLogin(empUsername, empPass);
	}

	@Override
	public void loanUpdate(String typechoice, int choice2, String choice3) {
		FactoryClass.getDAO().loanUpdate(typechoice, choice2, choice3);
	}

	@Override
	public void insertLoan(String type, String time, String rates) {
		FactoryClass.getDAO().insertLoan(type, time, rates);
	}

	@Override
	public void deleteLoan(String loantype) {
		FactoryClass.getDAO().deleteLoan(loantype);
	}

	@Override
	public void viewLoanPrograms() {
		FactoryClass.getDAO().viewLoanPrograms();
	}

	@Override
	public boolean changePassword(String custUsername, String newPass) {
		if (validationClass.passValid(newPass)) {
			FactoryClass.getDAO().changePassword(custUsername, newPass);
		} else {
			throw new InvalidPasswordException("Password not strong enough.");
		}
		return true;
	}

	@Override
	public void checkBalance(String custUsername) {
		FactoryClass.getDAO().checkBalance(custUsername);
	}

	@Override
	public void approvedForms() {
		FactoryClass.getDAO().approvedForms();
	}

	@Override
	public void rejectedForms() {
		FactoryClass.getDAO().rejectedForms();
	}

	@Override
	public void requestedForms() {
		FactoryClass.getDAO().requestedForms();
	}

	@Override
	public void loanApplicationForm(String applicationId, String accountNo, String applicantFirstName,
			String applicantMiddleName, String applicantLastName, String coapplicantFirstName,
			String coapplicantMiddleName, String coapplicantLastName, String loanChoice, String branchCode,
			String branchName, String openDate, String requestDate, String sub) {
		if (validationClass.dateValid(openDate)) {
			String[] openDateArr = openDate.split("/");
			int odmonth = Integer.parseInt(openDateArr[1]);
			int odyear = Integer.parseInt(openDateArr[2]);
			if ((odmonth > 3) && (odyear >= 2020)) {
				throw new DateLimitException("Not inside date limit.");
			} else if (validationClass.dateValid(requestDate)) {
				String[] reqDateArr = requestDate.split("/");
				int rdmonth = Integer.parseInt(reqDateArr[1]);
				int rdyear = Integer.parseInt(reqDateArr[2]);
				if (((rdmonth < 3) && (rdyear < 2020)) && (rdyear > 2021)) {
					throw new DateLimitException("Not inside date limit.");
				} else
					FactoryClass.getDAO().loanApplicationForm(applicationId, accountNo, applicantFirstName,
							applicantMiddleName, applicantLastName, coapplicantFirstName, coapplicantMiddleName,
							coapplicantLastName, loanChoice, branchCode, branchName, openDate, requestDate, sub);
			} else
				throw new InvalidDateFormatException("Enter correct date format (DD/MM/YYYY).");
		} else
			throw new InvalidDateFormatException("Enter correct date format (DD/MM/YYYY).");
	}

	@Override
	public void addClients(String appidString) {
		FactoryClass.getDAO().addClients(appidString);
	}

	@Override
	public void viewClients() {
		FactoryClass.getDAO().viewClients();
	}

	@Override
	public void ladReviewForms(String apid, String status) {
		FactoryClass.getDAO().ladReviewForms(apid, status);
	}

	@Override
	public void submitButton(String sub) {
		FactoryClass.getDAO().submitButton(sub);
	}

	@Override
	public void ladViewForms(String planString) {
		FactoryClass.getDAO().ladViewForms(planString);
	}

	@Override
	public void register(String occupation, String dob, String gender, String username, String userid, String email,
			String password, String firstname, String lastname, long phone, double accountBal) {
		FactoryClass.getDAO().register(occupation, dob, gender, username, userid, email, password, firstname, lastname,
				phone, accountBal);
	}

	@Override
	public void payLoan(String custUsername, Double loanPay) {
		FactoryClass.getDAO().payLoan(custUsername, loanPay);
	}

	@Override
	public void checkLoan(String custUsername) {
		FactoryClass.getDAO().checkLoan(custUsername);
	}
}
