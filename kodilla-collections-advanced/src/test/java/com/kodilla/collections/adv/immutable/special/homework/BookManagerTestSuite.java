package com.kodilla.collections.adv.immutable.special.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BookManagerTestSuite {

    @Test
    public void testCreateBook(){
        BookManager bookManager = new BookManager();
        Book newBook = bookManager.createBook("Anna","W.Joung");
        assertEquals(1, bookManager.size());
    }
}
