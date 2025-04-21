package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		int x = 100;
		int z = 10.3;
		SpringApplication.run(DemoApplication.class, args);
	}

}
