package com.kodilla.collections.adv.immutable.special.homework;

import java.util.HashSet;
import java.util.Set;

public class BookManager {
    Set<Book> books = new HashSet<>();


    public Set<Book> createBook(String title, String author) {
        Book book = new Book(title, author);

        Set<Book> create = new HashSet<>();
        for (Book book1 : create) {
            if (book1.equals(createBook(title, author)))
                create.add(book);
        }
            return create;





    }
}
