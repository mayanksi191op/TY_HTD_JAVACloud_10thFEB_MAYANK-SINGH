package com.tyss.capgemini.loanproject.controller;

import java.util.Scanner;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import com.tyss.capgemini.loanproject.dao.DAOImplementation;
import com.tyss.capgemini.loanproject.repository.Repository;

public class Login {
	public static void main(String[] args) {
		Repository.UserTable();
		DAOImplementation implementation = new DAOImplementation();
		Scanner scanner = new Scanner(System.in);
		Logger logger = LogManager.getLogger(Login.class);
		logger.info("enter the id");
		String userid = scanner.nextLine();
		logger.info("enter the pass");
		String password = scanner.nextLine();
		
		implementation.login(userid, password);
		scanner.close();
	}
}
