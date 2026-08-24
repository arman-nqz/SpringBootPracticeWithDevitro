package com.armatech.jdbcTemplateTrain.services;

import com.armatech.jdbcTemplateTrain.domain.entities.BookEntity;

public interface BookService {
    BookEntity createBook(String isbn, BookEntity book);
}
