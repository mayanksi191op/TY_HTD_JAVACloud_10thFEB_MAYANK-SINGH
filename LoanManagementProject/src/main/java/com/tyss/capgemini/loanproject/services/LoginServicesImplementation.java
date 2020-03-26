package com.tyss.capgemini.loanproject.services;

import com.tyss.capgemini.loanproject.exceptions.DateLimitException;
import com.tyss.capgemini.loanproject.exceptions.InvalidCredentialException;
import com.tyss.capgemini.loanproject.exceptions.InvalidEmailException;
import com.tyss.capgemini.loanproject.exceptions.InvalidPasswordException;
import com.tyss.capgemini.loanproject.exceptions.InvalidPhoneException;
import com.tyss.capgemini.loanproject.exceptions.InvalidUsernameException;
import com.tyss.capgemini.loanproject.factory.FactoryClass;
import com.tyss.capgemini.loanproject.repository.Repository;
import com.tyss.capgemini.loanproject.validation.ValidationClass;

public class LoginServicesImplementation implements LoginServicesDeclaration {
	ValidationClass validationClass = new ValidationClass();

	@Override
	public void custLogin(String custUsername, String custPass) {
		for (int i = 0; i < Repository.customerList.size(); i++) {
			if ((custUsername.equals(Repository.customerList.get(i).get("username")) && (custPass.equals(Repository.customerList.get(i).get("password"))))) {
				FactoryClass.getLoginDao().custLogin(custUsername, custPass);
			} else {
				throw new InvalidCredentialException("Enter correct username and password");
			}
		}
	}

	@Override
	public void empLogin(String empUsername, String empPass) {
		for (int i = 0; i < Repository.employeeList.size(); i++) {
			if ((empUsername.equals(Repository.employeeList.get(i).get("username")) && (empPass.equals(Repository.employeeList.get(i).get("password"))))) {
				FactoryClass.getLoginDao().empLogin(empUsername, empPass);
			} else {
				throw new InvalidCredentialException("Enter correct username and password");
			}
		}
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
			}else FactoryClass.getLoginDao().register(occupation, dob, gender, username, userid, email, password, firstname, lastname,
					phone, accountBal);
	}
}
