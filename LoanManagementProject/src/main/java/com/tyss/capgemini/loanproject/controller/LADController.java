package com.tyss.capgemini.loanproject.controller;

import java.util.Scanner;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import com.tyss.capgemini.loanproject.dao.DAODeclaration;
import com.tyss.capgemini.loanproject.dao.DAOImplementation;

public class LADController {
	public void ladController() {
		Logger logger = LogManager.getLogger(LADController.class);
		DAODeclaration daoDeclaration = new DAOImplementation();
		Scanner scanner = new Scanner(System.in);
		logger.info("Loan Approval Department:");
		logger.info("1> View all loan programs: ");
		logger.info("2> View loan applications:" );
		logger.info("3> Application review: ");
		int ch = scanner.nextInt();
		scanner.nextLine();
		switch (ch) {
		case 1:
			daoDeclaration.viewLoanPrograms();
			break;
		
		case 2:
			logger.info("Enter the loan plan of applications:- ");
			String planString = scanner.nextLine();
			daoDeclaration.ladViewForms(planString);
			break;
		
		case 3:
			logger.info("Requested forms:-");
			daoDeclaration.requestedForms();
			logger.info("enter the ApplicationId for review: ");
			String apid = scanner.nextLine();
			logger.info("enter the status: ");
			String status =scanner.nextLine();
			daoDeclaration.ladReviewForms(apid, status);
			
		default:
			break;
		}
		scanner.close();
	}
}
