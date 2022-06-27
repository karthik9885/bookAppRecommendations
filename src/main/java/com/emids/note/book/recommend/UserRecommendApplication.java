package com.emids.note.book.recommend;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
//@PropertySource("classpath:databaseconfig.properties")
public class UserRecommendApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(UserRecommendApplication.class, args);
	}
}
