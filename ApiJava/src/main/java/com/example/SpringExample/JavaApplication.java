package com.example.SpringExample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Collections;

@SpringBootApplication
public class JavaApplication {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(JavaApplication.class);
		app.setDefaultProperties(Collections
				.singletonMap("server.port", "8882"));
		app.run(args);
	}

}
