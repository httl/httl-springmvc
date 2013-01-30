package com.demo.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.demo.service.BookService;

@Controller  
public class BooksController {

	private BookService bookService;

	public void setBookService(BookService bookService) {
		this.bookService = bookService;
	}

	@RequestMapping("/books")
	public String books(Map<String, Object> context) throws Exception {
		context.put("books", bookService.findBooks());
		return "books.httl";
	}

}
