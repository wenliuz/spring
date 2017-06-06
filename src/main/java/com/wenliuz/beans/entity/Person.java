package com.wenliuz.beans.entity;

public class Person
{
	private Axe axe;

	public Person(){
		System.out.println("初始化person");
	}

	public void setAxe(Axe axe)
	{
		System.out.println("调用set方法");
		this.axe = axe;
	}
	public void useAxe()
	{
		System.out.println("我打算去砍点柴");

		System.out.println(axe.chop());
	}
}
