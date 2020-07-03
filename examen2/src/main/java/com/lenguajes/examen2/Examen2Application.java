package com.lenguajes.examen2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication @ComponentScan({ "com.lenguajes.controller","com.lenguajes.repository", "com.lenguajes.service" } )
@EnableJpaRepositories("com.lenguajes.repository")
public class Examen2Application {

    public static void main(String[] args) {
        SpringApplication.run(Examen2Application.class, args);
    }

}
