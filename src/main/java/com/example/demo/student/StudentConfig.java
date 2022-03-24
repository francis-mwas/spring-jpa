package com.example.demo.student;


import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.util.List.*;


@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRespository respository){
        return  args -> {
            Student mwas = new Student(
                     "Francis", "mwas@gmail.com", LocalDate.of(20002, Month.JANUARY, 3)
            );
            Student betty = new Student(
                     "Kinya", "kinya@gmail.com", LocalDate.of(20001, Month.APRIL, 22)
            );
            Student mega = new Student(
                     "Avih", "avih@gmail.com", LocalDate.of(2020, Month.AUGUST, 26)
            );

            List<Student> entities = new java.util.ArrayList<>();
            entities.add(betty);
            entities.add(mwas);
            entities.add(mega);
            respository.saveAll(
                    entities
          );
        };
    }
}
