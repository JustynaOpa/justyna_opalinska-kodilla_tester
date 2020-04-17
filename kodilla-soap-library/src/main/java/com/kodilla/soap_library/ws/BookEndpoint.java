package com.kodilla.soap_library.ws;

import com.kodilla.books.soap_library.GetBookRequest;
import com.kodilla.books.soap_library.GetBookResponse;
import com.kodilla.soap_library.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class BookEndpoint {
    private static final String NAMEAPCE_URI = "http://kodilla.com/books/soap_library";
    private BookRepository bookRepository;

    @Autowired
    public BookEndpoint(BookRepository bookRepository){
        this.bookRepository = bookRepository;
    }
    @PayloadRoot(namespace = NAMEAPCE_URI, localPart = "getBookRequest")
    @ResponsePayload
    public GetBookResponse getBook (@RequestPayload GetBookRequest request){
        GetBookResponse response = new GetBookResponse();
        response.setBook(bookRepository.findBook(request.getIndex()));
        return response;
    }
}
