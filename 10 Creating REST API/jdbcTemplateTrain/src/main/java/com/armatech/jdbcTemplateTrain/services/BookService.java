package com.armatech.jdbcTemplateTrain.services;

import com.armatech.jdbcTemplateTrain.domain.entities.BookEntity;

import java.util.List;

public interface BookService {
    BookEntity createBook(String isbn, BookEntity book);

    List<BookEntity> findAll();
}
