package com.wenliuz.base.impl;

import com.wenliuz.base.Axe;
import com.wenliuz.base.Person;
import org.springframework.stereotype.Component;


@Component
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