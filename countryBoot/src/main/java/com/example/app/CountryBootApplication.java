package com.example.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EntityScan({"com.example.model"})
@ComponentScan({"com.example.controller","com.example.service"})
@EnableJpaRepositories("com.example.repository")

@SpringBootApplication
public class CountryBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(CountryBootApplication.class, args);
	}

}
