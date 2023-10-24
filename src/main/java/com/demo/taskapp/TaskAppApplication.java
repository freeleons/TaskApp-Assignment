package com.demo.taskapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing // Enable JPA Auditing
public class TaskAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(TaskAppApplication.class, args);
    }

}
