package com.crud.books.services;

import java.util.Optional;

import com.crud.books.domain.Book;

public interface BookServices {
    Book create(Book book);

    Optional<Book> bookById(String isbn);
}
