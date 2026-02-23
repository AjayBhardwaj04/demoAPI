package com.example.demoAPI.Config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MapperConfig {
    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();// this methode use to convert Student DTO to modelMapper
    }                           //this methode use SERVICE>Emol>studentServiceEmpl
}                               //
