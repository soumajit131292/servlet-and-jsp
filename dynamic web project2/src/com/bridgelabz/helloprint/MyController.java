package com.bridgelabz.helloprint;

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
	
	
}
