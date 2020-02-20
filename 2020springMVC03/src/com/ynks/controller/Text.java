package com.ynks.controller;

import java.lang.ProcessBuilder.Redirect;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Text {
	@RequestMapping("/Text")
    public String Text(HttpServletRequest req,HttpServletResponse resp, HttpSession sen,Map<String,Object> map,Model model) {
		req.setAttribute("request", "我是request");
		 HttpSession session = req.getSession();
		 session.setAttribute("reqetsession", "我是request.get的session");
		 sen.setAttribute("session", "我是session参数自己设置的");
		 ServletContext application = req.getServletContext();
		 application.setAttribute("application", "我是application,我不能用参数创建我只能用req或sen获取");
		 map.put("map", "我是map我会被springmvc转换后直接使用");
		  model.addAttribute("model", "我是model springmvc特有的 我其实是request");
		 return"9Text.jsp";
	}
	@RequestMapping("/Text2")
	public ModelAndView	Text2() {
		ModelAndView mav=new ModelAndView("9Text.jsp");
		mav.addObject("mav", "我是ModelAndView我自己能传值能跳转");
		return mav;
	}
}
