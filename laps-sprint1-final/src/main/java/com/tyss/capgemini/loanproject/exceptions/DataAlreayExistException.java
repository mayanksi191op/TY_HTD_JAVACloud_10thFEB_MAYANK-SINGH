package com.tyss.capgemini.loanproject.exceptions;

@SuppressWarnings("serial")
public class DataAlreayExistException extends RuntimeException{
	public DataAlreayExistException(String message) {
		super(message);
	}
}
