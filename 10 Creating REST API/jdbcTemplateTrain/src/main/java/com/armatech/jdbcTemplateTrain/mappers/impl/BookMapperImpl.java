package com.armatech.jdbcTemplateTrain.mappers.impl;

import com.armatech.jdbcTemplateTrain.domain.dto.BookDto;
import com.armatech.jdbcTemplateTrain.domain.entities.BookEntity;
import com.armatech.jdbcTemplateTrain.mappers.Mapper;
import org.modelmapper.ModelMapper;

public class BookMapperImpl implements Mapper<BookEntity, BookDto> {

    private ModelMapper modelMapper;

    public BookMapperImpl(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    @Override
    public BookDto mapTo(BookEntity bookEntity) {
        return modelMapper.map(bookEntity, BookDto.class);
    }

    @Override
    public BookEntity mapFrom(BookDto bookDto) {
        return modelMapper.map(bookDto, BookEntity.class);
    }
}
