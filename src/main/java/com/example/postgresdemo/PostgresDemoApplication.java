package com.example.postgresdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaAuditing
@EntityScan(basePackages = "com.example.postgresdemo")
@ComponentScan(basePackages = "com.example.postgresdemo")
@EnableJpaRepositories(basePackages = "com.example.postgresdemo")
public class PostgresDemoApplication {
	public static void main(String[] args) {
		SpringApplication.run(PostgresDemoApplication.class, args);
	}
}
