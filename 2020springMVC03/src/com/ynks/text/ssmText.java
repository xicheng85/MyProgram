package com.ynks.text;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ynks.pojo.Menu;
import com.ynks.service.MenuService;
import com.ynks.service.impl.MenuServiceImpl;

public class ssmText {
   public static void main(String[] args) {
	    ApplicationContext ac=new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
	    String[] beanDefinitionNames = ac.getBeanDefinitionNames();
	    for (String string : beanDefinitionNames) {
			 System.out.println(string);
		}
	   MenuServiceImpl bean = ac.getBean(MenuServiceImpl.class);
	   List<Menu> menu = bean.getMenu(1);
	   for (Menu menu2 : menu) {
		 System.out.println(menu2);
	}
	    
}
}
