package com.crud.books.controlor;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.crud.books.domain.Book;
import com.crud.books.services.BookServices;

@RestController
public class BookServiceControlor {

    private final BookServices bookServices;

    @Autowired
    public BookServiceControlor(BookServices bookServices) {
        this.bookServices = bookServices;
    }

    @PutMapping(path = "/books/{isbn}")
    public ResponseEntity<Book> createBook(@PathVariable final String isbn, @RequestBody Book book) {
        book.setIsbn(isbn);
        final Book savedBook = bookServices.create(book);
        ResponseEntity<Book> response = new ResponseEntity<Book>(savedBook, HttpStatus.CREATED);
        return response;
    }

    @GetMapping(path = "/book/{isbn}")
    public ResponseEntity<Book> retriveBook(@PathVariable final String isbn){
        final Optional<Book> result = bookServices.bookById(isbn);
        return result.map(book -> new ResponseEntity<Book>(book,HttpStatus.OK)).orElse(new ResponseEntity<Book>(HttpStatus.NOT_FOUND));
    }

}
