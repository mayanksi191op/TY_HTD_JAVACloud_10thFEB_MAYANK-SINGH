package com.tyss.capgemini.loanproject.controller;

import java.util.Scanner;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import com.tyss.capgemini.loanproject.dao.DAODeclaration;
import com.tyss.capgemini.loanproject.dao.DAOImplementation;
import com.tyss.capgemini.loanproject.repository.Repository;

public class AdminController {
	public static void adminCont() {
		Repository.UserTable();
		DAODeclaration daoDeclaration = new DAOImplementation();
		Scanner scanner = new Scanner(System.in);
		Logger logger = LogManager.getLogger(AdminController.class);
		System.out.println("Admin Operations");
		logger.info("Admin Operations");
		logger.info("1> Loan Programs: ");
		logger.info("2> Client Manager ");
		logger.info("3> Loan Reports: ");
		int ch = scanner.nextInt();
		scanner.nextLine();
		switch (ch) {
		case 1:
			// logger.info("Admin Operations");
			logger.info("1> Insert in Loan programs: ");
			logger.info("2> Delete in Loan programs: ");
			logger.info("3> Update in Loan programs: ");
			logger.info("4> View the loan programs: ");
			logger.info("enter the choice: ");
			int choice = scanner.nextInt();
			scanner.nextLine();

			switch (choice) {
			case 1:
				logger.info("Enter the Loan Type: ");
				String type = scanner.nextLine();
				logger.info("enter the Time period: ");
				String time = scanner.nextLine();
				logger.info("enter the Interest rates: ");
				String rates = scanner.nextLine();
				daoDeclaration.insertLoan(type, time, rates);
				break;

			case 2:
				logger.info("enter the loan type you want to delete: ");
				String loantype = scanner.nextLine();
				daoDeclaration.deleteLoan(loantype);
				break;

			case 3:
				logger.info("enter the loan type: ");
				String typechoice = scanner.nextLine();
				logger.info(typechoice);
				logger.info("what detail you want to update?");
				logger.info("1> Type ");
				logger.info("2> Time-Period");
				logger.info("3> Interest-Rates");
				logger.info("enter choice:-");
				int choice2 = scanner.nextInt();
				scanner.nextLine();
				logger.info("enter the new value: ");
				String choice3 = scanner.nextLine();
				daoDeclaration.loanUpdate(typechoice, choice2, choice3);
				break;

			case 4:
				daoDeclaration.viewLoanPrograms();
				break;

			default:
				System.out.println("Wrong choice.");
				break;
			}
			break;
			
		case 2:
			System.out.println("1> Add Clients: ");
			System.out.println("2> View Clients");
			System.out.println("Choose one:-");
			int ch3=scanner.nextInt();
			scanner.nextLine();
			switch (ch3) {
			case 1:
				System.out.println("Enter the applicationId of client you want to add: ");
				String appidString = scanner.nextLine();
				daoDeclaration.addClients(appidString);
				
				break;
			case 2:
				System.out.println("Clients:-");
				daoDeclaration.viewClients();
				break;

			default:
				break;
			}
			break;
			
		case 3:
			System.out.println("Which report do you want to check: ");
			System.out.println("1> Approved reports");
			System.out.println("2> Rejected reports");
			System.out.println("3> Requested reports");
			int ch2 = scanner.nextInt();
			scanner.nextLine();
			switch (ch2) {
			case 1:
				logger.info("Approved application report:-");
				daoDeclaration.approvedForms();
				break;

			case 2:
				logger.info("Rejected application report:-");
				daoDeclaration.rejectedForms();
				break;

			case 3:
				logger.info("Requested application report:-");
				daoDeclaration.requestedForms();
			default:
				logger.info("noooo");
				break;
			}
			break;
	
		default:
			logger.info("nooooooo2");
			break;
		}
		scanner.close();
	}
}
