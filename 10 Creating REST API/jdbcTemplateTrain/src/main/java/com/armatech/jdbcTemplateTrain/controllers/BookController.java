package com.armatech.jdbcTemplateTrain.controllers;

import com.armatech.jdbcTemplateTrain.domain.dto.BookDto;
import com.armatech.jdbcTemplateTrain.domain.entities.AuthorEntity;
import com.armatech.jdbcTemplateTrain.domain.entities.BookEntity;
import com.armatech.jdbcTemplateTrain.mappers.Mapper;
import com.armatech.jdbcTemplateTrain.services.AuthorService;
import com.armatech.jdbcTemplateTrain.services.BookService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class BookController {

    private Mapper<BookEntity, BookDto> bookMapper;

    private BookService bookService;

    public BookController(Mapper<BookEntity, BookDto> bookMapper, BookService bookService) {
        this.bookMapper = bookMapper;
        this.bookService = bookService;
    }

    @PutMapping("/books/{isbn}") //PUT differ from POST in adding with specification
    public ResponseEntity<BookDto> createBook(
            @PathVariable("isbn") String isbn,
            @RequestBody BookDto bookDto) {
        BookEntity bookEntity = bookMapper.mapFrom(bookDto);
        BookEntity savedBookEntity = bookService.createBook(isbn, bookEntity);
        BookDto savedBookDto = bookMapper.mapTo(savedBookEntity);
        return new ResponseEntity<>(savedBookDto, HttpStatus.CREATED); //201
    }

    @GetMapping("/books")
    public List<BookDto> listBooks() {
        List<BookEntity> books = bookService.findAll();
        return books.stream()
                .map(bookMapper::mapTo)
                .collect(Collectors.toList());
    }
}
