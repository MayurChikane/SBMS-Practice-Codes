package com.project;

public class BillCollector 
{
	private Ipayment i;
	
	public void setPayment(Ipayment i)
	{
		this.i=i;
	}
	
	public BillCollector()
	{
		
	}
	
	public BillCollector(Ipayment i) 
	{
		this.i=i;
	}


	public void collectpay(double amount) 
	{
		String status=i.pay(amount);
		System.out.println(status);
	}
}
