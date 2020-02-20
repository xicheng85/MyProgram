package com.ynks.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import com.ynks.pojo.Menu;

public interface MenuManage {
	@Select("select * from menu where lid=#{lid}")
   public  List<Menu> selMenu(int lid); 
	@Insert("insert into menu values(default,#{name},#{lid})")
	public int insMenu(Menu mu);

}
