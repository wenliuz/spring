package com.wenliuz.aop.afterThrowing;

import com.wenliuz.aop.service.OtherService;
import com.wenliuz.aop.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by wenliu on 2017/6/7.
 */
public class AfterThrowingTest {

    @Test
    public void testAfterThrowing(){
        // 创建Spring容器
        ApplicationContext ctx = new
                ClassPathXmlApplicationContext("aop/afterThrowing.xml");
        UserService userService = ctx.getBean("userServiceImpl" , UserService.class);
        userService.foo();
        userService.addUser("悟空" , "7788");
        OtherService otherService = ctx.getBean("otherService",OtherService.class);
        otherService.bar();
    }
}
