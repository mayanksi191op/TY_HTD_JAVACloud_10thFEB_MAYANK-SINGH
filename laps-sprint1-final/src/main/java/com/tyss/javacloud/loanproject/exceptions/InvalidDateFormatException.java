package com.tyss.javacloud.loanproject.exceptions;

@SuppressWarnings("serial")
public class InvalidDateFormatException extends RuntimeException{
	public InvalidDateFormatException(String msg) {
		super(msg);
	}
}
