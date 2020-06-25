package com.tyss.javacloud.loanproject.exceptions;

@SuppressWarnings("serial")
public class LoanExcessException extends RuntimeException {
	public LoanExcessException(String msg) {
		super(msg);
	}
}
