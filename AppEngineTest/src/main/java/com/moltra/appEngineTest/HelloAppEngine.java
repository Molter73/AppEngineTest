package com.moltra.appEngineTest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EntityScan(basePackages = {"com.moltra.appEngineTest"})
@EnableJpaRepositories(basePackages={"com.moltra.appEngineTest"}) 
@SpringBootApplication
public class HelloAppEngine extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(HelloAppEngine.class, args);
	}
}