package com.project;

public class DebitCardPayment implements Ipayment
{
	@Override
	public String pay(double amount) {
		return "Payment successful using debit card";
	}
}
