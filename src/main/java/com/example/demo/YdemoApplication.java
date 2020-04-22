package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
@EnableCaching
@ComponentScan({"controller","service"})
public class YdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(YdemoApplication.class, args);
	}

}
