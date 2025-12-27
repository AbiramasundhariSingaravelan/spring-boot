package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class StudentController {

	@Autowired
	StudentRepository repo;
	@RequestMapping("/add")
	public String createStudent()
	{
		return "form";
	}
	@RequestMapping("/addData")
	@ResponseBody
	public Student addData(@RequestParam("id") int id, @RequestParam("name") String name, @RequestParam("dept") String dept, @RequestParam("age") int age,Model m)
	{
		/*m.addAttribute("id",id);
		m.addAttribute("name",name);
		m.addAttribute("age",age);
		m.addAttribute("dept",dept);*/
		
		Student s=new Student();
		s.setId(id);
		s.setName(name);
		s.setDept(dept);
		s.setAge(age);
		 return repo.save(s);
	}
}
