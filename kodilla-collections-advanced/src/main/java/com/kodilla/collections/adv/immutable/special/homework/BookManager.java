package com.kodilla.collections.adv.immutable.special.homework;


import java.util.HashSet;
import java.util.Set;

public class BookManager {


    public Book createBook(String title, String author) {
        Book book = new Book(title, author);

        Set<Book> books = new HashSet<>();
        books.add(new Book("Una", "Big"));
        books.add(new Book("Baba", "Snack"));
        books.add(new Book("Una", "Big"));

        books.add(book);

        return book;


    }


}
