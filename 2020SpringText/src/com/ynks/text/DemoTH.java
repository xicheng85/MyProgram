package com.ynks.text;

import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component("DTH")
public class DemoTH {
	//设置切点
	@Pointcut("execution(* com.ynks.text.DemoTH.TH())")
	//@Pointcut("execution(* A")
		 public void TH() {
			   System.out.println("TH");
		}
}
