package com.tyss.capgemini.loanproject.services;

import com.tyss.capgemini.loanproject.exceptions.DateLimitException;
import com.tyss.capgemini.loanproject.exceptions.InvalidDateFormatException;
import com.tyss.capgemini.loanproject.exceptions.InvalidPasswordException;
import com.tyss.capgemini.loanproject.factory.FactoryClass;
import com.tyss.capgemini.loanproject.validation.ValidationClass;

public class CustomerServicesImplementation implements CustomerServicesDeclaration {
	
	ValidationClass validationClass = new ValidationClass();

	@Override
	public boolean viewLoanPrograms() {
		FactoryClass.getCustomerDao().viewLoanPrograms();
		return true;
	}

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
	public void checkBalance(String custUsername) {
		FactoryClass.getCustomerDao().checkBalance(custUsername);
	}

	@Override
	public void loanApplicationForm(String applicationId, String accountNo, String applicantFirstName,
			String applicantMiddleName, String applicantLastName, String dateOfBirth, String coapplicantFirstName,
			String coapplicantMiddleName, String coapplicantLastName, String loanChoice, String branchCode,
			String branchName, String openDate, String requestDate, String sub) {
		if (validationClass.dateValid(dateOfBirth)) {
			String[] dateOfBirthArr = dateOfBirth.split("/");
			int dobmonth = Integer.parseInt(dateOfBirthArr[1]);
			int dobyear = Integer.parseInt(dateOfBirthArr[2]);
			if ((dobmonth > 3) && (dobyear >= 2020)) {
				throw new DateLimitException("Not inside date limit.");
			} else if (validationClass.dateValid(openDate)) {
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
						FactoryClass.getCustomerDao().loanApplicationForm(applicationId, accountNo, applicantFirstName,
								applicantMiddleName, applicantLastName, dateOfBirth, coapplicantFirstName,
								coapplicantMiddleName, coapplicantLastName, loanChoice, branchCode, branchName,
								openDate, requestDate, sub);
				} else
					throw new InvalidDateFormatException("Enter correct date format (DD/MM/YYYY).");
			} else
				throw new InvalidDateFormatException("Enter correct date format (DD/MM/YYYY).");
		} else
			throw new InvalidDateFormatException("Enter correct date format (DD/MM/YYYY).");
	}
	
	@Override
	public void payLoan(String custUsername, Double loanPay) {
		FactoryClass.getCustomerDao().payLoan(custUsername, loanPay);
	}

	@Override
	public void checkLoan(String custUsername) {
		FactoryClass.getCustomerDao().checkLoan(custUsername);
	}
}
