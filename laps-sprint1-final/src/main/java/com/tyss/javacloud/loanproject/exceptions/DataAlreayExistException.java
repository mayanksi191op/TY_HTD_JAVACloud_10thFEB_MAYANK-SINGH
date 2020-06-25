package com.tyss.javacloud.loanproject.exceptions;

@SuppressWarnings("serial")
public class DataAlreayExistException extends RuntimeException{
	public DataAlreayExistException(String message) {
		super(message);
	}
}
