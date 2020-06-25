package com.tyss.javacloud.loanproject.controller;


import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import com.tyss.javacloud.loanproject.exceptions.DateLimitException;
import com.tyss.javacloud.loanproject.exceptions.InvalidDataException;
import com.tyss.javacloud.loanproject.factory.FactoryClass;
import com.tyss.javacloud.loanproject.validation.ValidationClass;


public class CustomerController {

	public static void custController(String custUsername) {
		
		ValidationClass validationClass = new ValidationClass();
		Logger logger = LogManager.getLogger(CustomerController.class);
		boolean exit = false;
		boolean count = false;

		while (exit != true) {
			logger.info("=============================");
			logger.info("||   Customer Operations   ||");
			logger.info("=============================");
			logger.info("1> Loan Programs:");
			logger.info("2> Apply for loan: ");
			logger.info("3> change password: ");
			logger.info("4> View Details: ");
			logger.info("5> View Applications");
			logger.info("6> Logout");
			logger.info("Enter your choice: ");
			String choice = Login.scanner.nextLine();
			switch (choice) {
			case "1":
				FactoryClass.getCustomerServices().viewLoanPrograms();
				break;

			case "2":
				String applicationId = null;
				String accountNo = null;
				String email = null;
				String applicantFirstName = null;
				String applicantMiddleName = null;
				String applicantLastName = null;
				String coapplicantFirstName = null;
				String coapplicantMiddleName = null;
				String coapplicantLastName = null;
				String dateOfBirth = null;
				String loanChoice1 = null;
				String branchCode = null;
				String branchName = null;
				String loanAmount = null;
				String m = null;
				try {
					applicationId = FactoryClass.getCustomerServices().autoGenerateId();

					email = FactoryClass.getCustomerServices().fetchMail(custUsername);
					
					while(count == false ) {
						logger.info("enter the Bank account number: ");
						accountNo = Login.scanner.nextLine();
						try {
							if (validationClass.alphaNumValid(accountNo) == false) {
								throw new InvalidDataException("enter valid account number!!!");
							} else {
								count = true;
							}
						} catch (Exception e) {
							logger.info(e.getMessage());
						}}
					count = false;
					applicantFirstName = FactoryClass.getCustomerServices().fetchFirstName(custUsername);
					applicantMiddleName = "_";
					applicantLastName = FactoryClass.getCustomerServices().fetchLastName(custUsername);
					boolean count1 = false;
					while(count1 == false) {
						boolean flag = false;
						while(flag == false) {
						logger.info("Enter co-applicant?");
						logger.info("1>Yes        2>No");
						try {
							m = Login.scanner.nextLine();
							if (validationClass.numMismatch1(m)== false) {
								throw new InvalidDataException("Enter only numbers!!!");
							} else {
								flag = true;
							}
						} catch (Exception e) {
							logger.info(e.getMessage());
						}
						}
						flag = false;
						switch (m) {
						case "1":
							boolean count3 = false;
							while(count3 == false ) {
								logger.info("enter the Co-Applicant First Name: ");
								coapplicantFirstName = Login.scanner.nextLine();
								try {
									if (validationClass.nameValid(coapplicantFirstName) == false) {
										throw new InvalidDataException("enter letters only!!!");
									} else {
										count3 = true;
									}
								} catch (Exception e) {
									logger.info(e.getMessage());
								}}
							count3 = false;
							while(count3 == false ) {
								logger.info("enter the Co-Applicant's Middle Name: ");
								coapplicantMiddleName = Login.scanner.nextLine();
								try {
									if (validationClass.nameValid(coapplicantMiddleName) == false) {
										throw new InvalidDataException("enter letters only!!!");
									} else {
										count3 = true;
									}
								} catch (Exception e) {
									logger.info(e.getMessage());
								}}
							count3 = false;
							while(count3 == false ) {
								logger.info("enter the Co-Applicant's Last Name");
								coapplicantLastName = Login.scanner.nextLine();
								try {
									if (validationClass.nameValid(coapplicantLastName) == false) {
										throw new InvalidDataException("Enter letters only!!!");
									} else {
										count3 = true;
									}
								} catch (Exception e) {
									logger.info(e.getMessage());
								}}
							count3 = false;
							count1 = true;
							break;
						case "2":
							count1 = true;
							break;
						default:
							logger.info("Invalid option!!!");
							break;
						}
					}
					count1 = false;
					count = false;
					while(count == false ) {
						logger.info("enter the Date of Birth: ");
						dateOfBirth = Login.scanner.nextLine();
						try {
							if (validationClass.dateValid(dateOfBirth) == false) {
								throw new DateLimitException("enter correct format only (DD/MM/YYYY)");
							} else {
								count = true;
							}
						} catch (Exception e) {
							logger.info(e.getMessage());
						}}

					count = false;
					while(count == false ) {
						logger.info("enter the Loan Type");
						logger.info("Available loans :-");
						FactoryClass.getCustomerServices().loanTypes();
						int loanChoice = Login.scanner.nextInt();
						Login.scanner.nextLine();
						loanChoice1 = FactoryClass.getCustomerServices().loanTypes(loanChoice);
						if (loanChoice1 == null) {
							logger.info("incorrect choice, choose again please!!!");
						} else {
							count = true;
						}
					}
					count = false;
					while(count == false ) {
						logger.info("enter the Branch Code");
						branchCode = Login.scanner.nextLine();
						if (validationClass.alphaNumValid(branchCode) == false) {
							logger.info("Please enter only numbers");
							count = false;
						} else {
							count = true;
						} }
					count = false;
					while(count == false ) {
						logger.info("enter the Branch Name");
						branchName = Login.scanner.nextLine();
						if (validationClass.nameValid(branchName) == false) {
							logger.info("Please enter only letters");
							count = false;
						} else {
							count = true;
						} }
					count = false;
					while(count == false) {
						logger.info("Enter the Loan amount");
						loanAmount = Login.scanner.nextLine();
						Double doubleLoan = null;
						try {
							if (validationClass.numMismatch1(loanAmount) == false) {
								throw new InvalidDataException("Please enter valid data or amount (numbers) between 20000-800000!!!");
							} else {
								doubleLoan = Double.parseDouble(loanAmount);
								if (doubleLoan < 20000 || doubleLoan >800000) {
									throw new InvalidDataException("Please enter valid data or amount (numbers) between 20000-800000!!!");
								} else {
									count = true;
								}
							}
						} catch (Exception e) {
							logger.info(e.getMessage());
						}
					}
					count = false;	
					while(count == false) {
						logger.info("1>SUBMIT"  );
						logger.info("2>CANCEL");
						logger.info("Choose one...");
						String ch19 = Login.scanner.nextLine();
						switch (ch19) {
						case "1":
							FactoryClass.getCustomerServices().loanApplicationForm(applicationId, accountNo, email, applicantFirstName,
									applicantMiddleName, applicantLastName, dateOfBirth, coapplicantFirstName, coapplicantMiddleName,
									coapplicantLastName, loanChoice1, branchCode, branchName, loanAmount);
							count = true;
							break;
						case "2":
							logger.info("Cancelled");
							count = true;
						default:
							logger.info("invalid option");
							break;
						}
					}

				} catch (Exception e) {
					logger.info(e.getMessage());
				}
				count = false;
				break;

			case "3":
				while(count == false) {
				try {
					logger.info("enter the new password: ");
					String newPass = Login.scanner.nextLine();
					if (FactoryClass.getCustomerServices().changePassword(custUsername, newPass)) {
						count = true;
					}
				} catch (Exception e) {
					logger.info(e.getMessage());
				}
				}
				count = false;
				
				break;

			case "4":
				FactoryClass.getCustomerDao().viewDetails(custUsername);
				break;

			case "5":
				FactoryClass.getCustomerServices().viewApplications(custUsername);
				break;

			case "6":
				exit = true;
				break;   

			default:
				logger.info("Invalid Option");
				break;
			}
		}
	}
}
