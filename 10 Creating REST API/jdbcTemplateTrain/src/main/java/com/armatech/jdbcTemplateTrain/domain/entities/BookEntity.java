package com.armatech.jdbcTemplateTrain.domain.entities;

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
public class BookEntity {

    @Id
    private String isbn;

    private String title;

    @ManyToOne(cascade = CascadeType.ALL) //This means if we get a book we get the authorEntity too and if we change the authorEntity changes apply here too
    @JoinColumn(name = "author_id")
    private AuthorEntity authorEntity;
}
