package com.ynks.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.ynks.pojo.Student;

public interface StudentMapper {
		@Select("select * from student")
		 List<Student> selAll();
}
