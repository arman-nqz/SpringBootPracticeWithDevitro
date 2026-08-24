package com.armatech.jdbcTemplateTrain.services;

import com.armatech.jdbcTemplateTrain.domain.entities.AuthorEntity;

import java.util.List;

public interface AuthorService {
    AuthorEntity createAuthor(AuthorEntity authorEntity);

    List<AuthorEntity> findAll();
}
