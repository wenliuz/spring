package com.wenliuz.ioc.setter.impl;


import com.wenliuz.ioc.setter.Axe;
import com.wenliuz.ioc.setter.Person;

public class Chinese implements Person
{
	private Axe axe;
	public void setAxe(Axe axe)
	{
		this.axe = axe;
	}

	public void useAxe()
	{
		System.out.println(axe.chop());
	}
}