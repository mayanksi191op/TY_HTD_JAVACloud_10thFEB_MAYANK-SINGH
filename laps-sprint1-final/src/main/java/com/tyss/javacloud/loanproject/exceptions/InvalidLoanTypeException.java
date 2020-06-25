package com.tyss.javacloud.loanproject.exceptions;

@SuppressWarnings("serial")
public class InvalidLoanTypeException extends RuntimeException {
	public InvalidLoanTypeException(String msg) {
		super(msg);
	}
}
