package com.wenliuz.aop.service.impl;

import com.wenliuz.aop.service.OtherService;
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
