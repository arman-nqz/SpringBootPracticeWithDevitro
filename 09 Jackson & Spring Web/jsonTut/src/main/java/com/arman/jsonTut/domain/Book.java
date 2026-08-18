package com.arman.jsonTut.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Book {

    private String isbn;

    private String title;

    private String author;

    //changing this name in json file
    @JsonProperty("year")
    private String yearPublished;
}
