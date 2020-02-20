package com.ynks.text;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class MyBeforeAdvice implements MethodBeforeAdvice  {
	@Override
	public void before(Method arg0, Object[] arg1, Object arg2) throws Throwable {
		  System.out.println("切点方法名称:"+arg0.getName());
		  if(arg1.length>1) {
			   System.out.println("有参数:"+arg1[0]);
		  }
		  System.out.println("切点方法类："+arg2);
		  System.out.println("我是前置通知");
	}
}
