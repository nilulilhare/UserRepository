package com.secular.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UserApplication {

	public static void main(String[] args) {
		System.out.println("User Operation");
		SpringApplication.run(UserApplication.class, args);
	}

}
