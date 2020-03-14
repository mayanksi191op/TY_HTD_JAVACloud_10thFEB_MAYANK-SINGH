package com.tyss.capgemini.loanproject.controller;

import java.util.Scanner;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import com.tyss.capgemini.loanproject.dao.DAOImplementation;
import com.tyss.capgemini.loanproject.repository.Repository;

public class CostomerController {

	public static void custController(String userid) {
		Repository.UserTable();
		Scanner scanner = new Scanner(System.in);
		Logger logger = LogManager.getLogger(CostomerController.class);
		DAOImplementation implementation = new DAOImplementation();
		logger.info("Customer Operations:-");
		logger.info("1> Loan Programs:");
		logger.info("2> Apply for loan: ");
		logger.info("3> change password: ");
		logger.info("4> Check Balance: ");
		logger.info("enter your choice: ");
		int choice = scanner.nextInt();
		scanner.nextLine();

		switch (choice) {
		case 1:
			implementation.viewLoanPrograms();
			break;
		
		case 2:
			logger.info("enter the applicationId: ");
			String applicationId = scanner.nextLine();
			logger.info("enter the loan account number: ");
			String accountNo = scanner.nextLine();
			logger.info("enter the Applicant First Name: ");
			String applicantFirstName = scanner.nextLine();
			logger.info("enter the Middle Name: ");
			String applicantMiddleName = scanner.nextLine();
			logger.info("enter the Last Name");
			String applicantLastName = scanner.nextLine();
			logger.info("enter the Co-Applicant First Name: ");
			String coapplicantFirstName = scanner.nextLine();
			logger.info("enter the Middle Name");
			String coapplicantMiddleName = scanner.nextLine();
			logger.info("enter the Last Name");
			String coapplicantLastName = scanner.nextLine();
			logger.info("enter the Loan Type");
			String loanChoice = scanner.nextLine();
			logger.info("enter the Branch Code");
			String branchCode = scanner.nextLine();
			logger.info("enter the Branch Name");
			String branchName = scanner.nextLine();
			logger.info("enter the open date");
			String openDate = scanner.nextLine();
			logger.info("enter the Request Date");
			String requestDate = scanner.nextLine();
			implementation.loanApplicationForm(applicationId, accountNo, applicantFirstName, applicantMiddleName, applicantLastName,
					coapplicantFirstName, coapplicantMiddleName, coapplicantLastName, loanChoice, branchCode,
					branchName, openDate, requestDate);
			break;
		
		case 3:
			logger.debug("enter the new password: ");
			String newPass = scanner.nextLine();
			implementation.changePassword(userid, newPass);
			break;
			
		case 4:
			implementation.checkBalance(userid);
			
			break;
			
		default:
			break;
		}
		scanner.close();
	}
}
