package com.redcompany.red.Library.controller.command.impl;

import com.redcompany.red.Library.controller.command.BasicCommand;
import com.redcompany.red.Library.entity.Book;
import com.redcompany.red.Library.entity.Catalog;
import com.redcompany.red.Library.service.CatalogService;
import com.redcompany.red.Library.service.impl.RegularCatalogServiceImpl;

import java.util.Map;

public class ViewSingleCatalogRowCommand implements BasicCommand {

    private CatalogService catalogService;

    @Override
    // add params method
    public void performAction(Map<String, Object> param) {


        catalogService = new RegularCatalogServiceImpl();
        Catalog catalog = catalogService.listCatalog();
        //book id hardcode
        Book book  = catalog.getSingleRow(2);

        System.out.println(book);
    }
}
