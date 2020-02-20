package com.ynks.text;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ynks.mapper.StudentMapper;
import com.ynks.pojo.A;
import com.ynks.pojo.Student;

public class SpringText {

	public static void main(String[] args) {
		// Student st =new Student();
		// spring 创建对象
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		Student stu = ac.getBean("stu", Student.class);
		System.out.println(stu);

		// 实例工程创建 学生类子类对象A
		A stuA = ac.getBean("stuA", A.class);
		System.out.println(stuA);
		// 静态工程创建 学生类 对象stuC
		Student stuC = ac.getBean("stuC", Student.class);
		System.out.println(stuC);

		// spring 获取容器中所有对象
		String[] names = ac.getBeanDefinitionNames();
		for (String string : names) {
			System.out.println(string);
		}
		StudentMapper mapper = ac.getBean("studentMapper", StudentMapper.class);
		List<Student> selAll = mapper.selAll();
		System.out.println(selAll);

//					 Demo de=new Demo();
//					 de.demo1();
//					 de.demo2();
//					 de.demo3();
		Demo bean = ac.getBean("demo", Demo.class);
		try {
			bean.demo1();
		} catch (Exception e) {
			// TODO: handle exception
		}
	
		bean.demo2();
		bean.demo3();
		System.out.println("============================");
		DemoT beant = ac.getBean("deomT", DemoT.class);
		beant.dO();
		System.out.println("============================");
		DemoTH DTH = ac.getBean("DTH",DemoTH.class);
		DTH.TH();
	}

}
