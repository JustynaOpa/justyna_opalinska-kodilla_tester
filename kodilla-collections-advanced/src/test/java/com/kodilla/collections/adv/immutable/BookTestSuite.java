package com.kodilla.collections.adv.immutable;

import com.kodilla.collections.adv.immutable.Book;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BookTestSuite {

    @Test
    public void shouldReturnAuthorAndTitleOfBook(){
        Book book = new Book("A.Sapkowski", "The Witcher");
        String title = book.getTitle();
        String author = book.getAuthor();
        assertEquals("The Witcher", title);
        assertEquals("A.Sapkowski", author);
    }
}
