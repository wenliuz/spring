package com.wenliuz.component.autowired.service.impl;

import com.wenliuz.component.autowired.dao.BaseDao;
import com.wenliuz.component.autowired.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;


public class BaseServiceImpl<T> implements BaseService<T>
{
	@Autowired
	private BaseDao<T> dao;

	public void addEntity(T entity)
	{
		System.out.println("调用" + dao
				+ "保存实体：" + entity);
	}
}