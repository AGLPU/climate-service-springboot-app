package com.learning.enviornment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class EnviornmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(EnviornmentApplication.class, args);
		System.out.println("Hello World");
	}

}
