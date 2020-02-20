package com.ynks.text;

import java.lang.reflect.Method;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
public class MyArround implements MethodInterceptor{
	@Override
	public Object invoke(MethodInvocation arg0) throws Throwable {
		System.out.println("环绕-前置通知");
		//放行 执行切点方法
		Object object = arg0.proceed();
		System.out.println("环绕-后置通知");
		return object;
	}
}
