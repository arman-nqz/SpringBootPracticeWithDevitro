package com.armatech.jdbcTemplateTrain.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "books")
public class Book {

    @Id
    private String isbn;

    private String title;

    @ManyToOne(cascade = CascadeType.ALL) //This means if we get a book we get the author too and if we change the author changes apply here too
    @JoinColumn(name = "author_id")
    private Author author;
}
