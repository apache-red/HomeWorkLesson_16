package com.redcompany.red.Library.dao.collection;

import com.redcompany.red.Library.dao.BookDao;
import com.redcompany.red.Library.entity.Book;

import java.util.ArrayList;
import java.util.List;

public class BookDaoCollectionImpl implements BookDao {

   private List<Book> books = new ArrayList<Book>(5);
   private int id =1;

    @Override
    public List<Book> getBooks() {
        books.add(new Book(id, "Book1"));
        books.add(new Book(++id, "Book2"));
        books.add(new Book(++id, "Book3"));
        books.add(new Book(++id, "Book4"));
        books.add(new Book(++id, "Book5"));

        return books;
    }

    @Override
    public void addBook() {
        books.add(new Book(++id,"Book"+id));
    }


}
