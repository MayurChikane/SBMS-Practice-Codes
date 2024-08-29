package com.project;

public class CreditCardPayment implements Ipayment
{
	@Override
	public String pay(double amount) 
	{
		return "Payment successfull using credit card";
	}
	
}
