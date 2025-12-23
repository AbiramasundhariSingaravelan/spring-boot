package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String hello()
	{
		return "hello";//jsp name
	}
	@RequestMapping("/home")
	public String display()
	{
		return "home";
	}
}
//prefix = folder and suffix = .jsp
