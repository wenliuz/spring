package com.wenliuz.aop.after;

import com.wenliuz.aop.service.OtherService;
import com.wenliuz.aop.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by wenliu on 2017/6/7.
 */
public class AfterTest {

    @Test
    public void testAfter(){
        // 创建Spring容器
        ApplicationContext ctx = new
                ClassPathXmlApplicationContext("aop/after.xml");
        UserService userService = ctx.getBean("userServiceImpl1" , UserService.class);
        userService.foo();
        userService.addUser("悟空" , "7788");
        OtherService otherService = ctx.getBean("otherService",OtherService.class);
        otherService.bar();
    }
}
