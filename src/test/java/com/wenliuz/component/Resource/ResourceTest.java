package com.wenliuz.component.Resource;

import com.wenliuz.component.resource.Person;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ResourceTest
{

	/**
	 * 测试resources注解
	 */
	@Test
	public void testResource(){
		ApplicationContext ctx = new
				ClassPathXmlApplicationContext("component/resource.xml");
		Person person = ctx.getBean("chinese" , Person.class);
		person.useAxe();
	}
}