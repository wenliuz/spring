package com.wenliuz.aop.before.service.impl;

import com.wenliuz.aop.before.service.OtherService;
import org.springframework.stereotype.Component;

/**
 * Created by wenliu on 2017/6/6.
 */
@Component("otherService")
public class OtherServiceImpl implements OtherService {
    /**
     * 模拟逻辑方法
     */
    public void bar() {
        System.out.println("执行bar方法");

    }
}
