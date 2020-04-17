package com.kodilla.soap_library.repository;

import com.kodilla.books.soap_library.Book;
import com.kodilla.books.soap_library.TypeOfBook;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;


import javax.annotation.PostConstruct;


import java.util.HashMap;
import java.util.Map;

@Component
public class BookRepository {
    private static final Map<String, Book> books = new HashMap<>();

    @PostConstruct
    public void initData(){
        Book bookTolkien = new Book();
        bookTolkien.setTitle("The Lord Of The Rings");
        bookTolkien.setAuthor("J.R.R. Tolkien");
        bookTolkien.setYearOfPublication(1954);
        bookTolkien.setTypeOfBook(TypeOfBook.FANTASY);

        books.put(bookTolkien.getAuthor(), bookTolkien);

        Book bookBaxter = new Book();
        bookBaxter.setTitle("Proxima");
        bookBaxter.setAuthor("Stephen Baxter");
        bookBaxter.setYearOfPublication(2018);
        bookBaxter.setTypeOfBook(TypeOfBook.SCI_FI);

        books.put(bookBaxter.getAuthor(), bookBaxter);

        Book bookChristie = new Book();
        bookChristie.setTitle("Murder on the Orient Express");
        bookChristie.setAuthor("Agatha Christie");
        bookChristie.setYearOfPublication(2013);
        bookChristie.setTypeOfBook(TypeOfBook.CRIME);

        books.put(bookChristie.getAuthor(), bookChristie);

        Book bookAlter = new Book();
        bookAlter.setTitle("Irresistible");
        bookAlter.setAuthor("Adam Alter");
        bookAlter.setYearOfPublication(2015);
        bookAlter.setTypeOfBook(TypeOfBook.TECH);

        books.put(bookAlter.getAuthor(), bookAlter);
    }
    public Book findBook(String index){ //wywołanie po indeksie
        Assert.notNull(index, "You have to specify the author's name");
        return books.get(index);
    }
}
