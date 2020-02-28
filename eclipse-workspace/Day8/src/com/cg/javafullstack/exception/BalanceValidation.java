package com.cg.javafullstack.exception;

public class BalanceValidation {
	void verify(int amount)
	{
		if(amount > 10000)
		{
			throw new DailyLimit("Darling pls withdraw less than 10k");
		}
	}
	

}
