package com.sahil.mvc;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class MVC implements Controller
{
	@Override
	public ModelAndView handleRequest(HttpServletRequest req,HttpServletResponse resp) throws Exception 
	{
		String name =req.getParameter("name");
		String Email=req.getParameter("email");
		String password =req.getParameter("password");
		
		
		Map m  =new HashMap();
		m.put("msg","hi your details are : "+name+"  "+"  "+Email+"  "+password);
		return new ModelAndView("success",m);
	}
}
