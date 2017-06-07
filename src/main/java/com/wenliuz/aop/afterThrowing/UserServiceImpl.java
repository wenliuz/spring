package com.wenliuz.aop.afterThrowing;

import com.wenliuz.aop.service.UserService;
import org.springframework.stereotype.Component;

/**
 * Created by wenliu on 2017/6/6.
 */
@Component("userServiceImpl")
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
        if(name.length() < 3 || name.length() > 10)
        {
            throw new IllegalArgumentException("name参数的长度必须大于3，小于10！");
        }
        return 1;
    }
}
