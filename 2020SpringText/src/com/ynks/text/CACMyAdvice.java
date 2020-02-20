package com.ynks.text;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import jdk.jfr.Threshold;
@Component()
@Aspect()
public class CACMyAdvice {
	@Before("com.ynks.text.DemoTH.TH()")
	public void MyBefore() {
			 System.out.println("AspectJ 基于注解的 前置通知");
	}
	@After("com.ynks.text.DemoTH.TH()")
	public void MyAfter() {
		 System.out.println("AspectJ  基于注解的 后置通知");
	}
	public void MyAftering() {
		 System.out.println("AspectJ 基于注解的 后置通知ing");
	}
	@AfterThrowing("com.ynks.text.DemoTH.TH()")
	public void MyThrow() {
		 System.out.println("AspectJ 基于注解的 异常通知");
	}
	@Around("com.ynks.text.DemoTH.TH()")
	public  Object MyArround(ProceedingJoinPoint p) throws Throwable {
		 System.out.println("AspectJ 基于注解的 环绕通知");
		 System.out.println("AspectJ 基于注解的 环绕前置通知");
		 Object proceed = p.proceed();
		 System.out.println("AspectJ基于注解的 环绕后置通知");
		 return proceed;
	}
}
