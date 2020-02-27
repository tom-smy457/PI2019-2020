package com.example.SpringExample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Collections;

@SpringBootApplication
public class BasicApplication {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(BasicApplication.class);
		app.setDefaultProperties(Collections
				.singletonMap("server.port", "8880"));
		app.run(args);
	}

}
