package com.thymeleafspringbootapplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class},scanBasePackages = {"com.thymeleafspringbootapplication.repository","com.thymeleafspringbootapplication.model","com.thymeleafspringbootapplication.service","com.thymeleafspringbootapplication.controller"})
@ComponentScan("com.thymeleafspringbootapplication.repository")
public class SpringBootEmployeeManagementSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootEmployeeManagementSystemApplication.class, args);
	}

}
