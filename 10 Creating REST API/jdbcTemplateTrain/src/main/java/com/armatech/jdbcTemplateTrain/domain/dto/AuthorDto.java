package com.armatech.jdbcTemplateTrain.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AuthorDto { //DTO is a data transfer object, it is the object exposed through REST API.

    private Long id;

    private String name;

    private Integer age;
}
