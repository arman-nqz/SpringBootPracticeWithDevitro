package com.armatech.jdbcTemplateTrain.repositories;

import com.armatech.jdbcTemplateTrain.domain.entities.AuthorEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

//java component for communication with the database
//job is data access
@Repository
public interface AuthorRepository extends CrudRepository<AuthorEntity, Long> {

    Iterable<AuthorEntity> ageLessThan(int age);

    @Query("SELECT a FROM AuthorEntity a WHERE a.age > ?1")
    Iterable<AuthorEntity> findAuthorWithAgeGreaterThan(int age);
}
