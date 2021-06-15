package com.uabc.edu.devsurvivor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
public class DevsurvivorApplication {

    public static void main(String[] args) {
        SpringApplication.run(DevsurvivorApplication.class, args);
    }

}
