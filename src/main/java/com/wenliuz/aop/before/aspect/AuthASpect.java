package com.wenliuz.aop.before.aspect;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * 定义一个切面
 * Created by wenliu on 2017/6/6.
 */
@Aspect
public class AuthASpect {

    @Before("execution(* com.wenliuz.aop.before.service.*.*(..))")
    public void authority(){
        System.out.println("模拟权限检查");
    }
}
