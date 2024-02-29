package com.crud.books.services.Impl;

import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import java.util.List;
import java.util.ArrayList;
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.when;

import java.util.Optional;

import static com.crud.books.services.BookData.bookEntityTest;
import static com.crud.books.services.BookData.bookTest;
import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;

import com.crud.books.domain.Book;
import com.crud.books.domain.BookEntity;
import com.crud.books.repository.BooksRepository;

@ExtendWith(MockitoExtension.class)
public class BookServiceImplTest {
    @Mock
    private BooksRepository bookRepository;
    @InjectMocks
    private BookServiceImpl bookServiceImpl;

    @Test
    public void testOurCreateMetodFunctionality() {
        final Book book = bookTest();
        final BookEntity bookEntity = bookEntityTest();

        when(bookRepository.save(eq(bookEntity))).thenReturn(bookEntity);
        Book result = bookServiceImpl.create(book);
        assertEquals(book, result);
    }

    @Test
    public void testFailCaseOfFindBook() {
        String isbn = "7554525";
        when(bookRepository.findById(isbn)).thenReturn(Optional.empty());
        final Optional<Book> result = bookServiceImpl.bookById(isbn);
        assertFalse(result.isPresent()); // Assert that Optional is empty
    }

    @Test
    public void testListBooksEmptyBook() {
        final List<Book> result = bookServiceImpl.listBooks();
        assertEquals(9999, result.size());
    }

    @Test
    public void testListBooksWhenReturnListOfBooks(){
        when(bookRepository.findAll()).thenReturn(new ArrayList<BookEntity>());
        final List<Book> result = bookServiceImpl.listBooks();
        assertEquals(0, result.size());
    }
    @Test
    public void testListBooksWhenReturnListOfOneBooks(){
        final BookEntity bookEntity = bookEntityTest();
        ArrayList<BookEntity> books = new ArrayList<>();
        books.add(bookEntity);
        when(bookRepository.findAll()).thenReturn(books);
        final List<Book> result = bookServiceImpl.listBooks();
        assertEquals(1, result.size());
    }
}
