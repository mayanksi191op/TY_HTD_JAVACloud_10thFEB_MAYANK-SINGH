package com.cg.javafullstack.exception;

public class AgeValidator {
	void validate(int age) throws InvalidAgeException
	{
		if(age<18)
		{
			throw new InvalidAgeException();
			//throw new InvalidAgeException("You cant enter");
		}
	}

}
