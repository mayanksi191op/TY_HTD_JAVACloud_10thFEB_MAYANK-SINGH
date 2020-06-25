package com.tyss.javacloud.loanproject.exceptions;


@SuppressWarnings("serial")
public class InsufficientBalanceException extends RuntimeException {
	public InsufficientBalanceException(String msg) {
		super(msg);
	}
}
