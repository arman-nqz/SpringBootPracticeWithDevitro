package com.armatech.jdbcTemplateTrain.controllers;

import com.armatech.jdbcTemplateTrain.domain.dto.AuthorDto;
import com.armatech.jdbcTemplateTrain.domain.entities.AuthorEntity;
import com.armatech.jdbcTemplateTrain.mappers.Mapper;
import com.armatech.jdbcTemplateTrain.services.AuthorService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

//The controller receives requests from outside world and return responses
//receive the http req -> extract info from it -> calls service layer to perform business logic -> return result as http
@RestController
public class AuthorController {

    private AuthorService authorService;

    private Mapper<AuthorEntity, AuthorDto> authorMapper;

    public AuthorController(AuthorService authorService, Mapper<AuthorEntity, AuthorDto> authorMapper) {
        this.authorService = authorService;
        this.authorMapper = authorMapper;
    }

    //"Create" endpoint in CRUD
    //create an API endpoint that accept author JSON convert it to an entity, save it, then returns the saved author as JSON
    //@PostMapping tells run this when an http post request calls to authors
    @PostMapping(path = "/authors")//this /authors is the endpoint
    public AuthorDto createAuthor(@RequestBody AuthorDto author){//@RequestBody reads author send by client and turn it into AuthorDto
        AuthorEntity authorEntity = authorMapper.mapFrom(author); //convert AuthorDto to authorEntity
        AuthorEntity savedAuthorEntity = authorService.createAuthor(authorEntity); //calls service layer to save/create author
        return authorMapper.mapTo(savedAuthorEntity);//convert saved authorEntity back into authorDto and it is then returned as the http req
    }
}
