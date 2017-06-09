package com.wenliuz.beans;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by wenliu on 2017/6/1.
 */
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations = "classpath:before.xml")
public class Testbeans {

    @Test
    public void testBeans() {
        // 创建Spring容器
        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans/beans.xml");
        Person p= ctx.getBean("person",Person.class);
        // 调用useAxe()方法
        p.useAxe();


    }

}
