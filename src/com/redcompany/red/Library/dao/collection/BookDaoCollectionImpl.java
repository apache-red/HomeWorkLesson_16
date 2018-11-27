package com.redcompany.red.Library.dao.collection;

import com.redcompany.red.Library.dao.BookDao;
import com.redcompany.red.Library.entity.Book;

import java.util.ArrayList;
import java.util.List;

public class BookDaoCollectionImpl implements BookDao {

    @Override
    public List<Book> getBooks() {
        List<Book> books = new ArrayList<Book>(5);
        books.add(new Book(1, "Book1"));
        books.add(new Book(2, "Book2"));
        books.add(new Book(3, "Book3"));
        books.add(new Book(4, "Book4"));
        books.add(new Book(5, "Book5"));

        return books;
    }





}
