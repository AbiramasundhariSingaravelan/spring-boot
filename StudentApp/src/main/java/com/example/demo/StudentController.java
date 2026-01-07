package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
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
	@RequestMapping("/viewAll")
	@ResponseBody
	public List<Student> getAllStudents()
	{
		return repo.findAll();
	}
	@RequestMapping("/viewById/{id}")
	@ResponseBody
	public Optional<Student> getById(@PathVariable int id)
	{
		return repo.findById(id);
	}
	@RequestMapping("/update/{id}")
	@ResponseBody
	public Student update(@PathVariable int id)
	{
		Optional<Student> s=repo.findById(id);
		if(s.isPresent())
		{
			Student s1=s.get();
			s1.setName("Demo");
			s1.setDept("cse");
			s1.setAge(20);
			repo.save(s1);
			return s1;
		}
		return null;
	}
	@RequestMapping("/delete/{id}")
	@ResponseBody
	public String deleteStudent(@PathVariable int id)
	{
		repo.deleteById(id);
		return "Record Deleted";
	}
	
	
}
