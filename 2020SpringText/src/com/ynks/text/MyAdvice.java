package com.ynks.text;

import org.aspectj.lang.ProceedingJoinPoint;

public class MyAdvice {
	public void MyBefore() {
			 System.out.println("AspectJ 前置通知");
	}
	public void MyAfter() {
		 System.out.println("AspectJ 后置通知");
	}
	public void MyAftering() {
		 System.out.println("AspectJ 后置通知ing");
	}
	public void MyThrow() {
		 System.out.println("AspectJ 异常通知");
	}
	public  Object MyArround(ProceedingJoinPoint p) throws Throwable {
		 System.out.println("AspectJ 环绕通知");
		 System.out.println("AspectJ 环绕前置通知");
		 Object proceed = p.proceed();
		 System.out.println("AspectJ 环绕后置通知");
		 return proceed;
	}
}
