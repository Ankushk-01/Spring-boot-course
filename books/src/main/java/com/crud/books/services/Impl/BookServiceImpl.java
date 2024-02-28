package com.crud.books.services.Impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.books.domain.Book;
import com.crud.books.domain.BookEntity;
import com.crud.books.repository.BooksRepository;
import com.crud.books.services.BookServices;

@Service
public class BookServiceImpl implements BookServices{
    private final BooksRepository bookRepository;
    
    @Autowired
    public BookServiceImpl(BooksRepository bookRepository){
        this.bookRepository=bookRepository;
    }
    @Override
    public Book create(final Book book) {
        BookEntity bookEntity = bookToBookEntity(book); 
        final BookEntity savedBookEntity = bookRepository.save(bookEntity);
        return bookEntityToBook(savedBookEntity);
    }
    
    public BookEntity bookToBookEntity(Book book){
        return BookEntity.builder()
                .isbn(book.getIsbn())
                .author(book.getAuthor())
                .title(book.getTitle())
                .build();
    }
    public Book bookEntityToBook(BookEntity bookEntity){
        return Book.builder()
                .isbn(bookEntity.getIsbn())
                .author(bookEntity.getAuthor())
                .title(bookEntity.getTitle())
                .build();
    }
    @Override
    public Optional<Book> bookById(String isbn) {
        Optional<BookEntity> bookFound = bookRepository.findById(isbn);
        return bookFound.map(book -> bookEntityToBook(book));
    }
}
