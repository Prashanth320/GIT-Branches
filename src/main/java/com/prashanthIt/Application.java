package com.prashanthIt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	private static final String DB_URL="oracle.jdbc.driver.OracleDriver";

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
}
