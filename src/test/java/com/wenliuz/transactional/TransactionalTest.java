package com.wenliuz.transactional;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TransactionalTest
{
	@Test
	public void testTransactional(){
		// 创建Spring容器
		ApplicationContext ctx = new
				ClassPathXmlApplicationContext("transactional/transactional.xml");
		// 获取事务代理Bean
		NewsDao dao = (NewsDao)ctx
				.getBean("newsDao" , NewsDao.class);
		// 执行插入操作
		dao.insert("疯狂Java" , "轻量级Java EE企业应用实战");
	}
}
