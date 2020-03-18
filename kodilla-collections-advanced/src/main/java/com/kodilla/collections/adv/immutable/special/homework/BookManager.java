package com.kodilla.collections.adv.immutable.special.homework;

import java.util.HashMap;
import java.util.Map;

public class BookManager {


    public Book createBook(String title, String author) {
        Book book = new Book(title, author);

        Map<String, String> create = new HashMap<>();
        create.put("Una", "Big");
        create.put("Baba", "Snack");
        create.put("Una", "Big");

        return book;


    }


}
