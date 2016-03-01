package com.apollo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

@SpringBootApplication
public class HelloShanghaiApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloShanghaiApplication.class, args);
	}
}
