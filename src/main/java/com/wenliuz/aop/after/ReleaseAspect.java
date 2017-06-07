package com.wenliuz.aop.after;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;


@Aspect
public class ReleaseAspect
{

	//目标方法正常或者异常都会织入
	@After("execution(* com.wenliuz.aop.after.*.*(..))")
	public void release()
	{
		System.out.println("模拟方法结束后的释放资源...");
	}
}



