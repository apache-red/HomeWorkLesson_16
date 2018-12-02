package com.redcompany.red.Library.controller.command.impl;

import com.redcompany.red.Library.controller.command.BasicCommand;
import com.redcompany.red.Library.controller.console.view.ResultConsoleView;
import com.redcompany.red.Library.data.LibraryCommand;
import com.redcompany.red.Library.data.LibraryData;
import com.redcompany.red.Library.entity.Catalog;
import com.redcompany.red.Library.entity.Library;
import com.redcompany.red.Library.service.CatalogService;
import com.redcompany.red.Library.service.LibraryService;
import com.redcompany.red.Library.service.impl.RegularCatalogServiceImpl;
import com.redcompany.red.Library.service.impl.RegularLibraryServiceImpl;

import java.util.List;
import java.util.Map;

public class ViewBookLibraryCommand implements BasicCommand {

    private LibraryService libraryService;
    private List<Catalog> catalogList;
    private Library library;
    private Catalog catalog;

    @Override
    public void performAction(Map<String, Object> param, LibraryCommand libraryCommand) {
// bad code ! use factory


        libraryService = new RegularLibraryServiceImpl();
        System.out.println();
        library = libraryCommand.getLibrary();
        catalogList = library.getCatalogs();
        //hardcode
        catalog = catalogList.get(0);
        ResultConsoleView.showResult(catalog);



        //System.out.println(libraryList.size());


       // Library library = libraryService.


//        catalogService = new RegularCatalogServiceImpl();
//        Catalog catalog = catalogService.listCatalog();
//
//        // move to other layer
//        System.out.println(catalog);
    }
}
