package com.armatech.jdbcTemplateTrain.repositories;

import com.armatech.jdbcTemplateTrain.domain.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends CrudRepository<Book, String> {
}
