package com.example.demo.Controllers;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.exception.ProductNotFoundException;
import com.example.demo.model.Product;
import com.example.demo.repository.ProductRepository;

@RestController
public class ProductController {

	@Autowired
	ProductRepository repo;
	@GetMapping("/views/all")
	public List<Product> getAllProducts()
	{
		return repo.findAll();
	}
	@GetMapping("/views/{id}")
	public Product getPdtById(@PathVariable int id) throws ProductNotFoundException
	{
		
		return repo.findById(id).orElseThrow(()->new ProductNotFoundException((id)));
	}
	@PostMapping("/add")
	public Product addProduct (@RequestBody Product pdt)
	{
		return repo.save(pdt);
	}
	//update/25
	@PutMapping("/update/{id}")
	public Product updateProduct(@PathVariable int id, @RequestBody Product pdt)
	{
		pdt.setId(id);
		
		return repo.save(pdt);
	}
	@PatchMapping("/updatee/{id}")
	public Product updateeProduct(@PathVariable int id, @RequestBody Map<String, Object> newrecord)
	{
		Product p=repo.findById(id).orElseThrow();
		if(newrecord.containsKey("name"))
		{
			p.setName((String)newrecord.get("name"));
		}
		if(newrecord.containsKey("price"))
		{
			p.setPrice((Integer)newrecord.get("price"));
		}
		if(newrecord.containsKey("quantity"))
		{
			p.setQuantity((Integer)newrecord.get("quantity"));
		}
		return repo.save(p);
	}
	@DeleteMapping("/delete/{id}")
	public String delete(@PathVariable int id)
	{
		repo.deleteById(id);
		return "Deleted Successfully";
	}
}
