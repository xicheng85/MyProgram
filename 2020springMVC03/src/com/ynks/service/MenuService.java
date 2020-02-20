package com.ynks.service;

import java.util.List;

import com.ynks.pojo.Menu;

public interface MenuService {
	public  List<Menu> getMenu(int lid); 
	public int addMenu(Menu mu);
}
