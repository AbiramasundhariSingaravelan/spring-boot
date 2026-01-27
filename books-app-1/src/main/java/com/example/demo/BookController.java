package com.example.demo;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/books")
public class BookController {

	private List<Book> books= List.of(new Book(1,"PHP","Arthi",500),
			new  Book(2,"Java","Raveendar",600),
			new  Book(3,"Java","Raveendar",900),new  Book(4,"Java","Raveendar",800));
			
	@RequestMapping("/all")
	public List<Book> getAllBooks() {
		return books;
	}
}

//localhost:8080/books/hello
