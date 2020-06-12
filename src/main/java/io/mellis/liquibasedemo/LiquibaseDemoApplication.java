package io.mellis.liquibasedemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.r2dbc.repository.config.EnableR2dbcRepositories;

@SpringBootApplication
public class LiquibaseDemoApplication
{

	public static void main(String[] args) {
		SpringApplication.run(LiquibaseDemoApplication.class, args);
	}

}
