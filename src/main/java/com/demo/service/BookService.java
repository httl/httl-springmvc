package com.demo.service;

import java.util.List;

import com.demo.domain.Book;

public interface BookService {

	List<Book> findBooks() throws Exception;

}
