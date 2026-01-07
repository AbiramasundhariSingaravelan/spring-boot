package com.example.demo.exception;

public class ProductNotFoundException extends Exception{

	public ProductNotFoundException(int id)
	{
		
		super("Product Not found with the mentioned id");
	}
}	

