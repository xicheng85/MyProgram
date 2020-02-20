package com.ynks.controller;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
@Controller
public class Upload {
	@RequestMapping("/upload")
	 public String upload(MultipartFile file,String name,HttpServletRequest req ) throws IOException {
		   String filename = file.getOriginalFilename();
		   String substring = filename.substring(filename.lastIndexOf("."));
		    if(substring.equals(".png")||substring.equals(".jpg")) {
		    		String uuid = UUID.randomUUID().toString();
		    		String path = req.getServletContext().getRealPath("images");
		    		System.out.println(path);
		    		FileUtils.copyInputStreamToFile(file.getInputStream(), new File(path+"\\"+uuid+".png"));
		    		return "uploadAndDownload.jsp";
		    	}
		    else {
		    	System.out.println("goto error.jsp");
		    	return "error.jsp";	
			}		
		   }
}
