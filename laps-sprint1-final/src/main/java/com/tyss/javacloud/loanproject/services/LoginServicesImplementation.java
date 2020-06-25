package com.tyss.javacloud.loanproject.services;

import com.tyss.javacloud.loanproject.exceptions.InvalidCredentialException;
import com.tyss.javacloud.loanproject.exceptions.InvalidDateFormatException;
import com.tyss.javacloud.loanproject.exceptions.InvalidEmailException;
import com.tyss.javacloud.loanproject.exceptions.InvalidPasswordException;
import com.tyss.javacloud.loanproject.exceptions.InvalidUsernameException;
import com.tyss.javacloud.loanproject.factory.FactoryClass;
import com.tyss.javacloud.loanproject.repository.Repository;
import com.tyss.javacloud.loanproject.validation.ValidationClass;

public class LoginServicesImplementation implements LoginServicesDeclaration {
	ValidationClass validationClass = new ValidationClass();

	/**
	 * @param String customerUsername,
	 * @param String customerPassword
	 * @return true is customer log in successfully, false otherwise
	 */
	@Override
	public boolean custLogin(String custUsername, String custPass) {
		int count = 0;
		for (int i = 0; i < Repository.CUSTOMER_LIST.size(); i++) {
			if ((custUsername.equals(Repository.CUSTOMER_LIST.get(i).get("username"))
					&& (custPass.equals(Repository.CUSTOMER_LIST.get(i).get("password"))))) {
				count++;
				FactoryClass.getLoginDao().custLogin(custUsername, custPass);
				return true;
			}
		}
		if (count == 0) {
			throw new InvalidCredentialException("Enter correct username and password");
		}
		return false;
	}

	/**
	 * @param String employeeUsername,
	 * @param String employeePassword
	 * @return true is customer log in successfully, false otherwise
	 */
	@Override
	public boolean empLogin(String empUsername, String empPass) {
		int count = 0;
		for (int i = 0; i < Repository.EMPLOYEE_LIST.size(); i++) {
			if ((empUsername.equals(Repository.EMPLOYEE_LIST.get(i).get("username"))
					&& (empPass.equals(Repository.EMPLOYEE_LIST.get(i).get("password"))))) {
				count++;
				FactoryClass.getLoginDao().empLogin(empUsername, empPass);
				return true;
			}
		}
		if (count == 0) {
			throw new InvalidCredentialException("Enter correct username and password");
		}
		return false;
	}

	/**
	 *@param String occupation,
	 *@param String dob,
	 *@param String gender,
	 *@param String userName,
	 *@param String userId,
	 *@param String email,
	 *@param String password,
	 *@param String firstName,
	 *@param String lastName,
	 *@param long phone,
	 *@param double accountBalance
	 */
	@Override
	public boolean register(String occupation, String dob, String gender, String username, String email,
			String password, String firstname, String lastname, long phone, double accountBal) {
		if (validationClass.usernameValid(username)) {
			if (validationClass.passValid(password)) {
				if (validationClass.mailValid(email)) {
						if ((phone > 6000000000L) || (phone < 1000000000L)) {
							FactoryClass.getLoginDao().register(occupation, dob, gender, username,  email,
									password, firstname, lastname, phone, accountBal);
							return true;
					} else
						throw new InvalidDateFormatException("Enter correct date format (DD/MM/YYYY).");
				} else
					throw new InvalidEmailException("Enter correct email format");
			} else
				throw new InvalidPasswordException("Enter correct password format");
		} else
			throw new InvalidUsernameException("Enter correct format");
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
}
