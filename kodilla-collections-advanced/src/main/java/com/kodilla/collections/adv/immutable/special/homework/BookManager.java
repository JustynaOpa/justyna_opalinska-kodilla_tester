package com.kodilla.collections.adv.immutable.special.homework;

import java.util.HashSet;
import java.util.Set;

public class BookManager {
    Set<Book> books = new HashSet<>();


    public Book createBook(Book newBook) {
        return createBook(newBook.getTitle(), newBook.getAuthor());
    }

    public Book createBook(String title, String author) {
        boolean alreadyIs = false;
        Book newBook = null;

        for (Book book : books) {
            if(book.getAuthor().equals(author) && book.getTitle().equals(title)) {
                alreadyIs = true;
            }
        }

        newBook = new Book(title, author);

        if(alreadyIs == false) {
            books.add(newBook);
        }

        return newBook;
    }


    public static boolean compare(Book book1, Book book2)
    {
        if(book1.getTitle().equals(book2.getTitle()) && book1.getAuthor().equals(book2.getAuthor()))
            return true;
        else
            return false;
    }
}
