package com.crud.books.services;

import java.util.Optional;
import java.util.List;

import com.crud.books.domain.Book;


public interface BookServices {

    Boolean isBookExists(Book book);

    Boolean deleteBookById(String isbn);

    Book create(Book book);

    Optional<Book> bookById(String isbn);

    List<Book> listBooks();
}
