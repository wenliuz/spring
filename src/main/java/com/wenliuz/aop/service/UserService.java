package com.wenliuz.aop.service;

/**
 * Created by wenliu on 2017/6/6.
 */
public interface UserService {
    /**
     * 模拟逻辑方法
     */
    public void foo();

    /**
     * 添加用户
     * @param name
     * @param pass
     * @return
     */
    public int addUser(String name, String pass);
}
