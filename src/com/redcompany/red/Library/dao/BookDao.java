package com.redcompany.red.Library.dao;

import com.redcompany.red.Library.entity.Book;

import java.util.List;

public interface BookDao {

List<Book> getBooks();

void addBook();

}
