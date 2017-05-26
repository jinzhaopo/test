
package com.test.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.test.entry.SaleBean;
import com.test.service.TestService;

@Controller
public class TestController {
	@Resource
	private TestService service;
	@RequestMapping("/test")
	public SaleBean controller(){
		String name="徐荣";
		return service.service(name);
	}
	
	@RequestMapping("/generic/web/page")
	@ResponseBody
	public void pdfController(HttpServletRequest request){
		String str=request.getParameter("pageNumber");
		System.out.println("页数为："+request.getParameter("pageNumber"));
				
	}
	
	@RequestMapping("/generic/web/getPage")
	@ResponseBody
	public int getPageController(){
		return 4;
	}
	
	@RequestMapping("/viewer")
	public String viewerController(){
		System.out.println("1111111111111111111111");
		
		return "/generic/web/viewer.html";
	}
}

