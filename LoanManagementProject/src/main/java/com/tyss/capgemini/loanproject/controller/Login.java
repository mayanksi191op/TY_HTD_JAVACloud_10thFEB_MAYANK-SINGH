package com.tyss.capgemini.loanproject.controller;

import java.util.Scanner;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import com.tyss.capgemini.loanproject.factory.FactoryClass;
import com.tyss.capgemini.loanproject.repository.Repository;

public class Login {
	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		Repository.UserTable();
		boolean exit = false;
		Logger logger = LogManager.getLogger(Login.class);
		while (exit != true) {
			//Scanner scanner = new Scanner(System.in);
			logger.info("**************** WELCOME ****************");
			logger.info("1> Login as Customer?");
			logger.info("2> Login as Employee?");
			logger.info("3> New user? Register");
			logger.info("4> Exit");
			int choice = scanner.nextInt();
			scanner.nextLine();
			switch (choice) {
			case 1:
				logger.info("-----CUSTOMER LOGIN-----");
				logger.info("Enter the Id:-");
				String custId = scanner.nextLine();
				logger.info("Enter the Password:-");
				String custPass = scanner.nextLine();
				FactoryClass.getServices().custLogin(custId, custPass);
				break;

			case 2:
				logger.info("-----EMPLOYEE LOGIN-----");
				logger.info("Enter the Id:-");
				String empid = scanner.nextLine();
				logger.info("Enter the Password:-");
				String empPass = scanner.nextLine();
				FactoryClass.getServices().empLogin(empid, empPass);
				break;

			case 3:

				break;

			case 4:
				exit = true;
				logger.info("ending...");
				scanner.close();
				break;
			default:
				logger.info("Wrong choice. Enter again");
				break;
			}
		}
	}
}
