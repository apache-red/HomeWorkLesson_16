package com.redcompany.red.Library.controller.command.impl;

import com.redcompany.red.Library.controller.command.BasicCommand;
import com.redcompany.red.Library.data.LibraryCommand;

import com.redcompany.red.Library.entity.Book;
import com.redcompany.red.Library.entity.Catalog;
import com.redcompany.red.Library.service.CatalogService;
import com.redcompany.red.Library.service.impl.RegularCatalogServiceImpl;

import java.util.Map;

public class ViewBookFindByTitleCommand implements BasicCommand {

    private CatalogService catalogService;


    @Override
    public void performAction(Map<String, Object> param,  LibraryCommand libraryCommand) {

        System.out.println(param);

        catalogService = new RegularCatalogServiceImpl();
        Catalog catalog = catalogService.listCatalog();
        //hardcode
        Book book = catalog.getFindTitle("Book2");
        System.out.println(book);

    }


}
