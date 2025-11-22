package com.example.springtaskapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})

public class SpringTaskApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringTaskApiApplication.class, args);
    }
}


