package com.blog.main;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(value = "com.blog")
@EnableAutoConfiguration
public class MyBlogApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyBlogApplication.class, args);
	}
}
