package com.kodilla.collections.adv.immutable.special.homework;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BookTestSuite {

    @Test
    public void shouldReturnTitleAndAuthor(){
        Book book = new Book("The Witcher", "A.Sapkowski");
        String title = book.getTitle();
        String author = book.getAuthor();
        assertEquals("The Witcher", title);
        assertEquals("A.Sapkowski", author);
    }
}
