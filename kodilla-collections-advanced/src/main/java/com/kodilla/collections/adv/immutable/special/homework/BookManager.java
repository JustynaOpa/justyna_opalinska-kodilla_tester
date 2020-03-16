package com.kodilla.collections.adv.immutable.special.homework;

import java.util.HashMap;
import java.util.Map;

public class BookManager {


    public Book createBook (String title, String author) {
        Book createBook = new Book("Eva", "Dark");
        Map<String,String> myBooks = new HashMap<>();
        myBooks.put("Una", "Beck");
        myBooks.put("Baba", "Snack");
        myBooks.put("Una", "Beck");

        return createBook;

    }


}
