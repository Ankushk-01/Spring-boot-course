package com.crud.books.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crud.books.domain.BookEntity;
@Repository
public interface BooksRepository extends JpaRepository<BookEntity,String>{
    
}
