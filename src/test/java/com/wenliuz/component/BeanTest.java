package com.wenliuz.component;

import org.junit.Test;
import org.springframework.context.*;
import org.springframework.context.support.*;

public class BeanTest
{
	@Test
	public void test(){
		ApplicationContext ctx = new
				ClassPathXmlApplicationContext("component/beans.xml");

		System.out.println("--------------" +
				java.util.Arrays.toString(ctx.getBeanDefinitionNames()));
	}
}