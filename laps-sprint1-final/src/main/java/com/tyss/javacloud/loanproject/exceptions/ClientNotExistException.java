package com.tyss.javacloud.loanproject.exceptions;

@SuppressWarnings("serial")
public class ClientNotExistException extends RuntimeException{
	public ClientNotExistException(String msg) {
		super(msg);
	}
}
