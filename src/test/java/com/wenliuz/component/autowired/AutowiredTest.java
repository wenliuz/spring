package com.wenliuz.component.autowired;

import com.wenliuz.component.autowired.entity.Item;
import com.wenliuz.component.autowired.entity.User;
import com.wenliuz.component.autowired.service.ItemService;
import com.wenliuz.component.autowired.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class AutowiredTest
{

	/**
	 * 测试@autowired注解
	 */
	@Test
	public void testAutowired(){
		ApplicationContext ctx = new
				ClassPathXmlApplicationContext("component/autowired.xml");
		UserService us = ctx.getBean("userService", UserService.class);
		us.addEntity(new User());
		ItemService is = ctx.getBean("itemService", ItemService.class);
		is.addEntity(new Item());
	}
}