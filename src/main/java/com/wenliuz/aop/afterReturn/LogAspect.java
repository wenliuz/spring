package com.wenliuz.aop.afterReturn;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class LogAspect
{

	// 声明rvt时指定的类型会限制目标方法必须返回指定类型的值或没有返回值
	// 此处将rvt的类型声明为Object，意味着对目标方法的返回值不加限制
	@AfterReturning(returning="rvt"
		, pointcut="execution(* com.wenliuz.aop.service.*.*(..))")
	public void log(Object rvt)
	{
		System.out.println("获取目标方法返回值:" + rvt);
		System.out.println("模拟记录日志功能...");
	}
}
