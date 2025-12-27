package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

	@RequestMapping("/form")
	public String userForm()
	{
		return "form";
	}
	@RequestMapping("/submit")
	public String formData(@RequestParam("username") String uname, @RequestParam("productname") String productname, @RequestParam("quantity") String quantity, @RequestParam("price") String price, Model m)
	{
		m.addAttribute("username", uname);
		m.addAttribute("productname", productname);
		m.addAttribute("quantity", quantity);
		m.addAttribute("price", price);
		
		return "display";
	}
}
