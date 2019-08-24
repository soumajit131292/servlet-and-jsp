package com.bridgelabz.helloprint;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MyController {

	@RequestMapping(value="/",method=RequestMethod.GET)
	public String print()
	{
		return "hello";
	}
	@RequestMapping("MyControllerServlet")
	public String method(HttpServletRequest request)
	{
		String name=request.getParameter("firstname");
		request.setAttribute("firstname", name);
		return "view";
	}
	
	
}
