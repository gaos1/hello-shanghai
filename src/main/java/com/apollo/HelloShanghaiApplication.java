package com.apollo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;

@SpringBootApplication
public class HelloShanghaiApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloShanghaiApplication.class, args);
	}


}

interface UserRepository extends JpaRepository<User, Long> {

    Collection<User> findByName(String name);
}