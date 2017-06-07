package com.wenliuz.aop.around;

import com.wenliuz.aop.service.OtherService;
import com.wenliuz.aop.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by wenliu on 2017/6/7.
 */
public class AroundTest {

    @Test
    public void testAround(){
        // 创建Spring容器
        ApplicationContext ctx = new
                ClassPathXmlApplicationContext("aop/around.xml");
        UserService userService = ctx.getBean("userService" , UserService.class);
        userService.foo();
        userService.addUser("孙悟空" , "7788");
        OtherService otherService = ctx.getBean("otherService",OtherService.class);
        otherService.bar();
    }
}
