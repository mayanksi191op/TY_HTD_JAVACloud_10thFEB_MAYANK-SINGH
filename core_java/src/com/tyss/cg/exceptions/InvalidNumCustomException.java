package com.tyss.cg.exceptions;

//@SuppressWarnings("serial")   :- to suppress warnings.
public class InvalidNumCustomException extends RuntimeException {   //if used only exception we'll have to use throws.
	public InvalidNumCustomException(String message) {
		System.err.println(message);
	}
}
