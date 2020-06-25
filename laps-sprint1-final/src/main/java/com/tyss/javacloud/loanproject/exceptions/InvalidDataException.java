package com.tyss.javacloud.loanproject.exceptions;

@SuppressWarnings("serial")
public class InvalidDataException extends RuntimeException{
	public InvalidDataException(String message) {
		super(message);
	}
}
