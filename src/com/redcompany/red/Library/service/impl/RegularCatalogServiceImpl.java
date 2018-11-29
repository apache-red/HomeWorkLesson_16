package com.redcompany.red.Library.service.impl;

import com.redcompany.red.Library.dao.BookDao;
import com.redcompany.red.Library.dao.collection.BookDaoCollectionImpl;
import com.redcompany.red.Library.entity.Book;
import com.redcompany.red.Library.entity.Catalog;
import com.redcompany.red.Library.service.CatalogService;

import java.util.Date;
import java.util.List;

public class RegularCatalogServiceImpl  implements CatalogService{


    private  BookDao bookDao = new BookDaoCollectionImpl();
    private Catalog catalog = new Catalog();

    @Override
    public Catalog listCatalog() {
        catalog.setResponsiblePerson("Ivan Ivanov");
        catalog.setCreationData(new Date());
        // bad code !!!!!!!!! Use factory1. Hardcode!Fix later
        List<Book> books = bookDao.getBooks();
        catalog.setBooks(books);

        return catalog;

    }

    public Catalog addBookToCatalog(){
        bookDao.addBook();
        return catalog;
    }




}
