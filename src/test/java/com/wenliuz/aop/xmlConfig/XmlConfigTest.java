package com.wenliuz.aop.xmlConfig;

import com.wenliuz.aop.service.OtherService;
import com.wenliuz.aop.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class XmlConfigTest
{

	@Test
	public void testConfig(){
		ApplicationContext ctx = new
				ClassPathXmlApplicationContext("aop/xmlConfig.xml");
		UserService userService = ctx.getBean("userService",UserService.class);
		userService.foo();
		System.out.println("addUser()的返回值为："
				+ userService.addUser("孙悟空" , "7788"));
		OtherService otherService = ctx.getBean("otherService" , OtherService.class);
		otherService.bar();
	}
}