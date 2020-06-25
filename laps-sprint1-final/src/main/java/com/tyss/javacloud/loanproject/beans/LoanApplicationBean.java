package com.tyss.javacloud.loanproject.beans;

import java.io.Serializable;

import lombok.Data;

@Data
@SuppressWarnings("serial")
public class LoanApplicationBean implements Serializable {
	
	private String applicationId;
	private String email;
	private String loanType;
	private String timePeriod;
	private String accountNo;
	private String applicantFirstName;
	private String applicantMiddleName;
	private String applicantLastName;
	private String coapplicantFirstName;
	private String coapplicantMiddleName;
	private String coapplicantLastName;
	private String dateOfBirth;
	private String loanChoice;
	private String branchCode;
	private String branchName;
	private String loanAmount;
	private String formStatus;
	
}
