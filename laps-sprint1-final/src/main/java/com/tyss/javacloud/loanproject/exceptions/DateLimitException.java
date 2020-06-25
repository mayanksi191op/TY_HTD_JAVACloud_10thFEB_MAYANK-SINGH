package com.tyss.javacloud.loanproject.exceptions;

@SuppressWarnings("serial")
public class DateLimitException extends RuntimeException {
	public DateLimitException(String msg) {
		super(msg);
	}
}
