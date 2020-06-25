package com.tyss.javacloud.loanproject.exceptions;

@SuppressWarnings("serial")
public class InvalidUsernameException extends RuntimeException {
	public InvalidUsernameException(String msg) {
		super(msg);
	}
}
