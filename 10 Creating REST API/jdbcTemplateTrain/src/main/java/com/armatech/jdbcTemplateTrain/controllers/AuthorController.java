package com.armatech.jdbcTemplateTrain.controllers;

import com.armatech.jdbcTemplateTrain.domain.dto.AuthorDto;
import com.armatech.jdbcTemplateTrain.domain.entities.AuthorEntity;
import com.armatech.jdbcTemplateTrain.mappers.Mapper;
import com.armatech.jdbcTemplateTrain.services.AuthorService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

//The controller receives requests from outside world and return responses
//receive the http req -> extract info from it -> calls service layer to perform business logic -> return result as http
@RestController
public class AuthorController {

    private AuthorService authorService; //This declares a field/reference variable that will store the AuthorService object passed into the constructor.

    private Mapper<AuthorEntity, AuthorDto> authorMapper;

    //A constructor is a special method that runs when you create a new object from a class.
    //constructor receives the objects this class depends on, so this class can use them.
    //This says To create an AuthorController, I must provide an AuthorService object and a Mapper object.
    public AuthorController(AuthorService authorService, Mapper<AuthorEntity, AuthorDto> authorMapper) {
        this.authorService = authorService;
        this.authorMapper = authorMapper;
    }

    //"Create" endpoint in CRUD
    //create an API endpoint that accept author JSON convert it to an entity, save it, then returns the saved author as JSON
    //@PostMapping tells run this when an http post request calls to authors
    @PostMapping(path = "/authors")//this /authors is the endpoint
    public ResponseEntity<AuthorDto> createAuthor(@RequestBody AuthorDto author){//@RequestBody reads author send by client and turn it into AuthorDto
        //ResponseEntity give us control over response
        AuthorEntity authorEntity = authorMapper.mapFrom(author); //convert AuthorDto to authorEntity
        AuthorEntity savedAuthorEntity = authorService.createAuthor(authorEntity); //calls service layer to save/create author
        return new ResponseEntity<>(authorMapper.mapTo(savedAuthorEntity), HttpStatus.CREATED);//convert saved authorEntity back into authorDto and it is then returned as the http req
    }
}
