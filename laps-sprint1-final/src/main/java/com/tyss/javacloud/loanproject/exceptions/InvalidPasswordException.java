package com.tyss.javacloud.loanproject.exceptions;

@SuppressWarnings("serial")
public class InvalidPasswordException extends RuntimeException {
	public InvalidPasswordException(String msg) {
		super(msg);
	}
}
