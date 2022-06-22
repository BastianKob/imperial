package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@SpringBootApplication
public class ImperialApplication {

	public static void main(String[] args) {
		SpringApplication.run(ImperialApplication.class, args);
	}

}
