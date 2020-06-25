package com.tyss.javacloud.loanproject.exceptions;

@SuppressWarnings("serial")
public class InvalidPhoneException extends RuntimeException {
	public InvalidPhoneException(String msg) {
		super(msg);
	}
}
