package com.example.demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.example.demo.model.ErrorResponse;

@RestControllerAdvice
public class GlobalExceptionHandler {

	public ResponseEntity<ErrorResponse> handleProductNotFound(ProductNotFoundException e)
	{
		ErrorResponse error=new ErrorResponse(HttpStatus.NOT_FOUND.value(),e.getMessage());
		
		return new ResponseEntity<ErrorResponse>(error,HttpStatus.NOT_FOUND);
	}
	public String printData()
	{
		String abc="text";
		return abc;
	}
}
