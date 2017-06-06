package com.wenliuz.component.resource.impl;

import com.wenliuz.component.resource.Axe;
import com.wenliuz.component.resource.Person;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;


@Component
public class Chinese implements Person
{
	@Resource(name = "stoneAxe")
	private Axe axe;

	/*@Resource(name="steelAxe")
	public void setAxe(Axe axe)
	{
		this.axe = axe;
	}*/

	public void useAxe()
	{
		System.out.println(axe.chop());
	}
}