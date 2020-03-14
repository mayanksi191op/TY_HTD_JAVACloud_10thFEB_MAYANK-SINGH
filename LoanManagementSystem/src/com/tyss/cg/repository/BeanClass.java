package com.tyss.cg.repository;

import java.io.Serializable;

import lombok.Data;

@SuppressWarnings("serial")
@Data
public class BeanClass implements Serializable{
	
	private String username;
	private String userid;
	private String email;
	private String password;
	private String firstname;
	private String lastname;
	private long phone;
	private String role;
	private int loanNo;
	private String loanType;
	private String timePeriod;
	private String interestRates;
	private String accountNo;
	private String applicantFirstName;
	private String applicantMiddleName;
	private String applicantLastName;
	private String coapplicantFirstName;
	private String coapplicantMiddleName;
	private String coapplicantLastName;
	private int loanChoice;
	private String branchCode;
	private String branchName;
	private String openDate;
	private String requestDate;
	
	public BeanClass(String username, String userid, String email, String password, String firstname, String lastname,
			long phone, String role) {
		super();
		this.username = username;
		this.userid = userid;
		this.email = email;
		this.password = password;
		this.firstname = firstname;
		this.lastname = lastname;
		this.phone = phone;
		this.role = role;
	}

	public BeanClass(int loanNo, String loanType, String timePeriod, String interestRates) {
		super();
		this.loanNo = loanNo;
		this.loanType = loanType;
		this.timePeriod = timePeriod;
		this.interestRates = interestRates;
	}

	public BeanClass(String accountNo, String applicantFirstName, String applicantMiddleName, String applicantLastName,
			String coapplicantFirstName, String coapplicantMiddleName, String coapplicantLastName,
			int loanChoice, String branchCode, String branchName, String openDate, String requestDate) {
		super();
		this.accountNo = accountNo;
		this.applicantFirstName = applicantFirstName;
		this.applicantMiddleName = applicantMiddleName;
		this.applicantLastName = applicantLastName;
		this.coapplicantFirstName = coapplicantFirstName;
		this.coapplicantMiddleName = coapplicantMiddleName;
		this.coapplicantLastName = coapplicantLastName;
		this.loanChoice = loanChoice;
		this.branchCode = branchCode;
		this.branchName = branchName;
		this.openDate = openDate;
		this.requestDate = requestDate;
	}
	
	
	
}
