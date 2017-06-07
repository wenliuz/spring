package com.wenliuz.aop.service.impl;

import com.wenliuz.aop.service.UserService;
import org.springframework.stereotype.Component;

/**
 * Created by wenliu on 2017/6/6.
 */
@Component("userService")
public class UserServiceImpl implements UserService {


    /**
     * 模拟逻辑方法
     */
    public void foo() {
        System.out.println("执行foo方法");

    }

    /**
     * 添加用户
     *
     * @param name
     * @param pass
     * @return
     */
    public int addUser(String name, String pass) {
        System.out.println("执行添加用户方法:"+name);
        return 1;
    }
}
