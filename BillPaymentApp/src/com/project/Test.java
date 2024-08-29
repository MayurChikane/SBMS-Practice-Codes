package com.project;

import java.lang.reflect.Field;

public class Test 
{
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchFieldException, SecurityException 
	{
		//Setter Injection
		BillCollector b=new BillCollector();
		b.setPayment(new UpiPayment());
		b.collectpay(1500.00);

		//Constructor Injection
		BillCollector bb=new BillCollector(new CreditCardPayment());
		bb.collectpay(25530.45);
		
		//Field Injection
//		DebitCardPayment d=new DebitCardPayment();
//		b.i=d;
//		b.collectpay(25663);
		
		// Field injection using Reflection API
		Class <?> cc=Class.forName("com.project.BillCollector");
		Object o = cc.newInstance();
		BillCollector bcc=(BillCollector) o;
		Field f=cc.getDeclaredField("i");
		f.setAccessible(true);
		f.set(o, new DebitCardPayment());
		bcc.collectpay(2200);
		
	}
}
