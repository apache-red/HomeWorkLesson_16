package com.redcompany.red.Library.controller.command.impl;

import com.redcompany.red.Library.controller.command.BasicCommand;
import com.redcompany.red.Library.entity.Catalog;
import com.redcompany.red.Library.service.CatalogService;
import com.redcompany.red.Library.service.impl.RegularCatalogServiceImpl;

import java.util.Map;

public class ViewBookCatalogCommand implements BasicCommand {

    private CatalogService catalogService;

    @Override
    public void performAction(Map<String, Object> param) {
// bad code ! use factory

        catalogService = new RegularCatalogServiceImpl();
        Catalog catalog = catalogService.listCatalog();

        // move to other layer
        System.out.println(catalog);
    }
}
