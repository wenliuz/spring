package com.wenliuz.aop.before;

import com.wenliuz.aop.before.service.OtherService;
import com.wenliuz.aop.before.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by wenliu on 2017/6/7.
 */
public class BeforeTest {

    @Test
    public void testBefore(){
        // 创建Spring容器
        ApplicationContext ctx = new
                ClassPathXmlApplicationContext("aop/before.xml");
        UserService userService = ctx.getBean("userService" , UserService.class);
        userService.foo();
        userService.addUser("孙悟空" , "7788");
        OtherService otherService = ctx.getBean("otherService",OtherService.class);
        otherService.bar();
    }
}
