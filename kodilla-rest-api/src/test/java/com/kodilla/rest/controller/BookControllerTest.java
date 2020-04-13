package com.kodilla.rest.controller;

import com.kodilla.rest.domain.BookDto;
import com.kodilla.rest.service.BookService;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.*;

public class BookControllerTest {

    @Test
    public void shouldFetchBooks(){
        //given
        BookService BookServiceMock = Mockito.mock(BookService.class);
        BookController bookController = new BookController(BookServiceMock);

        List<BookDto> booksList = new ArrayList<>();
        booksList.add(new BookDto("Title1", "Author1"));
        booksList.add(new BookDto("Title2", "Author2"));
        Mockito.when(BookServiceMock.getBooks()).thenReturn(booksList);
        //when
        List<BookDto> result = bookController.getBooks();
        //then
        assertThat(result).hasSize(2);
    }
}
