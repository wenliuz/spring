package com.wenliuz.ioc.constructor;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by wenliu on 2017/6/2.
 */
public class TestConstructor {

    @Test
    public void testConstructor(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("ioc/constructor/beans.xml");
        Person p = ctx.getBean("chinese",Person.class);
        p.useAxe();

    }
}
