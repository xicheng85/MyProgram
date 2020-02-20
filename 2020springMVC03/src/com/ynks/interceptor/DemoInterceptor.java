package com.ynks.interceptor;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class DemoInterceptor implements HandlerInterceptor{
	@Override
	public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
	//jsp 执行完成后执行  
	//记录执行过程中出现的异常.  
	//可以把异常记录到日志中
			throws Exception {
		// TODO Auto-generated method stub
		System.out.println(arg3.getMessage());
		 System.out.println("我是springmvc 拦截器的afterCompletion");
	}
	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
	//控制器执行完成,进入到 jsp 之前执行.  
		//日志记录.  
		//敏感词语过滤
			throws Exception {
		// TODO Auto-generated method stub
		 System.out.println("现在往"+arg3.getViewName()+"跳转");
		 
		  System.out.println(arg3.getModel()+":"+arg3.getModel().get("model"));
		  String model = arg3.getModel().get("model").toString();
		  String replace = model.replace("我是", "**");
		  arg3.getModel().put("model", replace);
		 
		 System.out.println("我是springmvc 拦截器的postHandle");
		 
	}
	@Override
	public boolean preHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2) throws Exception {
		//在进入控制器之前执行  
		//如果返回值为 false,阻止进入控制器  
		//控制代码
		System.out.println("arg2:"+arg2);  
		System.out.println("我是springmvc 拦截器的preHandle");
		return true;
	}
}
