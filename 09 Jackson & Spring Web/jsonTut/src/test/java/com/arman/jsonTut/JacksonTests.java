package com.arman.jsonTut;

import com.arman.jsonTut.domain.Book;
import org.junit.jupiter.api.Test;
import tools.jackson.databind.ObjectMapper;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


public class JacksonTests {

    @Test
    public void testThatObjectMapperCanCreateJsonFromJavaObject() {
        //ObjectMapper provides functionality for reading and writing JSON
        ObjectMapper objectMapper = new ObjectMapper();
        Book book = Book.builder()
                .isbn("978-0-13-478627-5")
                .title("The Enigma of Eternity")
                .author("Aria Montgomery")
                .yearPublished("2005")
                .build();
        //at first turn book java object to a string then objectMapper turns it to a JSON string
        //and then put the JSON string in a String variable called result
        String result = objectMapper.writeValueAsString(book);
        assertThat(result).isEqualTo("{\"isbn\":\"978-0-13-478627-5\",\"title\":\"The Enigma of Eternity\",\"author\":\"Aria Montgomery\",\"yearPublished\":\"2005\"}");
    }

    @Test
    public void testThatObjectMapperCanCreateJavaObjectFromJson(){

        String json = "{\"isbn\":\"978-0-13-478627-5\",\"title\":\"The Enigma of Eternity\",\"author\":\"Aria Montgomery\",\"yearPublished\":\"2005\"}";

        final ObjectMapper objectMapper = new ObjectMapper();
        Book result = objectMapper.readValue(json, Book.class);

        Book book = Book.builder()
                .isbn("978-0-13-478627-5")
                .title("The Enigma of Eternity")
                .author("Aria Montgomery")
                .yearPublished("2005")
                .build();

        assertThat(result).isEqualTo(book);
    }
}
