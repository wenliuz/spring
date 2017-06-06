package com.wenliuz.expression;

import java.util.Date;

public class Person
{
	private Integer id;
	private String name;
	private Date birth;

	public Person()
	{
	}
	public Person(Integer id , String name , Date birth)
	{
		this.id = id;
		this.name = name;
		this.birth = birth;
	}

	public void setId(Integer id)
	{
		this.id = id;
	}
	public Integer getId()
	{
		return this.id;
	}

	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return this.name;
	}

	public void setBirth(Date birth)
	{
		this.birth = birth;
	}
	public Date getBirth()
	{
		return this.birth;
	}
}