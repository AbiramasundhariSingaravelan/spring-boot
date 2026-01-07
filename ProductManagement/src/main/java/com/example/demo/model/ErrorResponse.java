package com.example.demo.model;

public class ErrorResponse {

	private int status;//404
	private String message;//data not found
	public ErrorResponse(int status, String message) {
		super();
		this.status = status;
		this.message = message;
	}
	
}
