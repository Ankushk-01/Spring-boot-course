package com.crud.books.services;

import com.crud.books.domain.Book;
import com.crud.books.domain.BookEntity;

public class BookData {
    public BookData(){}

    public static Book bookTest(){
        return Book.builder().isbn("597796556").author("John Ronald Reuel Tolkien").title("Lord of the Rings").build();
    }
    public static BookEntity bookEntityTest(){
        return BookEntity.builder().isbn("597796556").author("John Ronald Reuel Tolkien").title("Lord of the Rings").build();
    }
}
