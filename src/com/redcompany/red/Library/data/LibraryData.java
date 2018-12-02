package com.redcompany.red.Library.data;

import com.redcompany.red.Library.dao.BookDao;
import com.redcompany.red.Library.dao.collection.BookDaoCollectionImpl;
import com.redcompany.red.Library.entity.Catalog;
import com.redcompany.red.Library.entity.Library;
import com.redcompany.red.Library.service.impl.RegularLibraryServiceImpl;

import java.util.ArrayList;
import java.util.List;

public class LibraryData  implements  LibraryCommand{

    private Library library;
    private List<Library> libraryList = new ArrayList<Library>();


//    RegularLibraryServiceImpl regularLibraryService = new RegularLibraryServiceImpl();
//    private BookDao bookDao = new BookDaoCollectionImpl();
//    private Catalog catalog = new Catalog();


    public LibraryData() {
       library = createNewLibrary();
       addLibraryToLibraryList(library);
    }



    public Library createNewLibrary(){
       return this.library = new Library();
    }

    private void addLibraryToLibraryList(Library library){
        libraryList.add(library);
    }


    public List<Library> getLibraryList() {
        return libraryList;
    }


}
