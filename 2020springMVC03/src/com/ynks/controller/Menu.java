package com.ynks.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.websocket.server.PathParam;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ynks.service.MenuService;
import com.ynks.service.impl.MenuServiceImpl;

@Controller
public class Menu {
	@Resource
	 MenuService menuServiceImpl;
	@RequestMapping("/Menu")
	@ResponseBody
     public List<com.ynks.pojo.Menu>  LoadMenu(@RequestParam(defaultValue="0")int leven) {
		List<com.ynks.pojo.Menu> menup = menuServiceImpl.getMenu(1);
		for (com.ynks.pojo.Menu menu2 : menup) {
			 System.out.println(menup);
		}
		return menup ;
     }
	@RequestMapping("/addMenu")
	@ResponseBody
	public  String addMenu(String name,int lid) {
		 
		return name;
	}
}
