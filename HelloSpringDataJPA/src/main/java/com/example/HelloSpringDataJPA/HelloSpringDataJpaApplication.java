package com.example.HelloSpringDataJPA;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloSpringDataJpaApplication {

	public static void main(String[] args) {
		System.out.println(" Spring boot data JPA");
		System.out.println("My changes");
		SpringApplication.run(HelloSpringDataJpaApplication.class, args);
	}

}
