package com.car;

public class Car extends Engine
{
	int count;
	public void Drive() 
	{
		int count=super.start();
		if(count>=1)
		{
		System.out.println("Journey Started");
		}
		else
		{
			System.out.println("Engine not started");
		}
	}
	public static void main(String[] args) {
//		Engine e=new Engine();
//		int count=e.start();
//		
		Car c=new Car();
		c.Drive();
		
	}
}
