package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/form")
	public String userForm()
	{
		return "form";
	}
	@RequestMapping("/submit")
	public String formData(@ModelAttribute("abc") Customer c, Model m)
	{
		m.addAttribute("abc", c);		
		return "display";
	}
}
