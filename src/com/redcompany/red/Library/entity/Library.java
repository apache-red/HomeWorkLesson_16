package com.redcompany.red.Library.entity;

import java.util.ArrayList;
import java.util.List;

public class Library {

    private List<Catalog> catalogs;


    public Library() {
        this.catalogs = new ArrayList<Catalog>();
    }


    public void addCatalogToCatalogList(Catalog catalog){
        catalogs.add(catalog);
    }


    public List<Catalog> getCatalogs() {
        return catalogs;
    }

    public void setCatalogs(List<Catalog> catalogs) {
        this.catalogs = catalogs;
    }
}
