package com.redcompany.red.Library.data;

import com.redcompany.red.Library.dao.BookDao;
import com.redcompany.red.Library.dao.collection.BookDaoCollectionImpl;
import com.redcompany.red.Library.entity.Book;
import com.redcompany.red.Library.entity.Catalog;
import com.redcompany.red.Library.entity.Library;
import com.redcompany.red.Library.service.impl.RegularLibraryServiceImpl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LibraryData  implements  LibraryCommand{

    private Library library;
    private List<Catalog> catalogList = new ArrayList<>();


    public LibraryData() {
       library = createNewLibrary();

    }

    public Library createNewLibrary(){
        this.library = new Library();
        Catalog catalog = new Catalog();
        catalog.setResponsiblePerson("Ivan Ivanov");
        catalog.setCreationData(new Date());
        List<Book> books = new ArrayList<>();
        books.add(new Book(1, "Book1"));
        books.add(new Book(2, "Book2"));
        books.add(new Book(3, "Book3"));
        books.add(new Book(4, "Book4"));
        books.add(new Book(5, "Book5"));
        catalog.setBooks(books);
        library.addCatalogToCatalogList(catalog);
       return library;


    }


    @Override
    public Library getLibrary() {
        return library;
    }
}
