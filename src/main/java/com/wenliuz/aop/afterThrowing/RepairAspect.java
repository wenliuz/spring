package com.wenliuz.aop.afterThrowing;

import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;


@Aspect
public class RepairAspect
{

	// 声明ex时指定的类型会限制目标方法必须抛出指定类型的异常
	// 此处将ex的类型声明为Throwable，意味着对目标方法抛出的异常不加限制
	@AfterThrowing(throwing="ex"
		, pointcut="execution(* com.wenliuz.aop.afterThrowing.*.*(..))")

	public void doRecoveryActions(Throwable ex)
	{
		System.out.println("目标方法中抛出的异常:" + ex);
		System.out.println("模拟Advice对异常的修复...");
	}
}


