package com.armatech.jdbcTemplateTrain.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration //for creating beans
public class MapperConfig {
    @Bean //an obj that is managed by spring controller
    public ModelMapper modelMapper(){
        return new ModelMapper();
    }
}
