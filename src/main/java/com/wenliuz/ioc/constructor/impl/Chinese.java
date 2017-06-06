package com.wenliuz.ioc.constructor.impl;


import com.wenliuz.ioc.constructor.Axe;
import com.wenliuz.ioc.constructor.Person;

public class Chinese implements Person
{
	private Axe axe;
	public Chinese(Axe axe)
	{
		System.out.println("初始化Chinese");
		this.axe = axe;
	}
	public void useAxe()
	{
		System.out.println(axe.chop());
	}
}