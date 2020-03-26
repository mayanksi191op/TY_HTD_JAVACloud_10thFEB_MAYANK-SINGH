package com.tyss.capgemini.loanproject.services;

import com.tyss.capgemini.loanproject.exceptions.DateLimitException;
import com.tyss.capgemini.loanproject.exceptions.InvalidCredentialException;
import com.tyss.capgemini.loanproject.exceptions.InvalidDateFormatException;
import com.tyss.capgemini.loanproject.exceptions.InvalidEmailException;
import com.tyss.capgemini.loanproject.exceptions.InvalidPasswordException;
import com.tyss.capgemini.loanproject.exceptions.InvalidPhoneException;
import com.tyss.capgemini.loanproject.exceptions.InvalidUsernameException;
import com.tyss.capgemini.loanproject.factory.FactoryClass;
import com.tyss.capgemini.loanproject.repository.Repository;
import com.tyss.capgemini.loanproject.validation.ValidationClass;

public class ServicesImplementation implements ServicesDeclaration {
	ValidationClass validationClass = new ValidationClass();

	@Override
	public void custLogin(String custUsername, String custPass) {
		for (int i = 0; i < Repository.customerList.size(); i++) {
			if ((custUsername.equals(Repository.customerList.get(i).get("username")) && (custPass.equals(Repository.customerList.get(i).get("password"))))) {
				FactoryClass.getDAO().custLogin(custUsername, custPass);
			} else {
				throw new InvalidCredentialException("Enter correct username and password");
			}
		}
	}

	@Override
	public void empLogin(String empUsername, String empPass) {
		for (int i = 0; i < Repository.employeeList.size(); i++) {
			if ((empUsername.equals(Repository.employeeList.get(i).get("username")) && (empPass.equals(Repository.employeeList.get(i).get("password"))))) {
				FactoryClass.getDAO().empLogin(empUsername, empPass);
			} else {
				throw new InvalidCredentialException("Enter correct username and password");
			}
		}
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
			return true;
		} else {
			throw new InvalidPasswordException("Password not strong enough.");
		}
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
						FactoryClass.getDAO().loanApplicationForm(applicationId, accountNo, applicantFirstName,
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
			if (validationClass.usernameValid(username)) {
				throw new InvalidUsernameException("Enter correct format");
			} else if(validationClass.passValid(password)) {
				throw new InvalidPasswordException("Enter correct password format");
			} else if(validationClass.mailValid(email)) {
				throw new InvalidEmailException("Enter correct email format");
			} else if (validationClass.dateValid(dob)) {
				String[] dateOfBirthArr = dob.split("/");
				int dobmonth = Integer.parseInt(dateOfBirthArr[1]);
				int dobyear = Integer.parseInt(dateOfBirthArr[2]);
				if ((dobmonth > 3) && (dobyear >= 2020)) {
					throw new DateLimitException("Not inside date limit.");
				} 
			}else if ((phone > 9999999999L) || (phone < 1000000000L)) {
				 throw new InvalidPhoneException("Enter 10 digit phone number");
			}else FactoryClass.getDAO().register(occupation, dob, gender, username, userid, email, password, firstname, lastname,
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
