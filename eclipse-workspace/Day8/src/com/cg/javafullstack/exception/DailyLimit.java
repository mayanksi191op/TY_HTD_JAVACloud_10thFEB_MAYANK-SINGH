package com.cg.javafullstack.exception;

public class DailyLimit extends RuntimeException {
	
	private String message ="You are crossing daily limit of 10k ";
	
	public DailyLimit()
	{
		
	}
	
	public DailyLimit(String message)
	{
		this.message=message;
	}
	
	public String getMessage()
	{
		return message;
	}

}
