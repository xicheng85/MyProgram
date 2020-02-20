package com.ynks.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ynks.mapper.MenuManage;
import com.ynks.pojo.Menu;
import com.ynks.service.MenuService;
@Service
public class MenuServiceImpl implements MenuService {
	@Resource
	MenuManage menuManage;
	@Override
	public List<Menu> getMenu(int lid) {
		// TODO Auto-generated method stub
		return menuManage.selMenu(lid);
	}

	@Override
	public int addMenu(Menu mu) {
		// TODO Auto-generated method stub
		return 0;
	}

}
