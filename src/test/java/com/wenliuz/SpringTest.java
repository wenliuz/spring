package com.wenliuz;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.*;


public class SpringTest

{

	@Test
	public void testI18N(){
		ApplicationContext ctx = new ClassPathXmlApplicationContext("i18n/beans.xml");
		String hello = ctx.getMessage("hello",new String[]{"哈哈哈"},Locale.getDefault());
		String now = ctx.getMessage("now",new Object[]{new Date()},Locale.getDefault());
		System.out.println(hello);
		System.out.println(now);

	}
}