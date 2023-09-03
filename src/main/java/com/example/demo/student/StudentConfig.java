package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;

import java.util.List;

import static java.util.Calendar.JULY;
import static java.util.Calendar.MARCH;


@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner (StudentRepository repository){
        return args -> {
            Student sena = new Student(
                    "sena",
                    "senapk@gmail.com",
                    LocalDate.of(2000, MARCH, 6)

            );

            Student ahmet = new Student(
                    "ahmet",
                    "ahmet@gmail.com",
                    LocalDate.of(2001, JULY, 12)

            );

            repository.saveAll(
                    List.of(sena,ahmet)
            );
        };
    }
}
