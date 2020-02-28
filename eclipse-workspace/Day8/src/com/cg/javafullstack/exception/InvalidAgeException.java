package com.cg.javafullstack.exception;

public class InvalidAgeException extends Exception {

	private String message=("Sorry you are too young");
	
	public InvalidAgeException()
	{
		
	}
	
	public InvalidAgeException(String message)
	{
		this.message=message;
	}
	
	public String getMessage()
	{
		return message;
	}
			
			
}
