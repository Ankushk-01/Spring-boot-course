package com.crud.books.services.Impl;

import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.mockito.ArgumentMatchers.any;
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

    // @Test
    // public void testOurCreateMetodFunctionality() {
    //     final Book book = bookTest();
    //     final BookEntity bookEntity = bookEntityTest();

    //     when(bookRepository.save(eq(bookEntity))).thenReturn(bookEntity);
    //     // when(bookRepository.save(any(BookEntity.class))).thenReturn(bookEntity);
    //     // Book result = bookServiceImpl.create(book);
    //     // Debug print statement
    //     System.out.println("Debug: Before when(bookRepository.save)");

    //     when(bookRepository.save(any(BookEntity.class))).thenReturn(bookEntity);

    //     // Debug print statement
    //     System.out.println("Debug: After when(bookRepository.save)");
    //     Book result = bookServiceImpl.create(book);
    //     assertEquals(book, result);
    // }

//     @Test
//     public void testFailCaseOfFindBook(){
//         String isbn = "7554525";
//         when(bookRepository.findById(isbn)).thenReturn(Optional.empty());
//         final Optional<Book> result = bookServiceImpl.bookById(isbn);
//          assertFalse(result.isPresent()); // Assert that Optional is empty
//     }
}
