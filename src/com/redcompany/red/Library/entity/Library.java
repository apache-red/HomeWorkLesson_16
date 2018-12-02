package com.redcompany.red.Library.entity;

import java.util.List;

public class Library {

    private List<Catalog> catalogs;


    public List<Catalog> getCatalogs() {
        return catalogs;
    }

    public void setCatalogs(List<Catalog> catalogs) {
        this.catalogs = catalogs;
    }
}
