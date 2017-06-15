package com.wenliuz.cache;

import com.wenliuz.cache.entity.User;
import com.wenliuz.cache.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SimpleTest
{

	@Test
	public void testSimple(){
		ApplicationContext ctx =
				new ClassPathXmlApplicationContext("cache/simple.xml");
		UserService us = ctx.getBean("userService" , UserService.class);
		// 第一次调用us对象的方法时会执行该方法，并缓存方法的结果
		User u1 = us.getUsersByNameAndAge("孙悟空", 500);
		// 第二次调用us对象的方法时直接利用缓存的数据，并不真正执行该方法
		User u2 = us.getAnotherUser("孙悟空", 500);
		System.out.println(u1 == u2); // 输出true
	}
}
