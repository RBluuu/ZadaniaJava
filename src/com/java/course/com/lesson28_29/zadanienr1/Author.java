package com.java.course.com.lesson28_29.zadanienr1;

import java.util.ArrayList;
import java.util.List;

public class Author {
    //id|imie|nazwisko
    //1,Jan,Kowalski
    private String id;
    private String firstName;
    private String lastName;
    private List<Book> books = new ArrayList<>();

    public Author(String id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void addBook(Book book) {
        if (book == null || book.getAuthor() != null) {
            return;
        }
        book.setAuthor(this);
        this.getBooks().add(book);
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Author{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
