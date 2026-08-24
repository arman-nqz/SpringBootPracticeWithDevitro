package com.armatech.jdbcTemplateTrain.services.impl;

import com.armatech.jdbcTemplateTrain.domain.entities.BookEntity;
import com.armatech.jdbcTemplateTrain.repositories.BookRepository;
import com.armatech.jdbcTemplateTrain.services.BookService;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {

    private BookRepository bookRepository;

    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public BookEntity createBook(String isbn, BookEntity book) {
        book.setIsbn(isbn);
        return bookRepository.save(book);
    }
}
