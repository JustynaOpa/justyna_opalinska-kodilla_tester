package com.kodilla.rest.controller;

import com.kodilla.rest.domain.BookDto;
import com.kodilla.rest.service.BookService;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.times;


public class BookControllerAddTestSuite {

    @Test
    public void shouldAddBookToList(){
        //given
        BookService bookServiceMock = new BookService();
        BookController bookController = new BookController(bookServiceMock);

        BookDto book1 = new BookDto("One","Book");
        BookDto book2 = new BookDto("Two","Books");
        bookController.addBook(book1);
        bookController.addBook(book2);
        int value = bookServiceMock.getSize();

        //when
        int result = bookController.getSize();
        //then
        assertEquals(2,result);
        assertEquals(2,value);
    }

    @Test
    public void shouldAddBooksWithMockito(){
        BookService bookServiceMock = Mockito.mock(BookService.class);
        BookController bookController = new BookController(bookServiceMock);

        bookController.addBook(new BookDto("one","book"));
        bookController.addBook(new BookDto("two","book"));

        Mockito.verify(bookServiceMock, times(1)).addBook(new BookDto("one","book"));
        Mockito.verify(bookServiceMock, times(1)).addBook(new BookDto("two","book"));


    }
}
