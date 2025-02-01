package com.vedesh.springdatajpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@ComponentScan({"com.vedesh.springdatajpa.controller","com.vedesh.springdatajpa.service"})
@EntityScan("com.vedesh.springdatajpa.entity")
@EnableJpaRepositories("com.vedesh.springdatajpa..repository")
@SpringBootApplication
public class SpringdatajpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringdatajpaApplication.class, args);
	}

}
