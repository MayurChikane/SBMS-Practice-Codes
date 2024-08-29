package com.project;

public class UpiPayment implements Ipayment 
{
	@Override
	public String pay(double amount) {
		return "Payment Successful using UPI";
	}

}
