package com.tyss.capgemini.loanproject.dao;

import java.util.HashMap;
import java.util.LinkedHashMap;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import com.tyss.capgemini.loanproject.controller.AdminController;
import com.tyss.capgemini.loanproject.controller.CustomerController;
import com.tyss.capgemini.loanproject.controller.LADController;
import com.tyss.capgemini.loanproject.exceptions.InvalidCredentialException;
import com.tyss.capgemini.loanproject.repository.Repository;

public class LoginDaoImplementation implements LoginDaoDeclaration {
	Logger logger = LogManager.getLogger(DAOImplementation.class);
	Repository repo = new Repository();

	@Override
	public void custLogin(String custUsername, String custPass) {

		int count = 0;
		if (Repository.customerList.isEmpty() != true) {
			for (int i = 0; i < Repository.customerList.size(); i++) {
				if (Repository.customerList.get(i).get("username").equals(custUsername)
						&& Repository.customerList.get(i).get("password").equals(custPass)) {
					count++;
					if (Repository.customerList.get(i).get("role").equals("customer")) {
						logger.info("--------WELCOME " + custUsername + "---------");
						CustomerController.custController(custUsername);
					}
					break;
				}
			}
			if (count == 0) {
				throw new InvalidCredentialException(
						"Invalid Credentials entered. Please enter username/password correctly.");
			}
		} else
			System.out.println("XXXX No Users available XXXX");
	}
	
	@Override
	public void empLogin(String empUsername, String empPass) {
		int count = 0;
		if (Repository.employeeList.isEmpty() != true) {
			for (int i = 0; i < Repository.employeeList.size(); i++) {
				if (Repository.employeeList.get(i).get("username").equals(empUsername)
						&& Repository.employeeList.get(i).get("password").equals(empPass)) {
					count++;
					if (Repository.employeeList.get(i).get("role").equals("admin")) {
						logger.info("--------WELCOME " + empUsername + "--------");
						AdminController.adminCont();
					} else
						logger.info("--------WELCOME " + empUsername + "--------");
					LADController.ladController();
					break;
				}
			}
			if (count == 0) {
				throw new InvalidCredentialException(
						"Invalid Credentials entered. Please enter username/password correctly.");
			}
		} else
			System.out.println("XXXX No users available XXXX");
	}
	
	@Override
	public void register(String occupation, String dob, String gender, String username, String userid, String email,
			String password, String firstname, String lastname, long phone, double accountBal) {
		HashMap<String, Object> regHashMap = new LinkedHashMap<String, Object>();
		regHashMap.put("userid", userid);
		regHashMap.put("password", password);
		regHashMap.put("username", username);
		regHashMap.put("email", email);
		regHashMap.put("firstname", firstname);
		regHashMap.put("lastname", lastname);
		regHashMap.put("phone", phone);
		regHashMap.put("AccountBal", accountBal);
		regHashMap.put("role", "customer");
		regHashMap.put("loanAmount", 0);
		Repository.customerList.add(regHashMap);
		Repository.mainList.add(regHashMap);
	}
}
