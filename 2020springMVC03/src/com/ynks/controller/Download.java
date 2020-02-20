package com.ynks.controller;

import java.io.File;
import java.io.IOException;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class Download {
	@RequestMapping("/download")
		 public void download(String filename,HttpServletResponse resp,HttpServletRequest req) throws IOException {
		//注意这里有坑 千万别有空格否则不好使 如果设置对了 是不管什么都下载的 不会直接用浏览器打开
		   resp.setHeader("Content-Disposition","attachment;filename="+filename);
		String realPath = req.getServletContext().getRealPath("file");
		System.out.println(realPath);
		 File file=new File(realPath, filename);
		 byte[] fileB = FileUtils.readFileToByteArray(file);
		 ServletOutputStream outputStream = resp.getOutputStream();
		 outputStream.write(fileB);
		 outputStream.flush();
		 outputStream.close();	 
		}
}
