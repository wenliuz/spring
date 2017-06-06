package com.wenliuz.component.autowired.dao.impl;

import com.wenliuz.component.autowired.dao.BaseDao;

public class BaseDaoImpl<T> implements BaseDao<T>
{
	public void save(T e)
	{
		System.out.println("程序保存对象：" + e);
	}
}
