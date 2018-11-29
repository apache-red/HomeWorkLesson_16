package com.redcompany.red.Library.controller.command.impl;

import com.redcompany.red.Library.controller.command.BasicCommand;
import com.redcompany.red.Library.dao.BookDao;
import com.redcompany.red.Library.entity.Book;
import com.redcompany.red.Library.entity.Catalog;
import com.redcompany.red.Library.service.CatalogService;
import com.redcompany.red.Library.service.impl.RegularCatalogServiceImpl;

import java.util.Map;

public class AddNewBookToCatalogCommand implements BasicCommand {

    private CatalogService catalogService;
    private BookDao bookDao;

    @Override
    public void performAction(Map<String, Object> param) {

        catalogService = new RegularCatalogServiceImpl();
        Catalog catalog = catalogService.listCatalog();
        ((RegularCatalogServiceImpl) catalogService).addBookToCatalog();
        System.out.println(catalog);




    }


}
