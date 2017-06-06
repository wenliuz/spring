package com.wenliuz.ioc.setter;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by wenliu on 2017/6/2.
 */
public class TestSetter {

    @Test
    public void testSetter(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("ioc/setter/beans.xml");
        Person p = ctx.getBean("chinese",Person.class);
        p.useAxe();

    }
}
