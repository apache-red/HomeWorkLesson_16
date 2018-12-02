package com.redcompany.red.Library.service.impl;

import com.redcompany.red.Library.data.LibraryData;

import com.redcompany.red.Library.entity.Library;
import com.redcompany.red.Library.service.CatalogService;
import com.redcompany.red.Library.service.LibraryService;

import java.util.List;


public class RegularLibraryServiceImpl implements LibraryService {

    private LibraryData libraryData;
    private CatalogService catalogService;


    @Override
    public LibraryData getLibrary() {


        return libraryData;
    }
}
