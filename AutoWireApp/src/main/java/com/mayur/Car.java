package com.mayur;

public class Car {
	public Car()
	{
		System.out.println("Car : Constructor");
	}
	
	private DieselEngine d;
	public void setD(DieselEngine d) {
		this.d = d;
	}
	
	public void drive()
	{
		int start=d.start();
		if(start>0)
		{
			System.out.println("Journey started....");
		}
		else {
			System.out.println("Engine not started.....");
		}
	}
}
