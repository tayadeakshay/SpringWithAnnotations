package com.pro.wings;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAspect {
	
	@Before("execution(* com.pro.wings.StdService.*(..))")
	public void beforeMethod()
	{
		System.out.println("Before Aspect executed");
	}
}
