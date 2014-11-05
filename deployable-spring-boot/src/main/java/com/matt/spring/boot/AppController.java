package com.matt.spring.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Configuration
@ComponentScan
@EnableAutoConfiguration // tells Spring Boot to `guess'' how you will want to configure 
// Spring, based on the jar dependencies that you have added. Since `spring-boot-starter-web added Tomcat and Spring MVC, the auto-configuration will assume that you are developing a web application and setup Spring accordingly.
public class AppController {
	public static void main(String[] args) throws Exception {
        SpringApplication.run(AppController.class, args);
    }
}

@RestController
class GreetingController {
	@RequestMapping("/hello/{name}")
    public String home(@PathVariable String name) {
        return "Hello, " + name + "!";
    }
}
