package com.ynks.servlet;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.ynks.mapper.StudentMapper;
@WebServlet("/stu")
public class SpringText extends HttpServlet {
	 StudentMapper bean;
	@Override
	public void init() throws ServletException {

		  ServletContext servletContext = getServletContext();
		  System.out.println(servletContext);
		  ApplicationContext wac = WebApplicationContextUtils.getRequiredWebApplicationContext(getServletContext());
		    bean = wac.getBean("studentMapper",StudentMapper.class);
	}
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		   req.setAttribute("list", bean.selAll());
		   req.getRequestDispatcher("/index.jsp").forward(req, resp);
	}
}
