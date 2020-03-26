package com.tyss.capgemini.loanproject.controller;


import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import com.tyss.capgemini.loanproject.factory.FactoryClass;

public class LADController {
	public static void ladController() {
		Logger logger = LogManager.getLogger(LADController.class);
		boolean exit = false;
		while (exit != true) {
			logger.info("Loan Approval Department:");
			logger.info("1> View all Home loan programs: ");
			logger.info("2> View loan applications:");
			logger.info("3> Application review: ");
			logger.info("4> Logout");
			logger.info("Enter your choice: ");
			int ch = Login.scanner.nextInt();
			Login.scanner.nextLine();
			switch (ch) {
			case 1:
				FactoryClass.getLadServices().viewLoanPrograms();
				break;

			case 2:
				logger.info("Enter the loan plan of applications:- ");
				String planString = Login.scanner.nextLine();
				FactoryClass.getLadServices().ladViewForms(planString);
				break;

			case 3:
				logger.info("Requested forms:-");
				FactoryClass.getLadServices().requestedForms();
				logger.info("enter the ApplicationId for review: ");
				String apid = Login.scanner.nextLine();
				logger.info("enter the status: ");
				String status = Login.scanner.nextLine();
				FactoryClass.getLadServices().ladReviewForms(apid, status);
				break;
			case 4:
				exit = true;
				break;
			default:
				break;
			}
		}
	}
}
