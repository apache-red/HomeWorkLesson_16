package com.redcompany.red.Library.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Catalog {


    private String responsiblePerson;
    private Date creationData;
    private List<Book> books;


    public Catalog() {
        books = new ArrayList<>();
        creationData = new Date();
    }


    public String getResponsiblePerson() {
        return responsiblePerson;
    }

    public Catalog setResponsiblePerson(String responsiblePerson) {
        this.responsiblePerson = responsiblePerson;
        return this;
    }

    public Date getCreationData() {
        return creationData;
    }

    public Catalog setCreationData(Date creationData) {
        this.creationData = creationData;
        return this;
    }

    public List<Book> getBooks() {
        return books;
    }

    public Catalog setBooks(List<Book> books) {
        this.books = books;
        return this;
    }




    @Override
    public String toString() {
        return "Catalog{" +
                "responsiblePerson='" + responsiblePerson + '\'' +
                ", creationData=" + creationData +
                ", books=" + books +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Catalog catalog = (Catalog) o;

        if (responsiblePerson != null ? !responsiblePerson.equals(catalog.responsiblePerson) : catalog.responsiblePerson != null)
            return false;
        if (creationData != null ? !creationData.equals(catalog.creationData) : catalog.creationData != null)
            return false;
        return books != null ? books.equals(catalog.books) : catalog.books == null;
    }

    @Override
    public int hashCode() {
        int result = responsiblePerson != null ? responsiblePerson.hashCode() : 0;
        result = 31 * result + (creationData != null ? creationData.hashCode() : 0);
        result = 31 * result + (books != null ? books.hashCode() : 0);
        return result;
    }

    public Book getSingleRow(int row) {
        if (books !=null){
            return books.get(row);
        }else return null;
    }
}
